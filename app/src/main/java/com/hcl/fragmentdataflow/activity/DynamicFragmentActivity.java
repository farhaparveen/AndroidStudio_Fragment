package com.hcl.fragmentdataflow.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.hcl.fragmentdataflow.R;
import com.hcl.fragmentdataflow.fragments.HCLFragment;

public class DynamicFragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic_fragment);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        addFragmentToUI(fragmentTransaction);
    }



    private void addFragmentToUI(FragmentTransaction fragmentTransaction) {
        HCLFragment hclFragment = new HCLFragment();

        setDataToFragment(hclFragment);

        fragmentTransaction.add(R.id.container, hclFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    private void setDataToFragment(HCLFragment hclFragment) {
        Bundle args = new Bundle();
        args.putString("ARG_PARAM", "Dynamic Fragment Example");
        hclFragment.setArguments(args);
    }

}
