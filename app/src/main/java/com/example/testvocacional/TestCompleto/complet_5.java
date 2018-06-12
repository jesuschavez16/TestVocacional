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

public class complet_5 extends AppCompatActivity implements View.OnClickListener{
    RadioButton rb0, rb1, rb2, rb3;
    Button btn;
    private String ID;
    private Bundle bundle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complet_5);
        btn = findViewById(R.id.enviar_comp);
        btn.setOnClickListener(this);
        bundle = getIntent().getExtras();
        if(bundle != null){
            ID = bundle.getString("id");}
    }

    @Override
    public void onClick(View v) {
        int Res1 = 0, Res2 = 0, Res3 = 0, Res4 = 0, Res5 = 0, Res6 = 0, Res7 = 0, Res8 = 0, Res9 = 0, Res10 = 0, Res11 = 0, Res12 = 0, Res13 = 0, Res14 = 0, Res15 = 0;
        int R81 = 0, R82 = 0, R83 = 0, R84 = 0, R85 = 0, R86 = 0, R87 = 0, R88 = 0, R89 = 0, R90 = 0, R91 = 0, R92 = 0, R93 = 0, R94 = 0, R95 = 0, R96 = 0, R97 = 0, R98 = 0, R99 = 0, R100 = 0;

        rb0 =(RadioButton) findViewById(R.id.RB81_0);
        rb1 =(RadioButton) findViewById(R.id.RB81_1);
        rb2 =(RadioButton) findViewById(R.id.RB81_2);
        rb3 =(RadioButton) findViewById(R.id.RB81_3);
        if (rb0.isChecked()) {
            R81 = 0;
        }
        if (rb1.isChecked()) {
            R81 = 1;
        }
        if (rb2.isChecked()) {
            R81 = 2;
        }
        if (rb3.isChecked()) {
            R81 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB82_0);
        rb1 =(RadioButton) findViewById(R.id.RB82_1);
        rb2 =(RadioButton) findViewById(R.id.RB82_2);
        rb3 =(RadioButton) findViewById(R.id.RB82_3);
        if (rb0.isChecked()) {
            R82 = 0;
        }
        if (rb1.isChecked()) {
            R82 = 1;
        }
        if (rb2.isChecked()) {
            R82 = 2;
        }
        if (rb3.isChecked()) {
            R82 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB83_0);
        rb1 =(RadioButton) findViewById(R.id.RB83_1);
        rb2 =(RadioButton) findViewById(R.id.RB83_2);
        rb3 =(RadioButton) findViewById(R.id.RB83_3);
        if (rb0.isChecked()) {
            R83 = 0;
        }
        if (rb1.isChecked()) {
            R83 = 1;
        }
        if (rb2.isChecked()) {
            R83 = 2;
        }
        if (rb3.isChecked()) {
            R83 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB84_0);
        rb1 =(RadioButton) findViewById(R.id.RB84_1);
        rb2 =(RadioButton) findViewById(R.id.RB84_2);
        rb3 =(RadioButton) findViewById(R.id.RB84_3);
        if (rb0.isChecked()) {
            R84 = 0;
        }
        if (rb1.isChecked()) {
            R84 = 1;
        }
        if (rb2.isChecked()) {
            R84 = 2;
        }
        if (rb3.isChecked()) {
            R84 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB85_0);
        rb1 =(RadioButton) findViewById(R.id.RB85_1);
        rb2 =(RadioButton) findViewById(R.id.RB85_2);
        rb3 =(RadioButton) findViewById(R.id.RB85_3);
        if (rb0.isChecked()) {
            R85 = 0;
        }
        if (rb1.isChecked()) {
            R85 = 1;
        }
        if (rb2.isChecked()) {
            R85 = 2;
        }
        if (rb3.isChecked()) {
            R85 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB86_0);
        rb1 =(RadioButton) findViewById(R.id.RB86_1);
        rb2 =(RadioButton) findViewById(R.id.RB86_2);
        rb3 =(RadioButton) findViewById(R.id.RB86_3);
        if (rb0.isChecked()) {
            R86 = 0;
        }
        if (rb1.isChecked()) {
            R86 = 1;
        }
        if (rb2.isChecked()) {
            R86 = 2;
        }
        if (rb3.isChecked()) {
            R86 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB87_0);
        rb1 =(RadioButton) findViewById(R.id.RB87_1);
        rb2 =(RadioButton) findViewById(R.id.RB87_2);
        rb3 =(RadioButton) findViewById(R.id.RB87_3);
        if (rb0.isChecked()) {
            R87 = 0;
        }
        if (rb1.isChecked()) {
            R87 = 1;
        }
        if (rb2.isChecked()) {
            R87 = 2;
        }
        if (rb3.isChecked()) {
            R87 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB88_0);
        rb1 =(RadioButton) findViewById(R.id.RB88_1);
        rb2 =(RadioButton) findViewById(R.id.RB88_2);
        rb3 =(RadioButton) findViewById(R.id.RB88_3);
        if (rb0.isChecked()) {
            R88 = 0;
        }
        if (rb1.isChecked()) {
            R88 = 1;
        }
        if (rb2.isChecked()) {
            R88 = 2;
        }
        if (rb3.isChecked()) {
            R88 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB89_0);
        rb1 =(RadioButton) findViewById(R.id.RB89_1);
        rb2 =(RadioButton) findViewById(R.id.RB89_2);
        rb3 =(RadioButton) findViewById(R.id.RB89_3);
        if (rb0.isChecked()) {
            R89 = 0;
        }
        if (rb1.isChecked()) {
            R89 = 1;
        }
        if (rb2.isChecked()) {
            R89 = 2;
        }
        if (rb3.isChecked()) {
            R89 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB90_0);
        rb1 =(RadioButton) findViewById(R.id.RB90_1);
        rb2 =(RadioButton) findViewById(R.id.RB90_2);
        rb3 =(RadioButton) findViewById(R.id.RB90_3);
        if (rb0.isChecked()) {
            R90 = 0;
        }
        if (rb1.isChecked()) {
            R90 = 1;
        }
        if (rb2.isChecked()) {
            R90 = 2;
        }
        if (rb3.isChecked()) {
            R90 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB91_0);
        rb1 =(RadioButton) findViewById(R.id.RB91_1);
        rb2 =(RadioButton) findViewById(R.id.RB91_2);
        rb3 =(RadioButton) findViewById(R.id.RB91_3);
        if (rb0.isChecked()) {
            R91 = 0;
        }
        if (rb1.isChecked()) {
            R91 = 1;
        }
        if (rb2.isChecked()) {
            R91 = 2;
        }
        if (rb3.isChecked()) {
            R91 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB92_0);
        rb1 =(RadioButton) findViewById(R.id.RB92_1);
        rb2 =(RadioButton) findViewById(R.id.RB92_2);
        rb3 =(RadioButton) findViewById(R.id.RB92_3);
        if (rb0.isChecked()) {
            R92 = 0;
        }
        if (rb1.isChecked()) {
            R92 = 1;
        }
        if (rb2.isChecked()) {
            R92 = 2;
        }
        if (rb3.isChecked()) {
            R92 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB93_0);
        rb1 =(RadioButton) findViewById(R.id.RB93_1);
        rb2 =(RadioButton) findViewById(R.id.RB93_2);
        rb3 =(RadioButton) findViewById(R.id.RB93_3);
        if (rb0.isChecked()) {
            R93 = 0;
        }
        if (rb1.isChecked()) {
            R93 = 1;
        }
        if (rb2.isChecked()) {
            R93 = 2;
        }
        if (rb3.isChecked()) {
            R93 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB94_0);
        rb1 =(RadioButton) findViewById(R.id.RB94_1);
        rb2 =(RadioButton) findViewById(R.id.RB94_2);
        rb3 =(RadioButton) findViewById(R.id.RB94_3);
        if (rb0.isChecked()) {
            R94 = 0;
        }
        if (rb1.isChecked()) {
            R94 = 1;
        }
        if (rb2.isChecked()) {
            R94 = 2;
        }
        if (rb3.isChecked()) {
            R94 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB95_0);
        rb1 =(RadioButton) findViewById(R.id.RB95_1);
        rb2 =(RadioButton) findViewById(R.id.RB95_2);
        rb3 =(RadioButton) findViewById(R.id.RB95_3);
        if (rb0.isChecked()) {
            R95 = 0;
        }
        if (rb1.isChecked()) {
            R95 = 1;
        }
        if (rb2.isChecked()) {
            R95 = 2;
        }
        if (rb3.isChecked()) {
            R95 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB96_0);
        rb1 =(RadioButton) findViewById(R.id.RB96_1);
        rb2 =(RadioButton) findViewById(R.id.RB96_2);
        rb3 =(RadioButton) findViewById(R.id.RB96_3);
        if (rb0.isChecked()) {
            R96 = 0;
        }
        if (rb1.isChecked()) {
            R96 = 1;
        }
        if (rb2.isChecked()) {
            R96 = 2;
        }
        if (rb3.isChecked()) {
            R96 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB97_0);
        rb1 =(RadioButton) findViewById(R.id.RB97_1);
        rb2 =(RadioButton) findViewById(R.id.RB97_2);
        rb3 =(RadioButton) findViewById(R.id.RB97_3);
        if (rb0.isChecked()) {
            R97 = 0;
        }
        if (rb1.isChecked()) {
            R97 = 1;
        }
        if (rb2.isChecked()) {
            R97 = 2;
        }
        if (rb3.isChecked()) {
            R97 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB98_0);
        rb1 =(RadioButton) findViewById(R.id.RB98_1);
        rb2 =(RadioButton) findViewById(R.id.RB98_2);
        rb3 =(RadioButton) findViewById(R.id.RB98_3);
        if (rb0.isChecked()) {
            R98 = 0;
        }
        if (rb1.isChecked()) {
            R98 = 1;
        }
        if (rb2.isChecked()) {
            R98 = 2;
        }
        if (rb3.isChecked()) {
            R98 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB99_0);
        rb1 =(RadioButton) findViewById(R.id.RB99_1);
        rb2 =(RadioButton) findViewById(R.id.RB99_2);
        rb3 =(RadioButton) findViewById(R.id.RB99_3);
        if (rb0.isChecked()) {
            R99 = 0;
        }
        if (rb1.isChecked()) {
            R99 = 1;
        }
        if (rb2.isChecked()) {
            R99 = 2;
        }
        if (rb3.isChecked()) {
            R99 = 3;
        }
        rb0 =(RadioButton) findViewById(R.id.RB100_0);
        rb1 =(RadioButton) findViewById(R.id.RB100_1);
        rb2 =(RadioButton) findViewById(R.id.RB100_2);
        rb3 =(RadioButton) findViewById(R.id.RB100_3);
        if (rb0.isChecked()) {
            R100 = 0;
        }
        if (rb1.isChecked()) {
            R100 = 1;
        }
        if (rb2.isChecked()) {
            R100 = 2;
        }
        if (rb3.isChecked()) {
            R100 = 3;
        }


        Res7 = R81 + R82 + R83 + R84;
        Res8 = R85 + R86 + R87 + R88 + R89 + R90 + R91 + R92 + R93 + R94 + R95 + R96;
        Res9 = R97 + R98 + R99 + R100 ;

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
        values.put(Constantes.CAMPO_R5, 1);

        db.update(Constantes.TABLA_RES_COMP_NOMBRE,values,Constantes.CAMPO_ID +"=?",parametros);
        Intent intent = new Intent(this, completoActivity.class);
        intent.putExtra("id", ID);
        db.close();
        startActivity(intent);

    }
}
