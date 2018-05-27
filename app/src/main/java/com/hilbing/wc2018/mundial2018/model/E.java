
package com.hilbing.wc2018.mundial2018.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class E {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("winner")
    @Expose
    private Object winner;
    @SerializedName("runnerup")
    @Expose
    private Object runnerup;
    @SerializedName("matches")
    @Expose
    private List<Matches> matches = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getWinner() {
        return winner;
    }

    public void setWinner(Object winner) {
        this.winner = winner;
    }

    public Object getRunnerup() {
        return runnerup;
    }

    public void setRunnerup(Object runnerup) {
        this.runnerup = runnerup;
    }

    public List<Matches> getMatches() {
        return matches;
    }

    public void setMatches(List<Matches> matches) {
        this.matches = matches;
    }

}
