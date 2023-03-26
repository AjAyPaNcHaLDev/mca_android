package crsu.mca.ajay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Program4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program4);
    }
    public   void  openFB(View view){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/ajaydeveloper8570")));
    }

    public void openLinkdin(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/ajaypanchal1")));
    }

    public void oeninsta(View view) {

        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/ajaypanchal_1")));
    }

    public void openCrsu(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://crsu.ac.in/")));

    }

    public void openGit(View view) {

        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.github.com/ajaypanchaldev")));
    }
}