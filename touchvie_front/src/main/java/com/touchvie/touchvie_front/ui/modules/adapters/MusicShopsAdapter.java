package com.touchvie.touchvie_front.ui.modules.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.touchvie.touchvie_front.ui.modules.data.MusicShopRowData;

import java.util.ArrayList;

/**
 * Created by Tagsonomy S.L. on 19/10/2016.
 */

public class MusicShopsAdapter  extends BaseAdapter {

    ArrayList<MusicShopRowData> rows;

    public MusicShopsAdapter(Context context, ArrayList<MusicShopRowData> rows){
        this.rows=rows;
    }


    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}