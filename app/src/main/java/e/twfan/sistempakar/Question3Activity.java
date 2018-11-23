package e.twfan.sistempakar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Question3Activity extends AppCompatActivity {

    @BindView(R.id.btn_ya_3) Button btn_ya_3;
    @BindView(R.id.btn_tidak_3) Button btn_tidak_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);
        ButterKnife.bind(this);

        btn_ya_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ResultActivity.answer3=true;
                startActivity(new Intent(Question3Activity.this, Question4Activity.class));
                finish();
            }
        });

        btn_tidak_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ResultActivity.answer3=false;
                startActivity(new Intent(Question3Activity.this, Question4Activity.class));
                finish();
            }
        });
    }
}
