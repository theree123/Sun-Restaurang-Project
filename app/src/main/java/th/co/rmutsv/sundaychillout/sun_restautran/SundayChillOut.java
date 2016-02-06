package th.co.rmutsv.sundaychillout.sun_restautran;

import android.database.sqlite.SQLiteDatabase;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.InputStream;

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

        //Synchronize JSON to SQLlite
        synJSONtoSQLite();


    } //main mettord

    private void synJSONtoSQLite() {

        //Change Policy
        StrictMode.ThreadPolicy myThreadPolicy = new StrictMode.ThreadPolicy
                .Builder().permitAll().build();
        StrictMode.setThreadPolicy(myThreadPolicy);

        int intTable = 1;
        String tag = "Restaurant";

        while (intTable<=2) {

            //1 สร้าง input stream

            InputStream objInputStream = null;
            String strURLuser = "http://swiftcodingthai.com/6feb/php_get_asun.php";
            String strURLfood = "http://swiftcodingthai.com/6feb/php_get_data_food.php";

            try {

            } catch (Exception e) {
                long.d("tag,InputStream ==>" + e.toString());
            }

            //2 สร้าง JSON String
            //3 UPDATe SQLlife


            intTable += 1;
        }   //while

    }

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

