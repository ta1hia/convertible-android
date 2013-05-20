package com.example.convertible.activity;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import com.example.convertible.R;


public class LengthConversionActivity extends Activity {

    private Spinner mLengthSpinner;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.length_screen);

        Typeface font1 = Typeface.createFromAsset(getAssets(), "Roboto_Thin.ttf");
        TextView txt = (TextView) findViewById(R.id.sexy);
        txt.setTypeface(font1);
        Typeface font2 = Typeface.createFromAsset(getAssets(), "Roboto_Light.ttf");
        txt = (TextView) findViewById(R.id.convert);
        txt.setTypeface(font2);

        txt = (TextView) findViewById(R.id.option_length);
        txt.setTypeface(font1);
        txt = (TextView) findViewById(R.id.enter_amount);
        txt.setTypeface(font2);
        txt = (TextView) findViewById(R.id.enter_amount_unit);
        txt.setTypeface(font2);
        txt = (TextView) findViewById(R.id.result_amount);
        txt.setTypeface(font2);
        txt = (TextView) findViewById(R.id.result_amount_unit);
        txt.setTypeface(font2);

        initLengthFromSpinner();
        initLengthToSpinner();

    }

    private void initLengthFromSpinner() {
        mLengthSpinner = (Spinner) findViewById(R.id.length_from_spinner);
        ArrayAdapter<CharSequence> lengthAdapter = ArrayAdapter.createFromResource(this, R.array.length_units_array, R.layout.simple_spinner_item);
        lengthAdapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
        mLengthSpinner.setAdapter(lengthAdapter);
    }

    private void initLengthToSpinner() {
        mLengthSpinner = (Spinner) findViewById(R.id.length_to_spinner);
        ArrayAdapter<CharSequence> lengthAdapter = ArrayAdapter.createFromResource(this, R.array.length_units_array, R.layout.simple_spinner_item);
        lengthAdapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
        mLengthSpinner.setAdapter(lengthAdapter);
    }
}
