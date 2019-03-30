package com.pcon.hobbo.Activities;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.pcon.hobbo.BottomNavigationBehavior;
import com.pcon.hobbo.Fragments.ClassFragment;
import com.pcon.hobbo.Fragments.GroupFragment;
import com.pcon.hobbo.Fragments.OthersFragment;
import com.pcon.hobbo.Fragments.ProfileFragment;
import com.pcon.hobbo.Fragments.SearchFragment;
import com.pcon.hobbo.R;

public class MainActivity extends AppCompatActivity {

    private FragmentManager mFragmentManager;
    private BottomNavigationView mBottomNavView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBottomNavView=findViewById(R.id.bottom_nav);
        mBottomNavView.setSelectedItemId(R.id.search);

        // attaching bottom sheet behaviour - hide / show on scroll
        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) mBottomNavView.getLayoutParams();
        layoutParams.setBehavior(new BottomNavigationBehavior());

        mBottomNavView.setOnNavigationItemSelectedListener(mItemSelected);
        SearchFragment searchFragment=new SearchFragment();
        mFragmentManager=getSupportFragmentManager();
        FragmentTransaction transaction=mFragmentManager.beginTransaction();
        transaction.add(R.id.container,searchFragment);
        transaction.commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.bottom_nav_menu,menu);
        return true;
    }
   private BottomNavigationView.OnNavigationItemSelectedListener mItemSelected=new BottomNavigationView.OnNavigationItemSelectedListener() {
       @Override
       public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
           if(R.id.search==menuItem.getItemId())
               replace(new SearchFragment());
           else if(R.id.classes==menuItem.getItemId())
               replace(new ClassFragment());
            else if(R.id.groups==menuItem.getItemId())
                replace(new GroupFragment());
            else if(R.id.feed==menuItem.getItemId())
                replace(new OthersFragment());
            else if(R.id.profile==menuItem.getItemId())
                replace(new ProfileFragment());
           return true;
       }
   };
   private void replace(Fragment f)
   {
       FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
       transaction.replace(R.id.container,f);
       transaction.commit();
   }
}

