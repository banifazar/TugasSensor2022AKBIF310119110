package com.example.tugassensor2022akbif310119110.BottomNav;
//        NIM: 10119110
//        NAMA: BANI FAZA RASYADAN
//        KELAS: IF-3
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import com.example.tugassensor2022akbif310119110.R;

public class RestoranFragment extends Fragment {

    private OnMapReadyCallback callback = new OnMapReadyCallback() {

        /**
         * Manipulates the map once available.
         * This callback is triggered when the map is ready to be used.
         * This is where we can add markers or lines, add listeners or move the camera.
         * In this case, we just add a marker near Sydney, Australia.
         * If Google Play services is not installed on the device, the user will be prompted to
         * install it inside the SupportMapFragment. This method will only be triggered once the
         * user has installed Google Play services and returned to the app.
         */
        @Override
        public void onMapReady(GoogleMap googleMap) {

            // LOKASI 1
            LatLng mcd = new LatLng(-6.9402156,107.6626044);
            googleMap.addMarker(new MarkerOptions().position(mcd).title("Lokasi 1: McDonalds"));

            // LOKASI 2
            LatLng burgerKing = new LatLng(-6.9397138,107.6634036);
            googleMap.addMarker(new MarkerOptions().position(burgerKing).title("Lokasi 2: Burger King"));

            // LOKASI 3
            LatLng richeeseFactory = new LatLng(-6.9393708,107.6635366);
            googleMap.addMarker(new MarkerOptions().position(richeeseFactory).title("Lokasi 3: Richeese Factory"));

            // LOKASI 4
            LatLng ayamBakar = new LatLng(-6.939333,107.6653692);
            googleMap.addMarker(new MarkerOptions().position(ayamBakar).title("Lokasi 4: Ayam Bakar KQ5"));

            // LOKASI 5
            LatLng kfc = new LatLng(-6.9399747,107.6663423);
            googleMap.addMarker(new MarkerOptions().position(kfc).title("Lokasi 5: KFC"));

            // Zoom
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(richeeseFactory, 16));
        }
    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_restoran, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SupportMapFragment mapFragment =
                (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
        if (mapFragment != null) {
            mapFragment.getMapAsync(callback);
        }
    }
}