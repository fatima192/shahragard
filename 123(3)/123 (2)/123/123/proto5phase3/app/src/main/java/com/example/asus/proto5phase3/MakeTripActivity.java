//package com.example.asus.proto5phase3;
//
//import android.content.Context;
//import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
//import android.util.Log;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.Toast;
//
//public class MakeTripActivity extends AppCompatActivity {
//    private Context mContext = MakeTripActivity.this;
//    public static DatabaseHelper tripDb;
//    EditText origin, destination, day, month, time, seats;
//    Button btnMakeTrip;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState){
//        super.onCreate(savedInstanceState);
//
//        tripDb = new DatabaseHelper(this);
//        origin = findViewById(R.id.origin_input);
//        destination = findViewById(R.id.destination_input);
//        day = findViewById(R.id.day_input);
//        month = findViewById(R.id.month_input);
//        time = findViewById(R.id.time_input);
//        seats = findViewById(R.id.seats_input);
//        //exp = findViewByI
//        //
//        // d(R.id.exp_input);
//        btnMakeTrip = findViewById(R.id.maketrip_button);
//        setContentView(R.layout.activity_main);
//        addData();
//
//
//    }
//    boolean isInserted;
//    public void addData() {
//        btnMakeTrip.setOnClickListener(
//                new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                isInserted = tripDb.insertData(origin.getText().toString(), destination.getText().toString(), day.getText().toString(), month.getText().toString(),
//                        time.getText().toString(), seats.getText().toString());
//                if (isInserted == true)
//                    Toast.makeText(MakeTripActivity.this, "trip added", Toast.LENGTH_LONG).show();
//                else
//
//                    Toast.makeText(MakeTripActivity.this, "trip did not added", Toast.LENGTH_LONG).show();
//
//                    }
//                }
//        );
//    }
//}
//
