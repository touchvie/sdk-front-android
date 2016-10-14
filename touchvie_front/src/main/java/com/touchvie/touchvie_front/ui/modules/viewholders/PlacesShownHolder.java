package com.touchvie.touchvie_front.ui.modules.viewholders;

import android.content.Context;
import android.view.View;

import com.squareup.picasso.Picasso;
import com.touchvie.backend.Card;
import com.touchvie.touchvie_front.R;
import com.touchvie.touchvie_front.ui.modules.adapters.ItemsShownAdapter;

/**
 * Created by Tagsonomy S.L. on 13/10/2016.
 */

public class PlacesShownHolder extends CarouselHolder {

    public PlacesShownHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void configure(Card cardData, Picasso picasso, Context context) {

        super.configure(cardData, picasso, context);
        mTitle.setText(context.getResources().getString(R.string.places_shown));

        mSeeAll.setText(context.getResources().getString(R.string.see_all_places));
        mSeeAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO: manage click.
            }
        });

        ItemsShownAdapter adapter= new ItemsShownAdapter();
        mList.setAdapter(adapter);

    }
}