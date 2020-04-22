/**
 * 
 */
package psa.springframework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by pyaesoneaung on 22/04/2020
 *
 */
@Controller
public class IndexController {
	
	@RequestMapping({"","/","/index"})
	public String getIndexPage() {
		return "index";
	}

}
