package com.example.githubtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import com.example.githubtest.Adapter.HomeAdapter;
import com.example.githubtest.Model.Category;

import java.util.ArrayList;

public class Home extends AppCompatActivity {

    RecyclerView recyclerView_Home;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<Category> arrayList_Category;
    HomeAdapter homeAdapter;
    DividerItemDecoration dividerItemDecoration;
    Drawable drawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        recyclerView_Home = findViewById(R.id.recyclerView_Home);
        recyclerView_Home.setHasFixedSize(true);
        layoutManager= new LinearLayoutManager(this);
        recyclerView_Home.setLayoutManager(layoutManager);

//        dividerItemDecoration = new DividerItemDecoration(recyclerView_Home.getContext(),DividerItemDecoration.VERTICAL);
//        drawable = ContextCompat.getDrawable(getBaseContext(),R.drawable.custom_divider);
//        dividerItemDecoration.setDrawable(drawable );


        recyclerView_Home.setItemAnimator(new DefaultItemAnimator());
        arrayList_Category = new ArrayList<>();
        arrayList_Category.add(new Category(R.drawable.image1,"one","10000"));
        arrayList_Category.add(new Category(R.drawable.image2,"one","10000"));
        arrayList_Category.add(new Category(R.drawable.image3,"one","10000"));
        arrayList_Category.add(new Category(R.drawable.image4,"one","10000"));
        arrayList_Category.add(new Category(R.drawable.image5,"one","10000"));
        arrayList_Category.add(new Category(R.drawable.image6,"one","10000"));

         homeAdapter = new HomeAdapter(arrayList_Category,getBaseContext());
        recyclerView_Home.setAdapter(homeAdapter);


    }
}
