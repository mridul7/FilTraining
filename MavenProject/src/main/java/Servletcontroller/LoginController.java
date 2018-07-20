package Servletcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
    @RequestMapping(value="/log",method=RequestMethod.GET)
	@ResponseBody
	public String show()
	{
		return "servlet_controller";
	}
    @RequestMapping(value="/log",method=RequestMethod.POST)
    public String showData(@RequestParam String name, @RequestParam String pwd, ModelMap model)
    {
    	System.out.println("show data called");
    	if(name.equals(pwd))
    	{
    		model.put("name", name);
    		model.put("pwd", pwd);
    		return "Welcome";
    	}
    	else
    	{
    		return "login";
    	}
    	
    }
}
