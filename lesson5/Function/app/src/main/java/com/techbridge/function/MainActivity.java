package com.techbridge.function;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String me;
        String you;

        me = "바위";
        you = "가위";

        if (me == "바위" && you == "가위") {
            printPrettyLine();
            System.out.println("i am winner!!");
            printPrettyLine();
        }
        if (me == "바위" && you == "바위") {
            prinLine();
            System.out.println("draw");
            prinLine();
        }
        if (me == "바위" && you == "보") {
            prinLine();
            System.out.println("you ard winner!!");
            prinLine();
        }
    }

    void prinLine() {
        System.out.println("======================================");
    }

    void printPrettyLine() {
        System.out.println("=-=-=-=-=-=-=-pretty=-=-=-=-=-=-=-=-=-");
    }
}
