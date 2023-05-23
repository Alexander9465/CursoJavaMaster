package es.cursoJava.Servlet;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import es.cursoJava.Entidades.Producto;

/**
 * Servlet implementation class ServletMenu
 */
@WebServlet("/ServletMenu")
public class ServletMenu extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 ArrayList<Producto> lista = new ArrayList<>();
	 String valor;
	boolean s = true;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletMenu() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//conseguimos por enlace el parametro p que la funcion que ha elegido el usuario
		String opcion = request.getParameter("p");
		
		//tambien lo metemos en una varibale valor para que no cambie hasta que volvamos a entrar al doget
		valor = request.getParameter("p") ;
		System.out.println(valor);
		
		
		//creamos esta variable s para que los datos solo se creen una vez
		if(s) {
			Producto p1 = new Producto("camisa", "ropa", 20, 3);
			Producto p2 = new Producto("pantalon", "ropa", 4, 3);
			
			lista.add(p1);
			lista.add(p2);
		}
		//PRimer menu del html el menu principal 
		switch(opcion) {
		case "alta":
			response.sendRedirect("Alta.html");
			
			break;
		case "borrar":
			response.sendRedirect("Borrar.html");
			
			break;
		case "modificar":
			response.sendRedirect("Modificar.html");
			break;
		case "busqueda":
			response.sendRedirect("Busqueda.jsp");
			break;
		
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		//todos los metodos utilizan un dopost ya que enviamos valores en alta,busqueda, borrar,modificar
		//utilizamos la varibale valor que habiamos guardado en el doget para saber que seguimos en esa funcion
		
		switch (valor) {
		case "alta":
			//cogemos los valores con los que vamos a crear el nuevo producto 
			String nombre = request.getParameter("nombre");
			String seccion = request.getParameter("seccion");
			double precio = Double.parseDouble(request.getParameter("precio"));
			int stock = Integer.parseInt(request.getParameter("stock"));
			
			//metodo que es añadir un producto a un arraylist
			alta(nombre, seccion,precio,stock);
			System.out.println("se dio de alta");
			 s = false;//cambiamos el valor para que no vuelva a crear los elementos iniciales
			out.print("<h2>el producto se ha dado de ala correctamente</h2>");
			out.print("<br><a href=Menu.html>MENU<a>");
			break;
		case "busqueda":
			//buscamos la seccion que queremos buscar
			String busqueda = request.getParameter("busqueda");
			//si lo encontramos lo mostramos con un tostring 
			
			for (int i = 0; i < lista.size(); i++) {
				if(lista.get(i).getSeccion().equals(busqueda)) {
				out.print(lista.get(i).toString());
			}else {
				out.print("no hay productos ");
			}
				}
			s= false;
			out.print("<br><a href=Menu.html>MENU<a>");
			break;
		case "borrar":
			String borr = request.getParameter("nborrar");
			for (int i = 0; i < lista.size(); i++) {
				if(lista.get(i).getNombre().equals(borr)) {
					lista.remove(lista.get(i));
					out.print("El producto ha sido borrado");
				}
			}
			s= false;
			out.print("<br><a href=Menu.html>MENU<a>");
			break;
		case "modificar":
			//guardamos tres parametros el producto que queremos cambiar
			//el campo que queremos cambiar
			//y el nuevo valor del campo 
			String nantiguo = request.getParameter("ncambiar");
			String campo = request.getParameter("cambiar");
			String nombreNuevo = request.getParameter("nuevo");
			
			//buscamos el producto y lo cambiamos con un switch
			for (int i = 0; i < lista.size(); i++) {
				if(lista.get(i).getNombre().equals(nantiguo)) {
					switch (campo) {
					case "nombre":
						lista.get(i).setNombre(nombreNuevo);
						out.print("El nombre ha sido moficado");
						break;
					case "seccion":
						lista.get(i).setSeccion(nombreNuevo);
						out.print("El seccion ha sido moficado");
						break;
					case "precio":
						lista.get(i).setPrecio(Double.parseDouble(nombreNuevo));
						out.print("El precio ha sido moficado");
						break;
					case "stock":
						lista.get(i).setStock(Integer.parseInt(nombreNuevo));
						out.print("El stock ha sido moficado");
						break;
					default:
						break;
					}
				}
			}
			s=false;
			out.print("<br><a href=Menu.html>MENU<a>");
			
			break;
		default:
			break;
		}
	}
	
	public void alta(String nombre, String s,double pre,int stock) {
		lista.add(new Producto(nombre, s, pre, stock));
				
	}
	
	}


