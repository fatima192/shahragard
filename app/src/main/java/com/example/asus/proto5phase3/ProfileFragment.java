package com.example.asus.proto5phase3;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.EditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.asus.proto5phase3.Database.Model.User;


public class ProfileFragment extends Fragment {
    public TextView profileName,profileAge, profileAddress,profilePhonNum,profileCar, carModel;

    public static ProfileFragment newInstance() {
        ProfileFragment fragment= new ProfileFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_profile, container, false);
        profileName = v.findViewById(R.id.profileName);
        profileAge = v.findViewById(R.id.profileAge);
        profileAddress = v.findViewById(R.id.profileAddress);
        profilePhonNum = v.findViewById(R.id.proflePhoneNum);
        profileCar = v.findViewById(R.id.profileCarNum);
        carModel = v.findViewById(R.id.profileCar);

        profileName.setText(signIn.globalUser.getName());
        profileAge.setText(signIn.globalUser.getAge());
        profileAddress.setText(signIn.globalUser.getCity());
        profilePhonNum.setText(signIn.globalUser.getNumber());
        profileCar.setText(signIn.globalUser.getCarNumber());
        carModel.setText(signIn.globalUser.getCar());


        return v;

    }
}
