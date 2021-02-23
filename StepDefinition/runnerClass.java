package StepDefinition;
import org.junit.runner.RunWith; 
import cucumber.junit.Cucumber; 

@RunWith(Cucumber.class) 
@Cucumber.Options(features="Feature"
,glue={"StepDefinition"}
,format = {"pretty", "html:target/cucumber"}) 

public class runnerClass {

}
