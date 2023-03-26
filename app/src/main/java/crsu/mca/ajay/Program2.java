package crsu.mca.ajay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Program2 extends AppCompatActivity {

    Button calBtn;
    EditText num1,num2;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program2);
        calBtn=findViewById(R.id.add);
        num1=findViewById(R.id.num1);
        num2=findViewById(R.id.num2);
        result=findViewById(R.id.result);
        calBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!num1.getText().toString().isEmpty()||!num2.getText().toString().isEmpty()){
                    int number1=Integer.parseInt(num1.getText().toString());
                    int number2=Integer.parseInt(num2.getText().toString());
                    result.setText("Result is: "+(number1+number2));
                    Toast.makeText(Program2.this,"Result is: "+(number1+number2),Toast.LENGTH_SHORT).show();
                }else{
                    result.setText("Error: Num1 or Num2 is Empty.\n Please Fill value init.");
                }
            }
        });
    }
}