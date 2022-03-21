package com.doubl3.manageiocome.model.user;

import android.content.Context;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

@Database(entities = {User.class}, version = 1, exportSchema = false)
public abstract class UserRoomDatabase extends RoomDatabase {
    public abstract UserDao userDao();

    private static volatile UserRoomDatabase INSTANCE;
    private static final int NUMBER_OF_THREADS = 4;
    static final ExecutorService databaseWriteExecutor =
            Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    static UserRoomDatabase getDatabase(final Context context){
        if(INSTANCE == null){
            synchronized (UserRoomDatabase.class){
                if (INSTANCE == null){
                    INSTANCE = getInstance(context);
                }
            }
        }
        return INSTANCE;
    }

    public static UserRoomDatabase getInstance(Context context) {
        return Room.databaseBuilder(context.getApplicationContext(),
                UserRoomDatabase.class, "user_database")
                .addCallback(sRoomDatabaseCallback)
                .build();
    }

    private static final RoomDatabase.Callback sRoomDatabaseCallback = new RoomDatabase.Callback() {
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);
            //If you want to keep data through app restarts,
            //comment out the following block
            databaseWriteExecutor.execute(()->{
                //Populate the database in the background.
                //If you want to start with more users, just add them.
                UserDao dao = INSTANCE.userDao();
                dao.deleteAll();

                User user = new User("Tên", "Họ");
                dao.insert(user);
            });
        }
    };
}
