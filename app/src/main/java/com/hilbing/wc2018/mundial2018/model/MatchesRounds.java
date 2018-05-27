
package com.hilbing.wc2018.mundial2018.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MatchesRounds {

    @SerializedName("name")
    @Expose
    private Integer name;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("home_team")
    @Expose
    private Integer homeTeam;
    @SerializedName("away_team")
    @Expose
    private Integer awayTeam;
    @SerializedName("home_result")
    @Expose
    private Object homeResult;
    @SerializedName("away_result")
    @Expose
    private Object awayResult;
    @SerializedName("home_penalty")
    @Expose
    private Object homePenalty;
    @SerializedName("away_penalty")
    @Expose
    private Object awayPenalty;
    @SerializedName("winner")
    @Expose
    private Object winner;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("stadium")
    @Expose
    private Integer stadium;
    @SerializedName("channels")
    @Expose
    private List<Integer> channels = null;
    @SerializedName("finished")
    @Expose
    private Boolean finished;
    @SerializedName("matchday")
    @Expose
    private Integer matchday;

    public Integer getName() {
        return name;
    }

    public void setName(Integer name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Integer homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Integer getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(Integer awayTeam) {
        this.awayTeam = awayTeam;
    }

    public Object getHomeResult() {
        return homeResult;
    }

    public void setHomeResult(Object homeResult) {
        this.homeResult = homeResult;
    }

    public Object getAwayResult() {
        return awayResult;
    }

    public void setAwayResult(Object awayResult) {
        this.awayResult = awayResult;
    }

    public Object getHomePenalty() {
        return homePenalty;
    }

    public void setHomePenalty(Object homePenalty) {
        this.homePenalty = homePenalty;
    }

    public Object getAwayPenalty() {
        return awayPenalty;
    }

    public void setAwayPenalty(Object awayPenalty) {
        this.awayPenalty = awayPenalty;
    }

    public Object getWinner() {
        return winner;
    }

    public void setWinner(Object winner) {
        this.winner = winner;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getStadium() {
        return stadium;
    }

    public void setStadium(Integer stadium) {
        this.stadium = stadium;
    }

    public List<Integer> getChannels() {
        return channels;
    }

    public void setChannels(List<Integer> channels) {
        this.channels = channels;
    }

    public Boolean getFinished() {
        return finished;
    }

    public void setFinished(Boolean finished) {
        this.finished = finished;
    }

    public Integer getMatchday() {
        return matchday;
    }

    public void setMatchday(Integer matchday) {
        this.matchday = matchday;
    }

}
