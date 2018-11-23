package e.twfan.sistempakar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Question2Activity extends AppCompatActivity {

    @BindView(R.id.btn_ya_2) Button btn_ya_2;
    @BindView(R.id.btn_tidak_2) Button btn_tidak_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
        ButterKnife.bind(this);

        btn_ya_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ResultActivity.answer2 = true;
                startActivity(new Intent(Question2Activity.this, Question3Activity.class));
                finish();
            }
        });

        btn_tidak_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ResultActivity.answer2 = false;
                startActivity(new Intent(Question2Activity.this, Question3Activity.class));
                finish();
            }
        });
    }
}
