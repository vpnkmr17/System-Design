package lspPrinciple;
public class IndianCurrency extends PrintableCurrency {
    
    public IndianCurrency() {
        super("Rupee", "India", "₹");
    }

    @Override
    public Double convertCurrency(Double amount) {
        // logic to convert currency to indian rupees
        return 0.0;
    }

    @Override
    public void printCurrency() {
        // logic to print indian currency
        System.out.println("Printing indian currency");
    }
}
