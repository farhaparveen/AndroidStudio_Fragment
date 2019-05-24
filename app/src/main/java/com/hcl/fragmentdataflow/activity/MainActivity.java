package com.hcl.fragmentdataflow.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.hcl.fragmentdataflow.R;
import com.hcl.fragmentdataflow.fragments.RecieverFragment;
import com.hcl.fragmentdataflow.fragments.SenderFragment;
import com.hcl.fragmentdataflow.interfaces.OnFragmentInteractionListener;

public class MainActivity extends AppCompatActivity implements OnFragmentInteractionListener {

    private LinearLayout mContainerLayout;
    private SenderFragment mSenderFragment;
    private RecieverFragment mRecieverFragment;
    private FragmentManager mFragmentManager;
    private FragmentTransaction mFragmentTransaction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContainerLayout = findViewById(R.id.container_layout);
        mFragmentManager = getSupportFragmentManager();
        mFragmentTransaction = mFragmentManager.beginTransaction();

        mSenderFragment = SenderFragment.newInstance("Android", "Sender");
        mFragmentTransaction.add(R.id.container_layout, mSenderFragment);
        mFragmentTransaction.addToBackStack(null);
        mFragmentTransaction.commit();

        mFragmentTransaction = mFragmentManager.beginTransaction();
        mRecieverFragment = RecieverFragment.newInstance("Android", "Reciever");
        mFragmentTransaction.add(R.id.container_layout, mRecieverFragment);
        mFragmentTransaction.addToBackStack(null);

        mFragmentTransaction.commit();

//        removeFragments();



        mFragmentManager.addOnBackStackChangedListener(new FragmentManager.OnBackStackChangedListener() {
            @Override
            public void onBackStackChanged() {
                Toast.makeText(MainActivity.this, "BackStack Changed.", Toast.LENGTH_SHORT).show();




            }
        });
    }

    private void removeFragments() {
        mFragmentTransaction = mFragmentManager.beginTransaction();
        mFragmentTransaction.remove(mRecieverFragment);
        mFragmentTransaction.remove(mSenderFragment);
        mFragmentTransaction.commit();
    }

    @Override
    public void onFragmentInteraction(String message) {
        if (mRecieverFragment != null) {
            mRecieverFragment.setData(message);
        }
    }
}
