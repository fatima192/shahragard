//package com.example.asus.proto5phase3;
//
//import android.content.Context;
//import android.database.Cursor;
//import android.os.Bundle;
//import android.support.v7.app.AlertDialog;
//import android.support.v7.app.AppCompatActivity;
//import android.util.Log;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//
//public class SearchActivity extends AppCompatActivity{
//    private Context mContext=SearchActivity.this;
//
//    MakeTripActivity search;
//    Button btnSearch;
//    EditText origin, destination, day, month, seats;
//
//
//    protected void creat() {
//
//        search=new MakeTripActivity();
//        origin=findViewById(R.id.editText);
//        destination=findViewById(R.id.editText2);
//        day=findViewById(R.id.editText3);
//        month=findViewById(R.id.editText3);
//        seats=findViewById(R.id.editText4);
//        btnSearch=findViewById(R.id.search_button);
//        view();
//
//
//
//    }
//    public void  view(){
//        final boolean flag;
//        btnSearch.setOnClickListener(
//                new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        Cursor res= search.tripDb.getAllData();
//                        if (res.getCount()==0){
//                            show("Error", "Nothing found");
//                            return;
//
//                        }
//                        StringBuffer buffer= new StringBuffer();
//                        while (res.moveToNext()){
//
//                            if (res.getString(0).equals(origin)){
//                                if(res.getString(1).equals(destination)){
//                                    if(res.getString(2).equals(day)){
//                                        if(res.getString(3).equals(month)){
//                                            buffer.append("origin:"+ res.getString(0)+ "\n");
//                                            buffer.append("destination:" +res.getString(1)+ "\n");
//                                            buffer.append(res.getString(2)+ "\n");
//                                            buffer.append(res.getString(3)+ "\n");
//                                            buffer.append("time:"+res.getString(4)+ "\n");
//                                            buffer.append("numer of seats: " +res.getString(5)+ "\n");
//                                            buffer.append("extra explanations:" + res.getString(6)+ "\n");
//                                            show("Trips",buffer.toString());
//
//
//
//                                        }
//                                        else
//                                            show("Error", "invalid data");
//
//                                    }
//                                    else
//                                        show("Error", "invalid data");
//
//                                }
//                                else
//                                    show("Error", "invalid data");
//
//                            }
//                            else
//                                show("Error", "invalid data");
//                        }
//
//                    }
//                }
//        );
//
//    }
//    public  void show(String title, String message ){
//        AlertDialog.Builder builder = new AlertDialog.Builder(this);
//        builder.setCancelable(true);
//        builder.setTitle(title);
//        builder.setMessage(message);
//        builder.show();
//
//    }
//}
