package firstAppHelloPackage;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstAppHello {

	@RequestMapping("/hello")
	public String sayHi() {
	return "hi";
}
}
