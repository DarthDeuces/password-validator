package com.example.password_validator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.String.valueOf;

public class MainActivity extends AppCompatActivity {

    TextView txt;
    Button btn;
    EditText input;
    static Validator validator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt= (TextView) findViewById(R.id.textField);
        btn= (Button) findViewById(R.id.button);
        input= (EditText) findViewById(R.id.inputPass);

        //String pass = valueOf(input.getText());
        String pass = input.toString();
        validator = new Validator();
        validator.setPass(pass);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                if (validator.validate() < 4){
                    txt.setText("Not Strong");
                }
                else {
                    txt.setText("Strong");
                }
            }
        });
    }
}
