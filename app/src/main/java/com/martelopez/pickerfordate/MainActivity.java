package com.martelopez.pickerfordate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showDatePiker(View view) {

        // Agregue el controlador showDatePickerDialog() para el Boton Date
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(),"datePicker");
    }

    // Toma la fecha seleccionada y la convierte en una cadena para mostrar un mensaje
    public void processDataPickerResult(int year, int month, int day){
        String day_string = Integer.toString(day);
        String month_string = Integer.toString(month+1);
        String year_string = Integer.toString(year);
        String dateMessage = (day_string + "/" + month_string + "/" + year_string);

        Toast.makeText(this, "Date: " + dateMessage,Toast.LENGTH_SHORT).show();

    }
}
