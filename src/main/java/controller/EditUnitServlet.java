package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Unit;

/**
 * Servlet implementation class EditUnitServlet
 */
@WebServlet("/editUnitServlet")
public class EditUnitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EditUnitServlet() {
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
		UnitHelper dao = new UnitHelper();

		Integer tempId = Integer.parseInt(request.getParameter("id"));
		String unitName = request.getParameter("unitName");
		int level = Integer.parseInt(request.getParameter("level"));
		int hitpoints = Integer.parseInt(request.getParameter("hitpoints"));
		int strength = Integer.parseInt(request.getParameter("strength"));
		int magic = Integer.parseInt(request.getParameter("magic"));
		int skill = Integer.parseInt(request.getParameter("skill"));
		int sp = Integer.parseInt(request.getParameter("sp"));
		int luck = Integer.parseInt(request.getParameter("luck"));
		int defense = Integer.parseInt(request.getParameter("defense"));
		int resistence = Integer.parseInt(request.getParameter("resistence"));

		Unit unitToUpdate = dao.searchForUnitById(tempId);
		unitToUpdate.setUnitName(unitName);
		unitToUpdate.setLevel(level);
		unitToUpdate.setHitPoints(hitpoints);
		unitToUpdate.setStrength(strength);
		unitToUpdate.setMagic(magic);
		unitToUpdate.setSkill(skill);
		unitToUpdate.setSp(sp);
		unitToUpdate.setLuck(luck);
		unitToUpdate.setDefense(defense);
		unitToUpdate.setResistence(resistence);

		dao.updateItem(unitToUpdate);

		getServletContext().getRequestDispatcher("/viewAllUnitsServlet").forward(request, response);
	}

}
