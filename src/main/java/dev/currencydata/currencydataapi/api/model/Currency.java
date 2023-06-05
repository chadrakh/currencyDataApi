package dev.currencydata.currencydataapi.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Currency {

    @Id
    private String currencyCode;

    private String currency;

    private double rate;

    public Currency(String currencyCode, String currency, double rate) {
        this.currencyCode = currencyCode;
        this.currency = currency;
        this.rate = rate;
    }

    public Currency() {

    }

    public String getCurrency() {
        return currency;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}