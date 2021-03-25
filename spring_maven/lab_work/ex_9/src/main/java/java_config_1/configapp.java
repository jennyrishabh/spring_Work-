package java_config_1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("java_config_1")
public class configapp {
	
	@Bean
	@Scope("prototype")
	public couch ccouch() {
		return new ccouch(fort123());
	}
	
	
	@Bean
	public fortune fort123() {
		return new fortune();
	}
	
	
	

	@Bean
	public ccouch ccouch1() {
		return new ccouch();
	}
	

}
