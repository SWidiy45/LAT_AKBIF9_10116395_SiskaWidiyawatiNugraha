package app.lat_akbif9_10116395_siskawidiyawatinugrahacom.lat_akbif9_10116395_siskawidiyawatinugraha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class activity_code extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code);
    }
    public void masuk2 (View view){
        Intent intent = new Intent(activity_code.this,activity_isi.class);
        startActivity(intent);
    }
}
