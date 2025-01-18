package com.example.hanoca;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner spinner = findViewById(R.id.spinner2);
    ImageView t1= findViewById(R.id.imageView2);
    ImageView t2= findViewById(R.id.imageView3);
    ImageView t3= (ImageView)findViewById(R.id.imageView4);
    ImageView t4= (ImageView)findViewById(R.id.imageView5);
    ImageView S= (ImageView)findViewById(R.id.imageView6);
    ImageView t5= (ImageView)findViewById(R.id.imageView7);
    ImageView t6= (ImageView)findViewById(R.id.imageView8);
    ImageView t7= (ImageView)findViewById(R.id.imageView9);
    ImageView t8= (ImageView)findViewById(R.id.imageView10);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,
                R.array.spinner2,
                android.R.layout.simple_spinner_item
        );

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);



    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        switch (i){
            case 0:
                spinner.setVisibility(View.VISIBLE);
            case 1:
                t1.setVisibility(View.VISIBLE);
                S.setVisibility(View.VISIBLE);
                break;
            case 2:
                t2.setVisibility(View.VISIBLE);
                S.setVisibility(View.VISIBLE);
                break;
            case 3:
                t3.setVisibility(View.VISIBLE);
                S.setVisibility(View.VISIBLE);
                break;
            case 4:
                t4.setVisibility(View.VISIBLE);
                S.setVisibility(View.VISIBLE);
                break;
            case 5:
                t5.setVisibility(View.VISIBLE);
                S.setVisibility(View.VISIBLE);
                break;
            case  6:
                t6.setVisibility(View.VISIBLE);
                S.setVisibility(View.VISIBLE);
                break;
            case  7:
                t7.setVisibility(View.VISIBLE);
                S.setVisibility(View.VISIBLE);
                break;
            case  8:
                t8.setVisibility(View.VISIBLE);
                S.setVisibility(View.VISIBLE);
        }
    }
    ///

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
    
}