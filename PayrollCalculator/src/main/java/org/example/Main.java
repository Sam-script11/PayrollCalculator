package org.example;

import com.pluralsight.Employee;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        try{
            Scanner keyboard = new Scanner(System.in);

            System.out.println("Enter the name of the file employee file to process:");
            String fileToprocess = keyboard.next();


            System.out.println("Enter the name of the payroll file to create:");
            String Payroll = keyboard.next();



            FileReader fileReader = new FileReader("src/main/resources/employees.csv");
            FileWriter fileWriter= new FileWriter(Payroll);
           BufferedWriter writer = new BufferedWriter(fileWriter);
           BufferedReader bufferedReader = new BufferedReader(fileReader);

           // FileWriter(fileToprocess);
            //BufferedWriter(payroll);

            // create a BufferedReader to manage input stream
//            BufferedReader bufReader = new BufferedReader(fileReader);
            String input= "";
            int count = 0;

            // read until there is no more data
            while((input = bufferedReader.readLine()) != null) {


                String[] lineSplit = input.split(Pattern.quote("|"));
            if(lineSplit[0].startsWith("id")){
                continue;
            }
            Employee em = new Employee(lineSplit[1], Integer.parseInt(lineSplit[0]), Double.parseDouble(lineSplit[2]), Double.parseDouble(lineSplit[3]));

            Employee employee =  new Employee(em.getName(), em.getEmployeeID(), em.getHoursWorked(), em.getPayRate());
            //for(Employee emp : employees) {
                input= String.format("EmployeeID: %d Employee Name: %s Gross Pay: $%.2f \n ", em.getEmployeeID(), em.getName(), em.getGrossPay());
                writer.write(input);

           // }

            // close the stream and release the resources

            }
            writer.close();
            bufferedReader.close();
        } catch(IOException e) {
            e.printStackTrace();
        }

    }
}
