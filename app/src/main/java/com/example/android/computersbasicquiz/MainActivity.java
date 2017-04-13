package com.example.android.computersbasicquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();


    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;

    private String qAnswers;
    private int qScore = 0;
    private int qQuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mScoreView = (TextView) findViewById(R.id.score);
        mQuestionView = (TextView)findViewById(R.id.question);

        mButtonChoice1 = (Button) findViewById(R.id.choice1);
        mButtonChoice2 = (Button) findViewById(R.id.choice2);
        mButtonChoice3 = (Button) findViewById(R.id.choice3);

        updateQuestion();

        // Start of Button1 listener for checking clicks

        mButtonChoice1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                // My logic

                if(mButtonChoice1.getText() == qAnswers){
                    qScore = qScore + 1;
                    updateScore(qScore);
                    updateQuestion();
                    Toast.makeText(MainActivity.this, "CORRECT", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "WRONG", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

        //End of the check box

        // Start of Button2 listener for checking clicks

        mButtonChoice2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                // My logic

                if(mButtonChoice2.getText() == qAnswers){
                    qScore = qScore + 1;
                    updateScore(qScore);
                    updateQuestion();
                    Toast.makeText(MainActivity.this, "CORRECT", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "WRONG", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
        //End of the Button 3

        // Start of Button1 listener for checking clicks

        mButtonChoice3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                // My logic

                if(mButtonChoice3.getText() == qAnswers){
                    qScore = qScore + 1;
                    updateScore(qScore);
                    updateQuestion();
                    Toast.makeText(MainActivity.this, "CORRECT", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "WRONG", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

        //End of the Button3


    }
    private void updateQuestion(){
        mQuestionView.setText(mQuestionLibrary.getQuestions(qQuestionNumber));
        mButtonChoice1.setText(mQuestionLibrary.getChoice1(qQuestionNumber));
        mButtonChoice2.setText(mQuestionLibrary.getChoice2(qQuestionNumber));
        mButtonChoice3.setText(mQuestionLibrary.getChoice3(qQuestionNumber));

        qAnswers = mQuestionLibrary.getCorrectAnswer(qQuestionNumber);
        qQuestionNumber++;


    }

    private void updateScore(int point){
        mScoreView.setText("" + qScore);
    }

    }
