package vinos.model;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Ficha generated by hbm2java
 */
@Entity
@Table(name="ficha"
    ,catalog="tiendavinos"
)
public class Ficha  implements java.io.Serializable {


	private static final long serialVersionUID = -3022822090055365361L;
	private Integer idficha;
     private Bodega bodega;
     private String nombre;
     private Integer year;
     private Double precio;
     private String tipo;
     private String descripcionenvejecimiento;
     private String maridaje;
     private String urlfoto;
     private Stock stock;
     private Set<Valoraciones> valoracioneses = new HashSet<Valoraciones>(0);
     private Set<Desglose> desgloses = new HashSet<Desglose>(0);

    public Ficha() {
    }
    public Ficha(Bodega bodega,String nombre, Integer year, Double precio, String tipo, String descripcionenvejecimiento, String maridaje, String urlfoto ){
    	this.bodega=bodega;
    	this.nombre=nombre;
    	this.year=year;
    	this.precio=precio;
    	this.tipo=tipo;
    	this.descripcionenvejecimiento=descripcionenvejecimiento;
    	this.maridaje=maridaje;
    	this.urlfoto=urlfoto;
    	
    }

	
    public Ficha(Bodega bodega) {
        this.bodega = bodega;
    }
    public Ficha(Bodega bodega, String nombre, Integer year, Double precio, String tipo, String descripcionenvejecimiento, String maridaje, String urlfoto, Stock stock, Set<Valoraciones> valoracioneses, Set<Desglose> desgloses) {
       this.bodega = bodega;
       this.nombre = nombre;
       this.year = year;
       this.precio = precio;
       this.tipo = tipo;
       this.descripcionenvejecimiento = descripcionenvejecimiento;
       this.maridaje = maridaje;
       this.urlfoto = urlfoto;
       this.stock = stock;
       this.valoracioneses = valoracioneses;
       this.desgloses = desgloses;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idficha", unique=true, nullable=false)
    public Integer getIdficha() {
        return this.idficha;
    }
    
    public void setIdficha(Integer idficha) {
        this.idficha = idficha;
    }

@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="bodega_idbodega", nullable=false)
    public Bodega getBodega() {
        return this.bodega;
    }
    
    public void setBodega(Bodega bodega) {
        this.bodega = bodega;
    }

    
    @Column(name="nombre", length=45)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    @Column(name="year")
    public Integer getYear() {
        return this.year;
    }
    
    public void setYear(Integer year) {
        this.year = year;
    }

    
    @Column(name="precio", precision=22, scale=0)
    public Double getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    
    @Column(name="tipo", length=45)
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    @Column(name="descripcionenvejecimiento", length=100)
    public String getDescripcionenvejecimiento() {
        return this.descripcionenvejecimiento;
    }
    
    public void setDescripcionenvejecimiento(String descripcionenvejecimiento) {
        this.descripcionenvejecimiento = descripcionenvejecimiento;
    }

    
    @Column(name="maridaje", length=200)
    public String getMaridaje() {
        return this.maridaje;
    }
    
    public void setMaridaje(String maridaje) {
        this.maridaje = maridaje;
    }

    
    @Column(name="urlfoto")
    public String getUrlfoto() {
        return this.urlfoto;
    }
    
    public void setUrlfoto(String urlfoto) {
        this.urlfoto = urlfoto;
    }

@OneToOne(fetch=FetchType.EAGER, mappedBy="ficha")
    public Stock getStock() {
        return this.stock;
    }
    
    public void setStock(Stock stocks) {
        this.stock = stocks;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="ficha")
    public Set<Valoraciones> getValoracioneses() {
        return this.valoracioneses;
    }
    
    public void setValoracioneses(Set<Valoraciones> valoracioneses) {
        this.valoracioneses = valoracioneses;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="ficha")
    public Set<Desglose> getDesgloses() {
        return this.desgloses;
    }
    
    public void setDesgloses(Set<Desglose> desgloses) {
        this.desgloses = desgloses;
    }




}


