package crsu.mca.ajay;

import static android.Manifest.permission.READ_PHONE_STATE;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.TestLooperManager;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.karumi.dexter.Dexter;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;

public class Program6 extends AppCompatActivity {


    TextView imei_number,
            subs_id,
            sim_serial_no,
            net_country_ios,
            sim_contry_ios,
            voice_mail_no,
            roming,
            network_type,
            sim_state;
    String str_imei_number="",
            str_subs_id="",
            str_sim_serial_no="",
            str_net_country_ios="",
            str_sim_contry_ios="",
            str_voice_mail_no="",
            str_roming="",
            str_network_type="",
            str_sim_state="";

    TelephonyManager telephonyManager =null;
    @SuppressLint("MissingPermission")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program6);
//        textBody=findViewById(R.id.textBody);
//        mobileNumber=findViewById(R.id.mobileNumber);

        imei_number = findViewById(R.id.imei_number);
        subs_id = findViewById(R.id.subs_id);
        sim_serial_no = findViewById(R.id.sim_serial_no);
        net_country_ios = findViewById(R.id.net_country_ios);
        sim_contry_ios = findViewById(R.id.sim_contry_ios);
        voice_mail_no = findViewById(R.id.voice_mail_no);
        roming = findViewById(R.id.roming);
        network_type = findViewById(R.id.network_type);
        sim_state = findViewById(R.id.sim_state);
        telephonyManager= (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {

                    if(true){
                        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                            str_imei_number = Settings.Secure.getString(
                                    this.getContentResolver(),
                                    Settings.Secure.ANDROID_ID);
                        } else {
                            final TelephonyManager mTelephony = (TelephonyManager) this.getSystemService(Context.TELEPHONY_SERVICE);
                            if (mTelephony.getDeviceId() != null) {
                                str_imei_number = mTelephony.getDeviceId();
                            } else {
                                str_imei_number = Settings.Secure.getString(
                                        this.getContentResolver(),
                                        Settings.Secure.ANDROID_ID);
                            }
                        }
                    }

            imei_number.setText(str_imei_number);
            subs_id.setText(str_subs_id);
            sim_serial_no.setText(str_sim_serial_no);
            net_country_ios.setText(str_net_country_ios);
            sim_contry_ios.setText(str_sim_contry_ios);
            voice_mail_no.setText(str_voice_mail_no);
            roming.setText(str_roming);
            network_type.setText(str_network_type);
            sim_state.setText(str_sim_state);
        }
    }

    boolean bool=false;
    boolean getPermission(String p){

Dexter.withContext(this)
                .withPermission(p)
                .withListener(new PermissionListener() {
                    @Override public void onPermissionGranted(PermissionGrantedResponse response) {
                        /* ...
                     */
                        bool=true;
                    }
                    @Override public void onPermissionDenied(PermissionDeniedResponse response) {/* ... */
                        bool=false;
                    }
                    @Override public void onPermissionRationaleShouldBeShown(PermissionRequest permission, PermissionToken token) {/* ... */
                        bool=false;
                        Toast.makeText(Program6.this,"Please allow permission",Toast.LENGTH_SHORT).show();
                    }
                }).check();
        return bool;
    }


}