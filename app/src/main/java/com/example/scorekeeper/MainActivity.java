package com.example.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int mScore1;
    private int mScore2;
    TextView mTextTeam1;
    TextView mTextTeam2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextTeam1 = findViewById(R.id.score_team1);
        mTextTeam2 = findViewById(R.id.score_team2);

    }

    public void decreaseScore(View view) {
        int viewID = view.getId();
        switch (viewID){
            case R.id.decrease_Team1 :
                mScore1--;
                mTextTeam1.setText(String.valueOf(mScore1));
                break;
            case R.id.decrease_Team2 :
                mScore2--;
                mTextTeam2.setText(String.valueOf(mScore2));
        }
    }

    public void increaseScore(View view) {
        int viewID = view.getId();
        switch (viewID){
            case R.id.increase_Team1 :
                mScore1++;
                mTextTeam1.setText(String.valueOf(mScore1));
                break;
            case R.id.increase_Team2 :
                mScore2++;
                mTextTeam2.setText(String.valueOf(mScore2));
        }
    }
}