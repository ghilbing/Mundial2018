
package com.hilbing.wc2018.mundial2018.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Round4 {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("matches")
    @Expose
    private List<MatchRound4> matches = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<MatchRound4> getMatches() {
        return matches;
    }

    public void setMatches(List<MatchRound4> matches) {
        this.matches = matches;
    }
}
