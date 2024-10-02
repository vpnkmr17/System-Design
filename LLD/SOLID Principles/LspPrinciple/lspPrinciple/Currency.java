package lspPrinciple;

public class Currency {
    private String currencyType;
    private String currencyOrigin;
    private String currencySymbol;

    public Currency(String currencyType, String currencyOrigin, String currencySymbol) {
        this.currencyType = currencyType;
        this.currencySymbol = currencySymbol;
        this.currencyOrigin = currencyOrigin;
    }

    public Double convertCurrency(Double amount) {
        // logic to convert currency to other currency
        return 0.0;
    }
}