package InterfaceSegregationPrinciple;

import lspPrinciple.InvalidOperationException;

public class BackendDev implements BackendDeveloper{

    public void doCoding() {
        System.out.println("Coding backend...stuck in database configuration!");
    }

    public void fixBug() {
        System.out.println("Dammnn..It's friday but got bug!");
    }

    public void connectDB() {
        System.out.println("Let's connect DB!");
    }
}
