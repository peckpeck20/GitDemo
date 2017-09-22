package fi.hh.server.Chapter_2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody

public class HellController {
	
	@RequestMapping("/hi")
	public String hello(@RequestParam(name="name",required=false,defaultValue="default") String name){
		return "hello " + name;
	}
	
	@RequestMapping("/hola")
	public String spanishGreeting(@RequestParam(value="name")String name,Model model){
		model.addAttribute("name", name);
		return "Hola " + name ;
	}
	
	//GET Method via URL
	@RequestMapping(value="/get", method=RequestMethod.GET)
	public String getGreeting(Model model){
		model.addAttribute("greeting",new Greeting());
		return "greeting";
	}
	
	
	
	
	
	
}
