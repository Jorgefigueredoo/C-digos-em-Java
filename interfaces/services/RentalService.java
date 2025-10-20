package interfaces.services;

import interfaces.entities.CarRental;
import interfaces.entities.Invoice;

public class RentalService {

    private double pricePerDay;
    private double pricePerHour;

    private BrazilTaxService taxService;

    public RentalService(double procePerDay, double procePerHour, BrazilTaxService taxService) {
        this.pricePerDay = procePerDay;
        this.pricePerHour = procePerHour;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental) {

        carRental.setInvoice(new Invoice(50.0, 10.0));
    }

}
