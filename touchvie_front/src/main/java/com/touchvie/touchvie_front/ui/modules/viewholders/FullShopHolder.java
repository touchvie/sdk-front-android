package com.touchvie.touchvie_front.ui.modules.viewholders;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.widget.LinearLayout;

import com.squareup.picasso.Picasso;
import com.touchvie.backend.carddetail.CardDetail;

/**
 * Created by Tagsonomy S.L. on 13/10/2016.
 */

public class FullShopHolder extends ModuleHolder {


    /**
     * Default constructor
     *
     * @param itemView
     */

    public FullShopHolder(View itemView) {

        super(itemView);
    }

    @Override
    public void configure(CardDetail cardData, Picasso picasso, Context context, FragmentManager fragmentManager, LinearLayout container) {

    }

}