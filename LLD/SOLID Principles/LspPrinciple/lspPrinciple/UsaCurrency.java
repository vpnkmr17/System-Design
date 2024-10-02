package lspPrinciple;
public class UsaCurrency extends PrintableCurrency {

    public UsaCurrency() {
        super("Dollar", "USA", "$");
    }

    @Override
    public Double convertCurrency(Double amount) {
        // logic to convert currency to usa dollars
        return 0.0;
    }

    @Override
    public void printCurrency() {
        // logic to print usa currency
        System.out.println("Printing USA currency");
    }
}
