package com.alicemlima.pomogame.model.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Task {

    public Task() {
    }

    public Task(String name, int qtdPomodoros) {
        this.name = name;
        this.qtdPomodoros = qtdPomodoros;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int qtdPomodoros;

    protected int getId() {
        return id;
    }

    protected void setId(int id) {
        this.id = id;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected int getQtdPomodoros() {
        return qtdPomodoros;
    }

    protected void setQtdPomodoros(int qtdPomodoros) {
        this.qtdPomodoros = qtdPomodoros;
    }

    public int timeComplete(){
        if (getQtdPomodoros() > 0){
            setQtdPomodoros(getQtdPomodoros() - 1);
            return getQtdPomodoros();
        }
        else {
            return 0;
        }
    }


}
