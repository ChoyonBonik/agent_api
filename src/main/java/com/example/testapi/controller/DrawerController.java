package com.example.testapi.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.testapi.entity.DrawerElement;
import com.example.testapi.service.AgentService;

@RestController
@RequestMapping("/main")
public class DrawerController {
	
	@Autowired
    private AgentService agentService;
	

	@GetMapping("/drawerElement")
	public List<DrawerElement> getDrawerElement() {
	    List<DrawerElement> drawerElementList = agentService.getDrawerElementList();
	    return drawerElementList;
	}
}
