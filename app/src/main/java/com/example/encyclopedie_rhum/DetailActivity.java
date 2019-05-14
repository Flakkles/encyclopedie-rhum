package com.example.encyclopedie_rhum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import model.*;

import java.util.Arrays;

public class DetailActivity extends AppCompatActivity {

    private TextView mRhumNameView;
    private TextView mRhumDescriptionView;

    private RhumBank mRhumBank;
    private Rhum mCurrentRhum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        mRhumBank = generateRhums();

        mRhumNameView = findViewById(R.id.activity_detail_rhum_name);
        mRhumDescriptionView = findViewById(R.id.activity_detail_rhum_description);

        mCurrentRhum = mRhumBank.getRhum(1);
        this.displayRhum(mCurrentRhum);
    }

    private void displayRhum(final Rhum rhum) {
        mRhumNameView.setText(rhum.getNom());
        mRhumDescriptionView.setText(rhum.getDescription());
    }

    private RhumBank generateRhums() {
        Rhum rhum1 = new Rhum(1,"Captain Morgan","Le rhum des pirates");

        return new RhumBank(Arrays.asList(rhum1));
    }
}
