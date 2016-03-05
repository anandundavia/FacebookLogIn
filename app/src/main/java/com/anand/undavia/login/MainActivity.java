package com.anand.undavia.login;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.facebook.CallbackManager;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.login.widget.LoginButton;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Fragment fb = new LogInFrag();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ftm = fm.beginTransaction();
        ftm.replace(R.id.container,fb).commit();
    }


    @Override
    protected void onResume()
    {
        super.onResume();
        AppEventsLogger.activateApp(this);
    }

    protected void onPause()
    {
        super.onPause();
        AppEventsLogger.deactivateApp(this);
    }


}
