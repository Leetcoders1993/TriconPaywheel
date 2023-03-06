package com.restassured.java;

import static io.restassured.RestAssured.given;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;

public class OAuthDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  RestAssured.baseURI = "https://reqres.in/";
		  
		  String res = given().log().all(). queryParam("api/users").
		  headers("Content-Type", "application/json"). body("{\r\n" +
		  "    \"name\": \"morpheus\",\r\n" + "    \"job\": \"leader\"\r\n" +
		  "}").when().log().all().post().then().extract().response().asString();
		  System.out.println(res);
		  
		  JsonPath json = new JsonPath(res); json.get("a");
		  
		  json.getInt("courses.size()");
		  
		  given().log().all(). queryParam("", "").header("",""). multiPart("File",new
		  File("")). body("").when().get("").then(). extract().response().toString();
		  
		  
		  RequestSpecBuilder req = (RequestSpecBuilder) new RequestSpecBuilder().
		  setContentType("ContentType/JSON"). addQueryParam("Key", "Value"). build();
		  
		  given().spec((RequestSpecification)
		  req).body("").when().post().then().extract().response().toString();
		  
		  
		  ResponseSpecBuilder ress = (ResponseSpecBuilder) new ResponseSpecBuilder().
		  expectContentType("ContentType/json"). expectStatusCode(200). build();
		  
		  
		  
		  
		  
		 


	
	}

}
