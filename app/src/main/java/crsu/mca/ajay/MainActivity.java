 package crsu.mca.ajay;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity {
Button program_1, program_2,    program_3,    program_4,    program_5,    program_6;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(this,"App Started(OnCreate)",Toast.LENGTH_SHORT).show();
        setContentView(R.layout.activity_main);
        program_1=findViewById(R.id.program_1);
        program_2=findViewById(R.id.program_2);
        program_3=findViewById(R.id.program_3);
        program_4=findViewById(R.id.program_4);
        program_5=findViewById(R.id.program_5);
        program_6=findViewById(R.id.program_6);

        program_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Program1.class));
            }
        });

        program_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Program2.class));
            }
        });

        program_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Program3.class));

            }
        });

        program_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Program4.class));
            }
        });

        program_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Program5.class));
            }
        });

        program_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Program6.class));
            }
        });


    }


}