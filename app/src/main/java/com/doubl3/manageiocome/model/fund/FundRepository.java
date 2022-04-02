package com.doubl3.manageiocome.model.fund;

import android.app.Application;

import com.doubl3.manageiocome.model.IOComeRoomDatabase;

import javax.inject.Inject;

public class FundRepository {

    private FundDao mFundDao;

    @Inject
    public FundRepository(Application application){
        IOComeRoomDatabase db = IOComeRoomDatabase.getDatabase(application);
        mFundDao = db.fundDao();
    }

    public void insert(Fund fund) {
        IOComeRoomDatabase.databaseWriteExecutor.execute(()->{
            mFundDao.insert(fund);
        });
    }



}
