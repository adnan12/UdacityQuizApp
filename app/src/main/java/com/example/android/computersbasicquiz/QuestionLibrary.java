package com.example.android.computersbasicquiz;

import android.widget.TextView;

/**
 * Created by Adnan on 4/13/17.
 */

public class QuestionLibrary {

    /**
     * Three memeber elements
     *
     */

    private String mQuestions[] = {"Which part is the 'BRAIN' of the computer",
            "What is the permanent memory built into your computer called?",
            " Approximately how many bytes make one Megabyte",
    "The capacity of your hard drive is measured in",
            "Which of the following is not an input device?",
            "Which of the following is not an output device?",
            "Which device allows your computer to talk to other computers over a telephone line as well as access the internet?",
    "Which of the following is an operating system you would be using on the computer?",
    "Which of these is a not a computer manufacturer?", "What does RAM stand for?"};
    private String mChoices[][] = {

            {"Monitor", "CPU", "RAM"},
            {"ROM", "RAM", "CPU"},{"One Thousand", "One Million", "Ten Thousand"},{"Mhz", "Mbps", "Gigabytes"},
            {"Keyboard", "Joystick", "Monitor"},{"Keyboard", "Speakers", "Printers"},
            {"RAM", "Hard Drive", "Modem"},{"Internet Explorer", "Microsoft Windows", "Microsoft Word"},
            {"IBM", "Apple", "Microsoft"},
            {"Remote Authorization Mechanism", "Random Access Memory", "Random Authorization Mechanism"}
    };

    private String mCorrectAnswers [] ={

            "CPU", "ROM", "One Million", "Gigabyte", "Monitor", "Keyboard", "Modem", "Microsoft Windows",
            "Microsoft", "Random Access Memory"
    };
    public String getQuestions(int a){

         String question;
        question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a){
        String choice0 = mChoices[a][0];
        return choice0;

    }
    public String getChoice2(int a){
        String choice1 = mChoices[a][1];
        return choice1;

    }
    public String getChoice3(int a){
        String choice2 = mChoices[a][2];
        return choice2;

    }

    public String getCorrectAnswer(int a){

        String answer = mCorrectAnswers[a];
        return answer;
    }

    }



