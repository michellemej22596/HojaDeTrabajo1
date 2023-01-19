/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hojadetrabajo1;

import java.util.Scanner;
import models.RadioCar;

/**
 *
 * @author Davis
 */
public class HojaDeTrabajo1 {

    /**
     * @param args the command line arguments
     */
    private int resp =0;
    private Scanner in = new Scanner(System.in);
    private  RadioCar  myRadio;
    
    public static void main(String[] args) {
        // TODO code application logic here
        HojaDeTrabajo1 hoja = new HojaDeTrabajo1();
        
        hoja.start();
    }
    
    public void start(){
        myRadio = new RadioCar(0,87.9,"FM",false);
        menu();
    }
    
    public void menu(){
        while(resp!=7){
            System.out.println("================================================================");
            System.out.println("HOLA DE NUEVO, PUEDES SELECCIONAR CUALQUIERA DE ESTAS OPCIONES: ");
            System.out.println("================================================================");
            System.out.println("1. PRENDER/APAGAR RADIO");
            System.out.println("2. CAMBIAR DE AM A FM");
            System.out.println("3. SIGUIENTE EMISORA");
            System.out.println("4. ANTERIOR EMISORA");
            System.out.println("5. GUARDAR ESTACIÓN EN FAVORITOS");
            System.out.println("6. SELECCIONAR EMISORA");
            System.out.println("7. SALIR");
            resp = in.nextInt();
            
            posibleCases();
        }
    }
    
    
    public void posibleCases(){
        if(resp!=1 && !myRadio.isStatus()){
            System.out.println("DEBES ENCENDER EL RADIO");
        }else{
            switch(resp){
                case 1:
                    System.out.println(myRadio.changeStatusRadio());
                    break;
                case 2:
                    System.out.println(menuFrequency());
                    break;
                case 3:
                    System.out.println(myRadio.nextStation());
                    break;
                case 4:
                    System.out.println(myRadio.prevStation());
                    break;
                case 5:
                    System.out.println(menuButtonsRadio());
                    break;
                case 6:
                    System.out.println(menuSelectButton());
                    break;
                case 7:
                    System.out.println("GRACIAS POR UTILIZAR ESTE PROGRAMA");
                    break;
                default:
                    System.out.println("ESTA OPCIÓN ES INVALIDA");

            }
        }
    }
    
    public String menuFrequency(){
        System.out.println("SELECCIONA EL TIPO DE FRECUENCIA QUE NECESITAS");
        System.out.println("1. AM");
        System.out.println("2. FM");
        int resp = in.nextInt();
        
        if(resp==1){
            myRadio.setFrequencyType("AM");
        }else if(resp==2){
            myRadio.setFrequencyType("FM");
        }
        
        return "tu frecuencia actual es: "+myRadio.getFrequencyType();
    }
    
    public boolean validateStatusRadio(){
        return myRadio.isStatus();
    }
    
    public String menuButtonsRadio(){
        System.out.println("SELECCIONA EL BOTÓN DEL 1 AL 6: ");
        String msg ="";
        int button= in.nextInt();
        if(button>0 && button<=6){
            msg = myRadio.saveStation(button);
        }else{
            msg = "DEBES SELECCIONAR UN VALOR ENTRE 1 Y 6";
        }
        
        return msg;
    }


    public String menuSelectButton(){
        System.out.println("SELECCIONA EL BOTÓN DEL 1 AL 6: ");
        String msg ="";
        int button= in.nextInt();
        if(button>0 && button<=6){
            msg = myRadio.setActualStation(button);
        }else{
            msg = "DEBES SELECCIONAR UN VALOR ENTRE 1 Y 6";
        }
        return msg;
    }    
}
