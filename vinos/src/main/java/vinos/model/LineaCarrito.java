package vinos.model;

public class LineaCarrito {
	private Ficha ficha;
	private int unidades;
	private double precio;
	
	public LineaCarrito(){
		
	}
	

	public LineaCarrito(Ficha ficha, int unidades, double precio) {
		super();
		this.ficha = ficha;
		this.unidades = unidades;
		this.precio = precio;
	}


	public Ficha getFicha() {
		return ficha;
	}

	public void setFicha(Ficha ficha) {
		this.ficha = ficha;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	
	
	

}
