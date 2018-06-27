package com.example.testvocacional;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SliderActivity extends AppCompatActivity {

    private ViewPager mSLideViewPager;
    private LinearLayout mDotLayout;

    private TextView[] mDots;

    private  SliderAdapter sliderAdapter;

    private Button mnext, mback;

    private  int mCurrentPage;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.slider_page );

        mSLideViewPager  = (ViewPager) findViewById( R.id.slideViewPage );
        mDotLayout  = (LinearLayout) findViewById( R.id.dataLayout );

        mnext = (Button) findViewById( R.id.next );
        mback = (Button) findViewById( R.id.back );

        sliderAdapter = new SliderAdapter( this );

        mSLideViewPager.setAdapter( sliderAdapter );

        addDotsIndicator(0);

        mSLideViewPager.addOnPageChangeListener( viewlistener );


    }

    public void addDotsIndicator ( int position){
        mDots = new TextView[3];
        mDotLayout.removeAllViews();
        for(int i = 0; i < mDots.length; i++){
            mDots[i] = new TextView( this );
            mDots[i].setText( Html.fromHtml("&#8226;") );
            mDots[i].setTextSize( 35 );;
            mDots[i].setTextColor( getResources().getColor( R.color.backgroung_color) );

            mDotLayout.addView( mDots[i] );
        }

        if (mDots.length > 0){
            mDots[position].setTextColor( getResources().getColor( R.color.backgroung_color ) );
        }
    }

    ViewPager.OnPageChangeListener viewlistener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int i) {
            addDotsIndicator(i);
            mCurrentPage = i;

            if (i == 0){

                mnext.setEnabled( true );
                mback.setEnabled( false );
                mback.setVisibility( View.INVISIBLE );

                mnext.setText( "Next" );
                mback.setText( "" );

            }else if ( i  == mDots.length - 1){

                mnext.setEnabled( true );
                mback.setEnabled( true );
                mback.setVisibility( View.VISIBLE );

                mnext.setText( "Next" );
                mback.setText( "Back" );

            }else {

                mnext.setEnabled( true );
                mback.setEnabled( true );
                mback.setVisibility( View.VISIBLE );
                mnext.setText( "Finish" );
                mback.setText( "Back" );

            }
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };

    public  void elegirIdioma (View view){

        Intent intent = new Intent( this, idiomaActivity.class );
        startActivity( intent );

    }
}
