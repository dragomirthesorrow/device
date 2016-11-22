/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devicetest2;
//import java.lang.*;
/**
 *
 * @author Dragomir Sergeev <dragomir.sergeev at your.org>
 */
public class GpioListener  implements Runnable{
    
    public void run() {              
        //GpioListener.sleep(50); 
        Device_test.x = true;
        //System.out.println ("Это поток прослушивателя.");
        //System.out.println(Device_test.x);
        }
    
    /*public void TestListPotok (){
        //sleep("10");
      System.out.println ("Это поток прослушивателя не функции ран.");
      
    }*/
    
}
