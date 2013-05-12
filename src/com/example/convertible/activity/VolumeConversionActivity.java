package com.example.convertible.activity;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;
import com.example.convertible.R;


public class VolumeConversionActivity extends Activity {

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.volume_screen);

        Typeface font1 = Typeface.createFromAsset(getAssets(), "Roboto_Thin.ttf");
        TextView txt = (TextView) findViewById(R.id.sexy);
        txt.setTypeface(font1);
        Typeface font2 = Typeface.createFromAsset(getAssets(), "Roboto_Light.ttf");
        txt = (TextView) findViewById(R.id.convert);
        txt.setTypeface(font2);

        txt = (TextView) findViewById(R.id.option_volume);
        txt.setTypeface(font1);
        txt = (TextView) findViewById(R.id.enter_amount);
        txt.setTypeface(font2);
        txt = (TextView) findViewById(R.id.enter_amount_unit);
        txt.setTypeface(font2);
        txt = (TextView) findViewById(R.id.result_amount);
        txt.setTypeface(font2);
        txt = (TextView) findViewById(R.id.result_amount_unit);
        txt.setTypeface(font2);


    }
}
