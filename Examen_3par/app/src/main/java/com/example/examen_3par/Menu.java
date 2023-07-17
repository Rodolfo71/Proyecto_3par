package com.example.examen_3par;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;
import android.view.MenuItem;
public class Menu extends AppCompatActivity{
    private int menuId;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        // Obtener la hora actual
        Calendar calendar = Calendar.getInstance();
        int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);


    }

    public boolean onCreateOptionsMenu(Menu menu) {
        //getMenuInflater().inflate(menuId, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        // Lógica para manejar los elementos del menú seleccionados
        return super.onOptionsItemSelected(item);
    }
}
