package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get a reference to the GUI
        TextView main = (TextView) findViewById(R.id.TextView_Main);

        //code we are interested in PART 1
        Student studentOne = new Student("David", 67, 0),
                studentTwo = new Student("Victoria", 85, 0);
        studentOne.setAge(23);
        studentTwo.setAge(22);
        main.setText(studentOne.getName() + " scored " + studentOne.getMark() + " marks " + studentOne.getAge() + " years old\n");
        main.append(studentTwo.getName() + " scored " + studentTwo.getMark() + " marks " + studentTwo.getAge() + " years old\n");
        studentOne.setMark(99);
        main.append(studentOne.getName() + " scored " + studentOne.getMark() + " marks " + studentOne.getAge() + " years old");

        /*code we are interested in PART 2
        main.setText("");
        int[] marks = {56, 72, 19, 65};

        int total = 0;

        for (int m : marks) {
            main.append(m + "\n");
            total += m;
        }
        main.append("Total is " + total);
        main.append("\nAverage is " + total / marks.length);

        String[] names = {"Karina", "Giselle", "Winter", "Ningning"};
        for (int i = 0; i < names.length; i++) {
            main.append("\n" + names[i] + ": " + marks[i]);
        }*/
    }
}