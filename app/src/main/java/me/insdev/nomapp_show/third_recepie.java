package me.insdev.nomapp_show;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import me.insdev.nomapp_show.SampleActivityBase;
import android.support.v4.app.FragmentTransaction;


public class third_recepie extends /*Activity*/ SampleActivityBase {


   /* @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_recepie);


    }*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_recepie);

        if (savedInstanceState == null) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            SlidingTabsBasicFragment fragment = new SlidingTabsBasicFragment();

            transaction.replace(R.id.sample_content_fragment, fragment);
            transaction.commit();

        }

    }




}
