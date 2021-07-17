package pojo;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Demo {
	@Test
	public void tc2() {
		Project p=new Project(87,"apitest","john","omkar");
		
		given()
		.contentType(ContentType.JSON)
		.body(p)
		.post("http://localhost:3000/posts")
		.then().log().all();
		
	}

}
