package com.hcl.fragmentdataflow.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.hcl.fragmentdataflow.R;
import com.hcl.fragmentdataflow.fragments.TypesFragment;
import com.hcl.fragmentdataflow.fragments.dummy.DummyContent;

public class StaticFragmentActivity extends AppCompatActivity implements TypesFragment.OnListFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_static_fragment);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public void onListFragmentInteraction(DummyContent.DummyItem item) {

    }
}
