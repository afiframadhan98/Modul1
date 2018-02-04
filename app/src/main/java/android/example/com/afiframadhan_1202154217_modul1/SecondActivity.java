package android.example.com.afiframadhan_1202154217_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    TextView tv_restaurant, tv_menu, tv_porsi, tv_harga;
    String restaurant, menu;
    int porsi, harga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tv_restaurant = (TextView) findViewById(R.id.sub_judul); //mengambil id dari xml
        tv_menu = (TextView) findViewById(R.id.menu_value);
        tv_porsi = (TextView) findViewById(R.id.porsi_value);
        tv_harga = (TextView) findViewById(R.id.harga_value);

        Intent intent = getIntent(); //mengambil data dari activity sebeleumnya

        restaurant = intent.getStringExtra("restaurant");
        menu = intent.getStringExtra("menu");
        porsi = intent.getIntExtra("porsi", 0);
        harga = intent.getIntExtra("harga", 0);

        tv_restaurant.setText(restaurant); //setText untuk mengisi komponen dengan data
        tv_menu.setText(menu);
        tv_porsi.setText("" + porsi);
        tv_harga.setText("Rp. " + harga);

        Toast toast = null; //inisiasi
        if (harga < 65000){
            toast = Toast.makeText(getApplicationContext(), "Silahkan Makan disini", Toast.LENGTH_SHORT); //apabila kurang dari 65000 akan menampilkan pesan makan disini aja atuh
        }else{
            toast = Toast.makeText(getApplicationContext(), "Maaf, Anda tidak bisa makan disini. Uang anda tidak cukup", Toast.LENGTH_SHORT); //apabila kurang dari 65000 akan menampilkan pesan jangan disini, terlalu mahal
        }
        toast.show(); //untuk menampilkan tulisan

    }
}
