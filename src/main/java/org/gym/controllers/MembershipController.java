package org.gym.controllers;

import org.gym.models.Membership;
import org.gym.services.MembershipService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class MembershipController {
    private MembershipService membershipService;
    public MembershipController(MembershipService membershipService){
        this.membershipService = membershipService;
    }


    @GetMapping("/getAllMemberships")
    public ModelAndView getAllMemberships(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("memberships.jsp");
        List<Membership> memberships = membershipService.getAllMemberships();
        modelAndView.addObject("memberships", memberships);
        return modelAndView;
    }
    @PostMapping("/saveNewMembership")
    public void saveNewMembership(@RequestParam("name") String name, @RequestParam("price") Integer price, @RequestParam("duration") Integer duration, @RequestParam("daysPerWeek") Integer daysPerWeek, Model model){

        Membership membership = new Membership();
        membership.setName(name);
        membership.setPrice(price);
        membership.setDuration(duration);
        membership.setDaysPerWeek(daysPerWeek);
        membershipService.saveMembership(membership);
    }
    @GetMapping("/addNewMembership")
    public String addNewMembership(){
        return "memberships.jsp";
    }

}
