package br.com.efood.application.domain;

import org.apache.commons.lang3.StringUtils;

public enum Category {

    SNACK,
    SIDE,
    DRINK,
    DESSERT;

    public static Category getCategoryByName(String category) {
        return Category.valueOf(StringUtils.upperCase(category));
    }
}
