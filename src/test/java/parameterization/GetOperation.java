package parameterization;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class GetOperation {
@Test
public void tc6() {
	given()
	.pathParam("ownerName","javaandselenium")
	.pathParam("repoName","www02api")
	.get("https://api.github.com/repos/{ownerName}/{repoName}")
	.then().log().all();
}
}
