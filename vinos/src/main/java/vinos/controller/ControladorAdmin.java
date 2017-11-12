package vinos.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import vinos.model.Bodega;
import vinos.model.Ficha;
import vinos.model.RecogerFicha;
import vinos.model.Stock;
import vinos.model.Usuario;
import vinos.service.InterfaceBodegasServicios;
import vinos.service.InterfaceServicios;
import vinos.service.InterfaceStockServicios;
import vinos.service.InterfaceVinosServicios;

@Controller
@SessionAttributes("ficha")
public class ControladorAdmin {
	@Autowired
	private InterfaceVinosServicios serv;
	
	@Autowired
	private InterfaceBodegasServicios servb;
	
	@Autowired
	private InterfaceStockServicios servStock;
	
	@Autowired
	private InterfaceServicios servUsu;
	
	@ModelAttribute("ficha")
	public Ficha getFicha(){
		return new Ficha();
	}
	@ModelAttribute("nuevaficha")
	public RecogerFicha getNuevaFicha() {
		return new RecogerFicha();
	}
	
	@RequestMapping (value="/admin", method= RequestMethod.GET)
	public String paginaAdministrador(){
		return "dashboard";
	}
	
	@RequestMapping (value="/verfichas", method=RequestMethod.GET)
	public String mostrarFichas(ModelMap model){
		List<Ficha> fichas=serv.fichas();
		model.addAttribute("fichas", fichas);
		return "tablafichas";
	}
	@RequestMapping (value="/nuevaficha", method=RequestMethod.GET)
	public String nuevaFicha(ModelMap model){
		RecogerFicha recogerficha=new RecogerFicha();
		model.addAttribute("nuevaficha", recogerficha);
		List<Bodega> bodegas=servb.bodegas();
		model.addAttribute("bodegas", bodegas);
		
		return "newFicha";
	}
	
	@RequestMapping (value="/crearficha", method=RequestMethod.POST)
	public String crearFicha(ModelMap model, @ModelAttribute("nuevaficha")RecogerFicha nuevaficha, HttpServletRequest request){
		int idbodega=Integer.parseInt(request.getParameter("bodega"));
		Bodega bodega=servb.buscarBodega(idbodega);
		Ficha ficha=new Ficha(bodega, nuevaficha.getNombre(),nuevaficha.getYear(),nuevaficha.getPrecio(),
				nuevaficha.getTipo(),nuevaficha.getDescripcionenvejecimiento(),nuevaficha.getMaridaje(),nuevaficha.getUrlfoto());
		System.out.println(nuevaficha.getStock());
		Stock stockPro=new Stock(ficha, nuevaficha.getStock(), 0);
		serv.guardar(ficha);
		servStock.guardar(stockPro);
		return "redirect:verfichas";
	}
	@RequestMapping (value="/editar", method=RequestMethod.GET)
	public String editarFicha(HttpServletRequest request,ModelMap model,@ModelAttribute("ficha")Ficha ficha){
		int id=Integer.parseInt(request.getParameter("id"));
		ficha=serv.buscarFicha(id);
		System.out.println(ficha.getIdficha());
		System.out.println(ficha.getStock().getUnidadesRestantes());
		model.addAttribute("ficha", ficha);
		RecogerFicha recogerficha=new RecogerFicha();
		model.addAttribute("editarficha", recogerficha);
		
		
		
		return "editarficha";
	}
	
	@RequestMapping (value="/modificarficha", method=RequestMethod.POST)
	public String modificarFicha( @ModelAttribute("editarficha")RecogerFicha recogerficha){
		Ficha ficha=serv.buscarFicha(recogerficha.getId());
		ficha.setDescripcionenvejecimiento(recogerficha.getDescripcionenvejecimiento());
		ficha.setMaridaje(recogerficha.getMaridaje());
		ficha.setNombre(recogerficha.getNombre());
		ficha.setYear(recogerficha.getYear());
		ficha.setPrecio(recogerficha.getPrecio());
		ficha.setTipo(recogerficha.getTipo());
		ficha.setUrlfoto(recogerficha.getUrlfoto());
		Stock stockPro=new Stock(ficha, recogerficha.getStock(), ficha.getStock().getUnidadesVendidas());
		
		ficha.setStock(stockPro);
		stockPro.setIdvino(recogerficha.getIdstock());
		System.out.println(stockPro.getIdvino());
		serv.guardar(ficha);
		servStock.guardar(stockPro);
		return "redirect:verfichas";
	}
	@RequestMapping (value="/borrar", method=RequestMethod.GET)
	public String borrarFicha(@RequestParam("borrar")int borrar){
		int borrraStock=serv.buscarFicha(borrar).getStock().getIdvino();
		Ficha borraficha=serv.buscarFicha(borrar);
		
		System.out.println(borrraStock +"-------------------");
		servStock.borrar(borrraStock);
		serv.eliminar(borraficha);
		return "redirect:verfichas";
	}
	
	@RequestMapping (value="/verusuarios", method=RequestMethod.GET)
	public String verusuarios( ModelMap model){
		List<Usuario> usuarios=servUsu.usuarios();
		model.addAttribute("usuarios",usuarios);
		for(Usuario u: usuarios){
			System.out.println(u.getEmail());
		}
		return "tablausuarios";
	}

	

}
