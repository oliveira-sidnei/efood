package br.com.efood.adapters.web;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class OrderDTO {

    private String orderStatus;

    private BigDecimal price;

    private LocalDateTime orderStartTime;

    private LocalDateTime orderEndTime;


    public OrderDTO(String orderStatus, BigDecimal price, LocalDateTime orderStartTime, LocalDateTime orderEndTime) {
        this.orderStatus = orderStatus;
        this.price = price;
        this.orderStartTime = orderStartTime;
        this.orderEndTime = orderEndTime;
    }
}
