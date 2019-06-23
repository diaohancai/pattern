package com.hancai.pattern.behavioral.template;

import org.junit.Test;

/**
 * @author diaohancai
 */
public class TemplateTest {

    @Test
    public void testTemplate() {
        Fridge fruitsFridge = new FruitsFridge();
        fruitsFridge.fridgeOperation();

        Fridge vegetablesFridge = new VegetablesFridge();
        vegetablesFridge.fridgeOperation();
    }

}
