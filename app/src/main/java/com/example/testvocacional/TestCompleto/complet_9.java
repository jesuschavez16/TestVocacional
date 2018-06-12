package com.example.testvocacional.TestCompleto;

import android.content.ContentValues;
import android.content.Intent;
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

public class complet_9 extends AppCompatActivity implements View.OnClickListener{
    RadioButton rb0, rb1, rb2, rb3;
    Button btn;
    private String ID;
    private Bundle bundle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complet_9);
        btn = findViewById(R.id.enviar_comp);
        btn.setOnClickListener(this);
        bundle = getIntent().getExtras();
        if(bundle != null){
            ID = bundle.getString("id");}
    }

    @Override
    public void onClick(View v) {
        int Res1 = 0, Res2 = 0, Res3 = 0, Res4 = 0, Res5 = 0, Res6 = 0, Res7 = 0, Res8 = 0, Res9 = 0, Res10 = 0, Res11 = 0, Res12 = 0, Res13 = 0, Res14 = 0, Res15 = 0;
        int R161 = 0, R162 = 0, R163 = 0, R164 = 0, R165 = 0, R166 = 0, R167 = 0, R168 = 0, R169 = 0, R170 = 0, R171 = 0, R172 = 0, R173 = 0, R174 = 0, R175 = 0, R176 = 0, R177 = 0, R178 = 0, R179 = 0, R180 = 0;
        rb0 =(RadioButton) findViewById(R.id.RB161_0);
        rb1 =(RadioButton) findViewById(R.id.RB161_1);
        rb2 =(RadioButton) findViewById(R.id.RB161_2);
        rb3 =(RadioButton) findViewById(R.id.RB161_3);
        if (rb0.isChecked()) {
            R161 = 0;
        }
        if (rb1.isChecked()) {
            R161 = 1;
        }
        if (rb2.isChecked()) {
            R161 = 2;
        }
        if (rb3.isChecked()) {
            R161 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB162_0);
        rb1 =(RadioButton) findViewById(R.id.RB162_1);
        rb2 =(RadioButton) findViewById(R.id.RB162_2);
        rb3 =(RadioButton) findViewById(R.id.RB162_3);
        if (rb0.isChecked()) {
            R162 = 0;
        }
        if (rb1.isChecked()) {
            R162 = 1;
        }
        if (rb2.isChecked()) {
            R162 = 2;
        }
        if (rb3.isChecked()) {
            R162 = 3;
        }
        rb0 =(RadioButton)findViewById(R.id.RB163_0);
        rb1 =(RadioButton)findViewById(R.id.RB163_1);
        rb2 =(RadioButton)findViewById(R.id.RB163_2);
        rb3 =(RadioButton)findViewById(R.id.RB163_3);
        if (rb0.isChecked()) {
            R163 = 0;
        }
        if (rb1.isChecked()) {
            R163 = 1;
        }
        if (rb2.isChecked()) {
            R163 = 2;
        }
        if (rb3.isChecked()) {
            R163 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB164_0);
        rb1 =(RadioButton) findViewById(R.id.RB164_1);
        rb2 =(RadioButton) findViewById(R.id.RB164_2);
        rb3 =(RadioButton) findViewById(R.id.RB164_3);
        if (rb0.isChecked()) {
            R164 = 0;
        }
        if (rb1.isChecked()) {
            R164 = 1;
        }
        if (rb2.isChecked()) {
            R164 = 2;
        }
        if (rb3.isChecked()) {
            R164 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB165_0);
        rb1 =(RadioButton) findViewById(R.id.RB165_1);
        rb2 =(RadioButton) findViewById(R.id.RB165_2);
        rb3 =(RadioButton) findViewById(R.id.RB165_3);
        if (rb0.isChecked()) {
            R165 = 0;
        }
        if (rb1.isChecked()) {
            R165 = 1;
        }
        if (rb2.isChecked()) {
            R165 = 2;
        }
        if (rb3.isChecked()) {
            R165 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB166_0);
        rb1 =(RadioButton) findViewById(R.id.RB166_1);
        rb2 =(RadioButton) findViewById(R.id.RB166_2);
        rb3 =(RadioButton) findViewById(R.id.RB166_3);
        if (rb0.isChecked()) {
            R166 = 0;
        }
        if (rb1.isChecked()) {
            R166 = 1;
        }
        if (rb2.isChecked()) {
            R166 = 2;
        }
        if (rb3.isChecked()) {
            R166 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB167_0);
        rb1 =(RadioButton) findViewById(R.id.RB167_1);
        rb2 =(RadioButton) findViewById(R.id.RB167_2);
        rb3 =(RadioButton) findViewById(R.id.RB167_3);
        if (rb0.isChecked()) {
            R167 = 0;
        }
        if (rb1.isChecked()) {
            R167 = 1;
        }
        if (rb2.isChecked()) {
            R167 = 2;
        }
        if (rb3.isChecked()) {
            R167 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB168_0);
        rb1 =(RadioButton) findViewById(R.id.RB168_1);
        rb2 =(RadioButton) findViewById(R.id.RB168_2);
        rb3 =(RadioButton) findViewById(R.id.RB168_3);
        if (rb0.isChecked()) {
            R168 = 0;
        }
        if (rb1.isChecked()) {
            R168 = 1;
        }
        if (rb2.isChecked()) {
            R168 = 2;
        }
        if (rb3.isChecked()) {
            R168 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB169_0);
        rb1 =(RadioButton) findViewById(R.id.RB169_1);
        rb2 =(RadioButton) findViewById(R.id.RB169_2);
        rb3 =(RadioButton) findViewById(R.id.RB169_3);
        if (rb0.isChecked()) {
            R169 = 0;
        }
        if (rb1.isChecked()) {
            R169 = 1;
        }
        if (rb2.isChecked()) {
            R169 = 2;
        }
        if (rb3.isChecked()) {
            R169 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB170_0);
        rb1 =(RadioButton) findViewById(R.id.RB170_1);
        rb2 =(RadioButton) findViewById(R.id.RB170_2);
        rb3 =(RadioButton) findViewById(R.id.RB170_3);
        if (rb0.isChecked()) {
            R170 = 0;
        }
        if (rb1.isChecked()) {
            R170 = 1;
        }
        if (rb2.isChecked()) {
            R170 = 2;
        }
        if (rb3.isChecked()) {
            R170 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB171_0);
        rb1 =(RadioButton) findViewById(R.id.RB171_1);
        rb2 =(RadioButton) findViewById(R.id.RB171_2);
        rb3 =(RadioButton) findViewById(R.id.RB171_3);
        if (rb0.isChecked()) {
            R171 = 0;
        }
        if (rb1.isChecked()) {
            R171 = 1;
        }
        if (rb2.isChecked()) {
            R171 = 2;
        }
        if (rb3.isChecked()) {
            R171 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB172_0);
        rb1 =(RadioButton) findViewById(R.id.RB172_1);
        rb2 =(RadioButton) findViewById(R.id.RB172_2);
        rb3 =(RadioButton) findViewById(R.id.RB172_3);
        if (rb0.isChecked()) {
            R172 = 0;
        }
        if (rb1.isChecked()) {
            R172 = 1;
        }
        if (rb2.isChecked()) {
            R172 = 2;
        }
        if (rb3.isChecked()) {
            R172 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB173_0);
        rb1 =(RadioButton) findViewById(R.id.RB173_1);
        rb2 =(RadioButton) findViewById(R.id.RB173_2);
        rb3 =(RadioButton) findViewById(R.id.RB173_3);
        if (rb0.isChecked()) {
            R173 = 0;
        }
        if (rb1.isChecked()) {
            R173 = 1;
        }
        if (rb2.isChecked()) {
            R173 = 2;
        }
        if (rb3.isChecked()) {
            R173 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB174_0);
        rb1 =(RadioButton) findViewById(R.id.RB174_1);
        rb2 =(RadioButton) findViewById(R.id.RB174_2);
        rb3 =(RadioButton) findViewById(R.id.RB174_3);
        if (rb0.isChecked()) {
            R174 = 0;
        }
        if (rb1.isChecked()) {
            R174 = 1;
        }
        if (rb2.isChecked()) {
            R174 = 2;
        }
        if (rb3.isChecked()) {
            R174 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB175_0);
        rb1 =(RadioButton) findViewById(R.id.RB175_1);
        rb2 =(RadioButton) findViewById(R.id.RB175_2);
        rb3 =(RadioButton) findViewById(R.id.RB175_3);
        if (rb0.isChecked()) {
            R175 = 0;
        }
        if (rb1.isChecked()) {
            R175 = 1;
        }
        if (rb2.isChecked()) {
            R175 = 2;
        }
        if (rb3.isChecked()) {
            R175 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB176_0);
        rb1 =(RadioButton) findViewById(R.id.RB176_1);
        rb2 =(RadioButton) findViewById(R.id.RB176_2);
        rb3 =(RadioButton) findViewById(R.id.RB176_3);
        if (rb0.isChecked()) {
            R176 = 0;
        }
        if (rb1.isChecked()) {
            R176 = 1;
        }
        if (rb2.isChecked()) {
            R176 = 2;
        }
        if (rb3.isChecked()) {
            R176 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB177_0);
        rb1 =(RadioButton) findViewById(R.id.RB177_1);
        rb2 =(RadioButton) findViewById(R.id.RB177_2);
        rb3 =(RadioButton) findViewById(R.id.RB177_3);
        if (rb0.isChecked()) {
            R177 = 0;
        }
        if (rb1.isChecked()) {
            R177 = 1;
        }
        if (rb2.isChecked()) {
            R177 = 2;
        }
        if (rb3.isChecked()) {
            R177 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB178_0);
        rb1 =(RadioButton) findViewById(R.id.RB178_1);
        rb2 =(RadioButton) findViewById(R.id.RB178_2);
        rb3 =(RadioButton) findViewById(R.id.RB178_3);
        if (rb0.isChecked()) {
            R178 = 0;
        }
        if (rb1.isChecked()) {
            R178 = 1;
        }
        if (rb2.isChecked()) {
            R178 = 2;
        }
        if (rb3.isChecked()) {
            R178 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB179_0);
        rb1 =(RadioButton) findViewById(R.id.RB179_1);
        rb2 =(RadioButton) findViewById(R.id.RB179_2);
        rb3 =(RadioButton) findViewById(R.id.RB179_3);
        if (rb0.isChecked()) {
            R179 = 0;
        }
        if (rb1.isChecked()) {
            R179 = 1;
        }
        if (rb2.isChecked()) {
            R179 = 2;
        }
        if (rb3.isChecked()) {
            R179 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB180_0);
        rb1 =(RadioButton) findViewById(R.id.RB180_1);
        rb2 =(RadioButton) findViewById(R.id.RB180_2);
        rb3 =(RadioButton) findViewById(R.id.RB180_3);
        if (rb0.isChecked()) {
            R180 = 0;
        }
        if (rb1.isChecked()) {
            R180 = 1;
        }
        if (rb2.isChecked()) {
            R180 = 2;
        }
        if (rb3.isChecked()) {
            R180 = 3;
        }

        Res14 = R161 + R162 + R163 + R164 + R165 + R166 + R167 + R168;
        Res15 = R169 + R170 + R171 + R172 + R173 + R174 + R175 + R176 + R177 + R178 + R179 + R180;

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
        values.put(Constantes.CAMPO_R9, 1);

        db.update(Constantes.TABLA_RES_COMP_NOMBRE,values,Constantes.CAMPO_ID +"=?",parametros);
        Intent intent = new Intent(this, completoActivity.class);
        intent.putExtra("id", ID);
        db.close();
        startActivity(intent);

    }
}
