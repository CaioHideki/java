package com.CaioHideki.todolistapi.models;


import java.util.Date;
import java.util.UUID;

public class Task {
    private UUID id;
    private String title;
    private Date date;
    private String description;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public Task(String title, Date date, String description) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.date = date;
        this.description = description;
    }
}
