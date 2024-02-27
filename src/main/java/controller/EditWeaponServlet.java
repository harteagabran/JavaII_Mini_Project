package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Weapon;

/**
 * Servlet implementation class EditWeaponServlet
 */
@WebServlet("/editWeaponServlet")
public class EditWeaponServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EditWeaponServlet() {
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

		Integer tempId = Integer.parseInt(request.getParameter("id"));
		String weaponName = request.getParameter("weaponName");
		String tempMastery = request.getParameter("mastery");
		char mastery = tempMastery.charAt(0);
		int endurance = Integer.parseInt(request.getParameter("endurance"));
		
		Weapon weaponToUpdate = dao.searchForWeaponById(tempId);
		weaponToUpdate.setWeaponName(weaponName);
		weaponToUpdate.setMastery(mastery);
		weaponToUpdate.setEndurance(endurance);

		dao.updateWeapon(weaponToUpdate);

		getServletContext().getRequestDispatcher("/viewAllWeaponsServlet").forward(request, response);
	}

}
