package com.techbridge.func;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    EditText editTextMe, editTextComputer;
    Button btnPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextMe = (EditText) findViewById(R.id.et_me);
        editTextComputer = (EditText) findViewById(R.id.et_you);
        btnPlay = (Button) findViewById(R.id.btn_play);

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String me = editTextMe.getText().toString();

                // 얘는 0이상 1미만의 유리수가 랜덤하게 나옴.
                double a = Math.random();

                Random random = new Random();
                int b = random.nextInt();
                int c = random.nextInt(3);

                String computer = "";
                if (c == 0) {
                    computer = "rock";
                } else if (c == 1) {
                    computer = "scissors";
                } else if (c == 2) {
                    computer = "paper";
                }

                editTextComputer.setText(computer);

                String result = whoWon(me, computer);

                Toast.makeText(MainActivity.this, result, Toast.LENGTH_SHORT).show();

                String someString = returnHello();

                int sum = add(11, 100);
            }
        });
    }

    public String returnHello() {
        return "Hi";
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a- b;
    }

    public String whoWon(String me, String computer){
        String result = "";

        if (me.equals("rock")) {
            if(computer.equals("rock")){
                result = "Draw!";
            } else if(computer.equals("paper")){
                result = "Lose!";
            } else if(computer.equals("scissors")){
                result = "Win!";
            } else {
                result = "Typo!";
            }
        } else if(me.equals("paper")){
            if(computer.equals("rock")){
                result = "Win!";
            } else if(computer.equals("paper")){
                result = "Draw!";
            } else if(computer.equals("scissors")){
                result = "Lose!";
            } else {
                result = "Typo!";
            }
        } else if(me.equals("scissors")){
            if(computer.equals("rock")){
                result = "Lose!";
            } else if(computer.equals("paper")){
                result = "Win!";
            } else if(computer.equals("scissors")){
                result = "Draw!";
            } else {
                result = "Typo!";
            }
        } else {
            result = "Typo!";
        }

//        Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();
        return result;
    }
}