package lspPrinciple;
public class BitcoinCurrency extends Currency {
    public BitcoinCurrency() {
        super("Digital", "Digital", "₿");
    }

    @Override
    public Double convertCurrency(Double amount) {
        // logic to convert currency to bitcoin currency
        return 0.0;
    }
}
