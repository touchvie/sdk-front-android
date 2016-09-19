package com.touchvie.sdk_front.ui.activities;

import android.os.Bundle;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.touchvie.sdkfront.R;
import com.touchvie.touchvie_front.builders.BaseCardDetailBuilder;

/**
 * Created by Tagsonomy S.L. on 19/09/2016.
 */
public class CardDetailDive extends FragmentActivity {
    private static CardDetailDive instance=null;
    private FragmentManager mManager = null;
    private FragmentTransaction mFt = null;

    /**
     *
     * @return CardDetailDive instance
     */
    public static CardDetailDive getInstance(){return instance;}

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        LinearLayout mContainer=null;
        super.onCreate(savedInstanceState);
        instance = this;
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.carddetail);
        mContainer = (LinearLayout) findViewById(R.id.carddetail);
        getWindow().setLayout(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);

        mManager = getSupportFragmentManager();
        BaseCardDetailBuilder cardDetail = new BaseCardDetailBuilder() {
            @Override
            protected BaseCardDetailBuilder getThis() {
                return null;
            }
        };
        cardDetail.buildAll("1",mManager, mContainer, getApplicationContext());

    }


}