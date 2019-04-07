package app.lat_akbif9_10116395_siskawidiyawatinugrahacom.lat_akbif9_10116395_siskawidiyawatinugraha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.security.PublicKey;

public class activity_isi extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "app.com.lat_akbif9_10116395_siskawidiyawatinugraha";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi);
    }

    public void selanjutnya (View view){
        Intent intent = new Intent(activity_isi.this,activity_hasil.class);
        EditText nama = (EditText)findViewById(R.id.nama);
        EditText umur = (EditText)findViewById(R.id.umur);

        String pesan = nama.getText().toString();

        intent.putExtra(EXTRA_MESSAGE,pesan);

        startActivity(intent);

    }


}
