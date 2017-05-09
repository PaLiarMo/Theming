package com.paliarmo.style.meetapp.main;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.paliarmo.style.meetapp.R;


/**
 * Created by PaLiarMo on 14/04/2017.
 */

public class MainFragment extends Fragment {
    /** Метод для получения id по R.attr.___ **/
    public static int getIdFromTheme(Context _parent, int incMessage) {
        if (_parent==null) return 0;
        TypedArray a = _parent.getTheme().obtainStyledAttributes(new int[]{incMessage});
        return a.getResourceId(0, 0);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View mainView = inflater.inflate(R.layout.fragment_layout, container,false);
        LinearLayout linearLayout = (LinearLayout) mainView.findViewById(R.id.layout_for_inflate);
        LayoutInflater.from(getContext()).inflate(getIdFromTheme(getContext(),R.attr.list_item_layout),linearLayout,true);
        return mainView;

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
}
