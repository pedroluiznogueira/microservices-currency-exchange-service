package com.github.pedroluiznogueira.microservices.currencyexchangeservice.controller;

import com.github.pedroluiznogueira.microservices.currencyexchangeservice.model.CurrencyExchange;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {

    @GetMapping("currency-exchange/from/{USD}/to/{INR}")
    public String retrieveExchangeValue(@PathVariable ("USD") String usd, @PathVariable ("INR") String inr) {
        return "usd: " + usd + " " + "inr: " + inr;
    }
}
