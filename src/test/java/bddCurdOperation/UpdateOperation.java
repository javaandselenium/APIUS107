package bddCurdOperation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class UpdateOperation {
@Test
public void tc3() {
	JSONObject j=new JSONObject();
	j.put("title","qwerty");
	
	given()
	.contentType(ContentType.JSON)
	.body(j)
	.patch("http://localhost:3000/posts/2000")
	.then()
	.log().all();
}
}
