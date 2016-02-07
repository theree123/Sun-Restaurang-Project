package th.co.rmutsv.sundaychillout.sun_restautran;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by SunDayChillOut on 6/2/2559.
 */
public class MyOpenHelper extends SQLiteOpenHelper{

    //Explicit (ประกาศตัวแปร)
    public static final String database_name = "Restaurant";
    private static final int database_version = 1;
    private static final String create_user_tabal ="create table userTABLE (" +
            "_id integer primary key, " +
            "User text," +
            "Password text," +
            "Name text);";
    private static final String create_food_table = "create table footTABLE (" +
            "_id integer primary key," +
            "foot tex," +
            "price tex," +
            "source tex);";

    public MyOpenHelper(Context context) {
        super(context,database_name,null,database_version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(create_user_tabal);
        db.execSQL(create_food_table);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
} //main class
