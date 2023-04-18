package behavioral.TemplateMethod;

public class EmployeeCLT extends Employee {
    @Override
    double calcDiscountSocialSecurity() {
        return 15;
    }

    @Override
    double calcDiscountSHealthPlan() {
        return 10;
    }
}
