package com.hancai.pattern.structural.facade;

import com.hancai.pattern.PatternApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author diaohancai
 */
public class FacadeTest extends PatternApplicationTests {

    @Autowired
    private ComputerFacade computerFacade;

    @Test
    public void testFacade() {
        computerFacade.startup();

        computerFacade.shutdown();
    }

}
