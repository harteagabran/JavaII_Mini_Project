package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Weapon;

/**
 * Servlet implementation class AddWeaponServlet
 */
@WebServlet("/addWeaponServlet")
public class AddWeaponServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddWeaponServlet() {
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
		String weaponName = request.getParameter("weaponName");
		String tempMastery = request.getParameter("mastery");
		char mastery = tempMastery.charAt(0);
		int endurance = Integer.parseInt(request.getParameter("endurance"));
	
		Weapon wp = new Weapon(weaponName, mastery, endurance);
		WeaponHelper dao = new WeaponHelper();
		dao.insertWeapon(wp);

		getServletContext().getRequestDispatcher("/add-weapon.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
