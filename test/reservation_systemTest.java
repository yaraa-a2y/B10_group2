/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import java.util.Arrays;
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
     * Test of DisplayRoom method, of class reservation_system.
     */
    @Test
    public void testDisplayRoom() {
        System.out.println("DisplayRoom");
        int numofPepole = 2;
        room room= new room(1,"Studio with Sofa Bed","1 king bed " ,500,2);
        String expect= room.toString();
        String result = reservation_system.DisplayRoom(numofPepole).toString();
        assertEquals(expect,result);
    }

    /**
     * Test of requestService method, of class reservation_system.
     */
    @Test
    public void testRequestService() {
         service [] services = { new service ("massage" , 100)};
         int ServiceNum =1;
         String expResult ="Requested, thanks";
         String result = reservation_system.requestService(ServiceNum, services);
        assertEquals(expResult, result);
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
    
    @Test
    public void testReservation() {
     System.out.println("Reservation");
        service[] ser = {new service ("massage" , 100)};
        booking [] res = {new booking(2 ,14,"5/6/2023", 2, 2, 3000, 4, 1, "sulafah",100 ,ser[0])};
        String result=res[0].toString(); 
       String expect = "\nbooking infomation \n" + " The starting time for the booking day is " + 14 +" o'clock"+ "\n Room_num = "+2 +"\nDate= " + "5/6/2023" +
               "\n Room type= " + 2 + "\n Number of days= " + 2 + "\n Total price= " + 3000 + "\n Number of people= " + 4 + "\n Booking number= " + 1 +
               "\n****************************************************************";
       assertEquals(expect, result);
    }

 
    
}
