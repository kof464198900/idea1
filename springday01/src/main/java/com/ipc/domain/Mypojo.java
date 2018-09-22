package com.ipc.domain;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Mypojo {
    private String[] str;
    private List ls;
    private Set  set;
    private Map  map;
    private Properties prots;


    public String[] getStr() {
        return str;
    }

    public void setStr(String[] str) {
        this.str = str;
    }

    public List getLs() {
        return ls;
    }

    public void setLs(List ls) {
        this.ls = ls;
    }

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Properties getProts() {
        return prots;
    }

    public void setProts(Properties prots) {
        this.prots = prots;
    }
}
