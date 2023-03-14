package shoppingmallvanilla.common;


import shoppingmallvanilla.NotifcationApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { NotifcationApplication.class })
public class CucumberSpingConfiguration {
    
}
