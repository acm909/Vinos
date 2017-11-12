package vinos.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.sound.sampled.Line;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import vinos.dao.Dao;
import vinos.model.Ficha;
import vinos.model.LineaCarrito;
import vinos.model.Usuario;
import vinos.service.FichasImple;
import vinos.service.InterfaceBodegasServicios;
import vinos.service.InterfaceServicios;
import vinos.service.InterfaceVinosServicios;

@Controller
@SessionAttributes("carrito")
public class ControladorTienda {
	
	@Autowired
	private InterfaceVinosServicios serv;
	@Autowired
	private InterfaceBodegasServicios servb;
	
	@ModelAttribute("carrito")
	public List<LineaCarrito> carrito(){
		List<LineaCarrito> carrito=new ArrayList<>();
		return carrito;
	}
	
	
	
	@RequestMapping(value="/tienda", method=RequestMethod.GET)
	public String montarListaArticulos(ModelMap model){
		List<Ficha> fichas =(List<Ficha>) serv.fichas();
		model.addAttribute("fichas",fichas);
		model.addAttribute("categoria", "Todos los vinos");
		return "store";
	}
	
	@RequestMapping(value="/montarFicha", method=RequestMethod.GET)
	public String montarFicha(HttpServletRequest request, ModelMap model){
		int id=Integer.parseInt(request.getParameter("id"));
		Ficha verficha=serv.buscarFicha(id);
		model.addAttribute("verficha", verficha);
		System.out.println(verficha.getBodega().getNombre());
		
		return "ficha";
	}
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public String mostrarCarrito(HttpServletRequest request,@ModelAttribute("carrito") List<LineaCarrito> carrito,
			ModelMap model){
		int id=Integer.parseInt(request.getParameter("id"));
		int cantidad=Integer.parseInt(request.getParameter("cantidad"));
		boolean repetido=false;
		for (LineaCarrito l: carrito){
			if (l.getFicha().getIdficha()==id){
				repetido=true;
				System.out.println("algun elemento repetido");
				l.setUnidades(l.getUnidades()+cantidad);
				l.setPrecio(l.getUnidades()*l.getFicha().getPrecio());
				model.addAttribute("carrito", carrito);
			}
		}
		if (!repetido){
		Ficha ficha=serv.buscarFicha(id);
		
		double precio=ficha.getPrecio()*cantidad;
		LineaCarrito linea=new LineaCarrito(ficha, cantidad,precio);
		carrito.add(linea);
		
		model.addAttribute("carrito", carrito);
		}
		double preciototal=0;
		for (LineaCarrito l:carrito){
			preciototal+=l.getPrecio();
		}
		model.addAttribute("preciototal",preciototal);
		
		return "cart";
	}
	
	@RequestMapping(value="/rm", method=RequestMethod.GET)
	public String eliminarItem(HttpServletRequest request,@ModelAttribute("carrito") List<LineaCarrito> carrito,
			ModelMap model){
		int id=Integer.parseInt(request.getParameter("id"));
		
		LineaCarrito borrar=null;
		for (LineaCarrito l:carrito){
			if (l.getFicha().getIdficha()==id){
				borrar=l;
			}
		}
		System.err.println(borrar.getFicha().getNombre());
		carrito.remove(borrar);
		model.addAttribute("carrito",carrito);
		double preciototal=0;
		for (LineaCarrito l:carrito){
			preciototal+=l.getPrecio();
		}
		model.addAttribute("preciototal",preciototal);
		
		return "cart";
		
	}
	
	@RequestMapping(value="/categorias", method=RequestMethod.GET)
	public String categorias(@RequestParam("categoria") String categoria,ModelMap model,@RequestParam("categorias")String categorias){
		if (categoria.equals("ficha")){
			List<Ficha> fichas=serv.buscarpornombre(categorias.toLowerCase());
			model.addAttribute("fichas", fichas);
		}
		else if (categoria.equals("bodega")){
			List<Ficha> todasfichas=serv.fichas();
			List<Ficha> fichas=new ArrayList<>();
			for(Ficha f: todasfichas){
				if(f.getBodega().getNombre().toLowerCase().indexOf(categorias.toLowerCase())!=-1){
					fichas.add(f);
				}
			}
			model.addAttribute("fichas", fichas);
			for (Ficha f: fichas){
				System.out.println(f.getNombre());
			}
			
		}else{
		List<Ficha> todas=serv.fichas();
		List<Ficha> fichas=new ArrayList<>();
		for(Ficha f: todas){
			if (f.getTipo().toLowerCase().equals(categoria.toLowerCase())){
				fichas.add(f);
			}
		}
		model.addAttribute("fichas", fichas);
		model.addAttribute("categoria", categoria);
		}
		return "store";
	}
	@RequestMapping(value="/comprar",method=RequestMethod.GET)
	public String compra(@ModelAttribute("carrito") List<LineaCarrito> carrito){
		
		
		
		return "finalizada";
	}
	

}
