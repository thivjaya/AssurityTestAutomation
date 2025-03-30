import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseTest {

    public String apiBaseUrl;
    public String apiGetCategory;

    public RequestSpecification specification;

    private void loadConfig() throws IOException {
        Properties properties = new Properties();
        FileInputStream inputStream = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\resources\\config.properties");
        properties.load(inputStream);
        apiBaseUrl = properties.getProperty("api.baseURL");
        apiGetCategory = properties.getProperty("api.get.category");
    }

    @BeforeTest
    public void setUp() throws IOException {
        loadConfig();
        specification = new RequestSpecBuilder().setBaseUri(apiBaseUrl).build();
    }
}
