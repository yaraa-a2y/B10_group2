/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author elsaa
 */
public class reservation_systemTest {
    
    public reservation_systemTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method, of class reservation_system.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        reservation_system.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of DisplayRoom method, of class reservation_system.
     */
    @Test
    public void testDisplayRoom() {
        System.out.println("DisplayRoom");
        reservation_system.DisplayRoom();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of requestService method, of class reservation_system.
     */
    @Test
    public void testRequestService() {
        System.out.println("requestService");
        service expResult = null;
        service result = reservation_system.requestService();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ViewListOfReservation method, of class reservation_system.
     */
    @Test
    public void testViewListOfReservation() {
     System.out.println("ViewListOfReservation");
        service[] ser = {new service ("massage" , 100),new service ("mass" , 200)};
        booking[] res = {new booking(2 ,3, "2", 13, 2, 1000, 3, 3, "ahmad" , 202020,ser[0]),new booking(2 ,3, "4", 5, 3, 3000, 2, 3, "ali" , 1111,ser[1])};
        reservation_system.ViewListOfReservation(res);
        String mas = res[0].list();
       String expect = "\n Room_num = "+2 +"\n Date= " + "2" + "\n Room type= " + 2 + "\n Number of days= " + 13 + "\n Total price= " + 1000 + "\n Number of people= " + 3 + "\n Booking number= " + 3 +"\n customer name = "+ "ahmad"+ "\n customer id = "+ 202020+"\n****************************************************************";
       assertEquals(expect, mas);
    }
    
}
