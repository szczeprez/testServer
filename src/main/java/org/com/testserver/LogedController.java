package org.com.testserver;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/loged", method = RequestMethod.GET)
public class LogedController {

	private static final Logger logger = LoggerFactory.getLogger(LogedController.class);

	@RequestMapping(value = "/pozycjonowanie-seo**", method = RequestMethod.GET)
	public String pozycjonowanieStrongWww(Locale locale) {
		logger.info("Method pozycjonowanie_seo() {}", locale);
		return "pages/pozycjonowanie_seo";
	}

	@RequestMapping(value = "/projektowanie-stron-www**", method = RequestMethod.GET)
	public String projektowanieStronWww(Locale locale) {
		logger.info("Method projektowanie-stron-www() {}", locale);
		return "pages/projektowanie-stron-www";
	}

 

 

/*	@RequestMapping(method = RequestMethod.POST)
	public String submitForm(Model model, @Validated Wojewodztwo wojo, BindingResult result) {
		logger.info("submitForm <<<<<<< " + model);

		model.addAttribute("color", wojo);
		String returnVal = "success Vojo";
		if (result.hasErrors()) {
			returnVal = "colorr";
		} else {
			model.addAttribute("color", wojo);
		}
		return returnVal;

	}*/

}
