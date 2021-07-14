package bddCurdOperation;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class GetOperation {
	@Test
	public void gettc() {
		given()
		.get("http://localhost:3000/posts")
		.then()
		.log().all();
		
	}

}
