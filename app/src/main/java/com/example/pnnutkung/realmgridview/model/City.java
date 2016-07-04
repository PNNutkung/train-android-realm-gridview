package com.example.pnnutkung.realmgridview.model;

import io.realm.RealmObject;

/**
 * Created by PNNutkung on 2016-07-04.
 */
public class City extends RealmObject {
    private String name;
    private long votes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getVotes() {
        return votes;
    }

    public void setVotes(long votes) {
        this.votes = votes;
    }
}
