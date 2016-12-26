package com.example.chow.stepout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/**
 * Created by Chow on 26/12/2016.
 */

public class Info extends Fragment  {

    InfoTab test = new InfoTab();

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //Returning the layout file after inflating
        //Change R.layout.tab1 in you classes
    //    return inflater.inflate(R.layout.info, container, false);
        return inflater.inflate(R.layout.activity_info_tab, container, false);




    }


}
