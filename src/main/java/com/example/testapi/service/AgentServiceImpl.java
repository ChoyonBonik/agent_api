package com.example.testapi.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.testapi.entity.DrawerElement;
import com.example.testapi.entity.Menuu;
import com.example.testapi.entity.SubMenu;


@Service
public class AgentServiceImpl implements AgentService{
	
	private final List<Menuu> menuList = List.of(
            new Menuu(1L, "Home Pages", true, "https://picsum.photos/200/300"),
            new Menuu(2L, "Pages", true, "https://picsum.photos/200"),
            new Menuu(3L, "Menu", true, "https://picsum.photos/500"),
            new Menuu(4L, "Location", false, "https://picsum.photos/1000")
    );

    private final List<SubMenu> subMenuList = List.of(
            new SubMenu(11L, "Home v1", "https://picsum.photos/900", 1L, "/"),
            new SubMenu(12L, "Home v2", "https://picsum.photos/100", 1L, "/home-v2"),
            new SubMenu(21L, "About Us", "https://picsum.photos/400", 2L, "/about"),
            new SubMenu(22L, "Login", "https://picsum.photos/400", 2L, "/login"),
            new SubMenu(23L, "Sign Up", "https://picsum.photos/400", 2L, "/register"),
            new SubMenu(24L, "Checkout", "https://picsum.photos/400", 2L, "/checkout"),
            new SubMenu(25L, "Cart", "https://picsum.photos/400", 2L, "/cart"),
            new SubMenu(31L, "Menu v1", "https://picsum.photos/400", 3L, "/menu-v1"),
            new SubMenu(32L, "Menu v2", "https://picsum.photos/400", 3L, "/menu-v2")
    );
    

    private final List<DrawerElement> drawerElementList= List.of(
            new DrawerElement(1L, "HOME", "https://picsum.photos/400"),
            new DrawerElement(2L, "BANK ACCOUNT DETAILS", "https://picsum.photos/400"),
            new DrawerElement(3L, "SUMMARIES", "https://picsum.photos/400"),
            new DrawerElement(4L, "ABOUT US", "https://picsum.photos/400"),
            new DrawerElement(5L, "SETTINGS", "https://picsum.photos/400"),
            new DrawerElement(6L, "LOGOUT", "https://picsum.photos/400")
    );
    
    

    
    
//
//    @Override
//    public List<SubMenu> getSubMenuList() {
//        return this.subMenuList;
//    }
//   
    @Override
    public List<Menuu> getMenuuList(){
    	return this.menuList;
    }
//
//    @Override
//    public SubMenu getSubMenu(Long subMenuId) {
//        return this.subMenuList.stream().filter(subMenu -> subMenu.getSubMenuId().equals(subMenuId)).findAny().orElse(null);
//    }
 
	@Override
	public List<SubMenu> getSubMenuOfMenu(Long menuId) {
		return subMenuList.stream().filter(subMenu -> subMenu.getMenuId()== menuId).collect(Collectors.toList());
	
}

	@Override
	public Menuu getMenuu(Long menuId) {
		
		return this.menuList.stream().filter(menu -> menu.getMenuId().equals(menuId)).findAny().orElse(null);
	}

	@Override
	public List<DrawerElement> getDrawerElementList() {
		
		return this.drawerElementList;
	}


}
