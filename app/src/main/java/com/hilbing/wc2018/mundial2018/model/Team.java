
package com.hilbing.wc2018.mundial2018.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Team {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("fifaCode")
    @Expose
    private String fifaCode;
    @SerializedName("iso2")
    @Expose
    private String iso2;
    @SerializedName("flag")
    @Expose
    private String flag;
    @SerializedName("emoji")
    @Expose
    private String emoji;
    @SerializedName("emojiString")
    @Expose
    private String emojiString;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFifaCode() {
        return fifaCode;
    }

    public void setFifaCode(String fifaCode) {
        this.fifaCode = fifaCode;
    }

    public String getIso2() {
        return iso2;
    }

    public void setIso2(String iso2) {
        this.iso2 = iso2;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getEmoji() {
        return emoji;
    }

    public void setEmoji(String emoji) {
        this.emoji = emoji;
    }

    public String getEmojiString() {
        return emojiString;
    }

    public void setEmojiString(String emojiString) {
        this.emojiString = emojiString;
    }

    public String getTeamNameById(int id){
        if (getId()==id){

        }
        return name;
    }

    public String getTeamFlagById(int id){
        if (getId()==id){

        }
        return flag;
    }





}
