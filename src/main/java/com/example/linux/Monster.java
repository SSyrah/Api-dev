package com.example.linux;


public class Monster {
    private String mName;
    private int mAge;
    private boolean mScary;

    public Monster(String mName, int mAge, boolean mScary) {
        this.mName = mName;
        this.mAge = mAge;
        this.mScary = mScary;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public int getmAge() {
        return mAge;
    }

    public void setmAge(int mAge) {
        this.mAge = mAge;
    }

    public boolean ismScary() {
        return mScary;
    }

    public void setmScary(boolean mScary) {
        this.mScary = mScary;
    }
}

