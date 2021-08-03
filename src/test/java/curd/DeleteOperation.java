package curd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteOperation {
@Test
public void delete() {
	Response resp = RestAssured.delete("http://localhost:3000/posts/2001");
	resp.prettyPrint();
}
}
