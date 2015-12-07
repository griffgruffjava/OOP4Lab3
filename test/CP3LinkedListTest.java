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
 * @author C_Train
 */
public class CP3LinkedListTest {
    
    public CP3LinkedListTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
    }
    
    @After
    public void tearDown()
    {
    }

    /**
     * Test of addFirst method, of class CP3LinkedList.
     */
//    @Test
//    public void testAddFirst()
//    {
//        System.out.println("addFirst");
//        CP3LinkedList instance = new CP3LinkedList();
//        String name = "Tim";    
//        instance.addFirst(name);
//        name = "Alice";
//        instance.addFirst(name);
//        int exp = 2;
//        int act = instance.size();
//        assertEquals(exp, act);
//        System.out.println(instance.getFirst());
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getFirst method, of class CP3LinkedList.
//     */
//    @Test
//    public void testGetFirst()
//    {
//        System.out.println("getFirst");
//        CP3LinkedList instance = new CP3LinkedList();
//        Object expResult = null;
//        Object result = instance.getFirst();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of removeFirst method, of class CP3LinkedList.
//     */
    @Test
    public void testRemoveFirst()
    {
        System.out.println("addFirst");
        CP3LinkedList instance = new CP3LinkedList();
        
        String name = "Tim";    
        instance.addFirst(name);
        
        name = "Alice";
        instance.addFirst(name);
        
        name = "Kevin";
        instance.addFirst(name);
        
        System.out.println(" first with 3...");
        instance.print();
        
        int exp = 3;
        int act = instance.size();
        assertEquals(exp, act);
        
        instance.removeFirst();
        System.out.println(" second with 2...");
        instance.print();
        
        instance.removeFirst();
        System.out.println(" third with 1...");
        instance.print();
        
        instance.removeFirst();
        System.out.println(" forth with 0...");
        instance.print();
              
        boolean exp1 = true;
        boolean act1 = instance.isEmpty();
        assertEquals(exp1, act1);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

//    /**
//     * Test of isEmpty method, of class CP3LinkedList.
//     */
//    @Test
//    public void testIsEmpty()
//    {
//        System.out.println("isEmpty");
//        CP3LinkedList instance = new CP3LinkedList();
//        boolean expResult = false;
//        boolean result = instance.isEmpty();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of print method, of class CP3LinkedList.
//     */
//    @Test
//    public void testPrint()
//    {
//        System.out.println("print");
//        CP3LinkedList instance = new CP3LinkedList();
//        instance.print();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of size method, of class CP3LinkedList.
//     */
//    @Test
//    public void testSize()
//    {
//        System.out.println("size");
//        CP3LinkedList instance = new CP3LinkedList();
//        int expResult = 0;
//        int result = instance.size();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
}
