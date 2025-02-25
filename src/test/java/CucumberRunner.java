import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features =
        {"src/test/resources"},
        glue = {"stepsDefs"},
        tags = {"@test4"},    //доступные тэги = @test1, @test2, @test3
        plugin = {"ru.yandex.qatools.allure.cucumberjvm.AllureReporter"})

public class CucumberRunner {
}
