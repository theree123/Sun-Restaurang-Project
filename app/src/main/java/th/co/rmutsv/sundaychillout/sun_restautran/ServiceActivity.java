package th.co.rmutsv.sundaychillout.sun_restautran;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
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

        showDesk();


    } //main method

    private void showDesk() {

        final String[] showDeskStrings = {"โต๊ะที่ 1", "โต๊ะที่ 2", "โต๊ะที่ 3", "โต๊ะที่ 4",
                "โต๊ะที่ 5", "โต๊ะที่ 6", "โต๊ะที่ 7", "โต๊ะที่ 8", "โต๊ะที่ 9", "โต๊ะที่ 10"};
        ArrayAdapter<String> deskAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, showDeskStrings);
        deskSpinner.setAdapter(deskAdapter);
        deskSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                deskString = showDeskStrings[i];
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                deskString = showDeskStrings[0];
            }
        });
    } //Show Desk

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
