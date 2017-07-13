package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hello.service.HelloWorldService;

@RestController
//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
@SpringBootApplication //This annotation is equivalent to use the 3 previous ones with their default attributes. 
public class SampleController {
	
	@Autowired
	private HelloWorldService helloWorldService;

    @RequestMapping("/")
    String home() {
        return "Hello World! - " + helloWorldService.getHelloMessage();
    }

    public static void main(String[] args) throws Exception {
    	SpringApplication app = new SpringApplication(SampleController.class);
    	//app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }
}