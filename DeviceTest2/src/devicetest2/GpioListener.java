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

        DeviceTest2.x = true;
        //Проверяем поочередно все Gpio и выставляем статусные переменные
        //параллельно меняя статус активируемых gpio
        
        //1 Поднимаем в нужный статус gpio
        
        //2 Устанавливаем глобальные переменные gpio
        
        //3 Устанавливаем переменные статусов сервисов
        }

    
}
