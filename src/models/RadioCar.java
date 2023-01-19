package models;
import java.util.ArrayList;
import interfaces.IRadio;

/**
 *
 * @author Michelle
 */

public class RadioCar implements IRadio {
	
    private int volume;
    private double actualStation;
    private String frequencyType;
    private boolean status;
    private ArrayList<Double> favoriteStationsAM = new ArrayList();
    private ArrayList<Double> favoriteStationsFM = new ArrayList();

    /**
     * constructor para inicializar variables y arraylists
     * @param volume
     * @param actualStation
     * @param frequencyType
     * @param status 
     */
    public RadioCar(int volume, double actualStation, String frequencyType, boolean status) {
        this.volume = volume;
        this.actualStation = actualStation;
        this.frequencyType = frequencyType;
        this.status = status;
        initializeArraylists();
    }
    
    /**
     * inicializador de posiciones arraylist
     */
    public void initializeArraylists(){
        for(int x=0; x<=6; x++){
            favoriteStationsAM.add(0.00);
            favoriteStationsFM.add(0.00);
        }
    }
    
    
    
    /**
    * @return the volume
    */
    public int getVolume() {
       return volume;
    }

    /**
     * @param volume the volume to set
     */
    public void setVolume(int volume) {
        this.volume = volume;
    }

    /**
     * @return the actualStation
     */
    public double getActualStation() {
        return actualStation;
    }

    /**
     * @param actualStation the actualStation to set
     */
    public String setActualStation(int index) {
        String msg = "";
        if(frequencyType == "AM"){
            if(favoriteStationsAM.get(index)==0){
                msg = "NO TIENENS GUARDADO UNA EMISORA EN ESTE ESPACIO.";
            }else{
                this.actualStation = favoriteStationsAM.get(index);
                msg = "TU EMISORA ACTUAL ES: "+actualStation;
            }
        }else{
            if(favoriteStationsAM.get(index)==0){
                msg = "NO TIENENS GUARDADO UNA EMISORA EN ESTE ESPACIO.";
            }else{
                this.actualStation = favoriteStationsFM.get(index);
                msg = "TU EMISORA ACTUAL ES: "+actualStation;
            }

        }
        return msg;
    }

    /**
     * @return the frequencyType
     */
    public String getFrequencyType() {
        return frequencyType;
    }

    /**
     * @param frequencyType the frequencyType to set
     */
    public void setFrequencyType(String frequencyType) {
        this.frequencyType = frequencyType;
        if(frequencyType=="AM"){
            actualStation = 530;

        }else{
            actualStation = 87.9;
        }
    }

    /**
     * @return the status
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

    /**
     * @return the favoriteStationsAM
     */
    public ArrayList<Double> getFavoriteStationsAM() {
        return favoriteStationsAM;
    }

    /**
     * @param favoriteStationsAM the favoriteStationsAM to set
     */
    public void setFavoriteStationsAM(ArrayList<Double> favoriteStationsAM) {
        this.favoriteStationsAM = favoriteStationsAM;
    }

    /**
     * @return the favoriteStationsFM
     */
    public ArrayList<Double> getFavoriteStationsFM() {
        return favoriteStationsFM;
    }

    /**
     * @param favoriteStationsFM the favoriteStationsFM to set
     */
    public void setFavoriteStationsFM(ArrayList<Double> favoriteStationsFM) {
        this.favoriteStationsFM = favoriteStationsFM;
    }

    /**
     *  método para cambiar de encendido a apagado y viceversa.
     * @return  msg
     */
    @Override
    public String changeStatusRadio() {

        status = !status;
        String msg;
        if (status) {
                msg = "Radio encendido";
        }
        else {
                msg = "Radio apagado";
        }
        return msg;
    }


    /**
     * cambiar a la siguiente estación
     * @return msg
     */

    @Override
    public String nextStation() {
        if (frequencyType == "AM") {
                if (actualStation == 1610.0) {
                        actualStation = 530.0;
                }
                else {
                        actualStation = actualStation + 10.0;
                }
        }else if(frequencyType == "FM") {
                if (actualStation == 107.9) {
                        actualStation = 87.9;
                }
                else {
                        actualStation = actualStation + 0.2;
                }
        }
        String msg = "Tu emisora actual es: "+actualStation;
        return msg;
    }

    /**
     * anterior estación
     * @return msg
     */
    @Override
    public String prevStation() {
        if (frequencyType == "AM") {
            if (actualStation == 530.0) {
                    actualStation = 1610.0;
            }else {
                    actualStation = actualStation - 10.0;
            }
        }else if(frequencyType == "FM") {
            if (actualStation == 87.9) {
                    actualStation = 107.9;
            }else {
                    actualStation = actualStation - 0.2;
            }
        }
        String msg = "Tu emisora actual es: "+actualStation;
        return msg;
    }


    /**
     * guarda la estación en la posición elegida.
     * @param id
     * @return  msg
     */
    public String saveStation(int id){
        if(frequencyType=="FM"){
            return saveStationFm(id);
        }else{
            return saveStationAm(id);
        }

    }

    /**
     * guardar estación en FM
     * @param id
     * @return msg
     */

    @Override
    public String saveStationFm(int id) {
        favoriteStationsFM.add(id, actualStation);
        String msg = "se ha guardado exitosamente la emisora: "+actualStation+ " En el botón: "+(id);
        return msg;
    }


    /**
     * guardar esctación AM
     * @param id
     * @return msg
     */
    @Override
    public String saveStationAm(int id) {
        favoriteStationsAM.add(id, actualStation);
        String msg = "se ha guardado exitosamente la emisora: "+actualStation+ " En el botón: "+(id);  
        return msg;
    }


    /**
     * subir volumen
     * @return msg
     */
    @Override
    public String upVolume() {
        if(getVolume()<30)
            volume = volume+1;
        else {
            System.out.print("El volumen está al máximo");			
        }
        String msg = "tu volumen actual es: "+volume;
        return msg;
    }

    /**
     * bajar volumen
     * @return msg
     */
    @Override
    public String downVolume() {
        if(getVolume()>0)
            volume = volume-1;
        else{
            System.out.print("El volumen está al mínimo");
        }		
        String msg = "tu volumen actual es: "+volume;
        return msg;
    }
    
}
