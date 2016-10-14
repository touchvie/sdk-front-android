package com.touchvie.touchvie_front.ui.modules.viewholders;

import android.content.Context;
import android.view.View;

import com.squareup.picasso.Picasso;
import com.touchvie.backend.Card;
import com.touchvie.touchvie_front.R;
import com.touchvie.touchvie_front.ui.modules.adapters.SoundtrackAdapter;

/**
 * Created by Tagsonomy S.L. on 13/10/2016.
 */

public class SoundtrackHolder extends CarouselHolder {

    public SoundtrackHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void configure(Card cardData, Picasso picasso, Context context) {

        super.configure(cardData, picasso, context);
        mTitle.setText(context.getResources().getString(R.string.soundtrack));

        mSeeAll.setText(context.getResources().getString(R.string.see_all_soundtrack));
        mSeeAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO: manage click.
            }
        });

        SoundtrackAdapter adapter= new SoundtrackAdapter();
        mList.setAdapter(adapter);

    }
}