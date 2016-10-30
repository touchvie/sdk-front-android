package com.touchvie.touchvie_front.ui.modules.viewholders;

import android.content.Context;
import android.view.View;

import com.squareup.picasso.Picasso;
import com.touchvie.backend.carddetail.CardDetail;
import com.touchvie.backend.carddetail.containers.Awards;
import com.touchvie.touchvie_front.R;
import com.touchvie.touchvie_front.ui.modules.adapters.AwardsAdapter;

import java.util.ArrayList;

/**
 * Created by Tagsonomy S.L. on 05/10/2016.
 */

public class AwardsHolder extends VerticalListHolder {

    protected AwardsAdapter adapter;
    protected ArrayList<Awards> data;

    /**
     * Default constructor
     *
     * @param itemView
     */
    public AwardsHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void configure(CardDetail cardData, Picasso picasso, Context context) {

        mTitle.setText(context.getResources().getString(R.string.awards));

        data = new ArrayList<>();
        adapter = new AwardsAdapter(context, data);  //TODO: get all the data.
        super.setAdapter(adapter, true, null);

    }
}
