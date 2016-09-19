package com.touchvie.touchvie_client;

import com.touchvie.backend.CardData;

/**
 * Created by noemi.leon on 14/09/2016.
 */
public interface CardDataListener {

    /**
     * Interface to be reported when the data of a card has been received.
     * @param data
     */
    void onCardReceived(CardData data);
}