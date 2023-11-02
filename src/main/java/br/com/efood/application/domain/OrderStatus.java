package br.com.efood.application.domain;

import org.apache.commons.lang3.StringUtils;

public enum OrderStatus {

    RECEIVED,
    ONGOING,
    READY,
    FINISHED;

    public static OrderStatus getOrderStatusByName(String orderStatus) {
        return OrderStatus.valueOf(StringUtils.upperCase(orderStatus));
    }
}
