package model;

import java.util.List;

public class Board {

    private Double id;

    public Double getId() {
        return id;
    }

    public void setId(Double id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrivacy() {
        return privacy;
    }

    public void setPrivacy(String privacy) {
        this.privacy = privacy;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<User> getMembers() {
        return members;
    }

    public void setMembers(List<User> members) {
        this.members = members;
    }

    public List<Listt> getLists() {
        return lists;
    }

    public void setLists(List<Listt> lists) {
        this.lists = lists;
    }

    private String name;
    private String privacy;
    private String url;
    private List<User> members;
    private List<Listt> lists;

    public Board() {
        this.id = Math.random();
    }

}
