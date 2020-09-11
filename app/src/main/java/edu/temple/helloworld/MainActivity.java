package edu.temple.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button)findViewById(R.id.Button);
        text = (TextView)findViewById(R.id.Text);
        button.setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                text.setText("You have clicked the button");
            }
        });
    }
}