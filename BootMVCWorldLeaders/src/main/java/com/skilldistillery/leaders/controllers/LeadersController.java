package com.skilldistillery.leaders.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.skilldistillery.leaders.data.LeadersDAO;
import com.skilldistillery.leadersdata.entities.Leaders;

@Controller
public class LeadersController {

	@Autowired
	private LeadersDAO leadersdao;

	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String index() {
		return "WEB-INF/index.jsp";
	}

	@RequestMapping(path = "getLeader.do", method = RequestMethod.GET)
	public ModelAndView getLeader(@RequestParam("leader") int id) {
		ModelAndView mv = new ModelAndView();
		Leaders leader = leadersdao.findById(id);
		mv.addObject("leader", leader);
		mv.setViewName("WEB-INF/diplayResults.jsp");
		return mv;
	}

	@RequestMapping(path = "editLeader.do", params = { "leaderID" }, method = RequestMethod.POST)
	public ModelAndView editLeader(@RequestParam("leaderID") int id, Leaders editLeader) {
		ModelAndView mv = new ModelAndView();
		System.out.println(editLeader);
		System.out.println("Leader id is " + id);
		
		Leaders leader = leadersdao.update(id, editLeader);
//		leader.setBirthPlace(leader.getBirthPlace());
//		leader.setCountry(leader.getCountry());
//		leader.setDateOfBirth(leader.getDateOfBirth());
//		leader.setFirstName(leader.getFirstName());
//		leader.setGender(leader.getGender());
//		leader.setLastName(leader.getLastName());
		mv.addObject("leaderID", leader);
		mv.setViewName("WEB-INF/displayEditResults.jsp");
		return mv;

	}

	@RequestMapping(path = "addLeader.do", params = { "leaderID" }, method = RequestMethod.POST)
	public ModelAndView addLeader(Leaders leader) {
		ModelAndView mv = new ModelAndView();
		leadersdao.create(leader);
		mv.addObject("leaderID", leader);
		mv.setViewName("WEB-INF/addLeaderResults.jsp");
		return mv;

	}

	@RequestMapping(path = "deleteLeader.do", method = RequestMethod.POST)
	public ModelAndView deleteLeader(@RequestParam(value = "leaderID") int id) {
		ModelAndView mv = new ModelAndView();
		boolean test = leadersdao.destroy(id);
		mv.addObject("leaderID", test);
		mv.setViewName("WEB-INF/displayResultsOfDelete.jsp");
		return mv;

	}

}
