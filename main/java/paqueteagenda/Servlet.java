package paqueteagenda;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Servlet
 */
@WebServlet({ "/Servlet", "/enviar" })
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		//1-Recupero datos del formulario
		String name=request.getParameter("name");
		String telephone=request.getParameter("telephone");
		Contact contact=new Contact(name, telephone);
		//2-Grabo los datos en el CSV a través de una una clase externa
		DataAccess.registerContact(contact);
		//3-Recupero los contactos del CSV a través de una una clase externa
		ArrayList<Contact> contact_list=DataAccess.getAllContacts();
		//Meto los contactos en un Attribute y lo mando a la vista(view_contacts.jsp)
		request.setAttribute("contact_list", contact_list);
		request.getRequestDispatcher("view_contacts.jsp").forward(request, response)
	}

}
