package th.co.rmutsv.sundaychillout.sun_restautran;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SundayChillOut extends AppCompatActivity {

    //explicit
    private MyManage obMyManage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sunday_chill_out);
        //object
        obMyManage=new MyManage(this);

        //tes add value
        //tesAddvalue();

        //Clean data
        cleanData();


    } //main mettord

    private void cleanData() {

        SQLiteDatabase obSqLiteDatabase = openOrCreateDatabase(MyOpenHelper.database_name,
                MODE_APPEND, null);
        obSqLiteDatabase.delete(MyManage.food_TABLE, null,null);
        obSqLiteDatabase.delete(MyManage.user_TABLE, null,null);

    }//cleanData

    private void tesAddvalue() {

        for (int i = 0; i <= 1; i++) {
            obMyManage.addNewValue(i,"tast1", "test2", "test3");
        }//for

    }   //testaddvalue

}   //mainclassic

