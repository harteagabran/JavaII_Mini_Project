package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Unit;
import model.Weapon;

/**
 * Servlet implementation class UnitNavigationServlet
 */
@WebServlet("/unitNavigationServlet")
public class UnitNavigationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UnitNavigationServlet() {
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
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		UnitHelper dao = new UnitHelper();
		WeaponHelper wao = new WeaponHelper();
		String act = request.getParameter("doThisToUnit");

		String path = "/viewAllUnitsServlet";

		if (act.equals("delete")) {
			try {
				Integer tempId = Integer.parseInt(request.getParameter("id"));
				Unit unitToDelete = dao.searchForUnitById(tempId);
				dao.deleteUnit(unitToDelete);

			} catch (NumberFormatException e) {
				System.out.println("Forgot to select a unit");
			}
		} else if (act.equals("edit")) {
			try {
				Integer tempId = Integer.parseInt(request.getParameter("id"));

				Unit unitToEdit = dao.searchForUnitById(tempId);
				request.setAttribute("unitToEdit", unitToEdit);
				path = "/edit-unit.jsp";
			} catch (NumberFormatException e) {
				System.out.println("Forgot to select an unit");
			}
		} else if (act.equals("add")) {
			List<Weapon> allWeapons = wao.showAllWeapons();
			request.setAttribute("allWeapons", allWeapons);
			path = "/add-unit.jsp";
		}

		getServletContext().getRequestDispatcher(path).forward(request, response);
	}

}
