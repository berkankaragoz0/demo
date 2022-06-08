package com.example.demoproject1.entity;

import javax.persistence.*;

@Table(name = "content")
@Entity(name = "content")
public class ContentEntity {

    @Id
    @SequenceGenerator(name = "seq_contents", allocationSize = 1)
    @GeneratedValue(generator = "seq_contents",strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name", length = 250,nullable = false)
    private String name;

    @Override
    public String toString() {
        return "ContentEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public ContentEntity() {
    }

    public ContentEntity(int id) {
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
