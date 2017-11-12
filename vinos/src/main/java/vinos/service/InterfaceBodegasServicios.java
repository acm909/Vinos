package vinos.service;
import java.util.List;
import vinos.model.Bodega;
import vinos.model.Ficha;

public interface InterfaceBodegasServicios {
	public List<Bodega> bodegas();
	public void persist(Bodega bodega);
	public Bodega buscarBodega(int id);
	public List<Ficha> fichasPorBodega(String bodega);

}
