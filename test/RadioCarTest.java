

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import models.RadioCar;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;
import org.junit.*;

/**
 *
 * @author Davis
 */
public class RadioCarTest {
    
    RadioCar radio;
    public RadioCarTest() {
    }
    
    @Before
    public  void setUpClass() {
    }
    
    @After
    public  void tearDownClass() {
    }
    
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void nextStationFMTest(){
        radio = new RadioCar(0,87.9,"FM",false);
        assertEquals("Tu emisora actual es: 88.10",radio.nextStation());
    }
    
    
    @Test
    public void lastNextStationFMTest(){
        radio = new RadioCar(0,107.9,"FM",false);
        assertEquals("Tu emisora actual es: 87.90",radio.nextStation());
    }
    
    
    
    @Test
    public void NextStationAMTest(){
        radio = new RadioCar(0,530,"AM",false);
        assertEquals("Tu emisora actual es: 540.00",radio.nextStation());
    }
    
    
    @Test
    public void lastNextStationAMTest(){
        radio = new RadioCar(0,1610,"AM",false);
        assertEquals("Tu emisora actual es: 530.00",radio.nextStation());
    }
    
    
    
    @Test
    public void changeStatusRadioTest(){
        radio = new RadioCar(0,1610,"AM",false);
        assertEquals("Radio encendido",radio.changeStatusRadio());
    }
    
    
    
    
}
