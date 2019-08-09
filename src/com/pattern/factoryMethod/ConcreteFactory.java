package com.pattern.factoryMethod;

import com.pattern.simpleFactory.ConcreteProduct;
import com.pattern.simpleFactory.Product;

public class ConcreteFactory extends Factory {
    public Product factoryMethod() {
        return new ConcreteProduct();
    }
}
