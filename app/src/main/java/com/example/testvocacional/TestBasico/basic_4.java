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

public class basic_4 extends AppCompatActivity implements View.OnClickListener{
    CheckBox rb;
    Button btn;
    private String ID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_4);
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
                int r40 = 0, r41 = 0, r42 = 0, r43 = 0, r44 = 0, r45 = 0, r46 = 0, r48 = 0, r49 = 0, r51 = 0, r52 = 0;

                rb = (CheckBox) findViewById(R.id.R40);
                if (rb.isChecked()) {
                    r40 = 1;
                } else {
                    r40 = 0;
                }
                rb = (CheckBox) findViewById(R.id.R41);
                if (rb.isChecked()) {
                    r41 = 1;
                } else {
                    r41 = 0;
                }
                rb = (CheckBox) findViewById(R.id.R42);
                if (rb.isChecked()) {
                    r42 = 1;
                } else {
                    r42 = 0;
                }
                rb = (CheckBox) findViewById(R.id.R43);
                if (rb.isChecked()) {
                    r43 = 1;
                } else {
                    r43 = 0;
                }
                rb = (CheckBox) findViewById(R.id.R44);
                if (rb.isChecked()) {
                    r44 = 1;
                } else {
                    r44 = 0;
                }
                rb = (CheckBox) findViewById(R.id.R45);
                if (rb.isChecked()) {
                    r45 = 1;
                } else {
                    r45 = 0;
                }
                rb = (CheckBox) findViewById(R.id.R46);
                if (rb.isChecked()) {
                    r46 = 1;
                } else {
                    r46 = 0;
                }
                rb = (CheckBox) findViewById(R.id.R48);
                if (rb.isChecked()) {
                    r48 = 1;
                } else {
                    r48 = 0;
                }
                rb = (CheckBox) findViewById(R.id.R49);
                if (rb.isChecked()) {
                    r49 = 1;
                } else {
                    r49 = 0;
                }
                rb = (CheckBox) findViewById(R.id.R51);
                if (rb.isChecked()) {
                    r51 = 1;
                } else {
                    r51 = 0;
                }
                rb = (CheckBox) findViewById(R.id.R52);
                if (rb.isChecked()) {
                    r52 = 1;
                } else {
                    r52 = 0;
                }
                Res1 = r43 + r46;
                Res2 = r42 + r49 + r52;
                Res3 = r44;
                Res4 = r41 + r48 + r51;
                Res5 = r40 + r45;

                if (Res1 + Res2 + Res3 + Res4 + Res5 <= 5) {
                    Toast.makeText(getApplicationContext(), "Debe marcar almenos 6 actividades", Toast.LENGTH_SHORT).show();
                } else {
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
                    values.put (Constantes.CAMPO_RES1, Res1);
                    values.put (Constantes.CAMPO_RES2, Res2);
                    values.put (Constantes.CAMPO_RES3, Res3);
                    values.put (Constantes.CAMPO_RES4, Res4);
                    values.put (Constantes.CAMPO_RES5, Res5);
                    values.put (Constantes.CAMPO_R4, 1);

                    db.update(Constantes.TABLA_RES_BAS_NOMBRE,values,Constantes.CAMPO_ID +"=?",parametros);
                    Intent intent = new Intent(this, basicoActivity.class);
                    db.close();
                    startActivity(intent);
                }
                break;
        }
    }
}
