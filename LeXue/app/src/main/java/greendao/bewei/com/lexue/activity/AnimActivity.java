package greendao.bewei.com.lexue.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import greendao.bewei.com.lexue.R;
import greendao.bewei.com.lexue.activity.Afragment.Afragment01;
import greendao.bewei.com.lexue.activity.Afragment.Afragment02;
import greendao.bewei.com.lexue.activity.Afragment.Afragment03;

public class AnimActivity extends AppCompatActivity {

    private ViewPager vp3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anim);


          vp3 = (ViewPager) findViewById(R.id.vp3);

           vp3.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
               @Override
               public Fragment getItem(int position) {

                   Fragment fragment = null;

                   switch (position){

                       case 0:
                           fragment = new Afragment01();
                           break;
                       case 1:
                           fragment = new Afragment02();
                           break;
                       case 2:
                           fragment = new Afragment03();
                           break;
                   }
                   return fragment;
               }

               @Override
               public int getCount() {
                   return 3;
               }
           });

    }



}
