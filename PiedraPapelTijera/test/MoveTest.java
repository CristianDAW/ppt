/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cristianelx
 */
public class MoveTest {
    
    public MoveTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getMove method, of class Move.
     */
    @Test
    public void testGetMove() {
        System.out.println("getMove");
        Move instance = new Move();
        String expResult = "";
        String result = instance.getMove();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isUnknown method, of class Move.
     */
    @Test
    public void testIsUnknown() {
        System.out.println("isUnknown");
        Move instance = new Move();
        boolean expResult = false;
        boolean result = instance.isUnknown();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of beats method, of class Move.
     */
    @Test
    public void testBeats() {
        System.out.println("beats");
        Move other = null;
        Move instance = new Move();
        int expResult = 0;
        int result = instance.beats(other);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
