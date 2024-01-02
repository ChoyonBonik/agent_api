package com.example.testapi.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.testapi.entity.Menuu;
import com.example.testapi.service.AgentService;

@RestController
@RequestMapping("/main")
public class MenuController {
	
	@Autowired
    private AgentService agentService;

    @GetMapping("/menu/{menuId}")
    public Menuu getMenuu(@PathVariable Long menuId) {
    	Menuu menu = agentService.getMenuu(menuId);
    	if (menu.getChild()) {
            menu.setSubMenu(agentService.getSubMenuOfMenu(menuId));
        } else {
            menu.setSubMenu(Collections.emptyList());
        }

        return menu;
        
    }
    
    

//    @GetMapping("/submenus")
//    public List<SubMenu> getSubMenus() {
//        return agentService.getSubMenuList();
//    }
    
    @GetMapping("/menus")
    public List<Menuu> getMenuu() {
        List<Menuu> menuList = agentService.getMenuuList();

        for (Menuu menu : menuList) {
            if (menu.getChild()) {
                
                menu.setSubMenu(agentService.getSubMenuOfMenu(menu.getMenuId()));
            } else {
                
                menu.setSubMenu(Collections.emptyList());
            }
        }

        return menuList;
    }

//    @GetMapping("/submenu/{subMenuId}")
//    public SubMenu getSubMenu(@PathVariable Long subMenuId) {
//        return agentService.getSubMenu(subMenuId);
//    }

}
