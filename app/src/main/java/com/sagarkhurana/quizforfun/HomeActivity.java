package com.sagarkhurana.quizforfun;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.sagarkhurana.quizforfun.data.User;
import com.sagarkhurana.quizforfun.other.Constants;
import com.sagarkhurana.quizforfun.other.SharedPref;

public class HomeActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        TextView tvUsername = findViewById(R.id.tvUsernameHome);
//        CardView cvStartQuiz = findViewById(R.id.cvStartQuiz);
//        CardView cvRule = findViewById(R.id.cvRule);
//        CardView cvHistory = findViewById(R.id.cvHistory);
//        CardView cvEditPassword = findViewById(R.id.cvEditPassword);
//        Button cvLogout = findViewById(R.id.cvLogout);
        ImageButton cvProfile = findViewById(R.id.profile_button);
        CardView beginner = findViewById(R.id.beginner);
        CardView intermediate = findViewById(R.id.intermediate);
        CardView expert = findViewById(R.id.expert);

        SharedPref sharedPref = SharedPref.getInstance();
        User user = sharedPref.getUser(this);
        tvUsername.setText("Hello, " + user.getUsername());

        beginner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, QuizOptionActivity.class);
                intent.putExtra("levelTitle", "beginner");
                startActivity(intent);
            }
        });

        intermediate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, QuizOptionActivity.class);
                intent.putExtra("levelTitle", "intermediate");
                startActivity(intent);
            }
        });

        expert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, QuizOptionActivity.class);
                intent.putExtra("levelTitle", "expert");
                startActivity(intent);
            }
        });

//        cvStartQuiz.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivity(new Intent(MainActivity.this,QuizOptionActivity.class));
//            }
//        });

//        cvRule.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivity(new Intent(MainActivity.this,RuleActivity.class));
//            }
//        });
//
//        cvHistory.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivity(new Intent(MainActivity.this,HistoryActivity.class));
//            }
//        });
//
//        cvEditPassword.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivity(new Intent(MainActivity.this,EditPasswordActivity.class));
//            }
//        });
//
//        cvLogout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                sharedPref.clearSharedPref(MainActivity.this);
//                Intent intent = new Intent(MainActivity.this,LoginActivity.class);
//                startActivity(intent);
//                finish();
//            }
//        });

        cvProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this,ProfileActivity.class));
            }
        });



    }


}