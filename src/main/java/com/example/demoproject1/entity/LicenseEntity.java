package com.example.demoproject1.entity;

import javax.persistence.*;

@Table(name = "license")
@Entity(name = "license")
public class LicenseEntity {
    @Id
    @SequenceGenerator(name = "seq_licenses", allocationSize = 1)
    @GeneratedValue(generator = "seq_licenses",strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name", length = 250,nullable = false)
    private String name;

    @Override
    public String toString() {
        return "LicenseEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public LicenseEntity() {
    }

    public LicenseEntity(int id) {
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
