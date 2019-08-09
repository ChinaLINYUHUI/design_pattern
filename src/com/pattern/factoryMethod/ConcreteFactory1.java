package com.pattern.factoryMethod;

import com.pattern.simpleFactory.ConcreteProduct1;
import com.pattern.simpleFactory.Product;

public class ConcreteFactory1 extends Factory {
    public Product factoryMethod() {
        return new ConcreteProduct1();
    }
}
