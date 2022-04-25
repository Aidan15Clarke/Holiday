package org.vashonsd;

import java.time.LocalDateTime;

public class Holiday {
    private int month;
    private int date;
    private String name;
    private String description;
    private boolean isFederallyRecognized;

    public Holiday(int month) {
        this.month = month;
    }

    public Holiday(int month, int date) {
        this.month = month;
        this.date = date;
    }

    public Holiday(int month, int date, String name) {
        this.month = month;
        this.date = date;
        this.name = name;
    }

    public Holiday(int month, int date, String name, String description) {
        this.month = month;
        this.date = date;
        this.name = name;
        this.description = description;
    }

    public Holiday(int month, int date, String name, String description, boolean isFederallyRecognized){
        this.month = month;
        this.date = date;
        this.name = name;
        this.description = description;
        this.isFederallyRecognized = isFederallyRecognized;
    }

    public boolean isToday(){
        LocalDateTime now = LocalDateTime.now();
        return now.getMonthValue() == month && now.getDayOfMonth() == date;
    }

    public void celebrate(){
        System.out.println("Yay! Today is: " + name);
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isFederallyRecognized() {
        return isFederallyRecognized;
    }

    public void setFederallyRecognized(boolean federallyRecognized) {
        isFederallyRecognized = federallyRecognized;
    }
}
