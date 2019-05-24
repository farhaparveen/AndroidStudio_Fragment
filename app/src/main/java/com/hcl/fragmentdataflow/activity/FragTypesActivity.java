package com.hcl.fragmentdataflow.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.hcl.fragmentdataflow.R;
import com.hcl.fragmentdataflow.fragments.TypesFragment;
import com.hcl.fragmentdataflow.fragments.dummy.DummyContent;

public class FragTypesActivity extends AppCompatActivity implements TypesFragment.OnListFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frag_types);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public void onListFragmentInteraction(DummyContent.DummyItem item) {

        if (item.id.equalsIgnoreCase("1")){
            startActivity(new Intent(this, StaticFragmentActivity.class));
        }else if(item.id.equalsIgnoreCase("2")){
            startActivity(new Intent(this, DynamicFragmentActivity.class));
        }else if(item.id.equalsIgnoreCase("3")){
            startActivity(new Intent(this, DynamicFragmentActivity.class));
        }else if(item.id.equalsIgnoreCase("4")){
            startActivity(new Intent(this, MainActivity.class));
        }else if(item.id.equalsIgnoreCase("5")){
            startActivity(new Intent(this, MainActivity.class));
        }

    }
}
