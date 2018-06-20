package com.example.testvocacional;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.testvocacional.Entidades.ResultadoBasico;
import com.example.testvocacional.Entidades.ResultadoCompleto;
import com.example.testvocacional.Util.ConexionSQLite;
import com.example.testvocacional.Util.Constantes;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link resultadosFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link resultadosFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class resultadosFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private ArrayList<String> listaInformacionBas;
    private ArrayList<String> listaInformacionCom;
    private ArrayList<ResultadoBasico> listaResBasico;
    private ArrayList<ResultadoCompleto> listaResCompleto;
    private ListView listViewBasic;
    private ListView listViewComple;

    private OnFragmentInteractionListener mListener;

    public resultadosFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment resultadosFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static resultadosFragment newInstance(String param1, String param2) {
        resultadosFragment fragment = new resultadosFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =inflater.inflate(R.layout.fragment_resultados, container, false);

        listViewBasic = (ListView) v.findViewById(R.id.lvResultBas);
        listViewComple = (ListView) v.findViewById(R.id.lvResultComp);

        consultarResBasico();
        consultarResCompleto();

        ArrayAdapter adapterBasico = new ArrayAdapter(getActivity(),android.R.layout.simple_list_item_1,listaInformacionBas);
        ArrayAdapter adapterCompleto = new ArrayAdapter(getActivity(),android.R.layout.simple_list_item_1,listaInformacionCom);

        listViewBasic.setAdapter(adapterBasico);
        listViewComple.setAdapter(adapterCompleto);

        listViewBasic.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                
            }
        });


        return v;
    }

    private void consultarResCompleto() {
        ConexionSQLite conn = new ConexionSQLite(getContext());
        SQLiteDatabase db = conn.getReadableDatabase();
        ResultadoCompleto resultadoCompleto = null;
        listaResCompleto = new ArrayList<ResultadoCompleto>();
        Cursor cursor = db.rawQuery("SELECT "+Constantes.CAMPO_NOMBRE+", "+Constantes.CAMPO_ID+" FROM "+Constantes.TABLA_RES_COMP_NOMBRE + " WHERE "+Constantes.CAMPO_ESTADO+" = 1",null);
        while (cursor.moveToNext()){
            resultadoCompleto = new ResultadoCompleto();
            resultadoCompleto.setNombre(cursor.getString(0));
            resultadoCompleto.setId(cursor.getInt(1));
            listaResCompleto.add(resultadoCompleto);
        }
        listaInformacionCom = new ArrayList<String>();
        for (int i=0; i<listaResCompleto.size();i++){
            String com = getString(R.string.test_compl);
            listaInformacionCom.add(listaResCompleto.get(i).getNombre()+ " - " + com);
        }
    }

    private void consultarResBasico() {
        ConexionSQLite conn = new ConexionSQLite(getContext());
        SQLiteDatabase db = conn.getReadableDatabase();
        ResultadoBasico resultadoBasico = null;
        listaResBasico = new ArrayList<ResultadoBasico>();
        Cursor cursor = db.rawQuery("SELECT "+Constantes.CAMPO_NOMBRE+", "+Constantes.CAMPO_ID+" FROM "+Constantes.TABLA_RES_BAS_NOMBRE + " WHERE "+Constantes.CAMPO_ESTADO+" = 1",null);
        while (cursor.moveToNext()){
            resultadoBasico = new ResultadoBasico();
            resultadoBasico.setNombre(cursor.getString(0));
            resultadoBasico.setId(cursor.getInt(1));
            listaResBasico.add(resultadoBasico);
        }
        listaInformacionBas = new ArrayList<String>();
        for (int i=0; i<listaResBasico.size();i++){
            String bas = getString(R.string.test_bas);
            listaInformacionBas.add(listaResBasico.get(i).getNombre()+ " - " + bas);
        }

    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }



    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
