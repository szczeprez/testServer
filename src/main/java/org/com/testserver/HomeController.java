package org.com.testserver;
 
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springinpractice.ch04.model.DanePodstawowe;
import com.springinpractice.ch04.model.DodatkowaInformacja;
import com.springinpractice.ch04.model.Miejscowosc;
import com.springinpractice.ch04.model.Mieszkam;
import com.springinpractice.ch04.model.Plec;
import com.springinpractice.ch04.model.Preferencje;
import com.springinpractice.ch04.model.StatusZwiazku;
import com.springinpractice.ch04.model.Sylwetka;
import com.springinpractice.ch04.model.Wojewodztwo;
import com.springinpractice.ch04.service.DanePodstawoweService;
import com.springinpractice.ch04.service.MieszkamService;
import com.springinpractice.ch04.service.PlecService;
import com.springinpractice.ch04.service.PreferencjeService;


/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
    @Autowired private DanePodstawoweService danePodstawoweService;  
	@Autowired private MieszkamService mieszkamService; 
	@Autowired private PreferencjeService preferencjeService; 
	
	/**
	 * http://websystique.com/spring-security/spring-security-4-custom-login-form-annotation-example/
	 * 
	 * Simply selects the home view to render by returning its name.
	 */
	//Spring Security see this :
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(
		@RequestParam(value = "error", required = false) String error,
		@RequestParam(value = "logout", required = false) String logout) {

		ModelAndView model = new ModelAndView();
		if (error != null) {
			model.addObject("error", "Invalid username and password!");
		}

		if (logout != null) {
			model.addObject("msg", "You've been logged out successfully.");
		}
		model.setViewName("login");

		return model;

	}	
	
	@RequestMapping(value = "/")
	public String welcome(ModelMap model){
	
	    Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String name = auth.getName(); //get logged in username
		logger.info("Logged person = " + name);
 
		//DanePodstawowe daneP = danePodstawoweService.findByName("Kazimierz"); 		
//		List<DanePodstawowe> all = danePodstawoweService.getAll(); 
//		System.out.println(all);
		List<Preferencje> all = preferencjeService.getAll(); 
		System.out.println(all);
		for(Preferencje p: all){
			System.out.println(p.getId());
		}
		
		//Mieszkam mieszkam = mieszkamService.get(1L);
logger.info("after retrived !");
 
	     
		return "home"; 
	}
	
	@RequestMapping(value = { "/welcome**" }, method = RequestMethod.GET)
	public ModelAndView welcomePage() {

		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Custom Login Form");
		model.addObject("message", "This is welcome page!");
		model.setViewName("hello");
		return model;

	}
	@RequestMapping(value = "/admin**", method = RequestMethod.GET)
	public ModelAndView adminPage() {

		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Custom Login Form");
		model.addObject("message", "This is protected page!");
		model.setViewName("admin");

		return model;
	}
	
/*    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String adminPage(ModelMap model) {
        model.addAttribute("user", getPrincipal());
        return "admin";
    }*/
	
	@RequestMapping(value = "menu" , method=RequestMethod.GET)
	public String menu(Model model){
		return "headAndFooterAndMenu/menu"; 
	}
	@RequestMapping(value = "footer" , method=RequestMethod.GET)
	public String footer(Model model){
		return "headAndFooterAndMenu/footer"; 
	}
	@RequestMapping(value = "content" , method=RequestMethod.GET)
	public String content(Model model){
		return "contentDir/content"; 
	}

	@RequestMapping(value = "/portfolio", method = RequestMethod.GET)
	public String portfolio(Locale locale) {
		logger.info("Method portfolio() {}", locale);
		return "pages/portfolio";
	}

	@RequestMapping(value = "/sklepy-internetowe", method = RequestMethod.GET)
	public String sklepyInternetowe(Locale locale) {
		logger.info("Method sklepy-internetowew() {}", locale);
		return "pages/sklepy-internetowe";
	}

	@RequestMapping(value = "/social-media", method = RequestMethod.GET)
	public String socialMedia(Locale locale) {
		logger.info("Method social-media() {}", locale);
		return "pages/social-media";
	}

	@RequestMapping(value = "/kontakt", method = RequestMethod.GET)
	public String kontakt(Locale locale) {
		logger.info("Method kontakt() {}", locale);
		return "pages/kontakt";
	}
	     
    @RequestMapping(value = "/db", method = RequestMethod.GET)
    public String dbaPage(ModelMap model) {
        model.addAttribute("user", getPrincipal());
        return "dba";
    }
 
	//for 403 access denied page
	@RequestMapping(value = "/403", method = RequestMethod.GET)
	public ModelAndView accesssDenied() {

	  ModelAndView model = new ModelAndView();
		
	  //check if user is login
	  Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	  if (!(auth instanceof AnonymousAuthenticationToken)) {
		UserDetails userDetail = (UserDetails) auth.getPrincipal();	
		model.addObject("username", userDetail.getUsername());
	  }
		
	  model.setViewName("403");
	  return model;

	}
 
    @RequestMapping(value="/logout", method = RequestMethod.GET)
    public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null){    
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
        return "redirect:/";
    }
    
    private String getPrincipal(){
        String userName = null;
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
 
        if (principal instanceof UserDetails) {
            userName = ((UserDetails)principal).getUsername();
        } else {
            userName = principal.toString();
        }
        return userName;
    }
}
