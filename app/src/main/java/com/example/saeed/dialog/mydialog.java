package com.example.saeed.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.zip.Inflater;

/**
 * Created by saeed on 4/13/2017.
 */

public class mydialog extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = (LayoutInflater) getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final View myview = inflater.inflate(R.layout.dialog, null, false);
        Button btn_Register = (Button) myview.findViewById(R.id.btn_Register);
        btn_Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Successful :D", Toast.LENGTH_SHORT).show();
                getDialog().dismiss();
            }
        });
        builder.setView(myview);
        return builder.create();

    }
}
