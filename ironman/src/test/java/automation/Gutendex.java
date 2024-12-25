package automation;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Gutendex {
	
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
			
			System.out.println("Response Body:");
	        System.out.println(response.prettyPrint());
		}

	}

}
