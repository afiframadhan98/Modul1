package android.example.com.afiframadhan_1202154217_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et_makanan, et_jumlah;
    Intent intent;
    String restaurant, menu;
    int porsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_makanan = (EditText) findViewById(R.id.editText_makanan);
        et_jumlah = (EditText) findViewById(R.id.editText_jumlah);

        intent = new Intent (this, SecondActivity.class);
    }

    public void launchSecondActivityEatbus(View view) {
        menu = et_makanan.getText().toString();
        restaurant = "Eatbus";
        porsi = Integer.parseInt(et_jumlah.getText().toString());

        int total = 50000 * Integer.parseInt(et_jumlah.getText().toString());

        Log.d("TOTAL HARGA", "Rp. " + total);

        intent.putExtra("restaurant",restaurant);
        intent.putExtra("menu",menu);
        intent.putExtra("porsi",porsi);
        intent.putExtra("harga",total);

        startActivity(intent);
    }

    public void launchSecondActivityAbnormal(View view) {
        menu = et_makanan.getText().toString();
        restaurant = "Abnormal";
        porsi = Integer.parseInt(et_jumlah.getText().toString());

        int total = 30000 * Integer.parseInt(et_jumlah.getText().toString());

        Log.d("TOTAL HARGA", "Rp. " + total);

        intent.putExtra("restaurant",restaurant);
        intent.putExtra("menu", menu);
        intent.putExtra("porsi", porsi);
        intent.putExtra("harga", total);

        startActivity(intent);
    }
}
