package com.hcl.fragmentdataflow.fragments;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.hcl.fragmentdataflow.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class HCLFragment extends Fragment {

    private String mParam;

    public HCLFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.e("Method Name: ", "onCreateView");
        View view = inflater.inflate(R.layout.fragment_static_fragment, container, false);
        TextView textView = view.findViewById(R.id.textView);
        if (mParam!=null) {
            textView.setText(mParam);
        }
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.e("Method Name: ", "onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("Method Name: ", "onCreate");
        if (getArguments() != null) {
            mParam = getArguments().getString("ARG_PARAM");
        }
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.e("Method Name: ", "onViewCreated");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.e("Method Name: ", "onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e("Method Name: ", "onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("Method Name: ", "onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e("Method Name: ", "onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e("Method Name: ", "onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e("Method Name: ", "onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("Method Name: ", "onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e("Method Name: ", "onDetach");
    }
}
