package parameterization;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Demo {
	@Test
	public void test5() {
		given()
		.param("q","www02api")
		.param("sort","stars")
		.get("https://api.github.com/search/repositories")
		.then().log().all();
	}
}
