package e.twfan.sistempakar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.andexert.library.RippleView;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.JSONObjectRequestListener;
import com.stepstone.apprating.AppRatingDialog;
import com.stepstone.apprating.listener.RatingDialogListener;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Text;

import java.util.Arrays;

import butterknife.BindView;
import butterknife.ButterKnife;
import e.twfan.sistempakar.helper.Config;

public class ResultActivity extends AppCompatActivity implements RatingDialogListener {

    @BindView(R.id.txt_solusi) TextView txt_solusi;
    @BindView(R.id.txt_no_online) TextView txt_no_online;
    @BindView(R.id.txt_bentuk_usaha) TextView txt_bentuk_usaha;
    @BindView(R.id.txt_jenis_izin) TextView txt_jenis_izin;
    @BindView(R.id.txt_nama_perusahaan) TextView txt_nama_perusahaan;
    @BindView(R.id.txt_posisi_berkas) TextView txt_posisi_berkas;
    @BindView(R.id.txt_status_berkas) TextView txt_status_berkas;
    @BindView(R.id.ripSelesai) RippleView ripSelesai;

    String id_user, no_online, bentuk_usaha, perusahaan, jenis_perizinan, posisi_berkas;

    public static int score=0, rate=0;
    String solusi="";

    public static boolean answer1, answer2, answer3, answer4, answer5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        ButterKnife.bind(this);

        if(!answer1){
            solusi = solusi + "Upload data dengan benar dan lengkap, ";
        }else{
            if(!answer2){
                solusi = solusi + "Upload formulir ssw, ";
            }

            if(!answer4){
                solusi = solusi + "Alamat NPWP harus sesuai dengan alamat perusahaan, ";
            }

            if(!answer5){
                solusi = solusi + "Upload data diri terbaru ";
            }
        }

        if(answer1== true && answer1==answer2 && answer2==answer3 && answer3==answer4 && answer4==answer5){
            solusi = "Berkas anda sudah lengkap dan tidak ada masalah, mohon ditunggu untuk proses petugas";
        }




        txt_solusi.setText(solusi);
//
        txt_no_online.setText(LoginActivity.no_online.toString());
        txt_bentuk_usaha.setText(LoginActivity.bentuk_usaha.toString());
        txt_nama_perusahaan.setText(LoginActivity.perusahaan.toString());
        txt_jenis_izin.setText(LoginActivity.jenis_perizinan.toString());
        txt_posisi_berkas.setText(LoginActivity.posisi_berkas.toString());
        txt_status_berkas.setText(LoginActivity.status_berkas.toString());


        ripSelesai.setOnRippleCompleteListener(new RippleView.OnRippleCompleteListener() {
            @Override
            public void onComplete(RippleView rippleView) {
//                Toast.makeText(ResultActivity.this , "Testing", Toast.LENGTH_LONG).show();
                showDialog();
            }
        });
    }
//===========================================RATING CODE============================
    @Override
    public void onPositiveButtonClicked(int rate, String comment) {
        // interpret results, send it to analytics etc...
        ResultActivity.rate = rate;
        addMysQL();


    }

    @Override
    public void onNegativeButtonClicked() {

    }

    @Override
    public void onNeutralButtonClicked() {

    }

    private void showDialog() {
        new AppRatingDialog.Builder()
                .setPositiveButtonText("Submit")
                .setNoteDescriptions(Arrays.asList("Very Bad", "Not good", "Quite ok", "Very Good", "Excellent !!!"))
                .setDefaultRating(2)
                .setTitle("Rate this application")
                .setCommentInputEnabled(false)
                .setWindowAnimation(R.style.MyDialogFadeAnimation)
                .setCanceledOnTouchOutside(false)
                .create(ResultActivity.this)
                .show();
    }

//    ===========================================END OF RATING CODE============================


    private void addMysQL(){

        String add_no_online = txt_no_online.getText().toString();
        String add_answer1 = String.valueOf(answer1);
        String add_answer2 = String.valueOf(answer2);
        String add_answer3 = String.valueOf(answer3);
        String add_answer4 = String.valueOf(answer4);
        String add_answer5 = String.valueOf(answer5);
        String add_solusi = solusi;
        String add_rate = String .valueOf(ResultActivity.rate);


        AndroidNetworking.post(Config.HOST + "insert.php")
                .addBodyParameter("no_online", add_no_online)
                .addBodyParameter("pertanyaan1", add_answer1 )
                .addBodyParameter("pertanyaan2", add_answer2 )
                .addBodyParameter("pertanyaan3", add_answer3 )
                .addBodyParameter("pertanyaan4", add_answer4 )
                .addBodyParameter("pertanyaan5", add_answer5 )
                .addBodyParameter("solusi", add_solusi )
                .addBodyParameter("bintang", add_rate )
                .setTag("test")
                .setPriority(Priority.MEDIUM)
                .build()
                .getAsJSONObject(new JSONObjectRequestListener() {
                    @Override
                    public void onResponse(JSONObject response) {
                        // do anything with response
                        try{
                            if(response.getString("response").equals("success")){

                                Toast.makeText(ResultActivity.this , "Tanggapan bintang dan pengaduan telah tersimpan, Terima kasih. ", Toast.LENGTH_LONG).show();
                                startActivity(new Intent(ResultActivity.this, LoginActivity.class));
                                finish();

                            }else
                            {
                                Toast.makeText(ResultActivity.this , response.getString("response"), Toast.LENGTH_LONG).show();
                            }
                        }catch (JSONException e){
                            e.printStackTrace();
                        }
                    }
                    @Override
                    public void onError(ANError error) {
                        // handle error
                    }
                });
    }



}
