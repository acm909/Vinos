package vinos.model;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Datospersonales generated by hbm2java
 */
@Entity
@Table(name="datospersonales"
    ,catalog="tiendavinos"
)
public class Datospersonales  implements java.io.Serializable {


	private static final long serialVersionUID = -5181616402739472370L;
	private Integer iddatosPersonales;
    private Usuario usuario;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String telefono;
    private String codigopostal;
    private String direcion;
    private Date fechanacimiento;

    public Datospersonales() {
    }

	
    public Datospersonales(Usuario usuario) {
        this.usuario = usuario;
    }
    public Datospersonales(Usuario usuario, String nombre, String apellido1, String apellido2, String telefono, String codigopostal, String direcion, Date fechanacimiento) {
       this.usuario = usuario;
       this.nombre = nombre;
       this.apellido1 = apellido1;
       this.apellido2 = apellido2;
       this.telefono = telefono;
       this.codigopostal = codigopostal;
       this.direcion = direcion;
       this.fechanacimiento = fechanacimiento;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="iddatosPersonales", unique=true, nullable=false)
    public Integer getIddatosPersonales() {
        return this.iddatosPersonales;
    }
    
    public void setIddatosPersonales(Integer iddatosPersonales) {
        this.iddatosPersonales = iddatosPersonales;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="usuario_idusuario", nullable=false)
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    
    @Column(name="nombre", length=45)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    @Column(name="apellido1", length=45)
    public String getApellido1() {
        return this.apellido1;
    }
    
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    
    @Column(name="apellido2", length=45)
    public String getApellido2() {
        return this.apellido2;
    }
    
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    
    @Column(name="telefono", length=12)
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
    @Column(name="codigopostal", length=45)
    public String getCodigopostal() {
        return this.codigopostal;
    }
    
    public void setCodigopostal(String codigopostal) {
        this.codigopostal = codigopostal;
    }

    
    @Column(name="direcion", length=45)
    public String getDirecion() {
        return this.direcion;
    }
    
    public void setDirecion(String direcion) {
        this.direcion = direcion;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="fechanacimiento", length=10)
    public Date getFechanacimiento() {
        return this.fechanacimiento;
    }
    
    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }




}

