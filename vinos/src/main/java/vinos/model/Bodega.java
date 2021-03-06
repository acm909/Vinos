package vinos.model;
// Generated 14-feb-2017 11:53:08 by Hibernate Tools 4.3.1


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
import javax.persistence.Table;

/**
 * Bodega generated by hbm2java
 */
@Entity
@Table(name="bodega"
    ,catalog="tiendavinos"
)
public class Bodega  implements java.io.Serializable {


     
	private static final long serialVersionUID = -6110093038154022515L;
	private Integer idbodega;
     private Zona zona;
     private String nombre;
     private String direccion;
     private String info;
     private Integer telefono;
     private Set<Ficha> fichas = new HashSet<Ficha>(0);

    public Bodega() {
    }

	
    public Bodega(Zona zona) {
        this.zona = zona;
    }
    public Bodega(Zona zona, String nombre, String direccion, String info, Integer telefono, Set<Ficha> fichas) {
       this.zona = zona;
       this.nombre = nombre;
       this.direccion = direccion;
       this.info = info;
       this.telefono = telefono;
       this.fichas = fichas;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idbodega", unique=true, nullable=false)
    public Integer getIdbodega() {
        return this.idbodega;
    }
    
    public void setIdbodega(Integer idbodega) {
        this.idbodega = idbodega;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="zona_idzona", nullable=false)
    public Zona getZona() {
        return this.zona;
    }
    
    public void setZona(Zona zona) {
        this.zona = zona;
    }

    
    @Column(name="nombre", length=45)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    @Column(name="direccion", length=45)
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
    @Column(name="info", length=250)
    public String getInfo() {
        return this.info;
    }
    
    public void setInfo(String info) {
        this.info = info;
    }

    
    @Column(name="telefono")
    public Integer getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="bodega")
    public Set<Ficha> getFichas() {
        return this.fichas;
    }
    
    public void setFichas(Set<Ficha> fichas) {
        this.fichas = fichas;
    }




}


