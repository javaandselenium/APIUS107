package authorization;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
public class PostOperation {
	@Test
	public void tc2() {
		JSONObject j=new JSONObject();
		j.put("name","gitwindows");
		
		given()
		.auth().oauth2("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 ")
		.contentType(ContentType.JSON)
		.body(j)
		.post("https://api.github.com/user/repos")
		.then().log().all();
	}

}
