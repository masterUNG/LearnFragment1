package app.ewtc.masterung.learnfragment1.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import app.ewtc.masterung.learnfragment1.R;

/**
 * Created by masterung on 8/3/2017 AD.
 */

public class MainFragment extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        //Goto Second
        gotoSecond();

    }

    private void gotoSecond() {
        Button button = getView().findViewById(R.id.btnGoToSecond);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SecondFragment secondFragment = new SecondFragment();
                getActivity().getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.myContent, secondFragment)
                        .addToBackStack(null)
                        .commit();
            }
        });
    }
}   // Main Class
