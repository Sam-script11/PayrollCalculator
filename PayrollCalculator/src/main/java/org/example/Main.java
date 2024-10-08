package org.example;

import com.pluralsight.Employee;

import java.io.*;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        try{
            Employee employee = new Employee("Dana",10,15.5f,25.6f);
            FileReader fileReader = new FileReader("src/main/resources/employees.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String input;

            Employee.grossPay(5f,15);





            while ((input = bufferedReader.readLine()) != null) {
               String [] data = input.split(Pattern.quote("|"));





            }

            bufferedReader.close();


        }catch (IOException e){
            e.printStackTrace();
        }




    }
}