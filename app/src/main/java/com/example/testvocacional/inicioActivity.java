package com.example.testvocacional;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class inicioActivity extends AppCompatActivity {
    Context cnt;
    FragmentManager fragmentManager = getSupportFragmentManager();
    homeFrag hf;
    resultadosFragment rf;
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_inicio:
                    hf = new homeFrag();
                    fragmentManager.beginTransaction().replace(R.id.contenedor, hf).commit();
                    return true;
                case R.id.navigation_result:
                    rf= new resultadosFragment();
                    Toast.makeText(cnt, "result", Toast.LENGTH_SHORT).show();
                    fragmentManager.beginTransaction().replace(R.id.contenedor, rf).commit();
                    return true;
                case R.id.navigation_config:
                    Toast.makeText(cnt, "config", Toast.LENGTH_SHORT).show();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        cnt = inicioActivity.this;
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        hf = new homeFrag();
        fragmentManager.beginTransaction().add(R.id.contenedor, hf).commit();


    }

}
