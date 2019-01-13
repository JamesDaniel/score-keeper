package irish.james.scorekeeper.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import irish.james.scorekeeper.R;

public class MainActivity extends AppCompatActivity {

  private Button team1ScoreBtn;
  private Button team1FoulBtn;
  private Button team2ScoreBtn;
  private Button team2FoulBtn;
  private Button resetBtn;

  private TextView team1ScoreTxt;
  private TextView team1FoulTxt;
  private TextView team2ScoreTxt;
  private TextView team2FoulTxt;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    team1ScoreBtn = findViewById(R.id.team1ScoreBtn);
    team1FoulBtn = findViewById(R.id.team1FoulBtn);
    team2ScoreBtn = findViewById(R.id.team2ScoreBtn);
    team2FoulBtn = findViewById(R.id.team2FoulBtn);
    resetBtn = findViewById(R.id.resetBtn);

    team1ScoreTxt = findViewById(R.id.team1ScoreTxt);
    team1FoulTxt = findViewById(R.id.team1FoulTxt);
    team2ScoreTxt = findViewById(R.id.team2ScoreTxt);
    team2FoulTxt = findViewById(R.id.team2FoulTxt);

    team1ScoreBtn.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        increaseTxtNumericValue(team1ScoreTxt);
      }
    });
    team1FoulBtn.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        increaseTxtNumericValue(team1FoulTxt);
      }
    });
    team2ScoreBtn.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        increaseTxtNumericValue(team2ScoreTxt);
      }
    });
    team2FoulBtn.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        increaseTxtNumericValue(team2FoulTxt);
      }
    });
    resetBtn.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        team1ScoreTxt.setText("0");
        team1FoulTxt.setText("0");
        team2ScoreTxt.setText("0");
        team2FoulTxt.setText("0");
      }
    });
  }

  private void increaseTxtNumericValue(TextView textView) {
    int textInt = Integer.parseInt(textView.getText().toString());
    textInt++;
    textView.setText(String.valueOf(textInt));
  }
}
