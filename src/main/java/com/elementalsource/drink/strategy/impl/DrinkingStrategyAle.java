package com.elementalsource.drink.strategy.impl;

import com.elementalsource.drink.strategy.DrinkingStrategy;
import org.springframework.stereotype.Component;

@Component
public class DrinkingStrategyAle implements DrinkingStrategy {

    public String toTaste() {
        return "Drinking ale";
    }
}
