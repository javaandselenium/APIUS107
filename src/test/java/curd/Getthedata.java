package curd;



import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Getthedata {
	@Test
	public void tc1() {
		Response resp = RestAssured.get(" http://localhost:3000/posts");
		System.out.println(resp.asString());
		//you want to JSON format
		resp.prettyPrint();
	}

}
