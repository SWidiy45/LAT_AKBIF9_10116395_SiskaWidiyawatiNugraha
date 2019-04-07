package app.lat_akbif9_10116395_siskawidiyawatinugrahacom.lat_akbif9_10116395_siskawidiyawatinugraha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class activity_hasil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);
        Intent intent = getIntent();
        String pesan = intent.getStringExtra(activity_isi.EXTRA_MESSAGE);
        TextView textView = (TextView)findViewById(R.id.txt1);
        textView.setText(pesan);

    }

    public void  oke (View view) {
        finish();
        moveTaskToBack(true);
    }
}
