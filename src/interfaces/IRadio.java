package interfaces;

/**
 *
 * @author Michelle
 */
public interface IRadio {
	/***
	 * Este metodo enciende / Apaga el dispositivo, recibe una variable booleana
	 * que tiene el estado actual del dispositivo
	 * @param el estado
	 * @return mensaje de apagado o encendido
	 */
	public String changeStatusRadio(boolean status);
	
	/***
	 * Este metodo cambia a la siguiente estacion.
	 * @param indice actual en la lista
	 * @return indice de la estacion
	 */
	public double nextStation(int index);
	
	/***
	 * Este metodo cambia a la estacion anterior.
	 * @param indice actual en la lista
	 * @return indice de la estacion
	 */
	public double prevStation(int index);
	
	/***
	 * Este metodo guarda la estaion FM
	 * @param boton (numero del 1 al 6) donde se desea guardar la estacion
	 * @return nombre de la estacion
	 */
	public String saveStationFm(int button);
	
	/***
	 * Este metodo guarda la estaion AM
	 * @param boton (numero del 1 al 6) donde se desea guardar la estacion
	 * @return nombre de la estacion
	 */
	public String saveStationAm(int button);
	
	/***
	 * Este metodo permite subir el volumen hasta 30
	 * @return volumen
	 */
	public int upVolume();
	
	/***
	 * Este metodo permite bajar el volumen hasta 0
	 * @return volumen
	 */
	public int downVolume();
	
}