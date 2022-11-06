package com.teresa.assignment;


public class Doctor extends HospitalEmployee{
    protected String imp;
    
    public Doctor(String name, int number, String imp)
    {
        super(name,number);
        this.imp = imp;
    }
    
    // constructor without parameter
    public Doctor()
    {
        
    }
    
    // Getter - imp Method 
    public String getimp()
    {
        return imp;
    }
    
    // Setter - imp Method 
    public void setimp(String imp)
    {
        this.imp = imp;
    }
    
    // Overriding the toString method with imp variable
    @Override
    public String toString()
    {
        return(name+" "+number+" "+imp);
    }
    
    @Override
     public void work()
    {
        System.out.println(name+ " works for the hospital. "+name+" is a(n) " +imp+" doctor.");
    }
}