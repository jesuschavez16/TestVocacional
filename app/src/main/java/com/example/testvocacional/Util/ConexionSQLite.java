package com.example.testvocacional.Util;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ConexionSQLite extends SQLiteOpenHelper {

    public ConexionSQLite(Context context) {
        super(context, Constantes.DATABASE_NOMBRE, null, 2);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Constantes.CREAR_TABLA_RESULTADO_BASICO);
        db.execSQL(Constantes.CREAR_TABLA_RESULTADO_COMPLETO);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE "+Constantes.TABLA_RES_BAS_NOMBRE);
        db.execSQL("DROP TABLE "+Constantes.TABLA_RES_COMP_NOMBRE);
    }
}
