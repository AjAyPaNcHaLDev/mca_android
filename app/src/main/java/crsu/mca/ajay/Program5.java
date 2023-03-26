package crsu.mca.ajay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Program5 extends AppCompatActivity {
    MyBroadcastReceiver myBroadcastReceiver = new MyBroadcastReceiver();
public static TextView txt_airplane;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program5);
        txt_airplane=findViewById(R.id.txt_airplane);

        updateAirplanModeStatus(MyBroadcastReceiver.isAirplaneModeOn(Program5.this),Program5.this);


    }
    @Override
    protected void onStart() {
        super.onStart();
        IntentFilter filter = new IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED);
        registerReceiver(myBroadcastReceiver, filter);
    }

    @Override
    protected void onStop() {
        super.onStop();

        unregisterReceiver(myBroadcastReceiver);
    }

public  static    void updateAirplanModeStatus(boolean b, Context c){
        if(b) {
            txt_airplane.setText("Airplane Mode is : Enabled");

            Toast.makeText(c, "AirPlane mode is on", Toast.LENGTH_SHORT).show();
        }
        else
    txt_airplane.setText("Airplane Mode is : Disabled");
}
}