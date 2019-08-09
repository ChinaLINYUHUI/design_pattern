package com.pattern.factoryMethod;

import com.pattern.simpleFactory.ConcreteProduct2;
import com.pattern.simpleFactory.Product;

public class ConcreteFactory2 extends Factory {
    public Product factoryMethod() {
        return new ConcreteProduct2();
    }
}
