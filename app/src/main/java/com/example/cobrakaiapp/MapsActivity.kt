package com.example.cobrakaiapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.example.cobrakaiapp.databinding.ActivityMapsBinding

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityMapsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }
    
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Add a marker in Sydney and move the camera
        val dojo1 = LatLng(-11.819426890253856, -77.1429491210957)
        val dojo2 = LatLng(-11.820771061421267, -77.14157583016797)
        val dojo3 = LatLng(-12.641871347089959, -76.62237288048289)
        mMap.addMarker(MarkerOptions().position(dojo1).title("Marker in Cobra Kai Dojo 1"))
        mMap.addMarker(MarkerOptions().position(dojo2).title("Marker in Cobra Kai Dojo 2"))
        mMap.addMarker(MarkerOptions().position(dojo3).title("Marker in Cobra Kai Dojo 3"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(dojo1))

        mMap.uiSettings.isZoomControlsEnabled = true
        mMap.uiSettings.isCompassEnabled = true
        mMap.setMinZoomPreference(4f)
        mMap.setMaxZoomPreference(20f)
    }
}