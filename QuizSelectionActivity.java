package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import java.util.Random;

public class QuizSelectionActivity extends AppCompatActivity {

    Button quiz1Btn, quiz2Btn, quiz3Btn, quiz4Btn, quiz5Btn, randomQuizBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_selection);

        quiz1Btn = findViewById(R.id.quiz_1_btn);
        quiz2Btn = findViewById(R.id.quiz_2_btn);
        quiz3Btn = findViewById(R.id.quiz_3_btn);
        quiz4Btn = findViewById(R.id.quiz_4_btn);
        quiz5Btn = findViewById(R.id.quiz_5_btn);
        randomQuizBtn = findViewById(R.id.random_quiz_btn);

        quiz1Btn.setOnClickListener(v -> startQuiz(0));
        quiz2Btn.setOnClickListener(v -> startQuiz(1));
        quiz3Btn.setOnClickListener(v -> startQuiz(2));
        quiz4Btn.setOnClickListener(v -> startQuiz(3));
        quiz5Btn.setOnClickListener(v -> startQuiz(4));
        randomQuizBtn.setOnClickListener(v -> startRandomQuiz());
    }

    private void startQuiz(int quizIndex) {
        Intent intent = new Intent(QuizSelectionActivity.this, MainActivity.class);
        intent.putExtra("quizIndex", quizIndex);
        startActivity(intent);
    }

    private void startRandomQuiz() {
        Random random = new Random();
        int randomQuizIndex = random.nextInt(QuestionAnswer.questions.length);
        startQuiz(randomQuizIndex);
    }
}
