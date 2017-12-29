package example.com.deveportfolio;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import example.com.deveportfolio.R;
import example.com.deveportfolio.controller.DevPagerAdapter;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(new DevPagerAdapter(getSupportFragmentManager()));

        TabLayout tabs = findViewById(R.id.tabLayout);
        tabs.setupWithViewPager(viewPager);
        tabs.setTabTextColors(Color.GRAY,Color.rgb(255,69,0));

        TextView txtGetInTouch = findViewById(R.id.txtGetInTouch);
        txtGetInTouch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String dial = "tel:063577442";
                startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
            }
        });
    }
}
