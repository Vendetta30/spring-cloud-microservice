package com.microservice.currencyconversion

class CurrencyConversionBean {
    Long id
    String from
    String to
    BigDecimal conversionMultiple
    BigDecimal quantity
    BigDecimal totalCalculatedAmount
    int port

    public CurrencyConversionBean() {

    }

    public CurrencyConversionBean(Long id, String from, String to, BigDecimal conversionMultiple, BigDecimal quantity, BigDecimal totalCalculatedAmount, int port) {
        super()
        this.id = id
        this.from = from
        this.to = to
        this.conversionMultiple = conversionMultiple
        this.quantity = quantity
        this.totalCalculatedAmount = totalCalculatedAmount
        this.port = port
    }
}