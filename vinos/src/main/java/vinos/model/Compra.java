package vinos.model;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Compra generated by hbm2java
 */
@Entity
@Table(name="compra"
    ,catalog="tiendavinos"
)
public class Compra  implements java.io.Serializable {


    
	private static final long serialVersionUID = 1415414257710023873L;
	private Integer idcompra;
     private Formapago formapago;
     private Usuario usuario;
     private Date fecha;
     private String preciofinal;
     private Set<Desglose> desgloses = new HashSet<Desglose>(0);

    public Compra() {
    }

	
    public Compra(Formapago formapago, Usuario usuario, Date fecha) {
        this.formapago = formapago;
        this.usuario = usuario;
        this.fecha = fecha;
    }
    public Compra(Formapago formapago, Usuario usuario, Date fecha, String preciofinal, Set<Desglose> desgloses) {
       this.formapago = formapago;
       this.usuario = usuario;
       this.fecha = fecha;
       this.preciofinal = preciofinal;
       this.desgloses = desgloses;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idcompra", unique=true, nullable=false)
    public Integer getIdcompra() {
        return this.idcompra;
    }
    
    public void setIdcompra(Integer idcompra) {
        this.idcompra = idcompra;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="formapago_idformaPago", nullable=false)
    public Formapago getFormapago() {
        return this.formapago;
    }
    
    public void setFormapago(Formapago formapago) {
        this.formapago = formapago;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="usuario_idusuario", nullable=false)
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="fecha", nullable=false, length=10)
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    
    @Column(name="preciofinal", length=45)
    public String getPreciofinal() {
        return this.preciofinal;
    }
    
    public void setPreciofinal(String preciofinal) {
        this.preciofinal = preciofinal;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="compra")
    public Set<Desglose> getDesgloses() {
        return this.desgloses;
    }
    
    public void setDesgloses(Set<Desglose> desgloses) {
        this.desgloses = desgloses;
    }




}


