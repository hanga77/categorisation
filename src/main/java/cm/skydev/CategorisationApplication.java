package cm.skydev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@SpringBootApplication
public class CategorisationApplication {
	
	@RequestMapping("/")
    @ResponseBody
    String home() {
      return "bienvenu dans cette application!";
    }


	public static void main(String[] args) {
		SpringApplication.run(CategorisationApplication.class, args);
	}
}
