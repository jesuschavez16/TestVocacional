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

public class complet_7 extends AppCompatActivity implements View.OnClickListener{
    RadioButton rb0, rb1, rb2, rb3;
    Button btn;
    private String ID;
    private Bundle bundle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complet_7);
        btn = findViewById(R.id.enviar_comp);
        btn.setOnClickListener(this);
        bundle = getIntent().getExtras();
        if(bundle != null){
            ID = bundle.getString("id");}

    }

    @Override
    public void onClick(View v) {
        int Res1 = 0, Res2 = 0, Res3 = 0, Res4 = 0, Res5 = 0, Res6 = 0, Res7 = 0, Res8 = 0, Res9 = 0, Res10 = 0, Res11 = 0, Res12 = 0, Res13 = 0, Res14 = 0, Res15 = 0;
        int R121 = 0, R122 = 0, R123 = 0, R124 = 0, R125 = 0, R126 = 0, R127 = 0, R128 = 0, R129 = 0, R130 = 0, R131 = 0, R132 = 0, R133 = 0, R134 = 0, R135 = 0, R136 = 0, R137 = 0, R138 = 0, R139 = 0, R140 = 0;

        rb0 =(RadioButton) findViewById(R.id.RB121_0);
        rb1 =(RadioButton) findViewById(R.id.RB121_1);
        rb2 =(RadioButton) findViewById(R.id.RB121_2);
        rb3 =(RadioButton) findViewById(R.id.RB121_3);
        if (rb0.isChecked()) {
            R121 = 0;
        }
        if (rb1.isChecked()) {
            R121 = 1;
        }
        if (rb2.isChecked()) {
            R121 = 2;
        }
        if (rb3.isChecked()) {
            R121 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB122_0);
        rb1 =(RadioButton) findViewById(R.id.RB122_1);
        rb2 =(RadioButton) findViewById(R.id.RB122_2);
        rb3 =(RadioButton) findViewById(R.id.RB122_3);
        if (rb0.isChecked()) {
            R122 = 0;
        }
        if (rb1.isChecked()) {
            R122 = 1;
        }
        if (rb2.isChecked()) {
            R122 = 2;
        }
        if (rb3.isChecked()) {
            R122 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB123_0);
        rb1 =(RadioButton) findViewById(R.id.RB123_1);
        rb2 =(RadioButton) findViewById(R.id.RB123_2);
        rb3 =(RadioButton) findViewById(R.id.RB123_3);
        if (rb0.isChecked()) {
            R123 = 0;
        }
        if (rb1.isChecked()) {
            R123 = 1;
        }
        if (rb2.isChecked()) {
            R123 = 2;
        }
        if (rb3.isChecked()) {
            R123 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB124_0);
        rb1 =(RadioButton) findViewById(R.id.RB124_1);
        rb2 =(RadioButton) findViewById(R.id.RB124_2);
        rb3 =(RadioButton) findViewById(R.id.RB124_3);
        if (rb0.isChecked()) {
            R124 = 0;
        }
        if (rb1.isChecked()) {
            R124 = 1;
        }
        if (rb2.isChecked()) {
            R124 = 2;
        }
        if (rb3.isChecked()) {
            R124 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB125_0);
        rb1 =(RadioButton) findViewById(R.id.RB125_1);
        rb2 =(RadioButton) findViewById(R.id.RB125_2);
        rb3 =(RadioButton) findViewById(R.id.RB125_3);
        if (rb0.isChecked()) {
            R125 = 0;
        }
        if (rb1.isChecked()) {
            R125 = 1;
        }
        if (rb2.isChecked()) {
            R125 = 2;
        }
        if (rb3.isChecked()) {
            R125 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB126_0);
        rb1 =(RadioButton) findViewById(R.id.RB126_1);
        rb2 =(RadioButton) findViewById(R.id.RB126_2);
        rb3 =(RadioButton) findViewById(R.id.RB126_3);
        if (rb0.isChecked()) {
            R126 = 0;
        }
        if (rb1.isChecked()) {
            R126 = 1;
        }
        if (rb2.isChecked()) {
            R126 = 2;
        }
        if (rb3.isChecked()) {
            R126 = 3;
        }
        rb0 = (RadioButton)findViewById(R.id.RB127_0);
        rb1 = (RadioButton)findViewById(R.id.RB127_1);
        rb2 = (RadioButton)findViewById(R.id.RB127_2);
        rb3 = (RadioButton)findViewById(R.id.RB127_3);
        if (rb0.isChecked()) {
            R127 = 0;
        }
        if (rb1.isChecked()) {
            R127 = 1;
        }
        if (rb2.isChecked()) {
            R127 = 2;
        }
        if (rb3.isChecked()) {
            R127 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB128_0);
        rb1 =(RadioButton) findViewById(R.id.RB128_1);
        rb2 =(RadioButton) findViewById(R.id.RB128_2);
        rb3 =(RadioButton) findViewById(R.id.RB128_3);
        if (rb0.isChecked()) {
            R128 = 0;
        }
        if (rb1.isChecked()) {
            R128 = 1;
        }
        if (rb2.isChecked()) {
            R128 = 2;
        }
        if (rb3.isChecked()) {
            R128 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB129_0);
        rb1 =(RadioButton) findViewById(R.id.RB129_1);
        rb2 =(RadioButton) findViewById(R.id.RB129_2);
        rb3 =(RadioButton) findViewById(R.id.RB129_3);
        if (rb0.isChecked()) {
            R129 = 0;
        }
        if (rb1.isChecked()) {
            R129 = 1;
        }
        if (rb2.isChecked()) {
            R129 = 2;
        }
        if (rb3.isChecked()) {
            R129 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB130_0);
        rb1 =(RadioButton) findViewById(R.id.RB130_1);
        rb2 =(RadioButton) findViewById(R.id.RB130_2);
        rb3 =(RadioButton) findViewById(R.id.RB130_3);
        if (rb0.isChecked()) {
            R130 = 0;
        }
        if (rb1.isChecked()) {
            R130 = 1;
        }
        if (rb2.isChecked()) {
            R130 = 2;
        }
        if (rb3.isChecked()) {
            R130 = 3;
        }
        rb0 =(RadioButton)findViewById(R.id.RB131_0);
        rb1 =(RadioButton)findViewById(R.id.RB131_1);
        rb2 =(RadioButton)findViewById(R.id.RB131_2);
        rb3 =(RadioButton)findViewById(R.id.RB131_3);
        if (rb0.isChecked()) {
            R131 = 0;
        }
        if (rb1.isChecked()) {
            R131 = 1;
        }
        if (rb2.isChecked()) {
            R131 = 2;
        }
        if (rb3.isChecked()) {
            R131 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB132_0);
        rb1 =(RadioButton) findViewById(R.id.RB132_1);
        rb2 =(RadioButton) findViewById(R.id.RB132_2);
        rb3 =(RadioButton) findViewById(R.id.RB132_3);
        if (rb0.isChecked()) {
            R132 = 0;
        }
        if (rb1.isChecked()) {
            R132 = 1;
        }
        if (rb2.isChecked()) {
            R132 = 2;
        }
        if (rb3.isChecked()) {
            R132 = 3;
        }
        rb0 =(RadioButton)findViewById(R.id.RB133_0);
        rb1 =(RadioButton)findViewById(R.id.RB133_1);
        rb2 =(RadioButton)findViewById(R.id.RB133_2);
        rb3 =(RadioButton)findViewById(R.id.RB133_3);
        if (rb0.isChecked()) {
            R133 = 0;
        }
        if (rb1.isChecked()) {
            R133 = 1;
        }
        if (rb2.isChecked()) {
            R133 = 2;
        }
        if (rb3.isChecked()) {
            R133 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB134_0);
        rb1 =(RadioButton) findViewById(R.id.RB134_1);
        rb2 =(RadioButton) findViewById(R.id.RB134_2);
        rb3 =(RadioButton) findViewById(R.id.RB134_3);
        if (rb0.isChecked()) {
            R134 = 0;
        }
        if (rb1.isChecked()) {
            R134 = 1;
        }
        if (rb2.isChecked()) {
            R134 = 2;
        }
        if (rb3.isChecked()) {
            R134 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB135_0);
        rb1 =(RadioButton) findViewById(R.id.RB135_1);
        rb2 =(RadioButton) findViewById(R.id.RB135_2);
        rb3 =(RadioButton) findViewById(R.id.RB135_3);
        if (rb0.isChecked()) {
            R135 = 0;
        }
        if (rb1.isChecked()) {
            R135 = 1;
        }
        if (rb2.isChecked()) {
            R135 = 2;
        }
        if (rb3.isChecked()) {
            R135 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB136_0);
        rb1 =(RadioButton) findViewById(R.id.RB136_1);
        rb2 =(RadioButton) findViewById(R.id.RB136_2);
        rb3 =(RadioButton) findViewById(R.id.RB136_3);
        if (rb0.isChecked()) {
            R136 = 0;
        }
        if (rb1.isChecked()) {
            R136 = 1;
        }
        if (rb2.isChecked()) {
            R136 = 2;
        }
        if (rb3.isChecked()) {
            R136 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB137_0);
        rb1 =(RadioButton) findViewById(R.id.RB137_1);
        rb2 =(RadioButton) findViewById(R.id.RB137_2);
        rb3 =(RadioButton) findViewById(R.id.RB137_3);
        if (rb0.isChecked()) {
            R137 = 0;
        }
        if (rb1.isChecked()) {
            R137 = 1;
        }
        if (rb2.isChecked()) {
            R137 = 2;
        }
        if (rb3.isChecked()) {
            R137 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB138_0);
        rb1 =(RadioButton) findViewById(R.id.RB138_1);
        rb2 =(RadioButton) findViewById(R.id.RB138_2);
        rb3 =(RadioButton) findViewById(R.id.RB138_3);
        if (rb0.isChecked()) {
            R138 = 0;
        }
        if (rb1.isChecked()) {
            R138 = 1;
        }
        if (rb2.isChecked()) {
            R138 = 2;
        }
        if (rb3.isChecked()) {
            R138 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB139_0);
        rb1 =(RadioButton) findViewById(R.id.RB139_1);
        rb2 =(RadioButton) findViewById(R.id.RB139_2);
        rb3 =(RadioButton) findViewById(R.id.RB139_3);
        if (rb0.isChecked()) {
            R139 = 0;
        }
        if (rb1.isChecked()) {
            R139 = 1;
        }
        if (rb2.isChecked()) {
            R139 = 2;
        }
        if (rb3.isChecked()) {
            R139 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB140_0);
        rb1 =(RadioButton) findViewById(R.id.RB140_1);
        rb2 =(RadioButton) findViewById(R.id.RB140_2);
        rb3 =(RadioButton) findViewById(R.id.RB140_3);
        if (rb0.isChecked()) {
            R140 = 0;
        }
        if (rb1.isChecked()) {
            R140 = 1;
        }
        if (rb2.isChecked()) {
            R140 = 2;
        }
        if (rb3.isChecked()) {
            R140 = 3;
        }


        Res11 = R121 + R122 + R123 + R124 + R125 + R126 + R127 + R128 + R129 + R130 + R131 + R132;
        Res12 = R133 + R134 + R135 + R136 + R137 + R138 + R139 + R140;

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
        values.put(Constantes.CAMPO_R7, 1);

        db.update(Constantes.TABLA_RES_COMP_NOMBRE,values,Constantes.CAMPO_ID +"=?",parametros);
        Intent intent = new Intent(this, completoActivity.class);
        intent.putExtra("id", ID);
        db.close();
        startActivity(intent);
    }
}
