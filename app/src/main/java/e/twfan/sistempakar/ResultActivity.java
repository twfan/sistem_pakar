package e.twfan.sistempakar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ResultActivity extends AppCompatActivity {

    @BindView(R.id.txt_solusi) TextView txt_solusi;
    @BindView(R.id.txt_no_online) TextView txt_no_online;
    @BindView(R.id.txt_bentuk_usaha) TextView txt_bentuk_usaha;
    @BindView(R.id.txt_jenis_izin) TextView txt_jenis_izin;
    @BindView(R.id.txt_nama_perusahaan) TextView txt_nama_perusahaan;
    @BindView(R.id.txt_posisi_berkas) TextView txt_posisi_berkas;
    @BindView(R.id.txt_status_berkas) TextView txt_status_berkas;

    String id_user, no_online, bentuk_usaha, perusahaan, jenis_perizinan, posisi_berkas;

    public static int score=0;
    String solusi="";

    public static boolean answer1, answer2, answer3, answer4, answer5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        ButterKnife.bind(this);

        if(!answer1){
            solusi = solusi + "Upload data dengan benar dan lengkap, ";
        }

        if(!answer2){
            solusi = solusi + "Upload formulir ssw, ";
        }

        if(!answer4){
            solusi = solusi + "Alamat NPWP harus sesuai dengan alamat perusahaan, ";
        }

        if(!answer5){
            solusi = solusi + "Upload data diri terbaru ";
        }


        txt_solusi.setText(solusi);
//
//        txt_no_online.setText(LoginActivity.no_online.toString());
//        txt_bentuk_usaha.setText(LoginActivity.bentuk_usaha.toString());
//        txt_nama_perusahaan.setText(LoginActivity.perusahaan.toString());
//        txt_jenis_izin.setText(LoginActivity.jenis_perizinan.toString());
//        txt_posisi_berkas.setText(LoginActivity.posisi_berkas.toString());
//        txt_status_berkas.setText(LoginActivity.status_berkas.toString());
    }


}
