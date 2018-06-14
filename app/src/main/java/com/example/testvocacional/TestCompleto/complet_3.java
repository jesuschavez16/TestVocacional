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

public class complet_3 extends AppCompatActivity implements View.OnClickListener{
    RadioButton rb0, rb1, rb2, rb3;
    Button btn;
    private String ID;
    private Bundle bundle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complet_3);
        btn = findViewById(R.id.enviar_comp);
        btn.setOnClickListener(this);
        SharedPreferences sharedPreferences = getSharedPreferences(Constantes.PREFERENCIAS_RES,0);
        ID = sharedPreferences.getString(Constantes.PREFERENCIAS_RES_COMP,null);

    }

    @Override
    public void onClick(View v) {
        int Res1 = 0, Res2 = 0, Res3 = 0, Res4 = 0, Res5 = 0, Res6 = 0, Res7 = 0, Res8 = 0, Res9 = 0, Res10 = 0, Res11 = 0, Res12 = 0, Res13 = 0, Res14 = 0, Res15 = 0;
        int R41 = 0, R42 = 0, R43 = 0, R44 = 0, R45 = 0, R46 = 0, R47 = 0, R48 = 0, R49 = 0, R50 = 0, R51 = 0, R52 = 0, R53 = 0, R54 = 0, R55 = 0, R56 = 0, R57 = 0, R58 = 0, R59 = 0, R60 = 0;

        rb0 =(RadioButton) findViewById(R.id.RB41_0);
        rb1 =(RadioButton) findViewById(R.id.RB41_1);
        rb2 =(RadioButton) findViewById(R.id.RB41_2);
        rb3 =(RadioButton) findViewById(R.id.RB41_3);
        if (rb0.isChecked()) {
            R41 = 0;
        }
        if (rb1.isChecked()) {
            R41 = 1;
        }
        if (rb2.isChecked()) {
            R41 = 2;
        }
        if (rb3.isChecked()) {
            R41 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB42_0);
        rb1 =(RadioButton) findViewById(R.id.RB42_1);
        rb2 =(RadioButton) findViewById(R.id.RB42_2);
        rb3 =(RadioButton) findViewById(R.id.RB42_3);
        if (rb0.isChecked()) {
            R42 = 0;
        }
        if (rb1.isChecked()) {
            R42 = 1;
        }
        if (rb2.isChecked()) {
            R42 = 2;
        }
        if (rb3.isChecked()) {
            R42 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB43_0);
        rb1 =(RadioButton) findViewById(R.id.RB43_1);
        rb2 =(RadioButton) findViewById(R.id.RB43_2);
        rb3 =(RadioButton) findViewById(R.id.RB43_3);
        if (rb0.isChecked()) {
            R43 = 0;
        }
        if (rb1.isChecked()) {
            R43 = 1;
        }
        if (rb2.isChecked()) {
            R43 = 2;
        }
        if (rb3.isChecked()) {
            R43 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB44_0);
        rb1 =(RadioButton) findViewById(R.id.RB44_1);
        rb2 =(RadioButton) findViewById(R.id.RB44_2);
        rb3 =(RadioButton) findViewById(R.id.RB44_3);
        if (rb0.isChecked()) {
            R44 = 0;
        }
        if (rb1.isChecked()) {
            R44 = 1;
        }
        if (rb2.isChecked()) {
            R44 = 2;
        }
        if (rb3.isChecked()) {
            R44 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB45_0);
        rb1 =(RadioButton) findViewById(R.id.RB45_1);
        rb2 =(RadioButton) findViewById(R.id.RB45_2);
        rb3 =(RadioButton) findViewById(R.id.RB45_3);
        if (rb0.isChecked()) {
            R45 = 0;
        }
        if (rb1.isChecked()) {
            R45 = 1;
        }
        if (rb2.isChecked()) {
            R45 = 2;
        }
        if (rb3.isChecked()) {
            R45 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB46_0);
        rb1 =(RadioButton) findViewById(R.id.RB46_1);
        rb2 =(RadioButton) findViewById(R.id.RB46_2);
        rb3 =(RadioButton) findViewById(R.id.RB46_3);
        if (rb0.isChecked()) {
            R46 = 0;
        }
        if (rb1.isChecked()) {
            R46 = 1;
        }
        if (rb2.isChecked()) {
            R46 = 2;
        }
        if (rb3.isChecked()) {
            R46 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB47_0);
        rb1 =(RadioButton) findViewById(R.id.RB47_1);
        rb2 =(RadioButton) findViewById(R.id.RB47_2);
        rb3 =(RadioButton) findViewById(R.id.RB47_3);
        if (rb0.isChecked()) {
            R47 = 0;
        }
        if (rb1.isChecked()) {
            R47 = 1;
        }
        if (rb2.isChecked()) {
            R47 = 2;
        }
        if (rb3.isChecked()) {
            R47 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB48_0);
        rb1 =(RadioButton) findViewById(R.id.RB48_1);
        rb2 =(RadioButton) findViewById(R.id.RB48_2);
        rb3 =(RadioButton) findViewById(R.id.RB48_3);
        if (rb0.isChecked()) {
            R48 = 0;
        }
        if (rb1.isChecked()) {
            R48 = 1;
        }
        if (rb2.isChecked()) {
            R48 = 2;
        }
        if (rb3.isChecked()) {
            R48 = 3;
        }
        rb0 = (RadioButton)findViewById(R.id.RB49_0);
        rb1 = (RadioButton)findViewById(R.id.RB49_1);
        rb2 = (RadioButton)findViewById(R.id.RB49_2);
        rb3 = (RadioButton)findViewById(R.id.RB49_3);
        if (rb0.isChecked()) {
            R49 = 0;
        }
        if (rb1.isChecked()) {
            R49 = 1;
        }
        if (rb2.isChecked()) {
            R49 = 2;
        }
        if (rb3.isChecked()) {
            R49 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB50_0);
        rb1 =(RadioButton) findViewById(R.id.RB50_1);
        rb2 =(RadioButton) findViewById(R.id.RB50_2);
        rb3 =(RadioButton) findViewById(R.id.RB50_3);
        if (rb0.isChecked()) {
            R50 = 0;
        }
        if (rb1.isChecked()) {
            R50 = 1;
        }
        if (rb2.isChecked()) {
            R50 = 2;
        }
        if (rb3.isChecked()) {
            R50 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB51_0);
        rb1 =(RadioButton) findViewById(R.id.RB51_1);
        rb2 =(RadioButton) findViewById(R.id.RB51_2);
        rb3 =(RadioButton) findViewById(R.id.RB51_3);
        if (rb0.isChecked()) {
            R51 = 0;
        }
        if (rb1.isChecked()) {
            R51 = 1;
        }
        if (rb2.isChecked()) {
            R51 = 2;
        }
        if (rb3.isChecked()) {
            R51 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB52_0);
        rb1 =(RadioButton) findViewById(R.id.RB52_1);
        rb2 =(RadioButton) findViewById(R.id.RB52_2);
        rb3 =(RadioButton) findViewById(R.id.RB52_3);
        if (rb0.isChecked()) {
            R52 = 0;
        }
        if (rb1.isChecked()) {
            R52 = 1;
        }
        if (rb2.isChecked()) {
            R52 = 2;
        }
        if (rb3.isChecked()) {
            R52 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB53_0);
        rb1 =(RadioButton) findViewById(R.id.RB53_1);
        rb2 =(RadioButton) findViewById(R.id.RB53_2);
        rb3 =(RadioButton) findViewById(R.id.RB53_3);
        if (rb0.isChecked()) {
            R53 = 0;
        }
        if (rb1.isChecked()) {
            R53 = 1;
        }
        if (rb2.isChecked()) {
            R53 = 2;
        }
        if (rb3.isChecked()) {
            R53 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB54_0);
        rb1 =(RadioButton) findViewById(R.id.RB54_1);
        rb2 =(RadioButton) findViewById(R.id.RB54_2);
        rb3 =(RadioButton) findViewById(R.id.RB54_3);
        if (rb0.isChecked()) {
            R54 = 0;
        }
        if (rb1.isChecked()) {
            R54 = 1;
        }
        if (rb2.isChecked()) {
            R54 = 2;
        }
        if (rb3.isChecked()) {
            R54 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB55_0);
        rb1 =(RadioButton) findViewById(R.id.RB55_1);
        rb2 =(RadioButton) findViewById(R.id.RB55_2);
        rb3 =(RadioButton) findViewById(R.id.RB55_3);
        if (rb0.isChecked()) {
            R55 = 0;
        }
        if (rb1.isChecked()) {
            R55 = 1;
        }
        if (rb2.isChecked()) {
            R55 = 2;
        }
        if (rb3.isChecked()) {
            R55 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB56_0);
        rb1 =(RadioButton) findViewById(R.id.RB56_1);
        rb2 =(RadioButton) findViewById(R.id.RB56_2);
        rb3 =(RadioButton) findViewById(R.id.RB56_3);
        if (rb0.isChecked()) {
            R56 = 0;
        }
        if (rb1.isChecked()) {
            R56 = 1;
        }
        if (rb2.isChecked()) {
            R56 = 2;
        }
        if (rb3.isChecked()) {
            R56 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB57_0);
        rb1 =(RadioButton) findViewById(R.id.RB57_1);
        rb2 =(RadioButton) findViewById(R.id.RB57_2);
        rb3 =(RadioButton) findViewById(R.id.RB57_3);
        if (rb0.isChecked()) {
            R57 = 0;
        }
        if (rb1.isChecked()) {
            R57 = 1;
        }
        if (rb2.isChecked()) {
            R57 = 2;
        }
        if (rb3.isChecked()) {
            R57 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB58_0);
        rb1 =(RadioButton) findViewById(R.id.RB58_1);
        rb2 =(RadioButton) findViewById(R.id.RB58_2);
        rb3 =(RadioButton) findViewById(R.id.RB58_3);
        if (rb0.isChecked()) {
            R58 = 0;
        }
        if (rb1.isChecked()) {
            R58 = 1;
        }
        if (rb2.isChecked()) {
            R58 = 2;
        }
        if (rb3.isChecked()) {
            R58 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB59_0);
        rb1 =(RadioButton) findViewById(R.id.RB59_1);
        rb2 =(RadioButton) findViewById(R.id.RB59_2);
        rb3 =(RadioButton) findViewById(R.id.RB59_3);
        if (rb0.isChecked()) {
            R59 = 0;
        }
        if (rb1.isChecked()) {
            R59 = 1;
        }
        if (rb2.isChecked()) {
            R59 = 2;
        }
        if (rb3.isChecked()) {
            R59 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB60_0);
        rb1 =(RadioButton) findViewById(R.id.RB60_1);
        rb2 =(RadioButton) findViewById(R.id.RB60_2);
        rb3 =(RadioButton) findViewById(R.id.RB60_3);
        if (rb0.isChecked()) {
            R60 = 0;
        }
        if (rb1.isChecked()) {
            R60 = 1;
        }
        if (rb2.isChecked()) {
            R60 = 2;
        }
        if (rb3.isChecked()) {
            R60 = 3;
        }


        Res4 =  R41 + R42 + R43 + R44 + R45 + R46 + R47 + R48;
        Res5 = R49 + R50 + R51 + R52 + R53 + R54 + R55 + R56 + R57 + R58 + R59 + R60;

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
        values.put(Constantes.CAMPO_R3, 1);

        db.update(Constantes.TABLA_RES_COMP_NOMBRE,values,Constantes.CAMPO_ID +"=?",parametros);
        Intent intent = new Intent(this, completoActivity.class);
        db.close();
        startActivity(intent);
    }
}
