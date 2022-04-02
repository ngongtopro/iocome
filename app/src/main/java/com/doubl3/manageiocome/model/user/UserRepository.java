package com.doubl3.manageiocome.model.user;

import android.app.Application;

import com.doubl3.manageiocome.model.IOComeRoomDatabase;

import java.util.List;

import javax.inject.Inject;

import androidx.lifecycle.LiveData;

public class UserRepository {

    private UserDao mUserDao;
    private LiveData<List<User>>    mAllUser;

    // Note that in order to unit test the WordRepository, you have to remove the Application
    // dependency. This adds complexity and much more code, and this sample is not about testing.
    // See the BasicSample in the android-architecture-components repository at
    // https://github.com/googlesamples

    @Inject
    public UserRepository(Application application){
        IOComeRoomDatabase db = IOComeRoomDatabase.getDatabase(application);
        mUserDao = db.userDao();
        mAllUser = mUserDao.getAlphabetizedUsers();
    }

    // Room executes all queries on a separate thread.
    // Observed LiveData will notify the observer when the data has changed.
    public LiveData<List<User>> getAllUsers(){
        return mAllUser;
    }
    public void insert(User user){
        IOComeRoomDatabase.databaseWriteExecutor.execute(()->{
            mUserDao.insert(user);
        });
    }
}
