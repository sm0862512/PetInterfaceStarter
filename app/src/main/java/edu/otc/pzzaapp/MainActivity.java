package edu.otc.pzzaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new MyClick());
//        button.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v) {
//
//            }
//                                  }
//        );
        button.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this, "Toasty", Toast.LENGTH_SHORT).show();
            Intent activity = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(activity);
        });
    }
    class MyClick implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, "Toasty", Toast.LENGTH_SHORT).show();

        }
    }


}




