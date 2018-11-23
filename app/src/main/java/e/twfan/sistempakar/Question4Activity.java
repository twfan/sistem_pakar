package e.twfan.sistempakar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Question4Activity extends AppCompatActivity {

    @BindView(R.id.btn_ya_4) Button btn_ya_4;
    @BindView(R.id.btn_tidak_4) Button btn_tidak_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question4);

        ButterKnife.bind(this);

        btn_ya_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ResultActivity.answer4=true;
                startActivity(new Intent(Question4Activity.this, Question5Activity.class));
                finish();
            }
        });

        btn_tidak_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ResultActivity.answer4=false;
                startActivity(new Intent(Question4Activity.this, Question5Activity.class));
                finish();
            }
        });
    }
}
