/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author elsaa
 */
public class reservation_systemTest {
    
    public reservation_systemTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
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
        int numofPepole = 2;
        room room= new room(1,"Studio with Sofa Bed","1 king bed " ,500,2);
        String expect= room.toString();
        String result = reservation_system.DisplayRoom(2).toString();
        assertEquals(expect,result);
    }

    /**
     * Test of requestService method, of class reservation_system.
     */
    @Test
    public void testRequestService() {
        
//        
//        service service =new service ("Breakfast", 50);
//        String expResult = service.toString();
//        String result = reservation_system.requestService().toString();
//        assertEquals(expResult, result);
        
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
