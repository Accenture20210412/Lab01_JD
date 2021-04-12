package lab1_JD.trip;

import java.math.BigDecimal;
import java.time.LocalDate;

public class AbroadTrip extends Trip {

    private BigDecimal insurancePrice;

    public AbroadTrip(LocalDate startDate, LocalDate endDate, String destiny, BigDecimal price, BigDecimal insurancePrice) {
        super(startDate, endDate, destiny, price);
        this.insurancePrice = insurancePrice;
    }

    public AbroadTrip(BigDecimal insurancePrice) {
        this.insurancePrice = insurancePrice;
    }


    public BigDecimal getInsurancePrice() {
        return insurancePrice;
    }


    @Override
    public String toString() {
        return "AbroadTrip{" +
                "insurancePrice=" + insurancePrice +
                '}';
    }

    @Override
    public BigDecimal getPrice() {
        BigDecimal price = super.getPrice();
        BigDecimal insurance = getInsurancePrice();
        BigDecimal priceWithInsurance = price.add(insurance);
        return priceWithInsurance;
    }
}