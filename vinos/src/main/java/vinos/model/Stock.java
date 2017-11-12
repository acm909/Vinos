package vinos.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Stock generated by hbm2java
 */
@Entity
@Table(name="stock"
    ,catalog="tiendavinos"
)
public class Stock  implements java.io.Serializable {

	private static final long serialVersionUID = -6152295616033227075L;
	private Integer idvino;
     private Ficha ficha;
     private Integer unidadesRestantes;
     private Integer unidadesVendidas;

    public Stock() {
    }

	
    public Stock(Ficha ficha) {
        this.ficha = ficha;
    }
    public Stock(Ficha ficha, Integer unidadesRestantes, Integer unidadesVendidas) {
       this.ficha = ficha;
       this.unidadesRestantes = unidadesRestantes;
       this.unidadesVendidas = unidadesVendidas;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idvino", unique=true, nullable=false)
    public Integer getIdvino() {
        return this.idvino;
    }
    
    public void setIdvino(Integer idvino) {
        this.idvino = idvino;
    }

@OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="ficha_idficha", nullable=false)
    public Ficha getFicha() {
        return this.ficha;
    }
    
    public void setFicha(Ficha ficha) {
        this.ficha = ficha;
    }

    
    @Column(name="unidadesRestantes")
    public Integer getUnidadesRestantes() {
        return this.unidadesRestantes;
    }
    
    public void setUnidadesRestantes(Integer unidadesRestantes) {
        this.unidadesRestantes = unidadesRestantes;
    }

    
    @Column(name="unidadesVendidas")
    public Integer getUnidadesVendidas() {
        return this.unidadesVendidas;
    }
    
    public void setUnidadesVendidas(Integer unidadesVendidas) {
        this.unidadesVendidas = unidadesVendidas;
    }




}


