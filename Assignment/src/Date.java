import java.io.*;
import java.util.*;
class Date
 {
    int startDate;
    int endDate;
    int dateofBirth;
     Date()
    {
    	this.startDate=1/1/2017;
    	this.endDate=1/1/2018;
    	this.dateofBirth=13/05/2000;
    }

    Date( int startDate,int endDate ,int dateofBirth)
    {
    	this.startDate=startDate;
    	this.endDate=endDate;
    	this.dateofBirth=dateofBirth;
    }
    public void setStartdate (int startDate) 
    {
        startDate =  startDate;
    }
     
    public int getStartdate() 
    {
        return  startDate;
    }

    public void setEnddate (int  endDate)
    {
        endDate =  endDate;
    }
     
    public int getEnddate()
    {
        return endDate;
    }
     
    public void setDOB(int dateofBirth )
    {
        dateofBirth = dateofBirth;
    }
     
    public int getDOB() 
    {
        return dateofBirth;
    }
     
    public void displayDate ()
    {
        System.out.println ("All the dates related to students are \n" +"Startdate of the project  " + startDate +" Finish Date of the project = " +
          endDate +"Date of Birth of the student is =" + dateofBirth);
    }
 
}