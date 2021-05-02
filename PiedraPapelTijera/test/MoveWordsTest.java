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
public class MoveWordsTest {
    
    public MoveWordsTest() {
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
     * Test of isValidMoveCommand method, of class MoveWords.
     */
    @Test
    public void testIsValidMoveCommand() {
        System.out.println("isValidMoveCommand");
        String value = "TIJERAS";
        MoveWords instance = new MoveWords();
        boolean expResult = true;
        boolean result = instance.isValidMoveCommand(value);
        assertEquals(expResult, result);
        
    }

   
   
    /**
     * Test of checkWinner method, of class MoveWords.
     */
    @Test
    public void testCheckWinner() {
        System.out.println("checkWinner");
        String first = "TIJERAS";
        String second = "PAPEL";
        int expResult = 1;
        int result = MoveWords.checkWinner(first, second);
        assertEquals(expResult, result);
        
    }
    
}
