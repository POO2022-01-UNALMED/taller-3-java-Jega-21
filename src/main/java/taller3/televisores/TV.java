package taller3.televisores;
public class TV {
	// Atributos.
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen;
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
		if(canal <= 120) {
			if (canal > 0) {
				if(estado == true) {
					this.canal = canal;
				}
			}
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
		if(volumen < 8) {
			if (volumen > 0) {
				if(estado == true) {
					this.volumen = volumen;
				}
			}
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
		if((canal + 1) <= 120) {
			if (estado == true) {
				this.canal++;
			}
		}
	}
	public void canalDown() {
		if ((canal - 1) > 0) {
			if(estado == true) {
				this.canal--;
			}
		}
	}
			
	// Metodos cambio de volumen.
	public void volumenUp() {
		if((volumen +1 ) < 8) {
			if(estado == true) {
				this.volumen++;
			}
		}
	}
	public void volumenDown() {
		if((volumen - 1) > 0) {
			if(estado == true) {
				this.volumen--;
			}
		}
	}

	public static int getNumTV() {
		return numTV;
	}
	public static void setNumTV(int num) {
		TV.numTV = num;
	}	
}