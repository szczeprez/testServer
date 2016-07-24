package org.com.testserver;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.UriComponentsBuilder;

import com.springinpractice.ch04.model.DanePodstawowe;
import com.springinpractice.ch04.service.DanePodstawoweService;

@Controller
public class RestDanePodstawoweController {

	private static final Logger logger = LoggerFactory.getLogger(RestDanePodstawoweController.class);

	@Autowired
	private DanePodstawoweService danePodstawoweService;
	
	@RequestMapping(value = "/danepod", method = RequestMethod.GET)
	public ResponseEntity<List<DanePodstawowe>> getAllDanePodstawowe() {
		logger.info(">> IN method getAllDanePodstawowe {} ");
		
		List<DanePodstawowe> listDp = danePodstawoweService.getAll();

		for (DanePodstawowe dp : listDp) {
			System.out.println(dp.getId() + " " 
					+ dp.getMiejscowosc().getNazwa_miejscowosci() + ", "
					+ dp.getMieszkam().getStatusMieszkaniowy() + " bo jestem: "
					+ dp.getPreferencje().getPlec().getPlec() + " " 
					+ dp.getDodatkowaInformacja().getDodatkowaInfo()
					+ " " 
					+ dp.getWojewodztwo().getNazwa() + " ");
		}
		logger.debug("OUT method testQueries {}" + listDp);
		return new ResponseEntity<List<DanePodstawowe>>(listDp, HttpStatus.OK);

	}
	
	@RequestMapping(value = "/danepod/{id}", method = RequestMethod.GET )
	public ResponseEntity<DanePodstawowe> getDanePodstawoweById(@PathVariable("id") Long id){
		DanePodstawowe dp = danePodstawoweService.getDanePodstawoweById(id); 
		
		return new ResponseEntity<DanePodstawowe>(dp, HttpStatus.OK); 
	}
	
	@RequestMapping(value = "/danepod" , method = RequestMethod.POST)
	public ResponseEntity<Void> addDanePodstawowe(@RequestBody DanePodstawowe danePodstawowe,  UriComponentsBuilder builder) {
		
		boolean flag = danePodstawoweService.addDanePodstawowe(danePodstawowe); 
		
		if(flag == false){
			return new ResponseEntity<Void>(HttpStatus.CONFLICT); 
		}
		HttpHeaders headers = new HttpHeaders(); 
		headers.setLocation(builder.path("/danepod/{id})").buildAndExpand(danePodstawowe.getId()).toUri());
		
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
		
	}
	@RequestMapping(value="/danepod/{id}", method = RequestMethod.PUT )
	public ResponseEntity<DanePodstawowe> updatePerson(@RequestBody DanePodstawowe danePodstawowe) {
	
		danePodstawoweService.updateDanePodstawowe(danePodstawowe);
		
		return new ResponseEntity<DanePodstawowe>(danePodstawowe, HttpStatus.OK);
	}
	
	@RequestMapping(value="/danepod/{id}", method = RequestMethod.DELETE )
	public ResponseEntity<Void> deletePerson(@PathVariable("id") Long id) {
		
		danePodstawoweService.deleteDanePodstawowe(id);
		
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}	
	
}
