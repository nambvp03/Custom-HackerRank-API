package cpp.hackerrank.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceCheckController {

	private static final String STATUS_CHECK_URL = "/custom-ranking/statuscheck";

	@RequestMapping(value=STATUS_CHECK_URL, method=RequestMethod.GET)
	public String statusCheck() {
		return "<center><h1><font color=#28B463>OK: System is running</font></h1></center>";
	}
}
