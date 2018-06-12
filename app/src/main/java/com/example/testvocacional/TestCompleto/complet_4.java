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

public class complet_4 extends AppCompatActivity implements View.OnClickListener{
    RadioButton rb0, rb1, rb2, rb3;
    Button btn;
    private String ID;
    private Bundle bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complet_4);
        btn = findViewById(R.id.enviar_comp);
        btn.setOnClickListener(this);
        bundle = getIntent().getExtras();
        if(bundle != null){
            ID = bundle.getString("id");}

    }

    @Override
    public void onClick(View v) {
        int Res1 = 0, Res2 = 0, Res3 = 0, Res4 = 0, Res5 = 0, Res6 = 0, Res7 = 0, Res8 = 0, Res9 = 0, Res10 = 0, Res11 = 0, Res12 = 0, Res13 = 0, Res14 = 0, Res15 = 0;
        int R61 = 0, R62 = 0, R63 = 0, R64 = 0, R65 = 0, R66 = 0, R67 = 0, R68 = 0, R69 = 0, R70 = 0, R71 = 0, R72 = 0, R73 = 0, R74 = 0, R75 = 0, R76 = 0, R77 = 0, R78 = 0, R79 = 0, R80 = 0;
        rb0 =(RadioButton) findViewById(R.id.RB61_0);
        rb1 =(RadioButton) findViewById(R.id.RB61_1);
        rb2 =(RadioButton) findViewById(R.id.RB61_2);
        rb3 =(RadioButton) findViewById(R.id.RB61_3);
        if (rb0.isChecked()) {
            R61 = 0;
        }
        if (rb1.isChecked()) {
            R61 = 1;
        }
        if (rb2.isChecked()) {
            R61 = 2;
        }
        if (rb3.isChecked()) {
            R61 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB62_0);
        rb1 =(RadioButton) findViewById(R.id.RB62_1);
        rb2 =(RadioButton) findViewById(R.id.RB62_2);
        rb3 =(RadioButton) findViewById(R.id.RB62_3);
        if (rb0.isChecked()) {
            R62 = 0;
        }
        if (rb1.isChecked()) {
            R62 = 1;
        }
        if (rb2.isChecked()) {
            R62 = 2;
        }
        if (rb3.isChecked()) {
            R62 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB63_0);
        rb1 =(RadioButton) findViewById(R.id.RB63_1);
        rb2 =(RadioButton) findViewById(R.id.RB63_2);
        rb3 =(RadioButton) findViewById(R.id.RB63_3);
        if (rb0.isChecked()) {
            R63 = 0;
        }
        if (rb1.isChecked()) {
            R63 = 1;
        }
        if (rb2.isChecked()) {
            R63 = 2;
        }
        if (rb3.isChecked()) {
            R63 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB64_0);
        rb1 =(RadioButton) findViewById(R.id.RB64_1);
        rb2 =(RadioButton) findViewById(R.id.RB64_2);
        rb3 =(RadioButton) findViewById(R.id.RB64_3);
        if (rb0.isChecked()) {
            R64 = 0;
        }
        if (rb1.isChecked()) {
            R64 = 1;
        }
        if (rb2.isChecked()) {
            R64 = 2;
        }
        if (rb3.isChecked()) {
            R64 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB65_0);
        rb1 =(RadioButton) findViewById(R.id.RB65_1);
        rb2 =(RadioButton) findViewById(R.id.RB65_2);
        rb3 =(RadioButton) findViewById(R.id.RB65_3);
        if (rb0.isChecked()) {
            R65 = 0;
        }
        if (rb1.isChecked()) {
            R65 = 1;
        }
        if (rb2.isChecked()) {
            R65 = 2;
        }
        if (rb3.isChecked()) {
            R65 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB66_0);
        rb1 =(RadioButton) findViewById(R.id.RB66_1);
        rb2 =(RadioButton) findViewById(R.id.RB66_2);
        rb3 =(RadioButton) findViewById(R.id.RB66_3);
        if (rb0.isChecked()) {
            R66 = 0;
        }
        if (rb1.isChecked()) {
            R66 = 1;
        }
        if (rb2.isChecked()) {
            R66 = 2;
        }
        if (rb3.isChecked()) {
            R66 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB67_0);
        rb1 =(RadioButton) findViewById(R.id.RB67_1);
        rb2 =(RadioButton) findViewById(R.id.RB67_2);
        rb3 =(RadioButton) findViewById(R.id.RB67_3);
        if (rb0.isChecked()) {
            R67 = 0;
        }
        if (rb1.isChecked()) {
            R67 = 1;
        }
        if (rb2.isChecked()) {
            R67 = 2;
        }
        if (rb3.isChecked()) {
            R67 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB68_0);
        rb1 =(RadioButton) findViewById(R.id.RB68_1);
        rb2 =(RadioButton) findViewById(R.id.RB68_2);
        rb3 =(RadioButton) findViewById(R.id.RB68_3);
        if (rb0.isChecked()) {
            R68 = 0;
        }
        if (rb1.isChecked()) {
            R68 = 1;
        }
        if (rb2.isChecked()) {
            R68 = 2;
        }
        if (rb3.isChecked()) {
            R68 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB69_0);
        rb1 =(RadioButton) findViewById(R.id.RB69_1);
        rb2 =(RadioButton) findViewById(R.id.RB69_2);
        rb3 =(RadioButton) findViewById(R.id.RB69_3);
        if (rb0.isChecked()) {
            R69 = 0;
        }
        if (rb1.isChecked()) {
            R69 = 1;
        }
        if (rb2.isChecked()) {
            R69 = 2;
        }
        if (rb3.isChecked()) {
            R69 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB70_0);
        rb1 =(RadioButton) findViewById(R.id.RB70_1);
        rb2 =(RadioButton) findViewById(R.id.RB70_2);
        rb3 =(RadioButton) findViewById(R.id.RB70_3);
        if (rb0.isChecked()) {
            R70 = 0;
        }
        if (rb1.isChecked()) {
            R70 = 1;
        }
        if (rb2.isChecked()) {
            R70 = 2;
        }
        if (rb3.isChecked()) {
            R70 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB71_0);
        rb1 =(RadioButton) findViewById(R.id.RB71_1);
        rb2 =(RadioButton) findViewById(R.id.RB71_2);
        rb3 =(RadioButton) findViewById(R.id.RB71_3);
        if (rb0.isChecked()) {
            R71 = 0;
        }
        if (rb1.isChecked()) {
            R71 = 1;
        }
        if (rb2.isChecked()) {
            R71 = 2;
        }
        if (rb3.isChecked()) {
            R71 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB72_0);
        rb1 =(RadioButton) findViewById(R.id.RB72_1);
        rb2 =(RadioButton) findViewById(R.id.RB72_2);
        rb3 =(RadioButton) findViewById(R.id.RB72_3);
        if (rb0.isChecked()) {
            R72 = 0;
        }
        if (rb1.isChecked()) {
            R72 = 1;
        }
        if (rb2.isChecked()) {
            R72 = 2;
        }
        if (rb3.isChecked()) {
            R72 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB73_0);
        rb1 =(RadioButton) findViewById(R.id.RB73_1);
        rb2 =(RadioButton) findViewById(R.id.RB73_2);
        rb3 =(RadioButton) findViewById(R.id.RB73_3);
        if (rb0.isChecked()) {
            R73 = 0;
        }
        if (rb1.isChecked()) {
            R73 = 1;
        }
        if (rb2.isChecked()) {
            R73 = 2;
        }
        if (rb3.isChecked()) {
            R73 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB74_0);
        rb1 =(RadioButton) findViewById(R.id.RB74_1);
        rb2 =(RadioButton) findViewById(R.id.RB74_2);
        rb3 =(RadioButton) findViewById(R.id.RB74_3);
        if (rb0.isChecked()) {
            R74 = 0;
        }
        if (rb1.isChecked()) {
            R74 = 1;
        }
        if (rb2.isChecked()) {
            R74 = 2;
        }
        if (rb3.isChecked()) {
            R74 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB75_0);
        rb1 =(RadioButton) findViewById(R.id.RB75_1);
        rb2 =(RadioButton) findViewById(R.id.RB75_2);
        rb3 =(RadioButton) findViewById(R.id.RB75_3);
        if (rb0.isChecked()) {
            R75 = 0;
        }
        if (rb1.isChecked()) {
            R75 = 1;
        }
        if (rb2.isChecked()) {
            R75 = 2;
        }
        if (rb3.isChecked()) {
            R75 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB76_0);
        rb1 =(RadioButton) findViewById(R.id.RB76_1);
        rb2 =(RadioButton) findViewById(R.id.RB76_2);
        rb3 =(RadioButton) findViewById(R.id.RB76_3);
        if (rb0.isChecked()) {
            R76 = 0;
        }
        if (rb1.isChecked()) {
            R76 = 1;
        }
        if (rb2.isChecked()) {
            R76 = 2;
        }
        if (rb3.isChecked()) {
            R76 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB77_0);
        rb1 =(RadioButton) findViewById(R.id.RB77_1);
        rb2 =(RadioButton) findViewById(R.id.RB77_2);
        rb3 =(RadioButton) findViewById(R.id.RB77_3);
        if (rb0.isChecked()) {
            R77 = 0;
        }
        if (rb1.isChecked()) {
            R77 = 1;
        }
        if (rb2.isChecked()) {
            R77 = 2;
        }
        if (rb3.isChecked()) {
            R77 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB78_0);
        rb1 =(RadioButton) findViewById(R.id.RB78_1);
        rb2 =(RadioButton) findViewById(R.id.RB78_2);
        rb3 =(RadioButton) findViewById(R.id.RB78_3);
        if (rb0.isChecked()) {
            R78 = 0;
        }
        if (rb1.isChecked()) {
            R78 = 1;
        }
        if (rb2.isChecked()) {
            R78 = 2;
        }
        if (rb3.isChecked()) {
            R78 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB79_0);
        rb1 =(RadioButton) findViewById(R.id.RB79_1);
        rb2 =(RadioButton) findViewById(R.id.RB79_2);
        rb3 =(RadioButton) findViewById(R.id.RB79_3);
        if (rb0.isChecked()) {
            R79 = 0;
        }
        if (rb1.isChecked()) {
            R79 = 1;
        }
        if (rb2.isChecked()) {
            R79 = 2;
        }
        if (rb3.isChecked()) {
            R79 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB80_0);
        rb1 =(RadioButton) findViewById(R.id.RB80_1);
        rb2 =(RadioButton) findViewById(R.id.RB80_2);
        rb3 =(RadioButton) findViewById(R.id.RB80_3);
        if (rb0.isChecked()) {
            R80 = 0;
        }
        if (rb1.isChecked()) {
            R80 = 1;
        }
        if (rb2.isChecked()) {
            R80 = 2;
        }
        if (rb3.isChecked()) {
            R80 = 3;
        }


        Res6 = R61 + R62 + R63 + R64 + R65 + R66 + R67 + R68 + R69 + R70 + R71 + R72;
        Res7 = R73 + R74 + R75 + R76 + R77 + R78 + R79 + R80 ;

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
        values.put(Constantes.CAMPO_R4, 1);

        db.update(Constantes.TABLA_RES_COMP_NOMBRE,values,Constantes.CAMPO_ID +"=?",parametros);
        Intent intent = new Intent(this, completoActivity.class);
        intent.putExtra("id", ID);
        db.close();
        startActivity(intent);

    }
}
