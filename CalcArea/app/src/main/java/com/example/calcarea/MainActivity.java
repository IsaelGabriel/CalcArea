package com.example.calcarea;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calc();

    }
    public void calc()
    {
        final Button button = (Button) findViewById(R.id.b_calc);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                int height = Integer.parseInt(((EditText) findViewById(R.id.e_height)).getText().toString());
                int width = Integer.parseInt(((EditText) findViewById(R.id.e_width)).getText().toString());
                TextView area = (TextView) findViewById(R.id.area_text);
                area.setText("Área = " + Integer.toString(height*width));

            }
        });
    }
}
