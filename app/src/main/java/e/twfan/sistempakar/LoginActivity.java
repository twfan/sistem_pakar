package e.twfan.sistempakar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.andexert.library.RippleView;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.JSONObjectRequestListener;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;

import butterknife.BindView;
import butterknife.ButterKnife;
import e.twfan.sistempakar.helper.Config;

public class LoginActivity extends AppCompatActivity {


    public static Integer Id_user ;
    public static String jenis_perizinan, no_online, bentuk_usaha, perusahaan, posisi_berkas, status_berkas ;

    @BindView(R.id.ripLogin) RippleView ripLogin;
    @BindView(R.id.inputNomorOnline) EditText inputNomorOnline;
    @BindView(R.id.inputDaftarPassword) EditText inputDaftarPassword;
//    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

//        Spinner spinner = (Spinner) findViewById(R.id.spinner_jenis);
//        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
//                R.array.jenis_usaha, android.R.layout.simple_spinner_item);
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner.setAdapter(adapter);



        ripLogin.setOnRippleCompleteListener(new RippleView.OnRippleCompleteListener() {
            @Override
            public void onComplete(RippleView rippleView) {
//                Toast.makeText(LoginActivity.this , "Anda Gagal login ", Toast.LENGTH_LONG).show();
                _loginMYSQL();
            }
        });
    }


    private void _loginMYSQL(){
        String varNologin = inputNomorOnline.getText().toString();
        String varPassword = inputDaftarPassword.getText().toString();

        startActivity(new Intent(LoginActivity.this, ChooseActivity.class ));
//                                finish();

//        AndroidNetworking.post(Config.HOST + "login.php")
//                .addBodyParameter("no_online", varNologin)
//                .addBodyParameter("password", varPassword)
//                .setTag("test")
//                .setPriority(Priority.MEDIUM)
//                .build()
//                .getAsJSONObject(new JSONObjectRequestListener() {
//                    @Override
//                    public void onResponse(JSONObject response) {
//                        // do anything with response
//                        try{
//                            if(response.getString("response").equals("success")){
//                                Toast.makeText(LoginActivity.this , "Anda Berhasil login ", Toast.LENGTH_LONG).show();
//
//                                JSONArray jsonArray = response.getJSONArray("hasil");
//                                for(int i=0;i< jsonArray.length();i++){
//                                    JSONObject jsonObject = jsonArray.getJSONObject(i);
//                                    Id_user = jsonObject.getInt("ID");
//                                    no_online = jsonObject.getString("no_online");
//                                    jenis_perizinan = jsonObject.getString("jenis_perizinan");
//                                    bentuk_usaha = jsonObject.getString("bentuk_usaha");
//                                    perusahaan = jsonObject.getString("perusahaan");
//                                    posisi_berkas = jsonObject.getString("posisi_berkas");
//                                    status_berkas = jsonObject.getString("status_berkas");
//                                }
//
//                            }else
//                            {
//                                Toast.makeText(LoginActivity.this , "Anda Gagal login ", Toast.LENGTH_LONG).show();
//                            }
//                        }catch (JSONException e){
//                            e.printStackTrace();
//                        }
//                    }
//                    @Override
//                    public void onError(ANError error) {
//                        // handle error
//                    }
//                });
    }
}
