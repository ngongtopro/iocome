package com.doubl3.manageiocome.model;

import android.content.Context;

import com.doubl3.manageiocome.model.fund.Fund;
import com.doubl3.manageiocome.model.fund.FundDao;
import com.doubl3.manageiocome.model.user.User;
import com.doubl3.manageiocome.model.user.UserDao;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import androidx.sqlite.db.SupportSQLiteDatabase;

@Database(entities = {User.class, Fund.class}, version = 1, exportSchema = false)
@TypeConverters({Converters.class})
public abstract class IOComeRoomDatabase extends RoomDatabase {

    public abstract UserDao userDao();
    public abstract FundDao fundDao();

    private static volatile IOComeRoomDatabase INSTANCE;
    private static final int NUMBER_OF_THREADS = 4;

    public static final ExecutorService databaseWriteExecutor =
            Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    public static IOComeRoomDatabase getDatabase(final Context context) {
        if(INSTANCE == null) {
            synchronized (IOComeRoomDatabase.class) {
                if(INSTANCE == null) {
                    INSTANCE = getInstance(context);
                }
            }
        }
        return INSTANCE;
    }

    private static IOComeRoomDatabase getInstance(Context context) {
        return Room.databaseBuilder(context.getApplicationContext(),
                IOComeRoomDatabase.class, "iocome_database")
                .addCallback(sRoomDatabaseCallback)
                .build();
    }

    private static final RoomDatabase.Callback sRoomDatabaseCallback = new RoomDatabase.Callback() {
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);
            //If you want to keep data through app restarts,
            //comment out the following block
            databaseWriteExecutor.execute(() -> {
                //Populate the database in the background.
                //If you want to start with more users, just add them.
                UserDao dao = INSTANCE.userDao();

                User user = new User("Tên", "Họ");
                dao.insert(user);
            });
        }
    };
}
