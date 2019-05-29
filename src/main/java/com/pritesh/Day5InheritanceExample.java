package com.pritesh;

import com.pritesh.college.Faculty;
import com.pritesh.college.Person;
import com.pritesh.college.Student;
import com.pritesh.hardware.Desktop;
import com.pritesh.other.IDisplay;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Day5InheritanceExample
{

    int y;
    static int p;
    static int q;

    {

        y =100;

        int a = 200;

        //static int l = 300;

        System.out.println("Hello Block - 1");
    }

    {
        System.out.println("Hello Block - 2");
    }


    static {
        p = 1000;

        //y = 3000;

        q = 100;
        System.out.println("Hello Static Block");


    }

    public static void main(String[] args)
    {
        Student s1 = new Student();
        Desktop d1=new Desktop();
        Desktop d2=new Desktop("Keyboard","Screen");

        Student.count++;

        s1.count++;

        Day5InheritanceExample d = new Day5InheritanceExample();



        //Reference : https://www.mkyong.com/java/java-date-and-calendar-examples/
        SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        String dateInString = "24-01-1984 10:25:56";

        try {
            Date s1BirthDate = sdf.parse(dateInString);
            s1.setBirthDate(s1BirthDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }


        Faculty f1 = new Faculty();

        //IDisplay i = new IDisplay() ;
        //Person p = new Person();


    }
}
