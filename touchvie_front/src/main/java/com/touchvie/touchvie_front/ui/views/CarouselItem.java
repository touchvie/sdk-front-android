package com.touchvie.touchvie_front.ui.views;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.touchvie.touchvie_front.R;

import java.util.List;

import eu.davidea.flexibleadapter.FlexibleAdapter;
import eu.davidea.flexibleadapter.items.AbstractSectionableItem;
import eu.davidea.viewholders.FlexibleViewHolder;

/**
 * Created by Tagsonomy S.L. on 21/09/2016.
 * Holds a line view in the carousel. It is related to one carousel section.
 */

public class CarouselItem extends AbstractSectionableItem<CarouselItem.ViewHolder, SceneHeaderItem> {


    private int id;
    private String text;


    /**
     * Constructor
     *
     * @param id     the identifier of this row.
     * @param header The header this row is related to.
     */
    public CarouselItem(int id, SceneHeaderItem header, String text) {
        super(header);
        this.id = id;
        this.text = text;
    }

    @Override
    public boolean equals(Object inObject) {
        if (inObject instanceof CarouselItem) {
            CarouselItem inItem = (CarouselItem) inObject;
            return this.id == inItem.id;
        }
        return false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public int getLayoutRes() {
        return R.layout.carousel_item_generic;
    }

    @Override
    public ViewHolder createViewHolder(FlexibleAdapter adapter, LayoutInflater inflater, ViewGroup parent) {
        return new ViewHolder(inflater.inflate(getLayoutRes(), parent, false), adapter);
    }

    @Override
    public void bindViewHolder(final FlexibleAdapter adapter, final ViewHolder holder, int position, List payloads) {
        Context context = holder.itemView.getContext();
        //holder.mCarouselCardImage;
        holder.mCarouselCardText.setText(this.text);
    }

    @Override
    public String toString() {
        return Integer.toString(id);
    }

    static class ViewHolder extends FlexibleViewHolder {
        public ImageView mCarouselCardImage;
        public TextView mCarouselCardText;

        /**
         * Default constructor.
         *
         * @param view    The {@link View} being hosted in this ViewHolder
         * @param adapter Adapter instance of type {@link FlexibleAdapter}
         */
        public ViewHolder(View view, FlexibleAdapter adapter) {
            super(view, adapter);
            this.mCarouselCardImage = (ImageView) view.findViewById(R.id.carousel_item_generic_image);
            this.mCarouselCardText = (TextView) view.findViewById(R.id.carousel_item_generic_text);

        }

    }

}
