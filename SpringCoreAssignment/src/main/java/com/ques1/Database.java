package com.ques1;
public class Database {
    private int port;
    private String name;

    public Database(int port, String name) {
        this.port = port;
        this.name = name;
    }

    public Database() {
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Database {" +
                "port=" + port +
                ", name='" + name + '\'' +
                '}';
    }
}
