package com.tigeroakes.sample.strikethru;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.screen).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        ImageView icon = findViewById(R.id.icon);
        icon.setEnabled(!icon.isEnabled());
    }
}
