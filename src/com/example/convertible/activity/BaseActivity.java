package com.example.convertible.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;
import android.graphics.Typeface;
import com.example.convertible.R;


public class BaseActivity extends Activity
{

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_screen);

        Typeface font = Typeface.createFromAsset(getAssets(), "Roboto_Thin.ttf");
        TextView txt = (TextView) findViewById(R.id.sexy);
        txt.setTypeface(font);
        font = Typeface.createFromAsset(getAssets(), "Roboto_Light.ttf");
        txt = (TextView) findViewById(R.id.convert);
        txt.setTypeface(font);
    }


    public void onButtonClick(View view) {
        Intent intent = new Intent(this, OptionMenuActivity.class);
        startActivity(intent);
    }

    /**
     * A custom EditText that draws lines between each line of text that is displayed.
     */



}


