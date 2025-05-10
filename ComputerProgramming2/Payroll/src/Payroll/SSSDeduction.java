package Payroll;

class SSSDeduction extends Deduction {
    private double sssRate; // Example attribute for SSS rate

    // Constructor sets name to "SSS" and initializes the SSS rate
    public SSSDeduction(double sssRate) {
        super("SSS");         // Call parent constructor
        this.sssRate = sssRate;
    }

    // Default constructor with a default SSS rate
    public SSSDeduction() {
        super("SSS");
        this.sssRate = 0.045; // Example default SSS rate (4.5%)
    }

    // Getter for the sssRate attribute
    public double getSssRate() {
        return sssRate;
    }

    // Setter for the sssRate attribute
    public void setSssRate(double sssRate) {
        this.sssRate = sssRate;
    }

    // Calculate SSS contribution (now potentially using the sssRate, though the logic here is based on salary brackets)
    @Override
    public double calculate(double basicSalary) {
        if (basicSalary < 3250) return 135.0;          // Minimum bracket
        if (basicSalary >= 24750) return 1125.0;         // Maximum bracket
        double steps = Math.floor((basicSalary - 3250) / 500);    // Calculate steps
        return 135.0 + (steps + 1) * 22.50;            // Return calculated amount
        // Note: The current calculation doesn't directly use sssRate.
        // You might want to adjust the calculation logic if the rate should be applied differently.
    }
}