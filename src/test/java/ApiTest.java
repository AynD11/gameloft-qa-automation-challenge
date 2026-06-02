import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.lessThan;

public class ApiTest {

    @Test
    public void homepageShouldReturnStatusCode200() {

        given()
                .when()
                .get("https://play.ludigames.com")
                .then()
                .statusCode(200);
    }

    @Test
    public void homepageShouldRespondInAcceptableTime() {

        given()
                .when()
                .get("https://play.ludigames.com")
                .then()
                .time(lessThan(3000L));
    }
}
