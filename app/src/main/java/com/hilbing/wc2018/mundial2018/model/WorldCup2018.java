
package com.hilbing.wc2018.mundial2018.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class WorldCup2018 {

    @SerializedName("stadiums")
    @Expose
    private List<Stadium> stadiums = null;
    @SerializedName("tvchannels")
    @Expose
    private List<Tvchannel> tvchannels = null;
    @SerializedName("teams")
    @Expose
    private List<Team> teams = null;
    @SerializedName("groups")
    @Expose
    private Groups groups;
    @SerializedName("knockout")
    @Expose
    private Knockout knockout;

    public List<Stadium> getStadiums() {
        return stadiums;
    }

    public void setStadiums(List<Stadium> stadiums) {
        this.stadiums = stadiums;
    }

    public List<Tvchannel> getTvchannels() {
        return tvchannels;
    }

    public void setTvchannels(List<Tvchannel> tvchannels) {
        this.tvchannels = tvchannels;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    public Groups getGroups() {
        return groups;
    }

    public void setGroups(Groups groups) {
        this.groups = groups;
    }

    public Knockout getKnockout() {
        return knockout;
    }

    public void setKnockout(Knockout knockout) {
        this.knockout = knockout;
    }

}
