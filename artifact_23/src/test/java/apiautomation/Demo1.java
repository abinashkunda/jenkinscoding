package apiautomation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Demo1 {
	
	@Test
	public void  reqres() {
		
		RestAssured.baseURI = "https://gutendex.com";
		
		Response response = RestAssured
				
				.given()
				.when()
				.get("/books")
				.then()
				.statusCode(200)
				.extract()
				.response();
		
		int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200, "Expected status code is 200");
		
		System.out.println("Response Body:");
        System.out.println(response.prettyPrint());
        
        int page = response.jsonPath().getInt("page");
        Assert.assertEquals(page, 2, "Expected page is 2");
        
        
	}

}
