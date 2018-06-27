package com.example.testvocacional;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.io.ObjectInputStream;

public class SliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter(Context context){
        this.context = context;
    }

    public  int [] slide_images = {

            R.drawable.eat_icon,
            R.drawable.sleep_icon,
            R.drawable.code_icon
    };

    public  String [] slide_headings = {

            "ORIENTACION VOCACIONAL PERSONALIZADA",
            "SLEEP",
            "CODE"
    };

    public  String [] slide_dexscs = {

            "Encuentra tu vocacion y disfruta de tu carrera, resultados garantizados",
            "Da tu primer paso ahora, no es necesario que veas el camino completo " + "El resto ira apareciendo a medida que camines.",
            "No se puede iniciar una travesía sin conocer el destino y sin contar con los mapas y"+" la orientación para llegar al mejor camino",

    };

    @Override
    public int getCount() {
        return slide_headings.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == (RelativeLayout) object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        layoutInflater = (LayoutInflater) context.getSystemService( context.LAYOUT_INFLATER_SERVICE );
        View view = layoutInflater.inflate( R.layout.slide_layout, container, false );

        ImageView slideImageView = (ImageView) view.findViewById( R.id.slide_image );
        TextView slide_heading = (TextView) view.findViewById( R.id.slide_headings );
        TextView slide_desc = (TextView) view.findViewById( R.id.slide_dexscs );

        slideImageView.setImageResource( slide_images[position] );
        slide_heading.setText( slide_headings[position] );
        slide_desc.setText( slide_dexscs[position] );

        container.addView( view );

        return view;
    };

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        container.removeView((RelativeLayout) object);
    }
}
