package greendao.bewei.com.lexue.activity.gfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;
import greendao.bewei.com.lexue.R;
import greendao.bewei.com.lexue.activity.cfragment.CFragment01;
import greendao.bewei.com.lexue.activity.cfragment.CFragment02;
import greendao.bewei.com.lexue.activity.cfragment.CFragment03;
import greendao.bewei.com.lexue.activity.cfragment.CFragment04;
import greendao.bewei.com.lexue.activity.cfragment.CFragment05;
import greendao.bewei.com.lexue.activity.cfragment.CFragment06;
import greendao.bewei.com.lexue.activity.cfragment.CFragment07;


/**
 * Created by 大白 on 2017/11/27.
 */

public class Fragment01 extends Fragment {


    private static final String[] Title = new String[]{"全部", "暑期营", "研学旅行", "夏令营", "周末营", "周边游", "亲子游"};
    private List<Fragment> fragments = new ArrayList<>();
    @InjectView(R.id.tablayout)
    TabLayout tablayout;
    private ViewPager vp2;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.gitme01, null);


        ButterKnife.inject(this, view);
        vp2 = view.findViewById(R.id.vp2);
        initView();



        return view;
    }

    private void initView() {


        fragments.add(new CFragment01());
        fragments.add(new CFragment02());
        fragments.add(new CFragment03());
        fragments.add(new CFragment04());
        fragments.add(new CFragment05());
        fragments.add(new CFragment06());
        fragments.add(new CFragment07());


        for (String str : Title){
            tablayout.addTab(tablayout.newTab().setText(str));
        }


          vp2.setAdapter(new MyFragmentAdapter(getChildFragmentManager()));

        tablayout.setupWithViewPager(vp2);
    }




    class  MyFragmentAdapter  extends FragmentPagerAdapter {
        public MyFragmentAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return fragments.get(position);
        }

        @Override
        public int getCount() {
            return Title.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return Title[position];
        }
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.reset(this);
    }
}
