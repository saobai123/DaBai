package greendao.bewei.com.lexue.activity.cfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import greendao.bewei.com.lexue.R;


/**
 * Created by 大白 on 2017/11/27.
 */

public class CFragment01 extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.citme01, null);

        return view;
    }
}
