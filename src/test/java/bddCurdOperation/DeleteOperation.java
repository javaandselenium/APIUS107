package bddCurdOperation;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class DeleteOperation {
	@Test
	public void tc5() {
		given()
		.delete("http://localhost:3000/posts/2000")
		.then()
		.log().all();
	}

}
