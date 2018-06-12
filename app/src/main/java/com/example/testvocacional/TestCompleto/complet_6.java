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

public class complet_6 extends AppCompatActivity implements View.OnClickListener{
    RadioButton rb0, rb1, rb2, rb3;
    Button btn;
    private String ID;
    private Bundle bundle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complet_6);

        btn = findViewById(R.id.enviar_comp);
        btn.setOnClickListener(this);
        bundle = getIntent().getExtras();
        if(bundle != null){
            ID = bundle.getString("id");}

    }

    @Override
    public void onClick(View v) {
        int Res1 = 0, Res2 = 0, Res3 = 0, Res4 = 0, Res5 = 0, Res6 = 0, Res7 = 0, Res8 = 0, Res9 = 0, Res10 = 0, Res11 = 0, Res12 = 0, Res13 = 0, Res14 = 0, Res15 = 0;
        int R101 = 0, R102 = 0, R103 = 0, R104 = 0, R105 = 0, R106 = 0, R107 = 0, R108 = 0, R109 = 0, R110 = 0, R111 = 0, R112 = 0, R113 = 0, R114 = 0, R115 = 0, R116 = 0, R117 = 0, R118 = 0, R119 = 0, R120 = 0;

        rb0 =(RadioButton) findViewById(R.id.RB101_0);
        rb1 =(RadioButton) findViewById(R.id.RB101_1);
        rb2 =(RadioButton) findViewById(R.id.RB101_2);
        rb3 =(RadioButton) findViewById(R.id.RB101_3);
        if (rb0.isChecked()) {
            R101 = 0;
        }
        if (rb1.isChecked()) {
            R101 = 1;
        }
        if (rb2.isChecked()) {
            R101 = 2;
        }
        if (rb3.isChecked()) {
            R101 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB102_0);
        rb1 =(RadioButton) findViewById(R.id.RB102_1);
        rb2 =(RadioButton) findViewById(R.id.RB102_2);
        rb3 =(RadioButton) findViewById(R.id.RB102_3);
        if (rb0.isChecked()) {
            R102 = 0;
        }
        if (rb1.isChecked()) {
            R102 = 1;
        }
        if (rb2.isChecked()) {
            R102 = 2;
        }
        if (rb3.isChecked()) {
            R102 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB103_0);
        rb1 =(RadioButton) findViewById(R.id.RB103_1);
        rb2 =(RadioButton) findViewById(R.id.RB103_2);
        rb3 =(RadioButton) findViewById(R.id.RB103_3);
        if (rb0.isChecked()) {
            R103 = 0;
        }
        if (rb1.isChecked()) {
            R103 = 1;
        }
        if (rb2.isChecked()) {
            R103 = 2;
        }
        if (rb3.isChecked()) {
            R103 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB104_0);
        rb1 =(RadioButton) findViewById(R.id.RB104_1);
        rb2 =(RadioButton) findViewById(R.id.RB104_2);
        rb3 =(RadioButton) findViewById(R.id.RB104_3);
        if (rb0.isChecked()) {
            R104 = 0;
        }
        if (rb1.isChecked()) {
            R104 = 1;
        }
        if (rb2.isChecked()) {
            R104 = 2;
        }
        if (rb3.isChecked()) {
            R104 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB105_0);
        rb1 =(RadioButton) findViewById(R.id.RB105_1);
        rb2 =(RadioButton) findViewById(R.id.RB105_2);
        rb3 =(RadioButton) findViewById(R.id.RB105_3);
        if (rb0.isChecked()) {
            R105 = 0;
        }
        if (rb1.isChecked()) {
            R105 = 1;
        }
        if (rb2.isChecked()) {
            R105 = 2;
        }
        if (rb3.isChecked()) {
            R105 = 3;
        }
        rb0 = (RadioButton)findViewById(R.id.RB106_0);
        rb1 = (RadioButton)findViewById(R.id.RB106_1);
        rb2 = (RadioButton)findViewById(R.id.RB106_2);
        rb3 = (RadioButton)findViewById(R.id.RB106_3);
        if (rb0.isChecked()) {
            R106 = 0;
        }
        if (rb1.isChecked()) {
            R106 = 1;
        }
        if (rb2.isChecked()) {
            R106 = 2;
        }
        if (rb3.isChecked()) {
            R106 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB107_0);
        rb1 =(RadioButton) findViewById(R.id.RB107_1);
        rb2 =(RadioButton) findViewById(R.id.RB107_2);
        rb3 =(RadioButton) findViewById(R.id.RB107_3);
        if (rb0.isChecked()) {
            R107 = 0;
        }
        if (rb1.isChecked()) {
            R107 = 1;
        }
        if (rb2.isChecked()) {
            R107 = 2;
        }
        if (rb3.isChecked()) {
            R107 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB108_0);
        rb1 =(RadioButton) findViewById(R.id.RB108_1);
        rb2 =(RadioButton) findViewById(R.id.RB108_2);
        rb3 =(RadioButton) findViewById(R.id.RB108_3);
        if (rb0.isChecked()) {
            R108 = 0;
        }
        if (rb1.isChecked()) {
            R108 = 1;
        }
        if (rb2.isChecked()) {
            R108 = 2;
        }
        if (rb3.isChecked()) {
            R108 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB109_0);
        rb1 =(RadioButton) findViewById(R.id.RB109_1);
        rb2 =(RadioButton) findViewById(R.id.RB109_2);
        rb3 =(RadioButton) findViewById(R.id.RB109_3);
        if (rb0.isChecked()) {
            R109 = 0;
        }
        if (rb1.isChecked()) {
            R109 = 1;
        }
        if (rb2.isChecked()) {
            R109 = 2;
        }
        if (rb3.isChecked()) {
            R109 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB110_0);
        rb1 =(RadioButton) findViewById(R.id.RB110_1);
        rb2 =(RadioButton) findViewById(R.id.RB110_2);
        rb3 =(RadioButton) findViewById(R.id.RB110_3);
        if (rb0.isChecked()) {
            R110 = 0;
        }
        if (rb1.isChecked()) {
            R110 = 1;
        }
        if (rb2.isChecked()) {
            R110 = 2;
        }
        if (rb3.isChecked()) {
            R110 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB111_0);
        rb1 =(RadioButton) findViewById(R.id.RB111_1);
        rb2 =(RadioButton) findViewById(R.id.RB111_2);
        rb3 =(RadioButton) findViewById(R.id.RB111_3);
        if (rb0.isChecked()) {
            R111 = 0;
        }
        if (rb1.isChecked()) {
            R111 = 1;
        }
        if (rb2.isChecked()) {
            R111 = 2;
        }
        if (rb3.isChecked()) {
            R111 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB112_0);
        rb1 =(RadioButton) findViewById(R.id.RB112_1);
        rb2 =(RadioButton) findViewById(R.id.RB112_2);
        rb3 =(RadioButton) findViewById(R.id.RB112_3);
        if (rb0.isChecked()) {
            R112 = 0;
        }
        if (rb1.isChecked()) {
            R112 = 1;
        }
        if (rb2.isChecked()) {
            R112 = 2;
        }
        if (rb3.isChecked()) {
            R112 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB113_0);
        rb1 =(RadioButton) findViewById(R.id.RB113_1);
        rb2 =(RadioButton) findViewById(R.id.RB113_2);
        rb3 =(RadioButton) findViewById(R.id.RB113_3);
        if (rb0.isChecked()) {
            R113 = 0;
        }
        if (rb1.isChecked()) {
            R113 = 1;
        }
        if (rb2.isChecked()) {
            R113 = 2;
        }
        if (rb3.isChecked()) {
            R113 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB114_0);
        rb1 =(RadioButton) findViewById(R.id.RB114_1);
        rb2 =(RadioButton) findViewById(R.id.RB114_2);
        rb3 =(RadioButton) findViewById(R.id.RB114_3);
        if (rb0.isChecked()) {
            R114 = 0;
        }
        if (rb1.isChecked()) {
            R114 = 1;
        }
        if (rb2.isChecked()) {
            R114 = 2;
        }
        if (rb3.isChecked()) {
            R114 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB115_0);
        rb1 =(RadioButton) findViewById(R.id.RB115_1);
        rb2 =(RadioButton) findViewById(R.id.RB115_2);
        rb3 =(RadioButton) findViewById(R.id.RB115_3);
        if (rb0.isChecked()) {
            R115 = 0;
        }
        if (rb1.isChecked()) {
            R115 = 1;
        }
        if (rb2.isChecked()) {
            R115 = 2;
        }
        if (rb3.isChecked()) {
            R115 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB116_0);
        rb1 =(RadioButton) findViewById(R.id.RB116_1);
        rb2 =(RadioButton) findViewById(R.id.RB116_2);
        rb3 =(RadioButton) findViewById(R.id.RB116_3);
        if (rb0.isChecked()) {
            R116 = 0;
        }
        if (rb1.isChecked()) {
            R116 = 1;
        }
        if (rb2.isChecked()) {
            R116 = 2;
        }
        if (rb3.isChecked()) {
            R116 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB117_0);
        rb1 =(RadioButton) findViewById(R.id.RB117_1);
        rb2 =(RadioButton) findViewById(R.id.RB117_2);
        rb3 =(RadioButton) findViewById(R.id.RB117_3);
        if (rb0.isChecked()) {
            R117 = 0;
        }
        if (rb1.isChecked()) {
            R117 = 1;
        }
        if (rb2.isChecked()) {
            R117 = 2;
        }
        if (rb3.isChecked()) {
            R117 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB118_0);
        rb1 =(RadioButton) findViewById(R.id.RB118_1);
        rb2 =(RadioButton) findViewById(R.id.RB118_2);
        rb3 =(RadioButton) findViewById(R.id.RB118_3);
        if (rb0.isChecked()) {
            R118 = 0;
        }
        if (rb1.isChecked()) {
            R118 = 1;
        }
        if (rb2.isChecked()) {
            R118 = 2;
        }
        if (rb3.isChecked()) {
            R118 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB119_0);
        rb1 =(RadioButton) findViewById(R.id.RB119_1);
        rb2 =(RadioButton) findViewById(R.id.RB119_2);
        rb3 =(RadioButton) findViewById(R.id.RB119_3);
        if (rb0.isChecked()) {
            R119 = 0;
        }
        if (rb1.isChecked()) {
            R119 = 1;
        }
        if (rb2.isChecked()) {
            R119 = 2;
        }
        if (rb3.isChecked()) {
            R119 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB120_0);
        rb1 =(RadioButton) findViewById(R.id.RB120_1);
        rb2 =(RadioButton) findViewById(R.id.RB120_2);
        rb3 =(RadioButton) findViewById(R.id.RB120_3);
        if (rb0.isChecked()) {
            R120 = 0;
        }
        if (rb1.isChecked()) {
            R120 = 1;
        }
        if (rb2.isChecked()) {
            R120 = 2;
        }
        if (rb3.isChecked()) {
            R120 = 3;
        }
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
        values.put(Constantes.CAMPO_R6, 1);

        db.update(Constantes.TABLA_RES_COMP_NOMBRE,values,Constantes.CAMPO_ID +"=?",parametros);
        Intent intent = new Intent(this, completoActivity.class);
        intent.putExtra("id", ID);
        db.close();
        startActivity(intent);

    }
}
