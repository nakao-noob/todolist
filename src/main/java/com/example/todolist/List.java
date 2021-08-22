package com.example.todolist;


import javax.persistence.*;

@Entity
@Table(name = "list")
public class List {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int id;


    @Column
    private String text;

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText() {
        this.text = text;
    }
}
