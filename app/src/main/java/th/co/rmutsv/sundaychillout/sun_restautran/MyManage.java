package th.co.rmutsv.sundaychillout.sun_restautran;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by SunDayChillOut on 6/2/2559.
 */
public class MyManage {
    //explicit
    private MyOpenHelper objopenHelper;
    private SQLiteDatabase writeSqLiteDatabase,readSqLiteDatabase;

    public static final String user_TABLE = "userTABLE";
    public static final String food_TABLE = "footTABLE";
    public static final String colum_id = "_id";
    public static final String colum_user = "User";
    public static final String colum_pass = "Password";
    public static final String colum_name = "Name";
    public static final String colum_food = "foot";
    public static final String colum_price = "price";
    public static final String colum_source = "source";

    public MyManage(Context context){

        //cleate $ comment
        objopenHelper =new MyOpenHelper(context);
        writeSqLiteDatabase = objopenHelper.getWritableDatabase();
        readSqLiteDatabase = objopenHelper.getReadableDatabase();

    }
    public long addNewValue(int inTable,
                            String strColum2,
                            String strColum3,
                            String strColum4){
        ContentValues obContentValues = new ContentValues();
        long inReturn = 0;

        switch (inTable) {
            case 0:

                obContentValues.put(colum_user, strColum2);
                obContentValues.put(colum_pass, strColum3);
                obContentValues.put(colum_name, strColum4);
                writeSqLiteDatabase.insert(user_TABLE, null, obContentValues);

                break;
            case 1:

                obContentValues.put(colum_food, strColum2);
                obContentValues.put(colum_price, strColum3);
                obContentValues.put(colum_source, strColum4);
                writeSqLiteDatabase.insert(food_TABLE, null, obContentValues);

                break;
        }//switch

        return inReturn;
    }
} //main classic
