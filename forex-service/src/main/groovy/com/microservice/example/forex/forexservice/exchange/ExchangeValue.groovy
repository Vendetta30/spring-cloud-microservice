package com.microservice.example.forex.forexservice.exchange

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity
public class ExchangeValue {
    @Id
    Long id
    @Column(name = "currency_from")
    String from
    @Column(name = "currency_to")
    String to
    BigDecimal conversionMultiple
    int port

    public ExchangeValue() {

    }

    public ExchangeValue(Long id, String from, String to, BigDecimal conversionMultiple) {
        super()
        this.id = id
        this.from = from
        this.to = to
        this.conversionMultiple = conversionMultiple
    }
}