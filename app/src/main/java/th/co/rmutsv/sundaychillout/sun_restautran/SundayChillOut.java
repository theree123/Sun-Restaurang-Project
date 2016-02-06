package th.co.rmutsv.sundaychillout.sun_restautran;

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
    } //main mettord

}   //mainclassic

