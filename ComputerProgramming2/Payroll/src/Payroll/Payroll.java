package Payroll;

import java.io.IOException;       
import java.util.*;                 

public class Payroll {
    public static void main(String[] args) {
        try {
            // Load data
            Map<String, Employee> employees = DataLoader.loadEmployees("C:\\Users\\Sid\\Desktop\\Java\\ComputerProgramming2\\Payroll\\src\\motorph_employee_data_complete.csv");
            AttendanceRecord attendance = new AttendanceRecord();
            DataLoader.loadAttendance(attendance, "C:\\Users\\Sid\\Desktop\\Java\\ComputerProgramming2\\Payroll\\src\\attendance_record.csv");

            // Start application
            new Menu(employees, attendance).showMenu();
        } catch (IOException e) {
            System.err.println("Error loading data: " + e.getMessage());  // Handle file errors
        }
    }
}