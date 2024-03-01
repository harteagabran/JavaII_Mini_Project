package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Unit;
import model.Weapon;

/**
 * Servlet implementation class AddUnitServlet
 */
@WebServlet("/addUnitServlet")
public class AddUnitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddUnitServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		WeaponHelper wh = new WeaponHelper();
		
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
		
		String[] selectedWeapons = request.getParameterValues("allWeaponsToAdd");
		List<Weapon> selectedWeaponsInList = new ArrayList<Weapon>();
		//make sure something was selected – otherwise we get a null pointer exception
		if (selectedWeapons != null && selectedWeapons.length > 0) {
    		for(int i = 0; i<selectedWeapons.length; i++) {
	    		System.out.println(selectedWeapons[i]);
	    		Weapon c = wh.searchForWeaponById(Integer.parseInt(selectedWeapons[i]));
	    		selectedWeaponsInList.add(c);
    		}
		}
		
		Unit u = new Unit(unitName,level,hitpoints,strength,magic,skill,sp,luck,defense,resistence, selectedWeaponsInList);
		UnitHelper dao = new UnitHelper();
		dao.insertUnit(u);
		
		getServletContext().getRequestDispatcher("/unit-menu.html").forward(request, response);
	}
    
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
