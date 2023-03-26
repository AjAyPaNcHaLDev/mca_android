package crsu.mca.ajay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Program3 extends AppCompatActivity {

    String userName1="himanshu", userName2="ajay",Password="123";
    EditText username,password;
    TextView status;
    Button authbtn;
    boolean isLogined=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program3);
        username=findViewById(R.id.username);
        password=findViewById(R.id.password);
        status=findViewById(R.id.status);
        authbtn=findViewById(R.id.auth);
        authbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isLogined){
                 boolean user=   (username.getText().toString().equals(userName1)||username.getText().toString().equals(userName2)&&password.getText().toString().equals(Password));

                    if(user){
                        isLogined=true;
                        authbtn.setText("Logout");
                        status.setText("welcome : "+ username.getText().toString());

                        username.setEnabled(false);
                        password.setEnabled(false);
                    }else {
                        Toast.makeText(Program3.this,"Please Enter Correct username and Password",Toast.LENGTH_SHORT).show();
                    }
                }else{
                    isLogined=false;
                    status.setText("Please Login");
                    username.setEnabled(true);
                    password.setEnabled(true);
                    username.setText("");
                    password.setText("");

                    authbtn.setText("Login");
                }
            }
        });

    }
}