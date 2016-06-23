package com.techbridge.cal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCalc = (Button) findViewById(R.id.btn_calc);

        View.OnClickListener calcButtonLister = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText num1 = (EditText) findViewById(R.id.et_num1);
                EditText num2 = (EditText) findViewById(R.id.et_num2);
                EditText symbol = (EditText) findViewById(R.id.et_symbol);

                TextView result = (TextView) findViewById(R.id.tv_result);

                String num1String = num1.getText().toString();
                String num2String = num2.getText().toString();

                int num1Int = Integer.parseInt(num1String);
                int num2Int = Integer.parseInt(num2String);

                String symbolString = symbol.getText().toString();

                String calcResult = "Can not calculate";

                if (symbolString.equals("+")) {
                    calcResult = String.valueOf(num1Int + num2Int);
                } else if (symbolString.equals("-")) {
                    calcResult = String.valueOf(num1Int - num2Int);
                } else if (symbolString.equals("*")) {
                    calcResult = String.valueOf(num1Int * num2Int);
                } else if (symbolString.equals("/")) {

                    if (num1Int == 0) {
                        // 같을 때

                    }
                    if (num1Int >= 0) {
                        // 0 이상

                    }
                    if (num1Int <= 0) {
                        // 0 이하

                    }
                    if (num1Int != 0) {
                        // 0이 아닐 때

                    }
                    if (num1Int >= 0 && num1Int <= 10) {
                        // 0 이상 이고 10  이하
                    }
                    if (num1Int >= 0 || num1Int <= 10) {
                        // 0 이상 이거나 10 이하
                    }


                    calcResult = String.valueOf(num1Int / num2Int);
                }

                result.setText( calcResult );
            }
        };

        btnCalc.setOnClickListener(calcButtonLister);
    }

    void showToast(String text) {
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_LONG).show();
    }

}