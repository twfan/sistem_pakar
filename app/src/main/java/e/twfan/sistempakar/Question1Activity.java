package e.twfan.sistempakar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Question1Activity extends AppCompatActivity {

    @BindView(R.id.btn_ya_1) Button btn_ya_1;
    @BindView(R.id.btn_tidak_1) Button btn_tidak_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);
        ButterKnife.bind(this);

        btn_ya_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ResultActivity.answer1=true;
                startActivity(new Intent(Question1Activity.this, Question2Activity.class));
                finish();
            }
        });

        btn_tidak_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ResultActivity.answer1=false;
                startActivity(new Intent(Question1Activity.this, ResultActivity.class));
                finish();
            }
        });


    }
}
