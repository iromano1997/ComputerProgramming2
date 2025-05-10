## MotorPH Simple Payroll System

This Java code implements a basic payroll system with the following functionalities:

* **Employee Information:** Displays details of an employee given their employee number.
* **Hours Worked:** Calculates and displays the total hours worked by an employee within a specified date range, based on attendance records.
* **Gross Salary:** Computes the gross salary of an employee based on their hourly rate and the total hours worked within a specified date range.
* **Net Salary:** Calculates the net salary of an employee after deducting SSS, PhilHealth, Pag-IBIG contributions, and withholding tax based on their basic monthly salary.

Files:

The application reads data from the following CSV files:

* `motorph_employee_data_complete.csv`: Contains employee information such as employee number, full name, birthday, basic salary, and hourly rate.
* `attendance_record.csv`: Contains employee attendance records including employee number, date, log-in time, and log-out time.

Features:

* **Deduction Calculation:** Includes classes for calculating SSS, PhilHealth, and Pag-IBIG deductions based on predefined rules.
* **Payroll Calculation:** Computes total deductions, taxable income, withholding tax, gross salary, and net salary.
* **Attendance Management:** Reads and processes employee attendance records to calculate hours worked.
* **Menu-Driven Interface:** Provides a simple text-based menu for users to interact with the system.
* **Data Loading:** Reads employee and attendance data from CSV files.