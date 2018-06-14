package com.example.testvocacional.Util;

public class Constantes {
    public static final String DATABASE_NOMBRE = "bd_test";
    public static final String TABLA_RES_BAS_NOMBRE = "resultadobasico";
    public static final String TABLA_RES_COMP_NOMBRE = "resultadocompleto";
    public static final String PREFERENCIAS_RES = "PrefTest";
    public static final String PREFERENCIAS_RES_COMP = "PCompleto";
    public static final String PREFERENCIAS_RES_BASICO = "PBasico";

    public static final String CAMPO_ID = "id";
    public static final String CAMPO_ESTADO = "estado";//Estados: 1=Completo, 2=incompleto, 3=eliminado
    public static final String CAMPO_NOMBRE = "nombre";
    public static final String CAMPO_RES1 = "resultado1";
    public static final String CAMPO_RES2 = "resultado2";
    public static final String CAMPO_RES3 = "resultado3";
    public static final String CAMPO_RES4 = "resultado4";
    public static final String CAMPO_RES5 = "resultado5";
    public static final String CAMPO_RES6 = "resultado6";
    public static final String CAMPO_RES7 = "resultado7";
    public static final String CAMPO_RES8 = "resultado8";
    public static final String CAMPO_RES9 = "resultado9";
    public static final String CAMPO_RES10 = "resultado10";
    public static final String CAMPO_RES11 = "resultado11";
    public static final String CAMPO_RES12 = "resultado12";
    public static final String CAMPO_RES13 = "resultado13";
    public static final String CAMPO_RES14 = "resultado14";
    public static final String CAMPO_RES15 = "resultado15";

    public static final String CAMPO_R1 = "r1";
    public static final String CAMPO_R2 = "r2";
    public static final String CAMPO_R3 = "r3";
    public static final String CAMPO_R4 = "r4";
    public static final String CAMPO_R5 = "r5";
    public static final String CAMPO_R6 = "r6";
    public static final String CAMPO_R7 = "r7";
    public static final String CAMPO_R8 = "r8";
    public static final String CAMPO_R9 = "r9";


    //TABLA "RES BASIC"
    public static final String CREAR_TABLA_RESULTADO_BASICO = "CREATE TABLE " +TABLA_RES_BAS_NOMBRE+" (" + CAMPO_ID +" INTEGER PRIMARY KEY AUTOINCREMENT, " + CAMPO_ESTADO + " INTEGER, " + CAMPO_NOMBRE +" TEXT, " + CAMPO_RES1 +" INTEGER, " + CAMPO_RES2 +" INTEGER, " + CAMPO_RES3 +" INTEGER, " + CAMPO_RES4 +" INTEGER, " + CAMPO_RES5 +" INTEGER, "+
            CAMPO_R1 +" INTEGER, " + CAMPO_R2 +" INTEGER, " + CAMPO_R3 +" INTEGER, " + CAMPO_R4 +" INTEGER)";


    //TABLA "RES COMPL"
    public static final String CREAR_TABLA_RESULTADO_COMPLETO = "CREATE TABLE "+TABLA_RES_COMP_NOMBRE+" ("+CAMPO_ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "+ CAMPO_ESTADO + " INTEGER, " + CAMPO_NOMBRE +" TEXT, " + CAMPO_RES1 +" INTEGER, " + CAMPO_RES2 +" INTEGER, " + CAMPO_RES3 +" INTEGER, " + CAMPO_RES4 +" INTEGER, " + CAMPO_RES5 +" INTEGER, "+CAMPO_RES6 +" INTEGER, " + CAMPO_RES7 +" INTEGER, " + CAMPO_RES8 +" INTEGER, " + CAMPO_RES9 +" INTEGER, " + CAMPO_RES10 +" INTEGER, "+CAMPO_RES11 +" INTEGER, " + CAMPO_RES12 +" INTEGER, " + CAMPO_RES13 +" INTEGER, " + CAMPO_RES14 +" INTEGER, " + CAMPO_RES15 +" INTEGER, "+
            CAMPO_R1 +" INTEGER, " + CAMPO_R2 +" INTEGER, " + CAMPO_R3 +" INTEGER, " + CAMPO_R4 +" INTEGER, "+CAMPO_R5 +" INTEGER, " + CAMPO_R6 +" INTEGER, " + CAMPO_R7 +" INTEGER, " + CAMPO_R8 +" INTEGER, "+ CAMPO_R9 +" INTEGER)";

}
