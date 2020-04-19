package com.example.lesson6;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ShareFragment extends Fragment {
TextView result;
Button share;
    public ShareFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_share, container, false);
    }

    private void onAttach() {
        Log.d("olol","onAttach");
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        result=view.findViewById(R.id.result);
        onAttach();
        share=view.findViewById(R.id.share);
        final MainActivity mainActivity = (MainActivity) getActivity();
        result.setText(mainActivity.operand.toString());
        share.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        mainActivity.onShare(v);
    }
});
    }
}
