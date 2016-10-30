package com.touchvie.touchvie_front.ui.modules.viewholders;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;

import com.squareup.picasso.Picasso;
import com.touchvie.backend.carddetail.CardDetail;

/**
 * Created by Tagsonomy S.L. on 05/10/2016.
 */

public abstract class ModuleHolder extends RecyclerView.ViewHolder {

    /**
     * Default constructor
     *
     * @param itemView
     */
    public ModuleHolder(View itemView) {
        super(itemView);
    }

    public abstract void configure(CardDetail cardData, Picasso picasso, Context context);
}
