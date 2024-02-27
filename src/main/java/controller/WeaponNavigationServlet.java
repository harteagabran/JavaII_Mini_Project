package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Weapon;

/**
 * Servlet implementation class WeaponNavigationServlet
 */
@WebServlet("/weaponNavigationServlet")
public class WeaponNavigationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public WeaponNavigationServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		WeaponHelper dao = new WeaponHelper();
		String act = request.getParameter("doThisToWeapon");

		String path = "/viewAllWeaponsServlet";

		if (act.equals("delete")) {
			try {
				Integer tempId = Integer.parseInt(request.getParameter("id"));
				Weapon weaponToDelete = dao.searchForWeaponById(tempId);
				dao.deleteWeapon(weaponToDelete);

			} catch (NumberFormatException e) {
				System.out.println("Forgot to select a weapon");
			}
		} else if (act.equals("edit")) {
			try {
				Integer tempId = Integer.parseInt(request.getParameter("id"));

				Weapon weaponToEdit = dao.searchForWeaponById(tempId);
				request.setAttribute("weaponToEdit", weaponToEdit);
				path = "/edit-weapon.jsp";
			} catch (NumberFormatException e) {
				System.out.println("Forgot to select an weapon");
			}
		} else if (act.equals("add")) {
			path = "/add-weapon.jsp";
		}

		getServletContext().getRequestDispatcher(path).forward(request, response);
	}

}
