package com.teresa.assignment;

public class HospitalEmployee {
    protected String name;
    protected int  number;
    
    public HospitalEmployee()
    {
    }
    
    public HospitalEmployee(String name, int number)
    {
        this.name = name;
        this.number = number;
    }
    
    // Name Method - Getter
    public String getName()
    {
        return name;
    }
    
    // Name Method - Setter
    public void setName(String name)
    {
        this.name = name;
    }
    
    // Number Method - Getter
    public int getNumber()
    {
        return number;
    }
    
    // Number Method - Setter
    public void setNumber(int number)
    {
        this.number = number;
    }
    
    // toString Method
    @Override
    public String toString()
    {
        return(name+" "+number);
    }
    
    public void work()
    {
        System.out.println(name+ " works for the hospital.");
    }
}