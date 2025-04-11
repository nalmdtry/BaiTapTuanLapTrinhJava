package bai7_1;

public class Visit {
    private Customer customer;
    private double serviceExpense;
    private double productExpense;

    public Visit(Customer customer, double serviceExpense, double productExpense) {
        this.customer = customer;
        this.serviceExpense = serviceExpense;
        this.productExpense = productExpense;
    }

    public double getTotalExpense() {
        String membership = customer.getMembership();
        if (membership == null) membership = "None"; // Tránh null

        double serviceDiscount = serviceExpense * DiscountRate.getServiceDiscountRate(membership);
        double productDiscount = productExpense * DiscountRate.getProductDiscountRate();

        return (serviceExpense - serviceDiscount) + (productExpense - productDiscount);
    }

    @Override
    public String toString() {
        return "Visit{customer=" + customer + ", serviceExpense=" + serviceExpense + ", productExpense=" + productExpense + "}";
    }
}


