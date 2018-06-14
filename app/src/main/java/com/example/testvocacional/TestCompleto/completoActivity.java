package com.example.testvocacional.TestCompleto;

import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.testvocacional.R;
import com.example.testvocacional.TestBasico.basic_1;
import com.example.testvocacional.TestBasico.basic_2;
import com.example.testvocacional.TestBasico.basic_3;
import com.example.testvocacional.TestBasico.basic_4;
import com.example.testvocacional.Util.ConexionSQLite;
import com.example.testvocacional.Util.Constantes;
import com.example.testvocacional.inicioActivity;

public class completoActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, evaluar,salir;
    private Integer r1 = 0, r2 = 0, r3 = 0, r4 = 0, r5 = 0, r6 = 0, r7 = 0, r8 = 0, r9 = 0;
    private Integer res1, res2, res3, res4, res5, res6, res7, res8, res9, res10, res11, res12, res13, res14, res15;
    private String ID;
    private Bundle bundle;
    private ConexionSQLite conn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_completo);
        btn1 = (Button) findViewById(R.id.btn_1);
        btn2 = (Button) findViewById(R.id.btn_2);
        btn3 = (Button) findViewById(R.id.btn_3);
        btn4 = (Button) findViewById(R.id.btn_4);
        btn5 = (Button) findViewById(R.id.btn_5);
        btn6 = (Button) findViewById(R.id.btn_6);
        btn7 = (Button) findViewById(R.id.btn_7);
        btn8 = (Button) findViewById(R.id.btn_8);
        btn9 = (Button) findViewById(R.id.btn_9);
        evaluar = (Button) findViewById(R.id.btn_evaluar);
        salir = findViewById(R.id.btn_salir);

        SharedPreferences sharedPreferences = getSharedPreferences(Constantes.PREFERENCIAS_RES,0);
        ID = sharedPreferences.getString(Constantes.PREFERENCIAS_RES_COMP,null);
        if (ID != null) {
            conn = new ConexionSQLite(getApplicationContext());
            SQLiteDatabase db = conn.getReadableDatabase();
            String[] param = {ID};
            String[] campos = {Constantes.CAMPO_R1, Constantes.CAMPO_R2, Constantes.CAMPO_R3, Constantes.CAMPO_R4, Constantes.CAMPO_R5, Constantes.CAMPO_R6, Constantes.CAMPO_R7, Constantes.CAMPO_R8, Constantes.CAMPO_R9};

            try (Cursor cursor = db.query(Constantes.TABLA_RES_COMP_NOMBRE, campos, Constantes.CAMPO_ID + "=?", param, null, null, null)) {
                cursor.moveToFirst();
                r1 = cursor.getInt(0);
                r2 = cursor.getInt(1);
                r3 = cursor.getInt(2);
                r4 = cursor.getInt(3);
                r5 = cursor.getInt(4);
                r6 = cursor.getInt(5);
                r7 = cursor.getInt(6);
                r8 = cursor.getInt(7);
                r9 = cursor.getInt(8);
            }

            if (r1 == 0) {
                btn1.setEnabled(true);
            } else {
                btn1.setEnabled(false);
            }
            if (r2 == 0) {
                btn2.setEnabled(true);
            }
            if (r3 == 0) {
                btn3.setEnabled(true);
            }
            if (r4 == 0) {
                btn4.setEnabled(true);
            }
            if (r5 == 0) {
                btn5.setEnabled(true);
            }
            if (r6 == 0) {
                btn6.setEnabled(true);
            }
            if (r7 == 0) {
                btn7.setEnabled(true);
            }
            if (r8 == 0) {
                btn8.setEnabled(true);
            }
            if (r9 == 0) {
                btn9.setEnabled(true);
            }
            if (r1 + r2 + r3 + r4 + r5 + r6 + r7 + r8 + r9 == 9) {
                evaluar.setEnabled(true);
            }
            db.close();
        }

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        evaluar.setOnClickListener(this);
        salir.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.btn_salir:
                i = new Intent(this,inicioActivity.class);
                startActivity(i);
                break;
            case R.id.btn_1:
                i = new Intent(this, complet_1.class);
                startActivity(i);
                break;

            case R.id.btn_2:
                i = new Intent(this, complet_2.class);
                startActivity(i);
                break;

            case R.id.btn_3:
                i = new Intent(this, complet_3.class);
                startActivity(i);
                break;

            case R.id.btn_4:
                i = new Intent(this, complet_4.class);
                startActivity(i);
                break;

            case R.id.btn_5:
                i = new Intent(this, complet_5.class);
                startActivity(i);
                break;
            case R.id.btn_6:
                i = new Intent(this, complet_6.class);
                startActivity(i);
                break;
            case R.id.btn_7:
                i = new Intent(this, complet_7.class);
                startActivity(i);
                break;
            case R.id.btn_8:
                i = new Intent(this, complet_8.class);
                startActivity(i);
                break;
            case R.id.btn_9:
                i = new Intent(this, complet_9.class);
                startActivity(i);
                break;

            case R.id.btn_evaluar:
                SQLiteDatabase db = conn.getReadableDatabase();
                int max = 0;
                ID = bundle.getString("id");
                String[] parametros = {ID};
                String[] campos = {Constantes.CAMPO_RES1, Constantes.CAMPO_RES2, Constantes.CAMPO_RES3, Constantes.CAMPO_RES4, Constantes.CAMPO_RES5, Constantes.CAMPO_RES6, Constantes.CAMPO_RES7, Constantes.CAMPO_RES8, Constantes.CAMPO_RES9, Constantes.CAMPO_RES10, Constantes.CAMPO_RES11, Constantes.CAMPO_RES12, Constantes.CAMPO_RES13, Constantes.CAMPO_RES14, Constantes.CAMPO_RES15};
                Cursor cursor = db.query(Constantes.TABLA_RES_COMP_NOMBRE, campos, Constantes.CAMPO_ID + "=?", parametros, null, null, null);
                cursor.moveToFirst();
                res1 = cursor.getInt(0);
                res2 = cursor.getInt(1);
                res3 = cursor.getInt(2);
                res4 = cursor.getInt(3);
                res5 = cursor.getInt(4);
                res6 = cursor.getInt(5);
                res7 = cursor.getInt(6);
                res8 = cursor.getInt(7);
                res9 = cursor.getInt(8);
                res10 = cursor.getInt(9);
                res11 = cursor.getInt(10);
                res12 = cursor.getInt(11);
                res13 = cursor.getInt(12);
                res14 = cursor.getInt(13);
                res15 = cursor.getInt(14);

                int mayor = 0;
                if (mayor < res1) {
                    mayor = res1;
                }
                if (mayor < res2) {
                    mayor = res2;
                }
                if (mayor < res3) {
                    mayor = res3;
                }
                if (mayor < res4) {
                    mayor = res4;
                }
                if (mayor < res5) {
                    mayor = res5;
                }
                if (mayor < res6) {
                    mayor = res6;
                }
                if (mayor < res7) {
                    mayor = res7;
                }
                if (mayor < res8) {
                    mayor = res8;
                }
                if (mayor < res9) {
                    mayor = res9;
                }
                if (mayor < res10) {
                    mayor = res10;
                }
                if (mayor < res11) {
                    mayor = res11;
                }
                if (mayor < res12) {
                    mayor = res12;
                }
                if (mayor < res13) {
                    mayor = res13;
                }
                if (mayor < res14) {
                    mayor = res14;
                }
                if (mayor < res15) {
                    mayor = res15;
                }
                //Resultados
                if (mayor == res1) {
                    Toast.makeText(getApplicationContext(), "C1- Cientifico", Toast.LENGTH_LONG).show();
                }
                if (mayor == res2) {
                    Toast.makeText(getApplicationContext(), "C2- Tecnológico", Toast.LENGTH_LONG).show();
                }
                if (mayor == res3) {
                    Toast.makeText(getApplicationContext(), "C3 - Sanitario", Toast.LENGTH_LONG).show();
                }
                if (mayor == res4) {
                    Toast.makeText(getApplicationContext(), "C4 - Cientifico Social", Toast.LENGTH_LONG).show();
                }
                if (mayor == res5) {
                    Toast.makeText(getApplicationContext(), "C5 - Juridico Social", Toast.LENGTH_LONG).show();
                }
                if (mayor == res6) {
                    Toast.makeText(getApplicationContext(), "C6 - Comunicación Informacion", Toast.LENGTH_LONG).show();
                }
                if (mayor == res7) {
                    Toast.makeText(getApplicationContext(), "C7 - Psicopedagógico", Toast.LENGTH_LONG).show();
                }
                if (mayor == res8) {
                    Toast.makeText(getApplicationContext(), "C8 - Empresarial", Toast.LENGTH_LONG).show();
                }
                if (mayor == res9) {
                    Toast.makeText(getApplicationContext(), "C9 - Informatica", Toast.LENGTH_LONG).show();
                }
                if (mayor == res10) {
                    Toast.makeText(getApplicationContext(), "C10 - Agrario", Toast.LENGTH_LONG).show();
                }
                if (mayor == res11) {
                    Toast.makeText(getApplicationContext(), "C11 - Art. Plástico", Toast.LENGTH_LONG).show();
                }
                if (mayor == res12) {
                    Toast.makeText(getApplicationContext(), "C12 - Art. Musical", Toast.LENGTH_LONG).show();
                }
                if (mayor == res13) {
                    Toast.makeText(getApplicationContext(), "C13 - Fuerzas Armadas", Toast.LENGTH_LONG).show();
                }
                if (mayor == res14) {
                    Toast.makeText(getApplicationContext(), "C14 - Deportivo", Toast.LENGTH_LONG).show();
                }
                if (mayor == res15) {
                    Toast.makeText(getApplicationContext(), "C15 - Turismo", Toast.LENGTH_LONG).show();
                }
                SharedPreferences sharedPreferences = getSharedPreferences(Constantes.PREFERENCIAS_RES,0);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.remove(Constantes.PREFERENCIAS_RES_COMP);
                editor.commit();
                i = new Intent(this,inicioActivity.class);
                startActivity(i);
                break;

        }
    }
}
