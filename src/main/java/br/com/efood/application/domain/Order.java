package br.com.efood.application.domain;

import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Getter
public class Order {

    private Long orderId;

    private OrderStatus orderStatus;

    private List<OrderItem> orderItemList;

    private BigDecimal price;

    private LocalDateTime orderStartTime;

    private LocalDateTime orderEndTime;

    public Order(String s, List<Long> products) {

    }


    public void addOrderItem(Long product){
        this.orderItemList.add(new OrderItem(product));
    }

}
