package com.alicemlima.pomogame.model.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Task {

    public Task() {
    }

    public Task(String name, int qttPomodoros) {
        this.name = name;
        this.qttPomodoros = qttPomodoros;
    }
    public Task(String name, int qttPomodoros, int cpdPomodoros) {
        this.name = name;
        this.qttPomodoros = qttPomodoros;
        this.cpdPomodoros = cpdPomodoros;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int qttPomodoros;
    private int cpdPomodoros;

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

    public int getQttPomodoros() {
        return qttPomodoros;
    }

    public void setQttPomodoros(int qttPomodoros) {
        this.qttPomodoros = qttPomodoros;
    }

    public int getCpdPomodoros() {
        return cpdPomodoros;
    }

    public void setCpdPomodoros(int cpdPomodoros) {
        this.cpdPomodoros = cpdPomodoros;
    }
}
