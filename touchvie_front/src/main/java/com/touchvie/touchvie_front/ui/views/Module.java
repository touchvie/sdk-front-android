package com.touchvie.touchvie_front.ui.views;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 *
 */
public class Module extends RecyclerView.ViewHolder {

    /**
     * Default constructor
     */
    public Module(View view) {
        super(view);
    }

    /**
     * Type of module
     */
    public String type;

    /**
     * Sets the module type
     * @param modType type of the Module
     */
    public void setType(String modType) {
        this.type = modType;
    }

    /**
     * Gets the module type
     * @return type the type of the module
     */
    public String getType() {
        return type;
    }


}