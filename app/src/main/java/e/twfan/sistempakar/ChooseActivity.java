package e.twfan.sistempakar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ChooseActivity extends AppCompatActivity {

    @BindView(R.id.btn_siup) Button btn_siup;
    @BindView(R.id.btn_tdp) Button btn_tdp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);
        ButterKnife.bind(this);

        btn_siup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ChooseActivity.this, Question1Activity.class));
                finish();
            }
        });


        btn_tdp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ChooseActivity.this, Question1Activity.class));
                finish();
            }
        });
    }
}
