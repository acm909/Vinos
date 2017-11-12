package vinos.model;

public class RecogerFicha {
	private int id;
    private int bodega;
    private String nombre;
    private Integer year;
    private Double precio;
    private String tipo;
    private String descripcionenvejecimiento;
    private String maridaje;
    private String urlfoto;
    private int stock;
    private int idstock;
	public RecogerFicha(int bodega, String nombre, Integer year, Double precio, String tipo,
			String descripcionenvejecimiento, String maridaje, String urlfoto, int stock) {
		super();
		this.bodega = bodega;
		this.nombre = nombre;
		this.year = year;
		this.precio = precio;
		this.tipo = tipo;
		this.descripcionenvejecimiento = descripcionenvejecimiento;
		this.maridaje = maridaje;
		this.urlfoto = urlfoto;
		this.stock = stock;
	}
    
    public int getIdstock() {
		return idstock;
	}

	public void setIdstock(int idstock) {
		this.idstock = idstock;
	}

	public RecogerFicha(){
    	
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBodega() {
		return bodega;
	}

	public void setBodega(int bodega) {
		this.bodega = bodega;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescripcionenvejecimiento() {
		return descripcionenvejecimiento;
	}

	public void setDescripcionenvejecimiento(String descripcionenvejecimiento) {
		this.descripcionenvejecimiento = descripcionenvejecimiento;
	}

	public String getMaridaje() {
		return maridaje;
	}

	public void setMaridaje(String maridaje) {
		this.maridaje = maridaje;
	}

	public String getUrlfoto() {
		return urlfoto;
	}

	public void setUrlfoto(String urlfoto) {
		this.urlfoto = urlfoto;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
    
    
    

}
