package com.touchvie.touchvie_front.builders;

/**
 * Class to build a card detail without a configuration json.
 */
public class CardDetailBuilder extends BaseCardDetailBuilder<CardDetailBuilder> {

    /**
     * Default constructor
     */
    public CardDetailBuilder() {
    }


    /**
     * Makes parent addSection method public.
     * @return
     */
    public CardDetailBuilder addSection(String sectionId, ConfigSection section){
        return super.addSection(sectionId, section);
    }

    @Override
    protected CardDetailBuilder getThis() {
        return this;
    }
}