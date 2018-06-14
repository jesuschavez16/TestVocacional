package com.example.testvocacional.TestBasico;

import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.example.testvocacional.R;
import com.example.testvocacional.Util.ConexionSQLite;
import com.example.testvocacional.Util.Constantes;


public class basic_1 extends AppCompatActivity implements View.OnClickListener {
    CheckBox rb;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_1);
        btn = (Button) findViewById(R.id.Enviar);
        btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.Enviar:
                int Res1 = 0, Res2 = 0, Res3 = 0, Res4 = 0, Res5 = 0;
                int r1 = 0, r2 = 0, r3 = 0, r4 = 0, r5 = 0, r6 = 0, r7 = 0, r8 = 0, r9 = 0, r10 = 0, r11 = 0, r12 = 0, r13 = 0;
                rb = (CheckBox) findViewById(R.id.R1);
                if (rb.isChecked()) {
                    r1 = 1;
                } else {
                    r1 = 0;
                }
                rb = (CheckBox) findViewById(R.id.R2);
                if (rb.isChecked()) {
                    r2 = 1;
                } else {
                    r2 = 0;
                }
                rb = (CheckBox) findViewById(R.id.R3);
                if (rb.isChecked()) {
                    r3 = 1;
                } else {
                    r3 = 0;
                }
                rb = (CheckBox) findViewById(R.id.R4);
                if (rb.isChecked()) {
                    r4 = 1;
                } else {
                    r4 = 0;
                }
                rb = (CheckBox) findViewById(R.id.R5);
                if (rb.isChecked()) {
                    r5 = 1;
                } else {
                    r5 = 0;
                }
                rb = (CheckBox) findViewById(R.id.R6);
                if (rb.isChecked()) {
                    r6 = 1;
                } else {
                    r6 = 0;
                }
                rb = (CheckBox) findViewById(R.id.R7);
                if (rb.isChecked()) {
                    r7 = 1;
                } else {
                    r7 = 0;
                }
                rb = (CheckBox) findViewById(R.id.R8);
                if (rb.isChecked()) {
                    r8 = 1;
                } else {
                    r8 = 0;
                }
                rb = (CheckBox) findViewById(R.id.R9);
                if (rb.isChecked()) {
                    r9 = 1;
                } else {
                    r9 = 0;
                }
                rb = (CheckBox) findViewById(R.id.R10);
                if (rb.isChecked()) {
                    r10 = 1;
                } else {
                    r10 = 0;
                }
                rb = (CheckBox) findViewById(R.id.R11);
                if (rb.isChecked()) {
                    r11 = 1;
                } else {
                    r11 = 0;
                }
                rb = (CheckBox) findViewById(R.id.R12);
                if (rb.isChecked()) {
                    r12 = 1;
                } else {
                    r12 = 0;
                }
                rb = (CheckBox) findViewById(R.id.R13);
                if (rb.isChecked()) {
                    r13 = 1;
                } else {
                    r13 = 0;
                }

                Res1 = r4 + r9 + r12;
                Res2 = r6 + r13;
                Res3 = r5 + r10;
                Res4 = r1 + r7 + r11;
                Res5 = r2 + r3 + r8;

                EditText nomn = (EditText) findViewById(R.id.etNombre);
                String nom = nomn.getText().toString();
                if (nom == null) {
                    nom = "Unknown";
                }


                if (Res1 + Res2 + Res3 + Res4 + Res5 <= 5) {
                    Toast.makeText(getApplicationContext(), "Debe marcar almenos 6 actividades", Toast.LENGTH_SHORT).show();
                } else {
                    ConexionSQLite conn = new ConexionSQLite(this);
                    SQLiteDatabase db = conn.getWritableDatabase();
                    ContentValues values = new ContentValues();
                    values.put(Constantes.CAMPO_ESTADO, 2);
                    values.put(Constantes.CAMPO_NOMBRE, nom);
                    values.put(Constantes.CAMPO_RES1, Res1);
                    values.put(Constantes.CAMPO_RES2, Res2);
                    values.put(Constantes.CAMPO_RES3, Res3);
                    values.put(Constantes.CAMPO_RES4, Res4);
                    values.put(Constantes.CAMPO_RES5, Res5);
                    values.put(Constantes.CAMPO_R1, 1);
                    values.put(Constantes.CAMPO_R2, 0);
                    values.put(Constantes.CAMPO_R3, 0);
                    values.put(Constantes.CAMPO_R4, 0);

                    Long IDResultado = db.insert(Constantes.TABLA_RES_BAS_NOMBRE, Constantes.CAMPO_ID, values);
                    String ID = String.valueOf(IDResultado);
                    Intent intent = new Intent(this, basicoActivity.class);
                    db.close();
                    SharedPreferences sharedPreferences = getSharedPreferences(Constantes.PREFERENCIAS_RES,0);
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString(Constantes.PREFERENCIAS_RES_BASICO,ID);
                    editor.commit();

                    startActivity(intent);
                }

        }
    }
}
