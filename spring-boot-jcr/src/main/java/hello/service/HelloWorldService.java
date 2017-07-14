package hello.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import hello.config.Config;

@Service
public class HelloWorldService {

	@Value("${my.name}")
	private String name;

	public String getHelloMessage() {
		Config conf = new Config();
		return "Hello JCR JCR Orozco Juan Ramirez: " + this.name + " YAML Props: " + conf.getServers();
	}

}
