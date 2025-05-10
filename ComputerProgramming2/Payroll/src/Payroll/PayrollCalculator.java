package Payroll;

import java.util.ArrayList;
import java.util.List;

class PayrollCalculator {
    private List<Deduction> deductions; 

    // Initialize with standard deductions
    public PayrollCalculator() {
        deductions = new ArrayList<>();   // Create list
        deductions.add(new SSSDeduction());   // Add SSS
        deductions.add(new PhilHealthDeduction());  // Add PhilHealth
        deductions.add(new PagIBIGDeduction());  // Add Pag-IBIG
    }

    // Getter for the deductions list
    public List<Deduction> getDeductions() {
        // Returning a new ArrayList to prevent external modification
        return new ArrayList<>(deductions);
    }

    // Setter for the deductions list
    public void setDeductions(List<Deduction> deductions) {
        // Creating a new ArrayList to avoid external modification of the internal list
        this.deductions = new ArrayList<>(deductions);
    }

    // Calculate total deductions
    public double calculateTotalDeductions(double basicSalary) {
        return deductions.stream()   // Create stream
                .mapToDouble(d -> d.calculate(basicSalary))   // Calculate each
                .sum();   // Sum all deductions
    }

    // Calculate withholding tax
    public static double calculateWithholdingTax(double taxableIncome) {
        if (taxableIncome <= 20832) return 0.0;                       // Tax exempt
        if (taxableIncome <= 33333) return (taxableIncome - 20833) * 0.20; // 20% bracket
        if (taxableIncome <= 66667) return 2500 + (taxableIncome - 33333) * 0.25; // 25%
        if (taxableIncome <= 166667) return 10833 + (taxableIncome - 66667) * 0.30; // 30%
        if (taxableIncome <= 666667) return 40833.33 + (taxableIncome - 166667) * 0.32; // 32%
        return 200833.33 + (taxableIncome - 666667) * 0.35;                   // 35% bracket
    }
}