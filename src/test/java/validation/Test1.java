package validation;
import static io.restassured.RestAssured.*;

import java.util.ArrayList;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Test1 {
	@Test
	public void demo() {
	 Response resp = given()
			 .get("http://localhost:3000/posts");
		ArrayList lst=resp.jsonPath().get("title");
	 for(int i=0;i<lst.size();i++) {
		 System.out.println(lst.get(i));
	 }
	}

}
