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
import com.example.testvocacional.Util.ConexionSQLite;
import com.example.testvocacional.Util.Constantes;

public class complet_8 extends AppCompatActivity implements View.OnClickListener {
    RadioButton rb0, rb1, rb2, rb3;
    Button btn;
    private String ID;
    private Bundle bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complet_8);

        btn = findViewById(R.id.enviar_comp);
        btn.setOnClickListener(this);
        SharedPreferences sharedPreferences = getSharedPreferences(Constantes.PREFERENCIAS_RES,0);
        ID = sharedPreferences.getString(Constantes.PREFERENCIAS_RES_COMP,null);
    }

    @Override
    public void onClick(View v) {
        int Res1 = 0, Res2 = 0, Res3 = 0, Res4 = 0, Res5 = 0, Res6 = 0, Res7 = 0, Res8 = 0, Res9 = 0, Res10 = 0, Res11 = 0, Res12 = 0, Res13 = 0, Res14 = 0, Res15 = 0;
        int R141 = 0, R142 = 0, R143 = 0, R144 = 0, R145 = 0, R146 = 0, R147 = 0, R148 = 0, R149 = 0, R150 = 0, R151 = 0, R152 = 0, R153 = 0, R154 = 0, R155 = 0, R156 = 0, R157 = 0, R158 = 0, R159 = 0, R160 = 0;
        rb0 = (RadioButton) findViewById(R.id.RB141_0);
        rb1 = (RadioButton) findViewById(R.id.RB141_1);
        rb2 = (RadioButton) findViewById(R.id.RB141_2);
        rb3 = (RadioButton) findViewById(R.id.RB141_3);
        if (rb0.isChecked()) {
            R141 = 0;
        }
        if (rb1.isChecked()) {
            R141 = 1;
        }
        if (rb2.isChecked()) {
            R141 = 2;
        }
        if (rb3.isChecked()) {
            R141 = 3;
        }
        rb0 = (RadioButton) findViewById(R.id.RB142_0);
        rb1 = (RadioButton) findViewById(R.id.RB142_1);
        rb2 = (RadioButton) findViewById(R.id.RB142_2);
        rb3 = (RadioButton) findViewById(R.id.RB142_3);
        if (rb0.isChecked()) {
            R142 = 0;
        }
        if (rb1.isChecked()) {
            R142 = 1;
        }
        if (rb2.isChecked()) {
            R142 = 2;
        }
        if (rb3.isChecked()) {
            R142 = 3;
        }
        rb0 = (RadioButton) findViewById(R.id.RB143_0);
        rb1 = (RadioButton) findViewById(R.id.RB143_1);
        rb2 = (RadioButton) findViewById(R.id.RB143_2);
        rb3 = (RadioButton) findViewById(R.id.RB143_3);
        if (rb0.isChecked()) {
            R143 = 0;
        }
        if (rb1.isChecked()) {
            R143 = 1;
        }
        if (rb2.isChecked()) {
            R143 = 2;
        }
        if (rb3.isChecked()) {
            R143 = 3;
        }
        rb0 = (RadioButton) findViewById(R.id.RB144_0);
        rb1 = (RadioButton) findViewById(R.id.RB144_1);
        rb2 = (RadioButton) findViewById(R.id.RB144_2);
        rb3 = (RadioButton) findViewById(R.id.RB144_3);
        if (rb0.isChecked()) {
            R144 = 0;
        }
        if (rb1.isChecked()) {
            R144 = 1;
        }
        if (rb2.isChecked()) {
            R144 = 2;
        }
        if (rb3.isChecked()) {
            R144 = 3;
        }
        rb0 = (RadioButton) findViewById(R.id.RB145_0);
        rb1 = (RadioButton) findViewById(R.id.RB145_1);
        rb2 = (RadioButton) findViewById(R.id.RB145_2);
        rb3 = (RadioButton) findViewById(R.id.RB145_3);
        if (rb0.isChecked()) {
            R145 = 0;
        }
        if (rb1.isChecked()) {
            R145 = 1;
        }
        if (rb2.isChecked()) {
            R145 = 2;
        }
        if (rb3.isChecked()) {
            R145 = 3;
        }
        rb0 = (RadioButton) findViewById(R.id.RB146_0);
        rb1 = (RadioButton) findViewById(R.id.RB146_1);
        rb2 = (RadioButton) findViewById(R.id.RB146_2);
        rb3 = (RadioButton) findViewById(R.id.RB146_3);
        if (rb0.isChecked()) {
            R146 = 0;
        }
        if (rb1.isChecked()) {
            R146 = 1;
        }
        if (rb2.isChecked()) {
            R146 = 2;
        }
        if (rb3.isChecked()) {
            R146 = 3;
        }
        rb0 = (RadioButton) findViewById(R.id.RB147_0);
        rb1 = (RadioButton) findViewById(R.id.RB147_1);
        rb2 = (RadioButton) findViewById(R.id.RB147_2);
        rb3 = (RadioButton) findViewById(R.id.RB147_3);
        if (rb0.isChecked()) {
            R147 = 0;
        }
        if (rb1.isChecked()) {
            R147 = 1;
        }
        if (rb2.isChecked()) {
            R147 = 2;
        }
        if (rb3.isChecked()) {
            R147 = 3;
        }
        rb0 = (RadioButton) findViewById(R.id.RB148_0);
        rb1 = (RadioButton) findViewById(R.id.RB148_1);
        rb2 = (RadioButton) findViewById(R.id.RB148_2);
        rb3 = (RadioButton) findViewById(R.id.RB148_3);
        if (rb0.isChecked()) {
            R148 = 0;
        }
        if (rb1.isChecked()) {
            R148 = 1;
        }
        if (rb2.isChecked()) {
            R148 = 2;
        }
        if (rb3.isChecked()) {
            R148 = 3;
        }
        rb0 = (RadioButton) findViewById(R.id.RB149_0);
        rb1 = (RadioButton) findViewById(R.id.RB149_1);
        rb2 = (RadioButton) findViewById(R.id.RB149_2);
        rb3 = (RadioButton) findViewById(R.id.RB149_3);
        if (rb0.isChecked()) {
            R149 = 0;
        }
        if (rb1.isChecked()) {
            R149 = 1;
        }
        if (rb2.isChecked()) {
            R149 = 2;
        }
        if (rb3.isChecked()) {
            R149 = 3;
        }
        rb0 = (RadioButton) findViewById(R.id.RB150_0);
        rb1 = (RadioButton) findViewById(R.id.RB150_1);
        rb2 = (RadioButton) findViewById(R.id.RB150_2);
        rb3 = (RadioButton) findViewById(R.id.RB150_3);
        if (rb0.isChecked()) {
            R150 = 0;
        }
        if (rb1.isChecked()) {
            R150 = 1;
        }
        if (rb2.isChecked()) {
            R150 = 2;
        }
        if (rb3.isChecked()) {
            R150 = 3;
        }
        rb0 = (RadioButton) findViewById(R.id.RB151_0);
        rb1 = (RadioButton) findViewById(R.id.RB151_1);
        rb2 = (RadioButton) findViewById(R.id.RB151_2);
        rb3 = (RadioButton) findViewById(R.id.RB151_3);
        if (rb0.isChecked()) {
            R151 = 0;
        }
        if (rb1.isChecked()) {
            R151 = 1;
        }
        if (rb2.isChecked()) {
            R151 = 2;
        }
        if (rb3.isChecked()) {
            R151 = 3;
        }
        rb0 = (RadioButton) findViewById(R.id.RB152_0);
        rb1 = (RadioButton) findViewById(R.id.RB152_1);
        rb2 = (RadioButton) findViewById(R.id.RB152_2);
        rb3 = (RadioButton) findViewById(R.id.RB152_3);
        if (rb0.isChecked()) {
            R152 = 0;
        }
        if (rb1.isChecked()) {
            R152 = 1;
        }
        if (rb2.isChecked()) {
            R152 = 2;
        }
        if (rb3.isChecked()) {
            R152 = 3;
        }
        rb0 = (RadioButton) findViewById(R.id.RB153_0);
        rb1 = (RadioButton) findViewById(R.id.RB153_1);
        rb2 = (RadioButton) findViewById(R.id.RB153_2);
        rb3 = (RadioButton) findViewById(R.id.RB153_3);
        if (rb0.isChecked()) {
            R153 = 0;
        }
        if (rb1.isChecked()) {
            R153 = 1;
        }
        if (rb2.isChecked()) {
            R153 = 2;
        }
        if (rb3.isChecked()) {
            R153 = 3;
        }
        rb0 = (RadioButton) findViewById(R.id.RB154_0);
        rb1 = (RadioButton) findViewById(R.id.RB154_1);
        rb2 = (RadioButton) findViewById(R.id.RB154_2);
        rb3 = (RadioButton) findViewById(R.id.RB154_3);
        if (rb0.isChecked()) {
            R154 = 0;
        }
        if (rb1.isChecked()) {
            R154 = 1;
        }
        if (rb2.isChecked()) {
            R154 = 2;
        }
        if (rb3.isChecked()) {
            R154 = 3;
        }
        rb0 = (RadioButton) findViewById(R.id.RB155_0);
        rb1 = (RadioButton) findViewById(R.id.RB155_1);
        rb2 = (RadioButton) findViewById(R.id.RB155_2);
        rb3 = (RadioButton) findViewById(R.id.RB155_3);
        if (rb0.isChecked()) {
            R155 = 0;
        }
        if (rb1.isChecked()) {
            R155 = 1;
        }
        if (rb2.isChecked()) {
            R155 = 2;
        }
        if (rb3.isChecked()) {
            R155 = 3;
        }
        rb0 = (RadioButton) findViewById(R.id.RB156_0);
        rb1 = (RadioButton) findViewById(R.id.RB156_1);
        rb2 = (RadioButton) findViewById(R.id.RB156_2);
        rb3 = (RadioButton) findViewById(R.id.RB156_3);
        if (rb0.isChecked()) {
            R156 = 0;
        }
        if (rb1.isChecked()) {
            R156 = 1;
        }
        if (rb2.isChecked()) {
            R156 = 2;
        }
        if (rb3.isChecked()) {
            R156 = 3;
        }
        rb0 = (RadioButton) findViewById(R.id.RB157_0);
        rb1 = (RadioButton) findViewById(R.id.RB157_1);
        rb2 = (RadioButton) findViewById(R.id.RB157_2);
        rb3 = (RadioButton) findViewById(R.id.RB157_3);
        if (rb0.isChecked()) {
            R157 = 0;
        }
        if (rb1.isChecked()) {
            R157 = 1;
        }
        if (rb2.isChecked()) {
            R157 = 2;
        }
        if (rb3.isChecked()) {
            R157 = 3;
        }
        rb0 = (RadioButton) findViewById(R.id.RB158_0);
        rb1 = (RadioButton) findViewById(R.id.RB158_1);
        rb2 = (RadioButton) findViewById(R.id.RB158_2);
        rb3 = (RadioButton) findViewById(R.id.RB158_3);
        if (rb0.isChecked()) {
            R158 = 0;
        }
        if (rb1.isChecked()) {
            R158 = 1;
        }
        if (rb2.isChecked()) {
            R158 = 2;
        }
        if (rb3.isChecked()) {
            R158 = 3;
        }
        rb0 = (RadioButton) findViewById(R.id.RB159_0);
        rb1 = (RadioButton) findViewById(R.id.RB159_1);
        rb2 = (RadioButton) findViewById(R.id.RB159_2);
        rb3 = (RadioButton) findViewById(R.id.RB159_3);
        if (rb0.isChecked()) {
            R159 = 0;
        }
        if (rb1.isChecked()) {
            R159 = 1;
        }
        if (rb2.isChecked()) {
            R159 = 2;
        }
        if (rb3.isChecked()) {
            R159 = 3;
        }
        rb0 = (RadioButton) findViewById(R.id.RB160_0);
        rb1 = (RadioButton) findViewById(R.id.RB160_1);
        rb2 = (RadioButton) findViewById(R.id.RB160_2);
        rb3 = (RadioButton) findViewById(R.id.RB160_3);
        if (rb0.isChecked()) {
            R160 = 0;
        }
        if (rb1.isChecked()) {
            R160 = 1;
        }
        if (rb2.isChecked()) {
            R160 = 2;
        }
        if (rb3.isChecked()) {
            R160 = 3;
        }


        Res12 = R141 + R142 + R143 + R144;
        Res13 = R145 + R146 + R147 + R148 + R149 + R150 + R151 + R152 + R153 + R154 + R155 + R156;
        Res14 = R157 + R158 + R159 + R160;

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
        values.put(Constantes.CAMPO_R8, 1);

        db.update(Constantes.TABLA_RES_COMP_NOMBRE,values,Constantes.CAMPO_ID +"=?",parametros);
        Intent intent = new Intent(this, completoActivity.class);
        db.close();
        startActivity(intent);

    }
}
