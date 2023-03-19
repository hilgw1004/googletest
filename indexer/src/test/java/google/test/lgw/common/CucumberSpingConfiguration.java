package google.test.lgw.common;

import google.test.lgw.IndexerApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { IndexerApplication.class })
public class CucumberSpingConfiguration {}
