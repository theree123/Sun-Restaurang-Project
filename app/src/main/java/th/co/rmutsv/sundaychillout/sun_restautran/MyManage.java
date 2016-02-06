package th.co.rmutsv.sundaychillout.sun_restautran;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by SunDayChillOut on 6/2/2559.
 */
public class MyManage {
    //explicit
    private MyOpenHelper objopenHelper;
    private SQLiteDatabase writeSqLiteDatabase,readSqLiteDatabase;

    public MyManage(Context context){

        //cleate $ comment
        objopenHelper =new MyOpenHelper(context);
        writeSqLiteDatabase = objopenHelper.getWritableDatabase();
        readSqLiteDatabase = objopenHelper.getReadableDatabase();

    }
} //main classic
