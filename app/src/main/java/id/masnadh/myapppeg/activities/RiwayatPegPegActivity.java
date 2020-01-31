package id.masnadh.myapppeg.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.PagerAdapter;

import android.app.ProgressDialog;
import android.content.SharedPreferences;
import android.os.Bundle;

import id.masnadh.myapppeg.R;

public class RiwayatPegPegActivity extends AppCompatActivity {

    String idu,id;
    ProgressDialog progressDialog;
    SharedPreferences sharedpreferences;
    public final static String TAG = "DataActivity";
    public final static String TAG_ID = "id";
    PagerAdapter pagerAdapter;
    Boolean session = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riwayat_peg_peg);

        Toolbar toolbar = findViewById(R.id.profileToolbar2);
        setSupportActionBar(toolbar);

        toolbar.setTitleTextColor(ContextCompat.getColor(this, R.color.white));
        getSupportActionBar().setTitle("Riwayat Kepegawaian");


    }
}
