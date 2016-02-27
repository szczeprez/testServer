package org.com.testserver;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "login";
	}
	
	
	@RequestMapping(value = "/")
	public ModelAndView welcome(HttpServletRequest request,
			HttpServletResponse response){
		
		ModelAndView model = new ModelAndView("home");
		
		return model; 
	}
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
	
	/*@RequestMapping(value = "/pozycjonowanie-seo", method = RequestMethod.GET)
	public String pozycjonowanieStrongWww(Locale locale) {
		logger.info("Method pozycjonowanie_seo() {}", locale);
		return "pages/pozycjonowanie_seo";
	}

	@RequestMapping(value = "/projektowanie-stron-www", method = RequestMethod.GET)
	public String projektowanieStronWww(Locale locale) {
		logger.info("Method projektowanie-stron-www() {}", locale);
		return "pages/projektowanie-stron-www";
	}*/

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

}
