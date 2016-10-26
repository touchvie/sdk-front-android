package com.touchvie.touchvie_front.ui.modules;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.touchvie.touchvie_front.ui.modules.viewholders.MusicShopsHolder;


/**
 * Created by Tagsonomy S.L. on 19/10/2016.
 */

public class MusicShops extends VerticalListModule {

    public MusicShops(){
        super();
    }

    @Override
    public RecyclerView.ViewHolder getViewHolder(LayoutInflater inflater, ViewGroup group) {

        ViewGroup viewGroup = (ViewGroup) inflater.inflate(this.layout, group, false);
        MusicShopsHolder holder= new MusicShopsHolder(viewGroup);
        return holder;
    }
}