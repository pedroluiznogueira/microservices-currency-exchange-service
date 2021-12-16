package com.github.pedroluiznogueira.microservices.currencyexchangeservice.controller;

import com.github.pedroluiznogueira.microservices.currencyexchangeservice.model.CurrencyExchange;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyExchangeController {

    @GetMapping("currency-exchange/from/{from}/to/{to}")
    public CurrencyExchange retrieveExchangeValue(@PathVariable ("from") String from, @PathVariable ("to") String to) {
        return new CurrencyExchange(1000L, from, to, BigDecimal.valueOf(50));
    }
}
