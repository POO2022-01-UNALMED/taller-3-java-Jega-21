package taller3.televisores;
public class TV {
	// Atributos.
	private Marca marca;
	private int canal;
	private int precio;
	private boolean estado;
	private int volumen;
	private Control control;
	public static int numTV;
	
	// Constructor.
	public TV (Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		canal = 1;
		volumen = 500;
		numTV++;
	}
	
	// Getters and Setters.
	public Marca getMarca() {
		return this.marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public int getCanal() {
		return this.canal;
	}

	public void setCanal(int canal) {
		if(canal > 0 && canal < 120 && this.getEstado()) {  // Condicional de que el TV debe estár encendido.
			this.canal = canal;
		}
	}

	public int getPrecio() {
		return this.precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getVolumen() {
		return this.volumen;
	}

	public void setVolumen(int volumen) {
		if(this.getVolumen() < 7 && this.getVolumen() > 0 && this.getEstado()) {  // Condicional de que el TV debe estár encendido.
			this.volumen = volumen;
		}
	}

	public Control getControl() {
		return this.control;
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
		return this.estado;
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
	public static void setNumTV(int numTV) {
		TV.numTV = numTV;
	}	
}