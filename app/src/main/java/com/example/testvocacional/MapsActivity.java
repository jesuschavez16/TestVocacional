package com.example.testvocacional;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.provider.Settings;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.app.LoaderManager;
import android.widget.Toast;

import com.example.testvocacional.Entidades.FirebaseReference;
import com.example.testvocacional.Entidades.Universidad;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private Marker marcador;
    double lat = 0.0;
    double lng = 0.0;
    String mensaje;
    String direccion = "";

    private FirebaseDatabase mfirebaseDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_maps );
        mfirebaseDatabase = FirebaseDatabase.getInstance();

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById( R.id.map );
        mapFragment.getMapAsync( this );
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        miUbicacion();

        //obtener ubicacion

        final DatabaseReference universidad_Ref = mfirebaseDatabase.getReference( FirebaseReference.UNIVERSIDAD_REFERENCE);

        universidad_Ref.addValueEventListener( new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for (final DataSnapshot datasnapshot : dataSnapshot.getChildren()) {

                    final String llave = datasnapshot.getKey();

                    final Universidad universidad_db  = datasnapshot.getValue( Universidad.class );

                    final String descripcion = universidad_db.getDescripcion();
                    final double lat = universidad_db.getLat();
                    final double lan = universidad_db.getLon();
                    final String nombre = universidad_db.getNombre();

                    mMap.addMarker(new MarkerOptions()
                            .position(new LatLng(lat, lan))
                            .title(nombre)
                            .icon( BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED) ));
                    Toast.makeText(MapsActivity.this,"gola" + llave,     Toast.LENGTH_SHORT).show();

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        } );
    }

    private  void  locationStart (){
        LocationManager locationManager = (LocationManager)getSystemService( Context.LOCATION_SERVICE );
        final boolean gpsEnabled = locationManager.isProviderEnabled( LocationManager.GPS_PROVIDER );
        if (!gpsEnabled){
            Intent settingIntent = new Intent( Settings.ACTION_LOCATION_SOURCE_SETTINGS );
            startActivity( settingIntent );
        }
        if (ActivityCompat.checkSelfPermission( this, android.Manifest.permission.ACCESS_FINE_LOCATION ) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission( this, android.Manifest.permission.ACCESS_COARSE_LOCATION ) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            return;
        }

    }

    public void  setLocation (Location loc) {
        if (loc.getLatitude() != 0.0 && loc.getLongitude() != 0.0) {

            try {
                Geocoder geocoder = new Geocoder( this, Locale.getDefault() );
                List<Address> list = geocoder.getFromLocation(
                        loc.getLatitude(), loc.getLongitude(), 1 );
                if (!list.isEmpty()) {
                    Address DirCalle = list.get( 0 );
                    direccion = (DirCalle.getAddressLine( 0 ));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

    private void AgregarMarcador(double lat, double lng) {
        LatLng coordenadas = new LatLng( lat, lng );
        CameraUpdate MiUbicacion = CameraUpdateFactory.newLatLngZoom( coordenadas, 16 );
        if (marcador != null) marcador.remove();
        marcador = mMap.addMarker( new MarkerOptions()
                .position( coordenadas )
                .title( "Direccion:" + direccion )
                .icon( BitmapDescriptorFactory.defaultMarker( BitmapDescriptorFactory.HUE_BLUE ) ) );
        mMap.animateCamera( MiUbicacion );
    }
    private void ActualizarUbicacion(Location location) {
        if (location != null) {
            lat = location.getLatitude();
            lng = location.getLongitude();
            AgregarMarcador( lat, lng );
        }
    }

    LocationListener locationListener = new LocationListener() {
        @Override
        public void onLocationChanged(Location location) {
            ActualizarUbicacion( location );
            setLocation( location );
        }

        @Override
        public void onStatusChanged(String provider, int status, Bundle extras) {

        }

        @Override
        public void onProviderEnabled(String provider) {
            mensaje = ("GPS Activado");
            Mensaje();
        }

        @Override
        public void onProviderDisabled(String provider) {

            mensaje = ("GPS Desactivado");
            locationStart();

        }
    };


    private static int PETICION_PERMISION_LOCALIZACION = 101;

    private void miUbicacion() {


        if (ActivityCompat.checkSelfPermission( this, android.Manifest.permission.ACCESS_FINE_LOCATION ) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission( this, android.Manifest.permission.ACCESS_COARSE_LOCATION ) != PackageManager.PERMISSION_GRANTED) {

            ActivityCompat.requestPermissions( this,
                    new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                    PETICION_PERMISION_LOCALIZACION);

            return;
        }else {
            LocationManager locationManager = (LocationManager)getSystemService( Context.LOCATION_SERVICE );
            Location location = locationManager.getLastKnownLocation( LocationManager.NETWORK_PROVIDER );
            ActualizarUbicacion( location );
            locationManager.requestLocationUpdates( LocationManager.GPS_PROVIDER, 1200, 0, locationListener );
            //locationManager.requestLocationUpdates( LocationManager.NETWORK_PROVIDER, 1000, 0, locListener );
        }



    }

    public  void  Mensaje (){

        Toast toast = Toast.makeText( this, mensaje, Toast.LENGTH_LONG );
        toast.show();;
    }


}
