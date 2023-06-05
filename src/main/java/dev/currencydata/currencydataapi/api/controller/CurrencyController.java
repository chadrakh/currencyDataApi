package dev.currencydata.currencydataapi.api.controller;

import dev.currencydata.currencydataapi.api.model.Currency;
import dev.currencydata.currencydataapi.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyController {

    private final CurrencyService currencyService;

    @Autowired
    public CurrencyController(CurrencyService currencyService){
        this.currencyService = currencyService;
    }

    @GetMapping("/")
    public String printString(){
        return "Currency Data API";
    }

    @GetMapping("/currencies")
    public void getCurrencies(){

    }
}
