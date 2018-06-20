package com.example.testvocacional.TestCompleto;

import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import com.example.testvocacional.R;
import com.example.testvocacional.TestBasico.basicoActivity;
import com.example.testvocacional.Util.ConexionSQLite;
import com.example.testvocacional.Util.Constantes;

public class complet_1 extends AppCompatActivity implements View.OnClickListener {
    RadioButton rb0, rb1, rb2, rb3;
    Button btn;
    private String ID;
    private Bundle bundle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complet_1);
        btn = findViewById(R.id.enviar_comp);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.enviar_comp:
                int Res1 = 0, Res2 = 0, Res3 = 0, Res4 = 0, Res5 = 0, Res6 = 0, Res7 = 0, Res8 = 0, Res9 = 0, Res10 = 0, Res11 = 0, Res12 = 0, Res13 = 0, Res14 = 0, Res15 = 0;
                int R1 = 0, R2 = 0, R3 = 0, R4 = 0, R5 = 0, R6 = 0, R7 = 0, R8 = 0, R9 = 0, R10 = 0, R11 = 0, R12 = 0, R13 = 0, R14 = 0, R15 = 0, R16 = 0, R17 = 0, R18 = 0, R19 = 0, R20 = 0;

                //1 INICIO
                rb0 = (RadioButton) findViewById(R.id.RB1_0);
                rb1 = (RadioButton) findViewById(R.id.RB1_1);
                rb2 = (RadioButton) findViewById(R.id.RB1_2);
                rb3 = (RadioButton) findViewById(R.id.RB1_3);
                if (rb0.isChecked()) {
                    R1 = 0;
                }
                if (rb1.isChecked()) {
                    R1 = 1;
                }
                if (rb2.isChecked()) {
                    R1 = 2;
                }
                if (rb3.isChecked()) {
                    R1 = 3;
                }
                //1 FIN

                //Prueba
                rb0 =(RadioButton) findViewById(R.id.RB2_0);
                rb1 = (RadioButton)findViewById(R.id.RB2_1);
                rb2 = (RadioButton)findViewById(R.id.RB2_2);
                rb3 = (RadioButton)findViewById(R.id.RB2_3);
                if (rb0.isChecked()) {
                    R2 = 0;
                }
                if (rb1.isChecked()) {
                    R2 = 1;
                }
                if (rb2.isChecked()) {
                    R2 = 2;
                }
                if (rb3.isChecked()) {
                    R2 = 3;
                }
                rb0 = (RadioButton) findViewById(R.id.RB3_0);
                rb1 = (RadioButton)findViewById(R.id.RB3_1);
                rb2 = (RadioButton)findViewById(R.id.RB3_2);
                rb3 = (RadioButton)findViewById(R.id.RB3_3);
                if (rb0.isChecked()) {
                    R3 = 0;
                }
                if (rb1.isChecked()) {
                    R3 = 1;
                }
                if (rb2.isChecked()) {
                    R3 = 2;
                }
                if (rb3.isChecked()) {
                    R3 = 3;
                }
                rb0 = (RadioButton)findViewById(R.id.RB4_0);
                rb1 = (RadioButton)findViewById(R.id.RB4_1);
                rb2 = (RadioButton)findViewById(R.id.RB4_2);
                rb3 = (RadioButton)findViewById(R.id.RB4_3);
                if (rb0.isChecked()) {
                    R4 = 0;
                }
                if (rb1.isChecked()) {
                    R4 = 1;
                }
                if (rb2.isChecked()) {
                    R4 = 2;
                }
                if (rb3.isChecked()) {
                    R4 = 3;
                }
                rb0 = (RadioButton)findViewById(R.id.RB5_0);
                rb1 = (RadioButton)findViewById(R.id.RB5_1);
                rb2 = (RadioButton)findViewById(R.id.RB5_2);
                rb3 = (RadioButton)findViewById(R.id.RB5_3);
                if (rb0.isChecked()) {
                    R5 = 0;
                }
                if (rb1.isChecked()) {
                    R5 = 1;
                }
                if (rb2.isChecked()) {
                    R5 = 2;
                }
                if (rb3.isChecked()) {
                    R5 = 3;
                }
                rb0 =(RadioButton) findViewById(R.id.RB6_0);
                rb1 = (RadioButton)findViewById(R.id.RB6_1);
                rb2 = (RadioButton)findViewById(R.id.RB6_2);
                rb3 = (RadioButton)findViewById(R.id.RB6_3);
                if (rb0.isChecked()) {
                    R6 = 0;
                }
                if (rb1.isChecked()) {
                    R6 = 1;
                }
                if (rb2.isChecked()) {
                    R6 = 2;
                }
                if (rb3.isChecked()) {
                    R6 = 3;
                }
                rb0 = (RadioButton)findViewById(R.id.RB7_0);
                rb1 = (RadioButton)findViewById(R.id.RB7_1);
                rb2 = (RadioButton)findViewById(R.id.RB7_2);
                rb3 = (RadioButton)findViewById(R.id.RB7_3);
                if (rb0.isChecked()) {
                    R7 = 0;
                }
                if (rb1.isChecked()) {
                    R7 = 1;
                }
                if (rb2.isChecked()) {
                    R7 = 2;
                }
                if (rb3.isChecked()) {
                    R7 = 3;
                }
                rb0 = (RadioButton)findViewById(R.id.RB8_0);
                rb1 = (RadioButton)findViewById(R.id.RB8_1);
                rb2 = (RadioButton)findViewById(R.id.RB8_2);
                rb3 = (RadioButton)findViewById(R.id.RB8_3);
                if (rb0.isChecked()) {
                    R8 = 0;
                }
                if (rb1.isChecked()) {
                    R8 = 1;
                }
                if (rb2.isChecked()) {
                    R8 = 2;
                }
                if (rb3.isChecked()) {
                    R8 = 3;
                }
                rb0 = (RadioButton)findViewById(R.id.RB9_0);
                rb1 = (RadioButton)findViewById(R.id.RB9_1);
                rb2 = (RadioButton)findViewById(R.id.RB9_2);
                rb3 = (RadioButton)findViewById(R.id.RB9_3);
                if (rb0.isChecked()) {
                    R9 = 0;
                }
                if (rb1.isChecked()) {
                    R9 = 1;
                }
                if (rb2.isChecked()) {
                    R9 = 2;
                }
                if (rb3.isChecked()) {
                    R9 = 3;
                }
                rb0 = (RadioButton)findViewById(R.id.RB10_0);
                rb1 = (RadioButton)findViewById(R.id.RB10_1);
                rb2 = (RadioButton)findViewById(R.id.RB10_2);
                rb3 = (RadioButton)findViewById(R.id.RB10_3);
                if (rb0.isChecked()) {
                    R10 = 0;
                }
                if (rb1.isChecked()) {
                    R10 = 1;
                }
                if (rb2.isChecked()) {
                    R10 = 2;
                }
                if (rb3.isChecked()) {
                    R10 = 3;
                }
                rb0 = (RadioButton) findViewById(R.id.RB11_0);
                rb1 = (RadioButton) findViewById(R.id.RB11_1);
                rb2 = (RadioButton) findViewById(R.id.RB11_2);
                rb3 = (RadioButton) findViewById(R.id.RB11_3);
                if (rb0.isChecked()) {
                    R11 = 0;
                }
                if (rb1.isChecked()) {
                    R11 = 1;
                }
                if (rb2.isChecked()) {
                    R11 = 2;
                }
                if (rb3.isChecked()) {
                    R11 = 3;
                }
                rb0 =(RadioButton) findViewById(R.id.RB12_0);
                rb1 =(RadioButton) findViewById(R.id.RB12_1);
                rb2 =(RadioButton) findViewById(R.id.RB12_2);
                rb3 =(RadioButton) findViewById(R.id.RB12_3);
                if (rb0.isChecked()) {
                    R12 = 0;
                }
                if (rb1.isChecked()) {
                    R12 = 1;
                }
                if (rb2.isChecked()) {
                    R12 = 2;
                }
                if (rb3.isChecked()) {
                    R12 = 3;
                }
                rb0 =(RadioButton) findViewById(R.id.RB13_0);
                rb1 =(RadioButton) findViewById(R.id.RB13_1);
                rb2 =(RadioButton) findViewById(R.id.RB13_2);
                rb3 =(RadioButton) findViewById(R.id.RB13_3);
                if (rb0.isChecked()) {
                    R13 = 0;
                }
                if (rb1.isChecked()) {
                    R13 = 1;
                }
                if (rb2.isChecked()) {
                    R13 = 2;
                }
                if (rb3.isChecked()) {
                    R13 = 3;
                }
                rb0 =(RadioButton) findViewById(R.id.RB14_0);
                rb1 =(RadioButton) findViewById(R.id.RB14_1);
                rb2 =(RadioButton) findViewById(R.id.RB14_2);
                rb3 =(RadioButton) findViewById(R.id.RB14_3);
                if (rb0.isChecked()) {
                    R14 = 0;
                }
                if (rb1.isChecked()) {
                    R14 = 1;
                }
                if (rb2.isChecked()) {
                    R14 = 2;
                }
                if (rb3.isChecked()) {
                    R14 = 3;
                }
                rb0 =(RadioButton) findViewById(R.id.RB15_0);
                rb1 =(RadioButton) findViewById(R.id.RB15_1);
                rb2 =(RadioButton) findViewById(R.id.RB15_2);
                rb3 =(RadioButton) findViewById(R.id.RB15_3);
                if (rb0.isChecked()) {
                    R15 = 0;
                }
                if (rb1.isChecked()) {
                    R15 = 1;
                }
                if (rb2.isChecked()) {
                    R15 = 2;
                }
                if (rb3.isChecked()) {
                    R15 = 3;
                }
                rb0 =(RadioButton) findViewById(R.id.RB16_0);
                rb1 =(RadioButton) findViewById(R.id.RB16_1);
                rb2 =(RadioButton) findViewById(R.id.RB16_2);
                rb3 =(RadioButton) findViewById(R.id.RB16_3);
                if (rb0.isChecked()) {
                    R16 = 0;
                }
                if (rb1.isChecked()) {
                    R16 = 1;
                }
                if (rb2.isChecked()) {
                    R16 = 2;
                }
                if (rb3.isChecked()) {
                    R16 = 3;
                }
                rb0 =(RadioButton) findViewById(R.id.RB17_0);
                rb1 =(RadioButton) findViewById(R.id.RB17_1);
                rb2 =(RadioButton) findViewById(R.id.RB17_2);
                rb3 =(RadioButton) findViewById(R.id.RB17_3);
                if (rb0.isChecked()) {
                    R17 = 0;
                }
                if (rb1.isChecked()) {
                    R17 = 1;
                }
                if (rb2.isChecked()) {
                    R17 = 2;
                }
                if (rb3.isChecked()) {
                    R17 = 3;
                }
                rb0 =(RadioButton) findViewById(R.id.RB18_0);
                rb1 =(RadioButton) findViewById(R.id.RB18_1);
                rb2 =(RadioButton) findViewById(R.id.RB18_2);
                rb3 =(RadioButton) findViewById(R.id.RB18_3);
                if (rb0.isChecked()) {
                    R18 = 0;
                }
                if (rb1.isChecked()) {
                    R18 = 1;
                }
                if (rb2.isChecked()) {
                    R18 = 2;
                }
                if (rb3.isChecked()) {
                    R18 = 3;
                }
                rb0 =(RadioButton) findViewById(R.id.RB19_0);
                rb1 =(RadioButton) findViewById(R.id.RB19_1);
                rb2 =(RadioButton) findViewById(R.id.RB19_2);
                rb3 =(RadioButton) findViewById(R.id.RB19_3);
                if (rb0.isChecked()) {
                    R19 = 0;
                }
                if (rb1.isChecked()) {
                    R19 = 1;
                }
                if (rb2.isChecked()) {
                    R19 = 2;
                }
                if (rb3.isChecked()) {
                    R19 = 3;
                }
                rb0 =(RadioButton) findViewById(R.id.RB20_0);
                rb1 =(RadioButton) findViewById(R.id.RB20_1);
                rb2 =(RadioButton) findViewById(R.id.RB20_2);
                rb3 =(RadioButton) findViewById(R.id.RB20_3);
                if (rb0.isChecked()) {
                    R20 = 0;
                }
                if (rb1.isChecked()) {
                    R20 = 1;
                }
                if (rb2.isChecked()) {
                    R20 = 2;
                }
                if (rb3.isChecked()) {
                    R20 = 3;
                }
                Res1 = R1 + R2 + R3 + R4 + R5 + R6 + R7 + R8 + R9 + R10 + R11 + R12;
                Res2 = R13 + R14 + R15 + R16 + R17 + R18 + R19 + R20;

                EditText nomn = (EditText) findViewById(R.id.etNombre);
                String nom = nomn.getText().toString();
                if (nom == "") {
                    nom = "Unknown";
                }
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
                values.put(Constantes.CAMPO_RES6, Res6);
                values.put(Constantes.CAMPO_RES7, Res7);
                values.put(Constantes.CAMPO_RES8, Res8);
                values.put(Constantes.CAMPO_RES9, Res9);
                values.put(Constantes.CAMPO_RES10, Res10);
                values.put(Constantes.CAMPO_RES11, Res11);
                values.put(Constantes.CAMPO_RES12, Res12);
                values.put(Constantes.CAMPO_RES13, Res13);
                values.put(Constantes.CAMPO_RES14, Res14);
                values.put(Constantes.CAMPO_RES15, Res15);
                values.put(Constantes.CAMPO_R1, 1);
                values.put(Constantes.CAMPO_R2, 0);
                values.put(Constantes.CAMPO_R3, 0);
                values.put(Constantes.CAMPO_R4, 0);
                values.put(Constantes.CAMPO_R5, 0);
                values.put(Constantes.CAMPO_R6, 0);
                values.put(Constantes.CAMPO_R7, 0);
                values.put(Constantes.CAMPO_R8, 0);
                values.put(Constantes.CAMPO_R9, 0);

                Long IDResult = db.insert(Constantes.TABLA_RES_COMP_NOMBRE, Constantes.CAMPO_ID, values);
                String ID = String.valueOf(IDResult);
                Intent intent = new Intent(this, completoActivity.class);
                db.close();
                SharedPreferences sharedPreferences = getSharedPreferences(Constantes.PREFERENCIAS_RES,0);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(Constantes.PREFERENCIAS_RES_COMP,ID);
                editor.commit();
                startActivity(intent);
                break;
        }
    }
}
