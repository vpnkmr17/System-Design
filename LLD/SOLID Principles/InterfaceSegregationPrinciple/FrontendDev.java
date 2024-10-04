package InterfaceSegregationPrinciple;

import LspPrinciple.lspPrinciple.InvalidOperationException;

public class FrontendDev implements FrontendDeveloper{
    public void doCoding() {
        System.out.println("Doing coding...");
    }

    public void fixBug() {
        System.err.println("Damnn...Fixing bug!");
    }

    public void designUI() {
        System.out.println("Designing UI for better user experience!");
    }
}
