package com.example.hamnox.bnrggeoquiz;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class QuestionsActivity extends Activity {
    private Button mNextButton;
    private TextView mQuestionTextView;

    private int mCurrentIndex = 0;
    private Question[] mQuestionBank = new Question[] {
            new Question(R.string.q1),
            new Question(R.string.q2),
            new Question(R.string.q3),
            new Question(R.string.q4),
            new Question(R.string.q5),
    };

    private int mMaxIndex = mQuestionBank.length;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        mQuestionTextView = (TextView) findViewById(R.id.question_text_view);

        int question = mQuestionBank[mCurrentIndex].getQuestion();
        mQuestionTextView.setText(question);
        mCurrentIndex += 1;

        mNextButton = (Button) findViewById(R.id.next_button);

        mNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // nice to have on hand:
                // Toast.makeText(QuestionsActivity.this, R.string.correct_toast, Toast.LENGTH_LONG).show();
                int question = mQuestionBank[mCurrentIndex].getQuestion();
                mQuestionTextView.setText(question);
                mCurrentIndex += 1;
                if (mCurrentIndex > mMaxIndex) {
                    mNextButton.setEnabled(false);
                }
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_quiz, menu);
        return true;
    }

//    This was not in the book
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
