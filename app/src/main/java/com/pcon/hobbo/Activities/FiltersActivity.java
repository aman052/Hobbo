package com.pcon.hobbo.Activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.pcon.hobbo.R;

public class FiltersActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filters);

        RadioButton mRelevance = findViewById(R.id.relevance);
        RadioButton mRating = findViewById(R.id.rating);
        RadioButton mCostLH = findViewById(R.id.costlh);
        RadioButton mCostHL = findViewById(R.id.costhl);
        RadioButton mDistance = findViewById(R.id.distance);

        mRelevance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Relevance Selected",Toast.LENGTH_SHORT).show();
            }
        });

        mRating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Rating Selected",Toast.LENGTH_SHORT).show();
            }
        });

        mCostLH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Cost(Low to High) Selected",Toast.LENGTH_SHORT).show();
            }
        });

        mCostHL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Cost(High to Low) Selected",Toast.LENGTH_SHORT).show();
            }
        });

        mDistance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Distance Selected",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
