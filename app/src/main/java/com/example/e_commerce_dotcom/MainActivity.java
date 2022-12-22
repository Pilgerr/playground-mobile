package com.example.e_commerce_dotcom;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    ArrayList<User> users;

    Button btn_sales;
    Button btn_users;
    Button btn_products;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateUser();

        RecyclerView rvUsers = findViewById(R.id.rvUsers);
        Adapter adapter = new Adapter(users);
        RecyclerView.LayoutManager layout =
                new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rvUsers.setLayoutManager(layout);
        rvUsers.setAdapter(adapter);

        btn_sales = findViewById(R.id.btn_sales);
        btn_users = findViewById(R.id.btn_users);
        btn_products = findViewById(R.id.btn_products);

        btn_sales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Sales.class));
            }
        });

        btn_users.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, User.class));
            }
        });

        btn_products.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Products.class));
            }
        });

    }

    //método para gerar os dados do dataset
    private void generateUser() {
        users = new ArrayList<User>();
        insertUser("Kaue", R.drawable.ic_profile_photo);
        insertUser("Kaue Souza", R.drawable.ic_profile_photo);
        insertUser("Kaue Souza Pilger", R.drawable.ic_profile_photo);
    }

    //instancia o objeto user e adiciona ao ArrayList<User>
    private void insertUser(String name, int photo) {
        User user = new User(name, photo);
        users.add(user);
    }

}


