package behavioral.TemplateMethod;

abstract public class Employee {
    private double salary = 1500;

    abstract double calcDiscountSocialSecurity();
    abstract double calcDiscountSHealthPlan();

    public double calcSalary() {
        double socialSecurity = this.calcDiscountSocialSecurity();
        double healthPlan = this.calcDiscountSHealthPlan();

        return this.salary - socialSecurity - healthPlan;
    }
}
