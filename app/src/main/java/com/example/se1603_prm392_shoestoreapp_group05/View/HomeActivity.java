package com.example.se1603_prm392_shoestoreapp_group05.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ViewFlipper;

import com.example.se1603_prm392_shoestoreapp_group05.R;
import com.google.android.material.navigation.NavigationView;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    Toolbar toolbar;
    ViewFlipper viewFlipper;
    RecyclerView recyclerView;
    NavigationView navigationView;
    ListView listView;
    LinearLayout linearLayout1;
    LinearLayout linearLayout2;
    DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Assignviews();
        ActionBar();
        ActionViewFlipper();
    }

    private void ActionBar(){
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationIcon(R.drawable.baseline_menu_24);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });
    }

    private void ActionViewFlipper(){
        ArrayList<String> Advertisement = new ArrayList<>();
        Advertisement.add("https://i.imgur.com/iQfHbs0.png");
        Advertisement.add("https://i.imgur.com/MynT1hc.png");
        Advertisement.add("https://i.imgur.com/qQ6HemS.png");
        Advertisement.add("https://i.imgur.com/zDnJg5x.png");
        Advertisement.add("https://i.imgur.com/59hVrow.png");
        for (int i=0; i<Advertisement.size(); i++){
            ImageView imageView = new ImageView(getApplicationContext());
            Picasso.get().load(Advertisement.get(i)).into(imageView);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            viewFlipper.addView(imageView);
        }
        viewFlipper.setFlipInterval(5000);
        viewFlipper.setAutoStart(true);
        Animation animation_sidebar_in = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.sidebar_in_right);
        Animation animation_sidebar_out = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.sidebar_out_right);
        viewFlipper.setInAnimation(animation_sidebar_in);
        viewFlipper.setOutAnimation(animation_sidebar_out);
    }
    private void Assignviews(){
        toolbar = findViewById(R.id.toolbarHome);
        viewFlipper = findViewById(R.id.viewFlipperHome);
        navigationView = findViewById(R.id.navigationViewHome);
        recyclerView = findViewById(R.id.recyclerviewHome);
        listView = findViewById(R.id.listviewHome);
        linearLayout1 = findViewById(R.id.linerboderlogo1);
        linearLayout2 = findViewById(R.id.linerboderlogo2);
        drawerLayout = findViewById(R.id.drawerlayoutHome);
        final String[] menuItems = {"Home", "Contact", "Product"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, menuItems);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Xử lý sự kiện khi mục menu được chọn
                switch (position) {
                    case 0:
                        // Chuyển đến trang Home
                        // startFragment(new HomeFragment());
                        break;
                    case 1:
                        // Chuyển đến trang Contact
                        // startFragment(new ContactFragment());
                        break;
                    case 2:
                        // Chuyển đến trang Product
                        // startFragment(new ProductFragment());
                        break;
                }

                drawerLayout.closeDrawer(GravityCompat.START);
            }
        });

    }
}