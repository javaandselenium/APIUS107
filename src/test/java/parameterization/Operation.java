package parameterization;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class Operation {
	@Test
	public void test5() {
		given()
		.queryParam("q","www02api")
		.queryParam("sort","stars")
		.get("https://api.github.com/search/repositories")
		.then().log().all();
	}

}
