package com.ecolife.model;

/**
 * General Data Model
 */
public class ItemGeneral {

    private String title;

    public ItemGeneral(String title) {
        this.title = title;
    }

    public String getTitle() { return this.title; }

    public void setTitle(String newTitle) { this.title = newTitle; }

}