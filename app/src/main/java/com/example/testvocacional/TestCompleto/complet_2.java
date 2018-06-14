package com.example.testvocacional.TestCompleto;

import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import com.example.testvocacional.R;
import com.example.testvocacional.TestBasico.basicoActivity;
import com.example.testvocacional.Util.ConexionSQLite;
import com.example.testvocacional.Util.Constantes;

public class complet_2 extends AppCompatActivity implements View.OnClickListener{
    RadioButton rb0, rb1, rb2, rb3;
    Button btn;
    private String ID;
    private Bundle bundle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complet_2);

        btn = findViewById(R.id.enviar_comp);
        btn.setOnClickListener(this);
        SharedPreferences sharedPreferences = getSharedPreferences(Constantes.PREFERENCIAS_RES,0);
        ID = sharedPreferences.getString(Constantes.PREFERENCIAS_RES_COMP,null);

    }

    @Override
    public void onClick(View v) {
        int Res1 = 0, Res2 = 0, Res3 = 0, Res4 = 0, Res5 = 0, Res6 = 0, Res7 = 0, Res8 = 0, Res9 = 0, Res10 = 0, Res11 = 0, Res12 = 0, Res13 = 0, Res14 = 0, Res15 = 0;
        int R21 = 0, R22 = 0, R23 = 0, R24 = 0, R25 = 0, R26 = 0, R27 = 0, R28 = 0, R29 = 0, R30 = 0, R31 = 0, R32 = 0, R33 = 0, R34 = 0, R35 = 0, R36 = 0, R37 = 0, R38 = 0, R39 = 0, R40 = 0;

        rb0 =(RadioButton) findViewById(R.id.RB21_0);
        rb1 =(RadioButton) findViewById(R.id.RB21_1);
        rb2 =(RadioButton) findViewById(R.id.RB21_2);
        rb3 =(RadioButton) findViewById(R.id.RB21_3);
        if (rb0.isChecked()) {
            R21 = 0;
        }
        if (rb1.isChecked()) {
            R21 = 1;
        }
        if (rb2.isChecked()) {
            R21 = 2;
        }
        if (rb3.isChecked()) {
            R21 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB22_0);
        rb1 =(RadioButton) findViewById(R.id.RB22_1);
        rb2 =(RadioButton) findViewById(R.id.RB22_2);
        rb3 =(RadioButton) findViewById(R.id.RB22_3);
        if (rb0.isChecked()) {
            R22 = 0;
        }
        if (rb1.isChecked()) {
            R22 = 1;
        }
        if (rb2.isChecked()) {
            R22 = 2;
        }
        if (rb3.isChecked()) {
            R22 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB23_0);
        rb1 =(RadioButton) findViewById(R.id.RB23_1);
        rb2 =(RadioButton) findViewById(R.id.RB23_2);
        rb3 =(RadioButton) findViewById(R.id.RB23_3);
        if (rb0.isChecked()) {
            R23 = 0;
        }
        if (rb1.isChecked()) {
            R23 = 1;
        }
        if (rb2.isChecked()) {
            R23 = 2;
        }
        if (rb3.isChecked()) {
            R23 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB24_0);
        rb1 =(RadioButton) findViewById(R.id.RB24_1);
        rb2 =(RadioButton) findViewById(R.id.RB24_2);
        rb3 =(RadioButton) findViewById(R.id.RB24_3);
        if (rb0.isChecked()) {
            R24 = 0;
        }
        if (rb1.isChecked()) {
            R24 = 1;
        }
        if (rb2.isChecked()) {
            R24 = 2;
        }
        if (rb3.isChecked()) {
            R24 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB25_0);
        rb1 =(RadioButton) findViewById(R.id.RB25_1);
        rb2 =(RadioButton) findViewById(R.id.RB25_2);
        rb3 =(RadioButton) findViewById(R.id.RB25_3);
        if (rb0.isChecked()) {
            R25 = 0;
        }
        if (rb1.isChecked()) {
            R25 = 1;
        }
        if (rb2.isChecked()) {
            R25 = 2;
        }
        if (rb3.isChecked()) {
            R25 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB26_0);
        rb1 =(RadioButton) findViewById(R.id.RB26_1);
        rb2 =(RadioButton) findViewById(R.id.RB26_2);
        rb3 =(RadioButton) findViewById(R.id.RB26_3);
        if (rb0.isChecked()) {
            R26 = 0;
        }
        if (rb1.isChecked()) {
            R26 = 1;
        }
        if (rb2.isChecked()) {
            R26 = 2;
        }
        if (rb3.isChecked()) {
            R26 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB27_0);
        rb1 =(RadioButton) findViewById(R.id.RB27_1);
        rb2 =(RadioButton) findViewById(R.id.RB27_2);
        rb3 =(RadioButton) findViewById(R.id.RB27_3);
        if (rb0.isChecked()) {
            R27 = 0;
        }
        if (rb1.isChecked()) {
            R27 = 1;
        }
        if (rb2.isChecked()) {
            R27 = 2;
        }
        if (rb3.isChecked()) {
            R27 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB28_0);
        rb1 =(RadioButton) findViewById(R.id.RB28_1);
        rb2 =(RadioButton) findViewById(R.id.RB28_2);
        rb3 =(RadioButton) findViewById(R.id.RB28_3);
        if (rb0.isChecked()) {
            R28 = 0;
        }
        if (rb1.isChecked()) {
            R28 = 1;
        }
        if (rb2.isChecked()) {
            R28 = 2;
        }
        if (rb3.isChecked()) {
            R28 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB29_0);
        rb1 =(RadioButton) findViewById(R.id.RB29_1);
        rb2 =(RadioButton) findViewById(R.id.RB29_2);
        rb3 =(RadioButton) findViewById(R.id.RB29_3);
        if (rb0.isChecked()) {
            R29 = 0;
        }
        if (rb1.isChecked()) {
            R29 = 1;
        }
        if (rb2.isChecked()) {
            R29 = 2;
        }
        if (rb3.isChecked()) {
            R29 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB30_0);
        rb1 =(RadioButton) findViewById(R.id.RB30_1);
        rb2 =(RadioButton) findViewById(R.id.RB30_2);
        rb3 =(RadioButton) findViewById(R.id.RB30_3);
        if (rb0.isChecked()) {
            R30 = 0;
        }
        if (rb1.isChecked()) {
            R30 = 1;
        }
        if (rb2.isChecked()) {
            R30 = 2;
        }
        if (rb3.isChecked()) {
            R30 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB31_0);
        rb1 =(RadioButton) findViewById(R.id.RB31_1);
        rb2 =(RadioButton) findViewById(R.id.RB31_2);
        rb3 =(RadioButton) findViewById(R.id.RB31_3);
        if (rb0.isChecked()) {
            R31 = 0;
        }
        if (rb1.isChecked()) {
            R31 = 1;
        }
        if (rb2.isChecked()) {
            R31 = 2;
        }
        if (rb3.isChecked()) {
            R31 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB32_0);
        rb1 =(RadioButton) findViewById(R.id.RB32_1);
        rb2 =(RadioButton) findViewById(R.id.RB32_2);
        rb3 =(RadioButton) findViewById(R.id.RB32_3);
        if (rb0.isChecked()) {
            R32 = 0;
        }
        if (rb1.isChecked()) {
            R32 = 1;
        }
        if (rb2.isChecked()) {
            R32 = 2;
        }
        if (rb3.isChecked()) {
            R32 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB33_0);
        rb1 =(RadioButton) findViewById(R.id.RB33_1);
        rb2 =(RadioButton) findViewById(R.id.RB33_2);
        rb3 =(RadioButton) findViewById(R.id.RB33_3);
        if (rb0.isChecked()) {
            R33 = 0;
        }
        if (rb1.isChecked()) {
            R33 = 1;
        }
        if (rb2.isChecked()) {
            R33 = 2;
        }
        if (rb3.isChecked()) {
            R33 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB34_0);
        rb1 =(RadioButton) findViewById(R.id.RB34_1);
        rb2 =(RadioButton) findViewById(R.id.RB34_2);
        rb3 =(RadioButton) findViewById(R.id.RB34_3);
        if (rb0.isChecked()) {
            R34 = 0;
        }
        if (rb1.isChecked()) {
            R34 = 1;
        }
        if (rb2.isChecked()) {
            R34 = 2;
        }
        if (rb3.isChecked()) {
            R34 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB35_0);
        rb1 =(RadioButton) findViewById(R.id.RB35_1);
        rb2 =(RadioButton) findViewById(R.id.RB35_2);
        rb3 =(RadioButton) findViewById(R.id.RB35_3);
        if (rb0.isChecked()) {
            R35 = 0;
        }
        if (rb1.isChecked()) {
            R35 = 1;
        }
        if (rb2.isChecked()) {
            R35 = 2;
        }
        if (rb3.isChecked()) {
            R35 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB36_0);
        rb1 =(RadioButton) findViewById(R.id.RB36_1);
        rb2 =(RadioButton) findViewById(R.id.RB36_2);
        rb3 =(RadioButton) findViewById(R.id.RB36_3);
        if (rb0.isChecked()) {
            R36 = 0;
        }
        if (rb1.isChecked()) {
            R36 = 1;
        }
        if (rb2.isChecked()) {
            R36 = 2;
        }
        if (rb3.isChecked()) {
            R36 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB37_0);
        rb1 =(RadioButton) findViewById(R.id.RB37_1);
        rb2 =(RadioButton) findViewById(R.id.RB37_2);
        rb3 =(RadioButton) findViewById(R.id.RB37_3);
        if (rb0.isChecked()) {
            R37 = 0;
        }
        if (rb1.isChecked()) {
            R37 = 1;
        }
        if (rb2.isChecked()) {
            R37 = 2;
        }
        if (rb3.isChecked()) {
            R37 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB38_0);
        rb1 =(RadioButton) findViewById(R.id.RB38_1);
        rb2 =(RadioButton) findViewById(R.id.RB38_2);
        rb3 =(RadioButton) findViewById(R.id.RB38_3);
        if (rb0.isChecked()) {
            R38 = 0;
        }
        if (rb1.isChecked()) {
            R38 = 1;
        }
        if (rb2.isChecked()) {
            R38 = 2;
        }
        if (rb3.isChecked()) {
            R38 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB39_0);
        rb1 =(RadioButton) findViewById(R.id.RB39_1);
        rb2 =(RadioButton) findViewById(R.id.RB39_2);
        rb3 =(RadioButton) findViewById(R.id.RB39_3);
        if (rb0.isChecked()) {
            R39 = 0;
        }
        if (rb1.isChecked()) {
            R39 = 1;
        }
        if (rb2.isChecked()) {
            R39 = 2;
        }
        if (rb3.isChecked()) {
            R39 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB40_0);
        rb1 =(RadioButton) findViewById(R.id.RB40_1);
        rb2 =(RadioButton) findViewById(R.id.RB40_2);
        rb3 =(RadioButton) findViewById(R.id.RB40_3);
        if (rb0.isChecked()) {
            R40 = 0;
        }
        if (rb1.isChecked()) {
            R40 = 1;
        }
        if (rb2.isChecked()) {
            R40 = 2;
        }
        if (rb3.isChecked()) {
            R40 = 3;
        }

        Res2 = R21 + R22 + R23 + R24;
        Res3 = R25 + R26 + R27 + R28 + R29 + R30 + R31 + R32 + R33 + R34 + R35 + R36;
        Res4 = R37 + R38 + R39 + R40;

        ConexionSQLite conn = new ConexionSQLite(this);
        conn = new ConexionSQLite(getApplicationContext());
        SQLiteDatabase db = conn.getReadableDatabase();
        String[] parametros = {ID};
        String[] campos = {Constantes.CAMPO_RES1,Constantes.CAMPO_RES2,Constantes.CAMPO_RES3,Constantes.CAMPO_RES4,Constantes.CAMPO_RES5,Constantes.CAMPO_RES6,Constantes.CAMPO_RES7,Constantes.CAMPO_RES8,Constantes.CAMPO_RES9,Constantes.CAMPO_RES10,Constantes.CAMPO_RES11,Constantes.CAMPO_RES12,Constantes.CAMPO_RES13,Constantes.CAMPO_RES14,Constantes.CAMPO_RES15};
        Cursor cursor = db.query(Constantes.TABLA_RES_COMP_NOMBRE,campos,Constantes.CAMPO_ID +"=?",parametros,null,null,null);
        cursor.moveToFirst();
        Res1 = Res1 + cursor.getInt(0);
        Res2 = Res2 + cursor.getInt(1);
        Res3 = Res3 + cursor.getInt(2);
        Res4 = Res4 + cursor.getInt(3);
        Res5 = Res5 + cursor.getInt(4);
        Res6 = Res6 + cursor.getInt(5);
        Res7 = Res7 + cursor.getInt(6);
        Res8 = Res8 + cursor.getInt(7);
        Res9 = Res9 + cursor.getInt(8);
        Res10 = Res10 + cursor.getInt(9);
        Res11 = Res11 + cursor.getInt(10);
        Res12 = Res12 + cursor.getInt(11);
        Res13 = Res13 + cursor.getInt(12);
        Res14 = Res14 + cursor.getInt(13);
        Res15 = Res15 + cursor.getInt(14);

        db = conn.getWritableDatabase();
        ContentValues values = new ContentValues();
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
        values.put(Constantes.CAMPO_R2, 1);

        db.update(Constantes.TABLA_RES_COMP_NOMBRE,values,Constantes.CAMPO_ID +"=?",parametros);
        Intent intent = new Intent(this, completoActivity.class);
        db.close();
        startActivity(intent);
    }
}
