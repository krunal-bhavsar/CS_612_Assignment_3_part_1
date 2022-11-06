package com.teresa.assignment;
public class Surgeon extends Doctor{
    private boolean operating;
    
    public Surgeon(String name, int number,String imp, boolean operating)
    {
        super(name,number,imp);
        this.operating = operating;
    }
    
    // constructor without parameter
    public Surgeon()
    {
        
    }
    
    // Method - Getter
    public boolean getOperating()
    {
        return operating;
    }
    
    // Method - setter 
    public void setOperating(boolean operating)
    {
        this.operating = operating;
    }
    
    @Override
    public String toString()
    {
        return(name+" "+number+" "+imp+" Operating : "+operating);
    }
    
    @Override
    public void work()
    {
        if(operating==true)
        {
            System.out.println(name+ " works for the hospital. "+name+" is operating now.");
        }
        else
        {
            System.out.println(name+ " works for the hospital. "+name+" is not operating now.");
        }
    }
}
