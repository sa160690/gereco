package models;

import java.util.ArrayList;
import java.util.List;

public class Gender {
    private String name;
    private List<Team> teams;
    private List<Match> matches;
    private List<List<String>> groups;

    public Gender(String name) {
        this.name = name;
        this.teams = new ArrayList<>();
        this.matches = new ArrayList<>();
        this.groups = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Team> getTeams() {
        return teams;
    }
    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }
    public List<Match> getMatches() {
        return matches;
    }
    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }
    public List<List<String>> getGroups() {
        return groups;
    }
    public void setGroups(List<List<String>> groups) {
        this.groups = groups;
    }
}
