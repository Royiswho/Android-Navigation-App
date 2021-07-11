package co.edureka.activitydemo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    String TAG = "MainActivity";
    //TextView textView;

    ListView listView;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_list);
        Log.i(TAG, "--onCreate--");

        listView = (ListView)findViewById(R.id.listView);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        adapter.add("Dial");
        adapter.add("ShowLocation");
        adapter.add("openWebPage");
        adapter.add("viewIntent");
        adapter.add("self-defined activity");
        adapter.add("message");

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
        //textView = (TextView) findViewById(R.id.textView);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "--onCreate--");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "--onRestart--");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "--onResume--");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "--onPause--");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "--onStop--");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "--onDestroy--");
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String item = adapter.getItem(i);
        switch (item){
            case "Dial":
                // intent to dial page
                Toast.makeText(this, "You clicked on " + item,Toast.LENGTH_LONG).show();
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:123456789"));
                startActivity(intent);
                break;

            case "ShowLocation":
                // open google map
                Toast.makeText(this, "You clicked on " + item,Toast.LENGTH_LONG).show();
                Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:40.7060361,-74.0110143,17"));
                startActivity(intent2);
                break;

            case "openWebPage":
                Toast.makeText(this, "You clicked on " + item,Toast.LENGTH_LONG).show();
                Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://codelabs.developers.google.com/android-training/"));
                startActivity(intent3);
                break;
            case "viewIntent":
                Toast.makeText(this, "You clicked on " + item,Toast.LENGTH_LONG).show();
                Intent intent4 = new Intent(Intent.ACTION_VIEW);
                startActivity(intent4);
                break;

            case "self-defined activity":
                Toast.makeText(this, "You clicked on " + item,Toast.LENGTH_LONG).show();
                Intent intent5 = new Intent("co.edureka.activitydemo.MainActivityTwo");
                startActivity(intent5);
                break;

            case "message":
                Toast.makeText(this, "You clicked on " + item,Toast.LENGTH_LONG).show();
                Intent intent6 = new Intent(Intent.ACTION_VIEW);
                intent6.putExtra("KEY", "My data parsed from the last page");
                startActivity(intent6);
        }


//        String item = adapter.getItem(i);
//        Toast.makeText(this, "You selected: " + item, Toast.LENGTH_LONG).show();
//
//        Intent intent = new Intent(MainActivity.this, MainActivityTwo.class);
//        startActivity(intent);
    }

    /*
    public void clickHandler(View view){
        Date date = new Date();

        textView.setText("Today is : " + date.toString());

        Toast.makeText(this, "You clicked Button", Toast.LENGTH_LONG).show();
    }
    */
}