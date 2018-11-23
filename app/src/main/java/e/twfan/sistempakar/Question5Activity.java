package e.twfan.sistempakar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Question5Activity extends AppCompatActivity {

    @BindView(R.id.btn_ya_5) Button btn_ya_5;
    @BindView(R.id.btn_tidak_5) Button btn_tidak_5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question5);
        ButterKnife.bind(this);

        btn_ya_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ResultActivity.answer5=true;
                startActivity(new Intent(Question5Activity.this, ResultActivity.class));
                finish();
            }
        });

        btn_tidak_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ResultActivity.answer5=false;
                startActivity(new Intent(Question5Activity.this, ResultActivity.class));
                finish();
            }
        });
    }
}
