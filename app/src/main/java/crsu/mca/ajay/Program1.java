package crsu.mca.ajay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class Program1 extends AppCompatActivity {
TextView textView;
public Toast toast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        textView=(TextView) findViewById(R.id.message);
        setContentView(R.layout.activity_program1);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(Program1.this,"onStart Called",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(Program1.this,"onDestroy Called",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(Program1.this,"onStart Called",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(Program1.this,"onStop Called",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(Program1.this,"onPause Called",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(Program1.this,"onResume Called",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
         Toast.makeText(Program1.this,"onBackPressed Called",Toast.LENGTH_SHORT).show();

    }

}