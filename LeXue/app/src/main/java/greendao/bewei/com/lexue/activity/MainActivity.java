package greendao.bewei.com.lexue.activity;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.RadioGroup;

import butterknife.ButterKnife;
import butterknife.InjectView;
import greendao.bewei.com.lexue.R;
import greendao.bewei.com.lexue.activity.activity.BaseActivity;
import greendao.bewei.com.lexue.activity.gfragment.Fragment01;
import greendao.bewei.com.lexue.activity.gfragment.Fragment02;
import greendao.bewei.com.lexue.activity.gfragment.Fragment03;

public class MainActivity extends BaseActivity {

    @InjectView(R.id.vp)
    ViewPager vp;
    @InjectView(R.id.rg)
    RadioGroup rg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);


        initView();


    }

    private void initView() {

              vp.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
                  @Override
                  public Fragment getItem(int position) {

                      Fragment fragment = null;

                      switch (position){
                          case 0:
                              fragment = new Fragment01();
                              break;
                          case 1:
                              fragment = new Fragment02();
                              break;
                          case 2:
                              fragment = new Fragment03();
                              break;

                      }
                      return fragment;
                  }

                  @Override
                  public int getCount() {
                      return 3;
                  }
              });



          rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
              @Override
              public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                  switch (checkedId){
                      case R.id.bt1:
                          vp.setCurrentItem(0);
                          break;
                      case R.id.bt2:
                          vp.setCurrentItem(1);
                          break;
                      case R.id.bt3:
                          vp.setCurrentItem(2);
                          break;
                  }
              }
          });

    }


}
