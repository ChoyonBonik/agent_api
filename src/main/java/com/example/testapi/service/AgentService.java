package com.example.testapi.service;
import java.util.List;

import com.example.testapi.entity.Menuu;
import com.example.testapi.entity.SubMenu;

public interface AgentService {
	
//	Menuu getMenuu(Long menuId);
//
//	SubMenu getSubMenu(Long subMenuId);
//	
//	List<SubMenu> getSubMenuList();
//	
	List<Menuu> getMenuuList();
	
	public List<SubMenu> getSubMenuOfMenu(Long menuId);

	public Menuu getMenuu(Long menuId);
}
