package com.example.testapi.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.testapi.entity.Menuu;
import com.example.testapi.entity.SubMenu;


@Service
public class AgentServiceImpl implements AgentService{
	
	private final List<Menuu> menuList = List.of(
            new Menuu(1L, "Agent Service", true, "https://picsum.photos/200/300"),
            new Menuu(2L, "Agent Service", true, "https://picsum.photos/200"),
            new Menuu(3L, "Agent Service", false, "https://picsum.photos/500"),
            new Menuu(4L, "Agent Service", true, "https://picsum.photos/1000")
    );

    private final List<SubMenu> subMenuList = List.of(
            new SubMenu(11L, "Move Money", "https://picsum.photos/900", 1L),
            new SubMenu(12L, "Move Money", "https://picsum.photos/100", 1L),
            new SubMenu(21L, "Move Money", "https://picsum.photos/400", 2L),
            new SubMenu(22L, "Move Money", "https://picsum.photos/400", 2L),
            new SubMenu(23L, "Move Money", "https://picsum.photos/400", 2L),
            new SubMenu(24L, "Move Money", "https://picsum.photos/400", 2L),
            new SubMenu(25L, "Move Money", "https://picsum.photos/400", 2L),
            new SubMenu(31L, "Move Money", "https://picsum.photos/400", 3L),
            new SubMenu(32L, "Move Money", "https://picsum.photos/400", 3L),
            new SubMenu(41L, "Move Money", "https://picsum.photos/400", 4L),
            new SubMenu(42L, "Move Money", "https://picsum.photos/400", 4L),
            new SubMenu(43L, "Move Money", "https://picsum.photos/400", 4L),
            new SubMenu(44L, "Move Money", "https://picsum.photos/400", 4L)
    );
    
   

//    @Override
//    public Menuu getMenuu(Long menuId) {
//        return this.menuList.stream().filter(menu -> menu.getMenuId().equals(menuId)).findAny().orElse(null);
//    }
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


}
