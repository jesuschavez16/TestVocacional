package com.example.testvocacional.TestBasico;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.testvocacional.R;
import com.example.testvocacional.Util.ConexionSQLite;
import com.example.testvocacional.Util.Constantes;

import java.util.ArrayList;

public class basic_resultado extends AppCompatActivity {
    TextView area, c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12;
    ArrayList area1 = new ArrayList<String>(13);
    ArrayList area2 = new ArrayList<String>(13);
    ArrayList area3 = new ArrayList<String>(13);
    ArrayList area4 = new ArrayList<String>(13);
    ArrayList area5 = new ArrayList<String>(13);
    int res;
    String ID;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_resultado);
        area = findViewById(R.id.tvArea);
        c1 = findViewById(R.id.tvC1);
        c2 = findViewById(R.id.tvC2);
        c3 = findViewById(R.id.tvC3);
        c4 = findViewById(R.id.tvC4);
        c5 = findViewById(R.id.tvC5);
        c6 = findViewById(R.id.tvC6);
        c7 = findViewById(R.id.tvC7);
        c8 = findViewById(R.id.tvC8);
        c9 = findViewById(R.id.tvC9);
        c10 = findViewById(R.id.tvC10);
        c11 = findViewById(R.id.tvC11);
        c12 = findViewById(R.id.tvC12);
        Bundle bundle = this.getIntent().getExtras();
         if (bundle!=null){
             ID = bundle.getString("ID");
         }

        agregarArea1();
        agregarArea2();
        agregarArea3();
        agregarArea4();
        agregarArea5();

        res = consultar();

        if (res == 1) {
            listar(area1, "Arte y Creatividad");
        }
        if (res == 2) {
            listar(area2, "Ciencias Sociales");
        }
        if (res == 3) {
            listar(area3, "Economía, administrativa y financiera");
        }
        if (res == 4) {
            listar(area4, "Ciencia y tecnología");
        }
        if (res == 5) {
            listar(area5, "Ciencias ecológias, biológicas y de la salud");
        }

    }

    private void listar(ArrayList lista, String ar) {
        area.setText(ar);
        c1.setText((String) lista.get(0));
        c2.setText((String) lista.get(1));
        c3.setText((String) lista.get(2));
        c4.setText((String) lista.get(3));
        c5.setText((String) lista.get(4));
        c6.setText((String) lista.get(5));
        c7.setText((String) lista.get(6));
        c8.setText((String) lista.get(7));
        c9.setText((String) lista.get(8));
        c10.setText((String) lista.get(9));
        c11.setText((String) lista.get(10));
        c12.setText((String) lista.get(11));
    }

    private int consultar() {
        ConexionSQLite conn;
        conn = new ConexionSQLite(getApplicationContext());
        SQLiteDatabase db = conn.getReadableDatabase();
        int max = 0;
        String[] param = {ID};
        String[] campos = {Constantes.CAMPO_RES1, Constantes.CAMPO_RES2, Constantes.CAMPO_RES3, Constantes.CAMPO_RES4, Constantes.CAMPO_RES5};
        Cursor cursor = db.query(Constantes.TABLA_RES_BAS_NOMBRE, campos, Constantes.CAMPO_ID + "=?", param, null, null, null);
        cursor.moveToFirst();
        int res1 = cursor.getInt(0);
        int res2 = cursor.getInt(1);
        int res3 = cursor.getInt(2);
        int res4 = cursor.getInt(3);
        int res5 = cursor.getInt(4);
        db.close();
        if (max < res1) {
            max = res1;
        }
        if (max < res2) {
            max = res2;
        }
        if (max < res3) {
            max = res3;
        }
        if (max < res4) {
            max = res4;
        }
        if (max < res5) {
            max = res5;
        }
        if (max == res1) {
            return 1;
        } else {
            if (max == res2) {
                return 2;
            } else {
                if (max == res3) {
                    return 3;
                } else {
                    if (max == res4) {
                        return 4;
                    } else {
                        return 5;
                    }
                }
            }
        }
    }

    private void agregarArea5() {
        area5.add(0,"Biologia");
        area5.add(1,"Bioquimica");
        area5.add(2,"Farmacia");
        area5.add(3,"Ciencias Ambientales");
        area5.add(4,"Veterinaria");
        area5.add(5,"Zootecnia");
        area5.add(6,"Nutrición");
        area5.add(7,"Medicina");
        area5.add(8,"Obstetricia");
        area5.add(9,"Odontologia");
        area5.add(10,"Ingenieria de alimentos");
        area5.add(11,"Cultura Fisica");

    }

    private void agregarArea4() {
        area4.add(0,"Ingenieria en sistemas computacionales");
        area4.add(1,"Geologia");
        area4.add(2,"Ingenieria Civil");
        area4.add(3,"Arquitectura");
        area4.add(4,"Electronica");
        area4.add(5,"Telecomunicaciones");
        area4.add(6,"Ingenieria Mecatronica");
        area4.add(7,"Imagen y sanidad");
        area4.add(8,"Ingenieria de minas");
        area4.add(9,"Ingenieria del petroleo y metalurgia");
        area4.add(10,"Ingenieria Mecanica");
        area4.add(11,"Ingenieria Industrial");

    }

    private void agregarArea3() {
        area3.add(0,"Administración de empresas");
        area3.add(1,"Contabilidad");
        area3.add(2,"Auditoria");
        area3.add(3,"Ventas y Marqueting estrategico");
        area3.add(4,"Gestión y negocios internacionales");
        area3.add(5,"Gestión empresarial");
        area3.add(6,"Gestión financiera");
        area3.add(7,"Ingenieria comercial");
        area3.add(8,"Comercio exterior");
        area3.add(9,"Banca y finanzas");
        area3.add(10,"Gestión de recursos humanos");
        area3.add(11,"Comunicaciones integradas");

    }

    private void agregarArea2() {
        area2.add(0,"Psicologia general");
        area2.add(1,"Trabajo social");
        area2.add(2,"Idiomas");
        area2.add(3,"Educación internacional");
        area2.add(4,"Historia y geografia");
        area2.add(5,"Periodismo");
        area2.add(6,"Derecho");
        area2.add(7,"Ciencias políticas");
        area2.add(8,"Sociología");
        area2.add(9,"Antropología");
        area2.add(10,"Arqueología");
        area2.add(11,"Gestión social y desarrollo");

    }

    private void agregarArea1() {
        area1.add(0,"Diseño Grafico");
        area1.add(1,"Diseño y Decoracion de Interiores");
        area1.add(2,"Diseño de jardines");
        area1.add(3,"Diseño de Modas");
        area1.add(4,"Diseño de Joyas");
        area1.add(5,"Artes Pasticas");
        area1.add(6,"Dibujo Publicitario");
        area1.add(7,"Restauracion y museologia");
        area1.add(8,"Modelaje");
        area1.add(9,"Fotografia");
        area1.add(10,"Fotografia Digital");
        area1.add(11,"Gestion Grafica");

    }
}
