package ma.ngcloud.devops;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@SpringBootApplication
public class DevOpsApplication {

	@Value("${spring.application.env}")
	private String env;

	public static void main(String[] args) {
		SpringApplication.run(DevOpsApplication.class, args);
		System.out.println("http://localhost:80");
	}

	@GetMapping("/message")
	public Response getMessage() {
		Response obj = new Response();
		obj.setMessage("Bonjour");
		obj.setEnvironment(this.env);
		return obj;
	}


	@GetMapping("/")
	public String index() {

		return "Index Page";
	}

}
