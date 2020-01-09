package com.example.expandablerecycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView=findViewById(R.id.recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Company> companies=new ArrayList<>();

        ArrayList<Product> googleproduct=new ArrayList<>();
        googleproduct.add(new Product("googleAdsense"));
        googleproduct.add(new Product("google Drive"));
        googleproduct.add(new Product("Android"));
        googleproduct.add(new Product("google Mail"));
        googleproduct.add(new Product("google Doc"));


        Company google=new Company("google",googleproduct);
        companies.add(google);

        ArrayList<Product> microsoftproduct=new ArrayList<>();
        microsoftproduct.add(new Product("Microsoft Store"));
        microsoftproduct.add(new Product("Microsoft word"));
        microsoftproduct.add(new Product("Microsoft Office"));
        microsoftproduct.add(new Product("SkyDrive"));
        microsoftproduct.add(new Product("Windows"));


        Company microsoft =new Company("Microsoft",microsoftproduct);
        companies.add(microsoft);

        ProductAdapter productAdapter=new ProductAdapter(companies);
        recyclerView.setAdapter(productAdapter);

    }

    }
