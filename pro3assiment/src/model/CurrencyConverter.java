package model;

public class CurrencyConverter {
    private double dollarToShekelRate = 3.64;

    public double convertToShekels(double dollars) {
        return dollars * dollarToShekelRate;
    }

    public double convertToDollars(double shekels) {
        return shekels / dollarToShekelRate;
    }
}
