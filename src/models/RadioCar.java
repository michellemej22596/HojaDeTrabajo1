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
    
    public RadioCar(int _volume) {
    	this.setVolume(_volume);
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
	public void setActualStation(double actualStation) {
		this.actualStation = actualStation;
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

	@Override
	public String changeStatusRadio(boolean status) {
		
		return null;
	}

	@Override
	public double nextStation(int index) {
	
		return actualStation;
	}

	@Override
	public double prevStation(int index) {
	
		return actualStation;
	}

	@Override
	public String saveStationFm(int button) {
	
		return null;
	}

	@Override
	public String saveStationAm(int button) {
	
		return null;
	}

	@Override
	public int upVolume() {
		if(getVolume()<30)
				volume = volume+1;
			else 
				System.out.print("El volumen está al máximo");
		
			
		return 0;
	}

	@Override
	public int downVolume() {
		if(getVolume()>0)
			volume = volume-1;
				else 
					System.out.print("El volumen está al mínimo");
			
		return 0;
	}
    
}
