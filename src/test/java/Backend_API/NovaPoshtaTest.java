package Backend_API;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsString;

public class NovaPoshtaTest {

    @Test
    public void KucheryavoTest(){

        RestAssured.baseURI = "https://api.novaposhta.ua/v2.0/xml/";

        String postBody = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
                + "<file>\n"
                   + "<apiKey>252468795c71540730f78a03ab5ec04e</apiKey>\n"
                + "<modelName>Address</modelName>\n"
                + "<calledMethod>searchSettlements</calledMethod>\n"
                + "<methodProperties>\n"
                    + "<CityName>Кучеряво</CityName>\n"
                    + "<Limit>5</Limit>\n"
                + "</methodProperties>\n"
                + "</file>";

        given()
                .contentType("text/html; charset=utf-8")
                .log().all()
                .body(postBody)
        .when().
                post("v2.0/xml/Address/searchSettlements/").
        then().log().all().
                assertThat().statusCode(200)
                .body(containsString("Кучерявоволодимирівка"));

  }

}
