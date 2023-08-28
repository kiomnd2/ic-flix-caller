package kiomnd2.icflixcaller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;


@ConfigurationPropertiesScan
@SpringBootApplication
public class IcFlixCallerApplication {

    public static void main(String[] args) {
        SpringApplication.run(IcFlixCallerApplication.class, args);
    }

}
