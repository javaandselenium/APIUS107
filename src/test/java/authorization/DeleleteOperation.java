package authorization;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class DeleleteOperation {
	@Test
	public void tc5() {
		given()
		.auth().oauth2("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")
		.delete("https://api.github.com/repos/javaandselenium/gitwindows")
		.then().log().all();
	}

}
