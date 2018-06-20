package com.example.testvocacional.TestBasico;

import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.testvocacional.R;
import com.example.testvocacional.Util.ConexionSQLite;
import com.example.testvocacional.Util.Constantes;
import com.example.testvocacional.inicioActivity;

public class basicoActivity extends AppCompatActivity implements View.OnClickListener{

    private CardView uno,dos,tre,cua, evaluar;
    private Button salir;
    private Integer r1 = 0,r2 = 0,r3 = 0,r4 = 0;
    private Integer res1,res2,res3,res4,res5;
    private String ID;
    private Bundle bundle;
    private ConexionSQLite conn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basico);
        uno = findViewById(R.id.btn_1);
        dos = findViewById(R.id.btn_2);
        tre = findViewById(R.id.btn_3);
        cua = findViewById(R.id.btn_4);
        evaluar = findViewById(R.id.btn_evaluar);
        salir = findViewById(R.id.btn_salir);

        SharedPreferences sharedPreferences = getSharedPreferences(Constantes.PREFERENCIAS_RES,0);
        ID = sharedPreferences.getString(Constantes.PREFERENCIAS_RES_BASICO,null);
        if(ID != null){
            conn = new ConexionSQLite(getApplicationContext());
            SQLiteDatabase db = conn.getReadableDatabase();
            String[] param = {ID};
            String[] campos = {Constantes.CAMPO_R1, Constantes.CAMPO_R2,Constantes.CAMPO_R3,Constantes.CAMPO_R4};

            Cursor cursor = db.query(Constantes.TABLA_RES_BAS_NOMBRE,campos,Constantes.CAMPO_ID +"=?",param,null,null,null);
            cursor.moveToFirst();
            r1=cursor.getInt(0);
            r2=cursor.getInt(1);
            r3=cursor.getInt(2);
            r4=cursor.getInt(3);

            if (r1==0){uno.setEnabled(true);} else {uno.setEnabled(false);}
            if (r2==0){dos.setEnabled(true);}
            if (r3==0){tre.setEnabled(true);}
            if (r4==0){cua.setEnabled(true);}
            if (r1+r2+r3+r4==4){evaluar.setEnabled(true);}
            db.close();
        }

        uno.setOnClickListener(this);
        dos.setOnClickListener(this);
        tre.setOnClickListener(this);
        cua.setOnClickListener(this);
        evaluar.setOnClickListener(this);
        salir.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch(v.getId()){
            case R.id.btn_salir:
                i = new Intent(this,inicioActivity.class);
                startActivity(i);
                break;

            case R.id.btn_1:
                i = new Intent(this,basic_1.class);
                startActivity(i);
                break;

            case R.id.btn_2:
                i = new Intent(this,basic_2.class);
                startActivity(i);
                break;

            case R.id.btn_3:
                i = new Intent(this,basic_3.class);
                startActivity(i);
                break;

            case R.id.btn_4:
                i = new Intent(this,basic_4.class);
                startActivity(i);
                break;

            case R.id.btn_evaluar:

                  //Esto es para eliminar la preferencia
                SharedPreferences sharedPreferences = getSharedPreferences(Constantes.PREFERENCIAS_RES,0);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.remove(Constantes.PREFERENCIAS_RES_BASICO);
                editor.commit();

                ConexionSQLite conn = new ConexionSQLite(this);
                conn = new ConexionSQLite(getApplicationContext());
                String[] parametros = {ID};
                SQLiteDatabase db = conn.getWritableDatabase();
                ContentValues values = new ContentValues();
                values.put (Constantes.CAMPO_ESTADO, 1);
                db.update(Constantes.TABLA_RES_BAS_NOMBRE,values,Constantes.CAMPO_ID +"=?",parametros);

                i = new Intent(this,basic_resultado.class);
                i.putExtra("ID",ID);
                startActivity(i);
                break;
        }

    }
}
