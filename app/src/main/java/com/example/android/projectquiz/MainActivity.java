package com.example.android.projectquiz;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int score = 0;
    String ans1 = "Delhi";
    String ans2 = "Tiger";
    String ans3 = "Peacock";
    String ans4 = "Lotus";
    String ans5 = "Aryan";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void check(String s, String a)
    {
        if(s.equalsIgnoreCase(a))
        {
            score = UpdateScore(score);
        }
        else
            score = dupdateScore(score);
    }

   

    public void Submit(View view) {

        EditText ans_1 = findViewById(R.id.a1);
        String ans1u = ans_1.getText().toString();
        check(ans1u, ans1);
        EditText ans_2 = findViewById(R.id.a2);
        String ans2u = ans_2.getText().toString();
        check(ans2u, ans2);
        EditText ans_3 = findViewById(R.id.a3);
        String ans3u = ans_3.getText().toString();
        check(ans3u, ans3);
        EditText ans_4 = findViewById(R.id.a4);
        String ans4u = ans_4.getText().toString();
        check(ans4u, ans4);
        EditText ans_5 = findViewById(R.id.a5);
        String ans5u = ans_5.getText().toString();
        check(ans5u, ans5);
        CheckBox cb1 = findViewById(R.id.a6_1);
        boolean has1cb = cb1.isChecked();
        CheckBox cb2 = findViewById(R.id.a6_2);
        boolean has2cb = cb2.isChecked();
        CheckBox cb3 = findViewById(R.id.a6_3);
        boolean has3cb = cb3.isChecked();
        CheckBox cb4 = findViewById(R.id.a6_4);
        boolean has4cb = cb4.isChecked();

//        if(ans1u.equalsIgnoreCase(ans1))
//        {
//            score = UpdateScore(score);
//        }
//        else if(ans2u.equalsIgnoreCase(ans2))
//        {
//            score = UpdateScore(score);
//        }
//        else if(ans3u.equalsIgnoreCase(ans3))
//        {
//            score = UpdateScore(score);
//        }
//        else if(ans4u.equalsIgnoreCase(ans4))
//        {
//            score = UpdateScore(score);
//        }
//        else if(ans5u.equalsIgnoreCase(ans5))
//        {
//            score = UpdateScore(score);
//        }
        if(has1cb)
        {
            score = UpdateScore(score);
        }
        if(has2cb)
        {
            score = UpdateScore(score);
        }
        if(has3cb)
        {
            score = UpdateScore(score);
        }
        else if(has4cb)
        {
            score = dupdateScore(score);
        }
        RadioGroup radioGroup = findViewById(R.id.radiogroup);
        int answerRadioButtonId = radioGroup.getCheckedRadioButtonId();
        if (answerRadioButtonId != -1) {
            RadioButton answer = findViewById(answerRadioButtonId);
            if (answer.getText().equals(getResources().getString(R.string._29_states_and_7_union_territories))) {
                UpdateScore(score);
            } else {
                dupdateScore(score);
            }
        } else {
            Toast.makeText(getApplicationContext(), getResources().getString(R.string.ans), Toast.LENGTH_SHORT).show();
        }

        if (score<2)
            Toast.makeText(MainActivity.this,"Your Score is: "+score+" out of 8 !!\n Padhai Likhai pe Dhyan Do beta", Toast.LENGTH_LONG).show();

        Toast.makeText(MainActivity.this,"Your Score is: "+score+" out of 8 !!", Toast.LENGTH_LONG).show();


        score = 0;

    }

    private int dupdateScore(int i) {
        if (i>0) {
            i = i - 1;
            return i;
        }
        else
        return i;
    }

    public int UpdateScore(int i)
    {
        i = i+1;
        return i;
    }
}