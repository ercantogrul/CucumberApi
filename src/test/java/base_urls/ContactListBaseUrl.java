package base_urls;

import io.cucumber.java.Before;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static utilities.Authentication.generateToken;



public class ContactListBaseUrl {

    public static RequestSpecification spec;

    @Before("@Api") // her @Api senaryosu öncesi calisir
    //@Before // veya her senaryo öncesi calisir
    public void setSpec() {

        spec = new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .addHeader("Authorization","Bearer " + generateToken())
                .setBaseUri("https://thinking-tester-contact-list.herokuapp.com")
                .build();
    }


}