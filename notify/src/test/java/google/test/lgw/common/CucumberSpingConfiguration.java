package google.test.lgw.common;

import google.test.lgw.NotifyApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { NotifyApplication.class })
public class CucumberSpingConfiguration {}
