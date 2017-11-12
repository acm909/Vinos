package vinos.model;

import java.util.HashSet;
import java.util.Set;

public class Carrito {

	private Integer preciofinal;
	private Set<Articulo> articulos = new HashSet<>();
	private Set<Desglose> desgloses = new HashSet<>();
	
	public Carrito() {
		super();
	}

	public Carrito(Integer preciofinal, Set<Articulo> articulos, Set<Desglose> desgloses) {
		super();
		this.preciofinal = preciofinal;
		this.articulos = articulos;
		this.desgloses = desgloses;
	}

	public void anadirArticulo(Ficha f)
	{
		
	}

	public Set<Articulo> getArticulos() {
		return articulos;
	}

	public Set<Desglose> getDesgloses() {
		return desgloses;
	}

	public Integer getPreciofinal() {
		return preciofinal;
	}

	public void setArticulos(Set<Articulo> articulos) {
		this.articulos = articulos;
	}

	public void setDesgloses(Set<Desglose> desgloses) {
		this.desgloses = desgloses;
	}

	public void setPreciofinal(Integer preciofinal) {
		this.preciofinal = preciofinal;
	}
	
	@Override
	public String toString() {
		return "Carrito [preciofinal=" + preciofinal + ", articulos=" + articulos + ", desgloses=" + desgloses + "]";
	}
	
}
