package nl.agility.commons.documentation.test;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.HTML;
import static org.apache.http.HttpStatus.SC_OK;

import org.junit.Test;

public abstract class BaseDocumentationIntegrationTest extends BaseTest {

    protected String API_DOCUMENTATION_URI = "/api-docs/api-guide.html";

    @Test
    public void verifyApiDocumentationIndexPage() {
        given()
                .when()
                .get(API_DOCUMENTATION_URI)
                .then()
                .statusCode(SC_OK)
                .contentType(HTML)
        ;
    }

}
