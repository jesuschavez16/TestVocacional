package com.example.testvocacional;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Locale;

public class idiomaActivity extends AppCompatActivity implements View.OnClickListener{
    private Locale locale;
    private Configuration config = new Configuration();
    Context cnt;
    //SharedPreferences sp = getSharedPreferences("Preferencias",this.MODE_PRIVATE);
    CardView esp, que;

    //slider adapter



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_idioma);
        //SharedPreferences sp = getPreferences(this.MODE_PRIVATE);
       // if(sp.getInt("Abierto",0)== 1){
       //     Intent intent = new Intent( this, inicioActivity.class );
        //    startActivity( intent );
        //}

        //slider Adapter



        //test vocacional
        esp=(CardView)findViewById(R.id.btn_espanol);
        que=(CardView)findViewById(R.id.btn_quechua);
        esp.setOnClickListener(this);
        que.setOnClickListener(this);
        cnt = idiomaActivity.this;
    }

    @Override
    public void onClick(View v) {
       // SharedPreferences sp = getPreferences(this.MODE_PRIVATE);
       // SharedPreferences.Editor editor = sp.edit();
       // editor.putInt("Abierto",1);
        switch (v.getId()){
            case R.id.btn_espanol:
                locale = new Locale("default");
                config.locale =locale;
                getResources().updateConfiguration(config, null);
                Intent intent = new Intent( this, inicioActivity.class );
                startActivity( intent );
                break;

            case R.id.btn_quechua:
                locale = new Locale("qu");
                config.locale =locale;
                getResources().updateConfiguration(config, null);
                Intent intent1 = new Intent( this, inicioActivity.class );
                startActivity( intent1 );
                break;
        }
    }
}
