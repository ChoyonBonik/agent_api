//package com.example.testapi.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.testapi.entity.SubMenu;
//import com.example.testapi.service.AgentService;
//
//@RestController
//@RequestMapping("/submenu")
//public class SubMenuController {
//	
//	@Autowired
//    private AgentService agentService;
//
//
//    @GetMapping("/{subMenuId}")
//    public SubMenu getSubMenu(@PathVariable ("subMenuId") Long subMenuId) {
//
//        SubMenu subMenu = this.agentService.getSubMenu(subMenuId);
//
//        return subMenu;
//
//    }
//    
//	@RequestMapping("/menu/{menuId}")
//	public List<SubMenu> getContacts(@PathVariable("menuId") Long menuId){
//		return this.agentService.getSubMenuOfMenu(menuId);
//	}
//
//}
