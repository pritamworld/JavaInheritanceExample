package com.pritesh;

import com.pritesh.college.Faculty;
import com.pritesh.college.Student;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Day5InheritanceExample
{
    public static void main(String[] args)
    {
        Student s1 = new Student();

        SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        String dateInString = "24-01-1984 10:25:56";

        try {
            Date s1BirthDate = sdf.parse(dateInString);
            s1.setBirthDate(s1BirthDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }


        Faculty f1 = new Faculty();


    }
}
