package com.ques5;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Complex {
    public List<String> list;
    public Set<Integer> set;
    public Map<Integer,String> map;

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Set<Integer> getSet() {
        return set;
    }

    public void setSet(Set<Integer> set) {
        this.set = set;
    }

    public Map<Integer, String> getMap() {
        return map;
    }

    public void setMap(Map<Integer, String> map) {
        this.map = map;
    }
}
