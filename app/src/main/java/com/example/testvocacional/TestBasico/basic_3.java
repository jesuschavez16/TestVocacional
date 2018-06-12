package com.example.testvocacional.TestBasico;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import com.example.testvocacional.R;
import com.example.testvocacional.Util.ConexionSQLite;
import com.example.testvocacional.Util.Constantes;

public class basic_3 extends AppCompatActivity implements View.OnClickListener{
    CheckBox rb;
    Button btn;
    private String ID;
    private Bundle bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_3);
        btn = (Button) findViewById(R.id.Enviar);
        btn.setOnClickListener(this);
        bundle = getIntent().getExtras();
        if(bundle != null){
            ID = bundle.getString("id");}

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.Enviar:
                int Res1 = 0, Res2 = 0, Res3 = 0, Res4 = 0, Res5 = 0;
                int r27 = 0, r28 = 0, r29 = 0, r30 = 0, r31 = 0, r32 = 0, r33 = 0, r34 = 0, r35 = 0, r36 = 0, r37 = 0, r38 = 0, r39 = 0;

                rb = (CheckBox) findViewById(R.id.R27);
                if (rb.isChecked()) {
                    r27 = 1;
                } else {
                    r27 = 0;
                }
                rb = (CheckBox) findViewById(R.id.R28);
                if (rb.isChecked()) {
                    r28 = 1;
                } else {
                    r28 = 0;
                }
                rb = (CheckBox) findViewById(R.id.R29);
                if (rb.isChecked()) {
                    r29 = 1;
                } else {
                    r29 = 0;
                }
                rb = (CheckBox) findViewById(R.id.R30);
                if (rb.isChecked()) {
                    r30 = 1;
                } else {
                    r30 = 0;
                }
                rb = (CheckBox) findViewById(R.id.R31);
                if (rb.isChecked()) {
                    r31 = 1;
                } else {
                    r31 = 0;
                }
                rb = (CheckBox) findViewById(R.id.R32);
                if (rb.isChecked()) {
                    r32 = 1;
                } else {
                    r32 = 0;
                }
                rb = (CheckBox) findViewById(R.id.R33);
                if (rb.isChecked()) {
                    r33 = 1;
                } else {
                    r33 = 0;
                }
                rb = (CheckBox) findViewById(R.id.R34);
                if (rb.isChecked()) {
                    r34 = 1;
                } else {
                    r34 = 0;
                }
                rb = (CheckBox) findViewById(R.id.R35);
                if (rb.isChecked()) {
                    r35 = 1;
                } else {
                    r35 = 0;
                }
                rb = (CheckBox) findViewById(R.id.R36);
                if (rb.isChecked()) {
                    r36 = 1;
                } else {
                    r36 = 0;
                }
                rb = (CheckBox) findViewById(R.id.R37);
                if (rb.isChecked()) {
                    r37 = 1;
                } else {
                    r37 = 0;
                }
                rb = (CheckBox) findViewById(R.id.R38);
                if (rb.isChecked()) {
                    r38 = 1;
                } else {
                    r38 = 0;
                }
                rb = (CheckBox) findViewById(R.id.R39);
                if (rb.isChecked()) {
                    r39 = 1;
                } else {
                    r39 = 0;
                }

                Res1 = r28 + r31 + r35 + r39;
                Res2 = r34 + r37 + r38 ;
                Res3 = r29 + r33 + r36;
                Res4 = r30;
                Res5 = r27 + r32 ;

                if (Res1 + Res2 + Res3 + Res4 + Res5 <= 5) {
                    Toast.makeText(getApplicationContext(), "Debe marcar almenos 6 actividades", Toast.LENGTH_SHORT).show();
                } else{
                    ConexionSQLite conn = new ConexionSQLite(this);
                    conn = new ConexionSQLite(getApplicationContext());
                    SQLiteDatabase db = conn.getReadableDatabase();
                    String[] parametros = {ID};
                    String[] campos = {Constantes.CAMPO_RES1,Constantes.CAMPO_RES2,Constantes.CAMPO_RES3,Constantes.CAMPO_RES4,Constantes.CAMPO_RES5};
                    Cursor cursor = db.query(Constantes.TABLA_RES_BAS_NOMBRE,campos,Constantes.CAMPO_ID +"=?",parametros,null,null,null);
                    cursor.moveToFirst();
                    Res1=Res1 + cursor.getInt(0);
                    Res2=Res2 + cursor.getInt(1);
                    Res3=Res3 + cursor.getInt(2);
                    Res4=Res4 + cursor.getInt(3);
                    Res5=Res5 + cursor.getInt(4);

                    db = conn.getWritableDatabase();
                    ContentValues values = new ContentValues();
                    values.put (Constantes.CAMPO_RES1, Res1);
                    values.put (Constantes.CAMPO_RES2, Res2);
                    values.put (Constantes.CAMPO_RES3, Res3);
                    values.put (Constantes.CAMPO_RES4, Res4);
                    values.put (Constantes.CAMPO_RES5, Res5);
                    values.put (Constantes.CAMPO_R3, 1);

                    db.update(Constantes.TABLA_RES_BAS_NOMBRE,values,Constantes.CAMPO_ID +"=?",parametros);
                    Intent intent = new Intent(this, basicoActivity.class);
                    intent.putExtra("id", ID);
                    db.close();
                    startActivity(intent);
                }

                break;


        }
    }
}
