package com.example.testvocacional.TestBasico;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.testvocacional.R;
import com.example.testvocacional.Util.ConexionSQLite;
import com.example.testvocacional.Util.Constantes;
import com.example.testvocacional.inicioActivity;

public class basicoActivity extends AppCompatActivity implements View.OnClickListener{

    private Button uno,dos,tre,cua, evaluar, salir;
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
        bundle = getIntent().getExtras();

        if(bundle != null){
            conn = new ConexionSQLite(getApplicationContext());
            SQLiteDatabase db = conn.getReadableDatabase();
            ID = bundle.getString("id");
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
                i.putExtra("id",ID);
                startActivity(i);
                break;

            case R.id.btn_3:
                i = new Intent(this,basic_3.class);
                i.putExtra("id",ID);
                startActivity(i);
                break;

            case R.id.btn_4:
                i = new Intent(this,basic_4.class);
                i.putExtra("id",ID);
                startActivity(i);
                break;

            case R.id.btn_evaluar:
                SQLiteDatabase db = conn.getReadableDatabase();
                int max = 0;
                ID = bundle.getString("id");
                String[] param = {ID};
                String[] campos = {Constantes.CAMPO_RES1,Constantes.CAMPO_RES2,Constantes.CAMPO_RES3,Constantes.CAMPO_RES4,Constantes.CAMPO_RES5};
                Cursor cursor = db.query(Constantes.TABLA_RES_BAS_NOMBRE,campos,Constantes.CAMPO_ID +"=?",param,null,null,null);
                cursor.moveToFirst();
                res1=cursor.getInt(0);
                res2=cursor.getInt(1);
                res3=cursor.getInt(2);
                res4=cursor.getInt(3);
                res5=cursor.getInt(4);

                if (max < res1) {
                    max = res1;
                }
                if (max < res2) {
                    max = res2;
                }
                if (max < res3) {
                    max = res3;
                }
                if (max < res4) {
                    max = res4;
                }
                if (max < res5) {
                    max = res5;
                }

                if (max == res1) {
                    Toast.makeText(getApplicationContext(), "Artes y creatividad", Toast.LENGTH_LONG).show();
                } else {
                    if (max == res2) {
                        Toast.makeText(getApplicationContext(), "Ciencias Sociales", Toast.LENGTH_LONG).show();
                    } else {
                        if (max == res3) {
                            Toast.makeText(getApplicationContext(), "Economica, Administrativa y Financiera", Toast.LENGTH_LONG).show();
                        } else {
                            if (max == res4) {
                                Toast.makeText(getApplicationContext(), "Ciencia y Tecnologia", Toast.LENGTH_LONG).show();
                            } else {
                                Toast.makeText(getApplicationContext(), "Ciencias Ecologicas y ciencias de la salud", Toast.LENGTH_LONG).show();
                            }
                        }
                    }
                }
                db.close();
                break;
        }

    }
}
