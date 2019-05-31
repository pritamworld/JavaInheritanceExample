package com.pritesh;

import com.pritesh.college.Faculty;
import com.pritesh.college.Person;
import com.pritesh.college.Student;
import com.pritesh.hardware.Desktop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

enum StudentType
{
    ADULT, STUDENT
}

public class Day5InheritanceExample {

    static int p;
    static int q;

    StudentType passType;

    static {
        p = 1000;

        //y = 3000;

        q = 100;
        System.out.println("Hello Static Block");


    }

    int y;

    {

        y = 100;

        int a = 200;

        //static int l = 300;

        System.out.println("Hello Block - 1");
    }

    {
        System.out.println("Hello Block - 2");
    }

    public static void main(String[] args) {

        /*
        Student s1 = new Student();
        Desktop d1 = new Desktop();
        Desktop d2 = new Desktop("Keyboard", "Screen");

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
    */

        Person p;
        Student s1 = new Student();
        Desktop d1 = new Desktop();

        p = s1;

        //p.display();

        //p.print();

        if(p instanceof Student)
        {
            Student s = (Student)p;

        }else if(p instanceof Faculty)
        {
            Faculty f = (Faculty)p;
        }


        //List<String>strings = new ArrayList<>();

        ArrayList<String>stringArrayList = new ArrayList<>();
        stringArrayList.add("India");
        stringArrayList.add("China");
        stringArrayList.add("India");

        System.out.println(stringArrayList.size());
        System.out.println(stringArrayList.contains("UK"));
        System.out.println(stringArrayList.contains("India"));
        System.out.println(stringArrayList.isEmpty());

        stringArrayList.add(2, "Canada");

        for(String s : stringArrayList) {
           System.out.println(s);
        }

        stringArrayList.get(2);

        stringArrayList.indexOf("India");

        stringArrayList.lastIndexOf("India");

        System.out.println("SET Example");

        Set<String>stringSet = new HashSet<>();

        stringSet.add("India");
        stringSet.add("China");
        stringSet.add("India");

        for(String s: stringSet)
        {
            System.out.println(s);
        }


        /*
        Integer x = 100;
        Integer y = new Integer(100);

        int z  = x;
        int aa = y.intValue();
         */



    }
}
