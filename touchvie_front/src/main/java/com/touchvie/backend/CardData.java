package com.touchvie.backend;

import java.io.Serializable;

/**
 * Created by Tagsonomy S.L. on 16/09/2016.
 */
public class CardData implements Serializable {
    String card_id;
    String locale;
    String title;
    String subtitle;
    int type;
    String image;
    String source;
    int anchor_x;
    int anchor_y;
    Description description;
    Boolean is_exact;
    String url;
    Boolean is_user_locale;
    RelatedMovies related_movies;


    public String getCard_id() {
        return card_id;
    }

    public void setCard_id(String card_id) {
        this.card_id = card_id;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public int getAnchor_x() {
        return anchor_x;
    }

    public void setAnchor_x(int anchor_x) {
        this.anchor_x = anchor_x;
    }

    public int getAnchor_y() {
        return anchor_y;
    }

    public void setAnchor_y(int anchor_y) {
        this.anchor_y = anchor_y;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public Boolean getIs_exact() {
        return is_exact;
    }

    public void setIs_exact(Boolean is_exact) {
        this.is_exact = is_exact;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Boolean getIs_user_locale() {
        return is_user_locale;
    }

    public void setIs_user_locale(Boolean is_user_locale) {
        this.is_user_locale = is_user_locale;
    }

    public RelatedMovies getRelated_movies() {
        return related_movies;
    }

    public void setRelated_movies(RelatedMovies related_movies) {
        this.related_movies = related_movies;
    }
}
