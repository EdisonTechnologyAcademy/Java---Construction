package com.edison;

public class Student {
    private String stdName;
    private int stdRollNo;
    private int stdId;

    public String getStdName()
    {
        return this.stdName;
    }

    public int getStdRollNo()
    {
        return this.stdRollNo;
    }

    public int getStdId()
    {
        return this.stdId;
    }

    public void setStdName(String name)
    {
        this.stdName = name;
    }

    public void setStdRollNo(int rollNo)
    {
        this.stdRollNo = rollNo;
    }

    public void setId(int id)
    {
        this.stdId = id;
    }
}