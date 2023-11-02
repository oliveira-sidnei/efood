package br.com.efood.adapters.persistence.entity;

import br.com.efood.application.domain.Order;
import br.com.efood.application.domain.OrderStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@NoArgsConstructor
@Entity
@Table(name = "order")
@Getter
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long orderId;

    @Column(name = "order_status")
    private OrderStatus orderStatus;

    private BigDecimal price;

    @Column(name = "start_time")
    private LocalDateTime orderStartTime;

    @Column(name = "end_time")
    private LocalDateTime orderEndTime;


    public OrderEntity(Order domainObject) {
        this.orderStatus = domainObject.getOrderStatus();
        this.price = domainObject.getPrice();
        this.orderStartTime = domainObject.getOrderStartTime();
        this.orderEndTime = domainObject.getOrderEndTime();
    }
}
