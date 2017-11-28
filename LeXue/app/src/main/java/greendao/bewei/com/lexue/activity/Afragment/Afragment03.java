package greendao.bewei.com.lexue.activity.Afragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import greendao.bewei.com.lexue.R;
import greendao.bewei.com.lexue.activity.MainActivity;


/**
 * Created by 大白 on 2017/11/27.
 */

public class Afragment03 extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.aitem03, null);


        Button bt = view.findViewById(R.id.anim_bt);

        Animation animation = AnimationUtils.loadAnimation(getContext(),R.anim.aa);

        bt.setAnimation(animation);


        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivity.class);
                startActivity(intent);
            }
        });


        return view;
    }

}
