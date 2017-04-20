package com.example.ledi.testandroidgit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button butoni;
    TextView fusha;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        butoni = (Button) findViewById(R.id.butoni);
        fusha = (TextView) findViewById(R.id.fusha);
        img = (ImageView) findViewById(R.id.img);


        butoni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fusha.setText(R.string.message);
                img.setImageResource(R.mipmap.smiley);
            }
        });
    }
}
