package Payroll;

class PhilHealthDeduction extends Deduction {
    private double contributionRate;

    // Default Constructor sets name to "PhilHealth" and a default rate
    public PhilHealthDeduction() {
        super("PhilHealth");
        this.contributionRate = 0.015; // Default to 1.5%
    }

    // Constructor that allows setting a custom contribution rate
    public PhilHealthDeduction(double contributionRate) {
        super("PhilHealth");
        this.contributionRate = contributionRate;
    }

    // Getter for the contributionRate
    public double getContributionRate() {
        return contributionRate;
    }

    // Setter for the contributionRate
    public void setContributionRate(double contributionRate) {
        this.contributionRate = contributionRate;
    }

    // Calculate PhilHealth contribution
    @Override
    public double calculate(double basicSalary) {
        if (basicSalary <= 10000) return 150.0; // Fixed rate
        if (basicSalary < 60000) return basicSalary * this.contributionRate; // Use the class's rate
        return 900.0; // Maximum contribution
    }
}