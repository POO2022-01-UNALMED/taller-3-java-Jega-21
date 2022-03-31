package taller3.televisores;
public class TV {
	// Atributos.
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	private Control control;
	public static int numTV;
	
	// Constructor.
	public TV (Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		numTV++;
	}
	
	// Getters and Setters.
	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		if(canal > 0 && canal <= 120 && this.getEstado()) {
			this.canal = canal;
		}
	}
	
	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int volumen) {
		if(this.getVolumen() < 7 && this.getVolumen() > 0 && this.getEstado()) {
			this.volumen = volumen;
		}
	}

	public Control getControl() {
		return control;
	}

	public void setControl(Control control) {
		this.control = control;
	}

	// TurnOn and tunrOff.
	public void turnOn() {
		this.estado = true;
	}
	public void turnOff() {
		this.estado = false;
	}
	
	// getEstado.
	public boolean getEstado() {
		return estado;
	}	
	
	// Metodos cambio de canal.
	public void canalUp() {
		if(this.canal < 120 && this.getEstado()) {
			setCanal(this.canal+1);
		}
	}
	
	public void canalDown() {
		setCanal(this.canal-1);
	}
			
	// Metodos cambio de volumen.
	public void volumenUp() {
		setVolumen(this.volumen+1);
	}
	
	public void volumenDown() {
		setVolumen(this.volumen-1);
	}
	
	public static int getNumTV() {
		return numTV;
	}
	public static void setNumTV(int num) {
		TV.numTV = num;
	}	
}