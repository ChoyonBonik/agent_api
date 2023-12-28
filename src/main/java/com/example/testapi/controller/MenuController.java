//package com.example.testapi.controller;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.testapi.entity.Menuu;
//import com.example.testapi.service.AgentService;
//
//@RestController
//@RequestMapping("/menu")
//public class MenuController {
//	
//	@Autowired
//    private AgentService agentService;
//	
//
//    @GetMapping("/{menuId}")
//    public Menuu getMenu(@PathVariable ("menuId") Long menuId) {
//
//        Menuu menuu = this.agentService.getMenuu(menuId);
//        List subMenu = this.agentService.getSubMenuList();
//        menuu.setSubMenu(subMenu);
//        return menuu;
//
//    }
//
//}
