package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    final int freeThrowPoint    = 1;
    final int twoPoints         = 2;
    final int threePoints       = 3;

    int scoreTeamA              = 0;
    int scoreTeamB              = 0;
    int numberOfFouls           = 0;
    int numberOfShotsAttempted  = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayForTeamA(scoreTeamA);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Adds three points for Team A
     * */
    public void addThreePointsForTeamA(View v) {
        scoreTeamA += threePoints;

        displayForTeamA(scoreTeamA);
    }
    /**
     * Adds two points for Team A
     * */
    public void addTwoPointsForTeamA(View v) {
        scoreTeamA += twoPoints;

        displayForTeamA(scoreTeamA);
    }
    /**
     * Adds one point for Team A
     * */
    public void addFreeThrowPointForTeamA(View v) {
        scoreTeamA += freeThrowPoint;

        displayForTeamA(scoreTeamA);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Adds three points for Team A
     * */
    public void addThreePointsForTeamB(View v) {
        scoreTeamB += threePoints;

        displayForTeamB(scoreTeamB);
    }
    /**
     * Adds two points for Team A
     * */
    public void addTwoPointsForTeamB(View v) {
        scoreTeamB += twoPoints;

        displayForTeamB(scoreTeamB);
    }
    /**
     * Adds one point for Team A
     * */
    public void addFreeThrowPointForTeamB(View v) {
        scoreTeamB += freeThrowPoint;

        displayForTeamB(scoreTeamB);
    }
    /**
     * Resets all values to zero*/
    public void resetScore(View v){
        scoreTeamA = 0;
        scoreTeamB = 0;

        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
