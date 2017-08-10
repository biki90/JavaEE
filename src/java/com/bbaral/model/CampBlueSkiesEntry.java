package com.bbaral.model;

public class CampBlueSkiesEntry {
    private Integer entryID;
    private Integer poolID;
    private String username;
    private String email;
    private String firstName;
    private String lastName;
    private String dateEntered;
    private Integer rank;
    private Integer points;
    private Integer tieBreaker1;
    private Integer tieBreaker2;
    private String teamName;
    private String teamNumber;
    
    public CampBlueSkiesEntry()
    {
        
    }

    public CampBlueSkiesEntry(Integer entryID, Integer poolID, String username, String email, String firstName, String lastName, String dateEntered, Integer rank, Integer points, Integer tieBreaker1, Integer tieBreaker2, String teamName, String teamNumber) {
        this.entryID = entryID;
        this.poolID = poolID;
        this.username = username;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateEntered = dateEntered;
        this.rank = rank;
        this.points = points;
        this.tieBreaker1 = tieBreaker1;
        this.tieBreaker2 = tieBreaker2;
        this.teamName = teamName;
        this.teamNumber = teamNumber;
    }

    public Integer getEntryID() {
        return entryID;
    }

    public void setEntryID(Integer entryID) {
        this.entryID = entryID;
    }

    public Integer getPoolID() {
        return poolID;
    }

    public void setPoolID(Integer poolID) {
        this.poolID = poolID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateEntered() {
        return dateEntered;
    }

    public void setDateEntered(String dateEntered) {
        this.dateEntered = dateEntered;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer teamRank) {
        this.rank = teamRank;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Integer getTieBreaker1() {
        return tieBreaker1;
    }

    public void setTieBreaker1(Integer tieBreaker1) {
        this.tieBreaker1 = tieBreaker1;
    }

    public Integer getTieBreaker2() {
        return tieBreaker2;
    }

    public void setTieBreaker2(Integer tieBreaker2) {
        this.tieBreaker2 = tieBreaker2;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamNumber() {
        return teamNumber;
    }

    public void setTeamNumber(String teamNumber) {
        this.teamNumber = teamNumber;
    }

    @Override
    public String toString() {
        return "CampBlueSkiesData{" + "entryID=" + entryID + ", poolID=" + poolID + ", username=" + username + ", email=" + email + ", firstName=" + firstName + ", lastName=" + lastName + ", dateEntered=" + dateEntered + ", teamRank=" + rank + ", points=" + points + ", tieBreaker1=" + tieBreaker1 + ", tieBreaker2=" + tieBreaker2 + ", teamName=" + teamName + ", teamNumber=" + teamNumber + '}';
    }
}
