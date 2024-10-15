package Segregation_Principle;

public class SimplePrinter implements Printer {

    @Override
    public void print(String document) {
        System.out.println("Printing document: " + document);
    }
}