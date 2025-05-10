package Payroll;

class PagIBIGDeduction extends Deduction {
    // Constructor sets name to "Pag-IBIG"
    public PagIBIGDeduction() {
        super("Pag-IBIG");  // Call parent constructor
    }

    // Getter method for the name (inherited from Deduction)
    public String getName() {
        return super.getName();
    }

    // Setter method for the name (inherited from Deduction)
    public void setName(String name) {
        super.setName(name);
    }

    // Calculate Pag-IBIG contribution
    @Override
    public double calculate(double basicSalary) {
        if (basicSalary >= 1000 && basicSalary <= 1500)
            return basicSalary * 0.01;  // 1% for lower bracket
        if (basicSalary > 1500)
            return basicSalary * 0.02;  // 2% for higher bracket
        return 0.0;                    // No contribution
    }
}