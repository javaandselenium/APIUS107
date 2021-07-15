package authorization;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
public class UpdateOperation {
	@Test
	public void tc3() {
		JSONObject j=new JSONObject();
		j.put("private",false);
		j.put("description","demo details");
		
		given()
		.auth().oauth2("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")
		.contentType(ContentType.JSON)
		.body(j)
		.patch("https://api.github.com/repos/javaandselenium/gitwindows")
		.then().log().all();
	}

}
