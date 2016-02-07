package th.co.rmutsv.sundaychillout.sun_restautran;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class ServiceActivity extends AppCompatActivity {

    //explicit
    private TextView showNameTextView;
    private Spinner deskSpinner;
    private ListView foodListView;
    private String officerString, deskString, FoodString, amountString;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);

        //bin Wisbe
        BindWidget();

        showView();


    } //main method

    private void showView() {

        officerString = getIntent().getStringExtra("Name");
        showNameTextView.setText(officerString);
    }

    private void BindWidget() {
        showNameTextView = (TextView) findViewById(R.id.textView2);
        deskSpinner = (Spinner) findViewById(R.id.spinner);
        foodListView = (ListView) findViewById(R.id.listView);
    }






} //main classic
