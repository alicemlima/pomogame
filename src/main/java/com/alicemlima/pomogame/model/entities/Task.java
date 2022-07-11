package com.alicemlima.pomogame.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Task {

    public Task() {
    }

    public Task(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int qtPomodoros;

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

    public int getQtPomodoros() {
        return qtPomodoros;
    }

    public void setQtPomodoros(int qtPomodoros) {
        this.qtPomodoros = qtPomodoros;
    }
}
