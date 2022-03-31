package taller3.televisores;
public class Control {
	private TV tv;
	
	public void enlazar(TV tv) {
		this.setTv(tv);
		tv.setControl(this);
	}
	
	public TV getTv() {
		return this.tv;
	}
	
	public void setTv(TV tv) {
		this.tv = tv;
	}
	
	// tunrOn and turnOff
	public void turnOn() {
		this.tv.turnOn();
	}
	public void turnOff() {
		this.tv.turnOff();
	}
	
	// canalUp and canalDown
	public void canalUp() {
		this.tv.canalUp();
	}
	public void canalDown() {
		this.tv.canalDown();
	}
	
	// volumenUp and volumenDowm
	public void volumenUp() {
		this.tv.volumenUp();
	}
	public void volumenDowm() {
		this.tv.volumenDown();
	}
	
	// setCanal
	public void setCanal(int canal) {
		this.tv.setCanal(canal);
	}
}