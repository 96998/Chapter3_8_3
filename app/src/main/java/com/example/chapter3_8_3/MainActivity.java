package com.example.chapter3_8_3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    private TextView text;
    private Button button;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        text = (TextView) this.findViewById(R.id.text);
        text.setText(this.toString());
        button = (Button) this.findViewById(R.id.button_stand);
        button.setOnClickListener(new ButtonClickListener());
    }

    // 按钮单击事件
    private final class ButtonClickListener implements View.OnClickListener {
        public void onClick(View v) {
            LaunchStandard();
        }
    }

    public void LaunchStandard() {
        startActivity(new Intent(this, MainActivity.class));
        text.setText(this.toString());
    }
}