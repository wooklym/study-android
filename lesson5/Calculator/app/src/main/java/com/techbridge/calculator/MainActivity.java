package com.techbridge.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.security.InvalidParameterException;
import java.text.NumberFormat;

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

                String symbolString = symbol.getText().toString();

                int calcResult;

                try {
                    calcResult = calculator(num1String, num2String, symbolString);
                    result.setText( String.valueOf(calcResult));
                } catch (NumberFormatException e) {
                    showToast(e.getMessage());
                    num1.setText("");
                    num2.setText("");
                } catch (InvalidParameterException e) {
                    showToast(e.getMessage());
                    symbol.setText("");
                }

            }
        };

        btnCalc.setOnClickListener(calcButtonLister);
    }

    void showToast(String text) {
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_LONG).show();
    }

    int calculator(String input1, String input2, String symbol) throws NumberFormatException, InvalidParameterException {
        int a = Integer.parseInt(input1);
        int b = Integer.parseInt(input2);

        switch (symbol) {
            case "+":
                return add(a, b);
            case "-":
                return sub(a, b);
            case "*":
                return multifly(a, b);
            case "/":
                return devide(a, b);
            default:
                throw new InvalidParameterException("not an operator");
        }

    }

    int add(int a, int b) {
        return  a + b;
    }

    int sub(int a, int b) {
        return a - b;
    }

    int multifly(int a, int b) {
        return a * b;
    }

    int devide(int a, int b) {
        return a / b;
    }

}
