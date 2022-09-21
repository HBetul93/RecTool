package hooks;

import io.cucumber.java.Before;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import utilities.ConfigurationReader;

public class Hook {
    public static RequestSpecification spec;

    @Before
    public void setup(){

        spec = new RequestSpecBuilder().setBaseUri(ConfigurationReader.getProperty("base_url")).build();

    }
}
