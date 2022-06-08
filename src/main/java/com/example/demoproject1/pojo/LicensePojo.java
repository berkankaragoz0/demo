package com.example.demoproject1.pojo;

public class LicensePojo {
    private int id;
    private String name;

    @Override
    public String toString() {
        return "LicensePojo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
    public LicensePojo() {
    }

    public LicensePojo(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
