package com.touchvie.touchvie_front.ui.modules;

import android.view.View;
import android.widget.ImageView;

import com.touchvie.touchvie_front.R;
import com.touchvie.touchvie_front.ui.views.Module;

/**
 * Created by rodrigo.moral on 16/09/2016.
 */
public class ImageModule extends Module {

    private ImageView mImage;

    /**
     * Default constructor
     */
    public ImageModule(View v) {
        super(v);
        mImage = (ImageView) v.findViewById(R.id.module_image_img);
    }

    public ImageView getImage() {
        return mImage;
    }

    public void setImage(ImageView mImage) {
        this.mImage = mImage;
    }

    public void configure(ImageModule imageVH, int position) {
        //TODO
    }
}
