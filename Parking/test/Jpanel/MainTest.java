/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jpanel;

import junit.framework.TestCase;

/**
 *
 * @author AnThOnY
 */
public class MainTest extends TestCase {
    
    public MainTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of main method, of class Main.
     */
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Main.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of login method, of class Main.
     */
    public void testLogin() {
        System.out.println("login");
        Main.login();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
