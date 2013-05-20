package com.example.convertible.activity;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import com.example.convertible.tools.LengthUtils;
import com.example.convertible.R;


public class LengthConversionActivity extends Activity {

    final static int KILOMETRES = 0;
    final static int METRES = 1;
    final static int CENTIMETRES = 2;
    final static int MILIMETRES = 3;

    private EditText mFromLengthView;
    private EditText mToLengthView;
    private Integer mFromUnit = 0;
    private Double mFromLength;
    private Integer mToUnit = 0;
    private Double mToLength;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.length_screen);

        mFromLengthView = (EditText) findViewById(R.id.enter_amount);
        mToLengthView = (EditText) findViewById(R.id.result_amount);
        initPage();
    }

    private void initPage() {
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

        ArrayAdapter<CharSequence> lengthAdapter = ArrayAdapter.createFromResource(this, R.array.length_units_array, R.layout.simple_spinner_item);
        lengthAdapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);

        Spinner mLengthFromSpinner = (Spinner) findViewById(R.id.length_from_spinner);
        Spinner mLengthToSpinner = (Spinner) findViewById(R.id.length_to_spinner);
        mLengthFromSpinner.setAdapter(lengthAdapter);
        mLengthToSpinner.setAdapter(lengthAdapter);

        mLengthFromSpinner.setOnItemSelectedListener(new FromSpinner());
        mLengthToSpinner.setOnItemSelectedListener(new ToSpinner());
    }

    public void onLengthConvertClick(View view) {
        mFromLength = (mFromLengthView.getText().toString()).equals("") ? 0.0 : Double.parseDouble(mFromLengthView.getText().toString());

        if (mFromUnit == KILOMETRES) {
            switch (mToUnit) {
                case METRES:
                    mToLength = LengthUtils.kilometreToMetre(mFromLength);
                    mToLengthView.setText( String.format("%.3f", mToLength));
                    break;
                case CENTIMETRES:
                    mToLength = LengthUtils.kilometreToCentimetre(mFromLength);
                    mToLengthView.setText( String.format("%.3f", mToLength));
                    break;
                case MILIMETRES:
                    mToLength = LengthUtils.kilometreToMillimetre(mFromLength);
                    mToLengthView.setText( String.format("%.3f", mToLength));
                    break;
                default:
                    break;
            }
        } else if (mFromUnit == METRES) {
            switch (mToUnit) {
                case KILOMETRES:
                    mToLength = LengthUtils.metresToKilometres(mFromLength);
                    mToLengthView.setText( String.format("%.3f", mToLength));
                    break;
                case CENTIMETRES:
                    mToLength = LengthUtils.metresToCentimetres(mFromLength);
                    mToLengthView.setText( String.format("%.3f", mToLength));
                    break;
                case MILIMETRES:
                    mToLength = LengthUtils.metresToMilliimetres(mFromLength);
                    mToLengthView.setText( String.format("%.3f", mToLength));
                    break;
                default:
                    break;
            }
        } else if (mFromUnit == CENTIMETRES) {
            switch (mToUnit) {
                case KILOMETRES:
                    mToLength = LengthUtils.centimetresToKilometres(mFromLength);
                    mToLengthView.setText( String.format("%.3f", mToLength));
                    break;
                case METRES:
                    mToLength = LengthUtils.centimetresToMetres(mFromLength);
                    mToLengthView.setText( String.format("%.3f", mToLength));
                    break;
                case MILIMETRES:
                    mToLength = LengthUtils.centimetresToMillimetres(mFromLength);
                    mToLengthView.setText( String.format("%.3f", mToLength));
                    break;
                default:
                    break;
            }
        } else if (mFromUnit == MILIMETRES) {
            switch (mToUnit) {
                case KILOMETRES:
                    mToLength = LengthUtils.millimetresToKilometres(mFromLength);
                    mToLengthView.setText( String.format("%.3f", mToLength));
                    break;
                case METRES:
                    mToLength = LengthUtils.millimetresToMetres(mFromLength);
                    mToLengthView.setText( String.format("%.3f", mToLength));
                    break;
                case CENTIMETRES:
                    mToLength = LengthUtils.millimetresToCentimetres(mFromLength);
                    mToLengthView.setText( String.format("%.3f", mToLength));
                    break;
                default:
                    break;
            }
        }
    }

    class FromSpinner implements Spinner.OnItemSelectedListener
    {
        @Override
        public void onItemSelected(AdapterView parent, View v, int position,
                                   long id) {
            TextView unitFrom = (TextView) findViewById(R.id.enter_amount_unit);
            mFromUnit = position;
            switch (position) {
                case KILOMETRES:     unitFrom.setText("km");
                    break;
                case METRES:     unitFrom.setText("m");
                    break;
                case CENTIMETRES:     unitFrom.setText("cm");
                    break;
                case MILIMETRES:     unitFrom.setText("mm");
                    break;
            }

        }

        @Override
        public void onNothingSelected(AdapterView parent) {
            // TODO Auto-generated method stub
            // Do nothing.
        }

    }

    class ToSpinner implements Spinner.OnItemSelectedListener
    {
        @Override
        public void onItemSelected(AdapterView parent, View v, int position,
                                   long id) {
            TextView unitFrom = (TextView) findViewById(R.id.result_amount_unit);
            mToUnit = position;
            switch (position) {
                case KILOMETRES:     unitFrom.setText("km");
                    break;
                case METRES:     unitFrom.setText("m");
                    break;
                case CENTIMETRES:     unitFrom.setText("cm");
                    break;
                case MILIMETRES:     unitFrom.setText("mm");
                    break;
            }
        }

        @Override
        public void onNothingSelected(AdapterView parent) {
            // TODO Auto-generated method stub
            // Do nothing.
        }

    }
}


