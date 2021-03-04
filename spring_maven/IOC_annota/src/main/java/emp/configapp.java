package emp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("emp")

public class configapp {
	
	
		
		@Bean
		public iWorker lazy() {
			return new lazyworker(fort123());
		}
		
		
		@Bean
		public fortune fort123() {
			return new fortune();
		}

}
