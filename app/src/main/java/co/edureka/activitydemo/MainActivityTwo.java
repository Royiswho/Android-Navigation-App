package co.edureka.activitydemo;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_two);

        String msg = "This is a self-defined activity";

        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }
}