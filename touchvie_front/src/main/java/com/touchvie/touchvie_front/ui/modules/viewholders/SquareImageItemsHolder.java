package com.touchvie.touchvie_front.ui.modules.viewholders;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.squareup.picasso.Picasso;
import com.touchvie.backend.Card;
import com.touchvie.touchvie_front.R;
import com.touchvie.touchvie_front.ui.modules.adapters.SquareImageItemsAdapter;
import com.touchvie.touchvie_front.ui.modules.data.ImageRowData;

import java.util.ArrayList;

/**
 * Created by Tagsonomy S.L. on 13/10/2016.
 */

public abstract class SquareImageItemsHolder extends HorizontalListHolder {

    protected SquareImageItemsAdapter adapter;
    protected ArrayList<ImageRowData> data;

    public SquareImageItemsHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void configure(Card cardData, Picasso picasso, Context context) {

        super.configure(cardData, picasso, context);
        data=new ArrayList<>();
        adapter= new SquareImageItemsAdapter(data);
        super.setAdapter(adapter);
    }

    protected void setData(ArrayList<ImageRowData> data){
        this.data.addAll(data);
        adapter.notifyDataSetChanged();
    }

}
