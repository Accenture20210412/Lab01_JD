package lab1_JD.trip;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

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
                "insurancePrice=" + getPrice() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbroadTrip)) return false;
        if (!super.equals(o)) return false;

        AbroadTrip that = (AbroadTrip) o;

        return Objects.equals(insurancePrice, that.insurancePrice);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (insurancePrice != null ? insurancePrice.hashCode() : 0);
        return result;
    }

    @Override
    public BigDecimal getPrice() {
        BigDecimal priceWithInsurance = super.getPrice().add(insurancePrice);
        return priceWithInsurance;
    }
}
