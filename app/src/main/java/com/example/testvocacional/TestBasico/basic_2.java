package com.example.testvocacional.TestBasico;

import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import com.example.testvocacional.R;
import com.example.testvocacional.Util.ConexionSQLite;
import com.example.testvocacional.Util.Constantes;

public class basic_2 extends AppCompatActivity implements View.OnClickListener {
    CheckBox rb;
    Button btn;
    private String ID;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_2);
        btn = (Button) findViewById(R.id.Enviar);
        btn.setOnClickListener(this);
        SharedPreferences sharedPreferences = getSharedPreferences(Constantes.PREFERENCIAS_RES,0);
        ID = sharedPreferences.getString(Constantes.PREFERENCIAS_RES_BASICO,null);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.Enviar:
                int Res1 = 0, Res2 = 0, Res3 = 0, Res4 = 0, Res5 = 0;
                int r14 = 0, r15 = 0, r16 = 0, r17 = 0, r18 = 0, r19 = 0, r20 = 0, r21 = 0, r22 = 0, r23 = 0, r24 = 0, r25 = 0, r26 = 0;

                rb = (CheckBox) findViewById(R.id.R14);
                if (rb.isChecked()) {
                    r14 = 1;
                } else {
                    r14 = 0;
                }
                rb = (CheckBox) findViewById(R.id.R15);
                if (rb.isChecked()) {
                    r15 = 1;
                } else {
                    r15 = 0;
                }
                rb = (CheckBox) findViewById(R.id.R16);
                if (rb.isChecked()) {
                    r16 = 1;
                } else {
                    r16 = 0;
                }
                rb = (CheckBox) findViewById(R.id.R17);
                if (rb.isChecked()) {
                    r17 = 1;
                } else {
                    r17 = 0;
                }
                rb = (CheckBox) findViewById(R.id.R18);
                if (rb.isChecked()) {
                    r18 = 1;
                } else {
                    r18 = 0;
                }
                rb = (CheckBox) findViewById(R.id.R19);
                if (rb.isChecked()) {
                    r19 = 1;
                } else {
                    r19 = 0;
                }
                rb = (CheckBox) findViewById(R.id.R20);
                if (rb.isChecked()) {
                    r20 = 1;
                } else {
                    r20 = 0;
                }
                rb = (CheckBox) findViewById(R.id.R21);
                if (rb.isChecked()) {
                    r21 = 1;
                } else {
                    r21 = 0;
                }
                rb = (CheckBox) findViewById(R.id.R22);
                if (rb.isChecked()) {
                    r22 = 1;
                } else {
                    r22 = 0;
                }
                rb = (CheckBox) findViewById(R.id.R23);
                if (rb.isChecked()) {
                    r23 = 1;
                } else {
                    r23 = 0;
                }
                rb = (CheckBox) findViewById(R.id.R24);
                if (rb.isChecked()) {
                    r24 = 1;
                } else {
                    r24 = 0;
                }
                rb = (CheckBox) findViewById(R.id.R25);
                if (rb.isChecked()) {
                    r25 = 1;
                } else {
                    r25 = 0;
                }
                rb = (CheckBox) findViewById(R.id.R26);
                if (rb.isChecked()) {
                    r26 = 1;
                } else {
                    r26 = 0;
                }

                Res1 = r20 ;
                Res2 = r23 + r25 ;
                Res3 = r15 + r19 + r21 + r26 ;
                Res4 = r17 + r18 + r24 ;
                Res5 = r14 + r16 + r22 ;

                if (Res1 + Res2 + Res3 + Res4 + Res5 <= 5) {
                    Toast.makeText(getApplicationContext(), "Debe marcar almenos 6 actividades", Toast.LENGTH_SHORT).show();
                } else{
                    ConexionSQLite conn = new ConexionSQLite(this);
                    conn = new ConexionSQLite(getApplicationContext());
                    SQLiteDatabase db = conn.getReadableDatabase();
                    String[] parametros = {ID};
                    String[] campos = {Constantes.CAMPO_RES1,Constantes.CAMPO_RES2,Constantes.CAMPO_RES3,Constantes.CAMPO_RES4,Constantes.CAMPO_RES5};
                    Cursor cursor = db.query(Constantes.TABLA_RES_BAS_NOMBRE,campos,Constantes.CAMPO_ID +"=?",parametros,null,null,null);
                    cursor.moveToFirst();
                    Res1=Res1 + cursor.getInt(0);
                    Res2=Res2 + cursor.getInt(1);
                    Res3=Res3 + cursor.getInt(2);
                    Res4=Res4 + cursor.getInt(3);
                    Res5=Res5 + cursor.getInt(4);

                    db = conn.getWritableDatabase();
                    ContentValues values = new ContentValues();
                    values.put(Constantes.CAMPO_RES1,Res1);
                    values.put(Constantes.CAMPO_RES2,Res2);
                    values.put(Constantes.CAMPO_RES3,Res3);
                    values.put(Constantes.CAMPO_RES4,Res4);
                    values.put(Constantes.CAMPO_RES5,Res5);
                    values.put(Constantes.CAMPO_R2, 1);

                    db.update(Constantes.TABLA_RES_BAS_NOMBRE,values,Constantes.CAMPO_ID +"=?",parametros);
                    Intent intent = new Intent(this, basicoActivity.class);
                    db.close();
                    startActivity(intent);
                }
                break;
        }
    }
}
