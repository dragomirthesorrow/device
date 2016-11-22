/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devicetest2;

/**
 *
 * @author Dragomir Sergeev <dragomir.sergeev at your.org>
 */
public class DeviceTest2 {
        static GpioListener mGp;
        public static boolean x;
        
        public static boolean Gpio01;
        public static boolean DoorStatus;
        public static boolean EnginePowerStatus;
        public static boolean EngineStatus;
        public static boolean OnSecureStatus;
        public static boolean PCStatus;
        
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int x = 1;
        //Device_test.x = 1;
        System.out.println("Hi!");
        Thread mainthread = Thread.currentThread();
        System.out.println("Главный поток: " + mainthread.getName());
        //mainthread.sleep(500);

        mGp = new GpioListener();
        Thread newP=new Thread(mGp);
        newP.start();
        System.out.println("Поток прослушивателя: " + newP.getName());
        //System.out.println(x);
        //if(newP.isAlive()){
            try{
                newP.join();
            }catch(InterruptedException e){}
        //}

        //GpioListener gl = new GpioListener();
        //gl.TestListPotok();
        //Server serv = new Server();
        //serv.ServerDevice();
        //System.out.println(Device_test.x);
        if(DeviceTest2.x == true){
            System.out.println("Значение переменной установлено:" + DeviceTest2.x);
        }
    }
    

    
}
