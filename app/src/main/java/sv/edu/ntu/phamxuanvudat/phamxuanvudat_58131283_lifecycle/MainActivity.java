package sv.edu.ntu.phamxuanvudat.phamxuanvudat_58131283_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class MainActivity extends AppCompatActivity {

    //TextView txtTG;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //SetContentView(R.layout.activity_main);
        Log.d("Life cycle","onCreate called");
        Toast.makeText(getApplicationContext(), "onCreate", Toast.LENGTH_SHORT).show();
        //txtTG = findViewById(R.id.txtTG);
        //SimpleDateFormat spf = new SimpleDateFormat("HH:mm:ss");
        //String strDate = spf.format(new Date());
        //txtTG.setText(strDate);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Life cycle","onStart called");
        Toast.makeText(getApplicationContext(), "on", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Life cycle","onPause called");
        Toast.makeText(getApplicationContext(), "on", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Life cycle","onStop called");
        Toast.makeText(getApplicationContext(), "on", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Life cycle","onRestart called");
        Toast.makeText(getApplicationContext(), "on", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Life cycle","onDestroy called");
        Toast.makeText(getApplicationContext(), "onDestroy", Toast.LENGTH_SHORT).show();
    }
}
