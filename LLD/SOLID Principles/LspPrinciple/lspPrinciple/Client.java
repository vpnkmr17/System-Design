package lspPrinciple;
import java.util.*;
public class Client {
    public static void main(String[] args) {
        List<PrintableCurrency> currLst = new ArrayList<PrintableCurrency>();
        IndianCurrency indCurr = new IndianCurrency();
        UsaCurrency usaCurr = new UsaCurrency();
        // BitcoinCurrency bitCoinCurr = new BitcoinCurrency();
        currLst.add(indCurr);
        currLst.add(usaCurr);
        // currLst.add(bitCoinCurr);
        for(PrintableCurrency currencyObj : currLst) {
            currencyObj.printCurrency();
        }
    
    }
}
