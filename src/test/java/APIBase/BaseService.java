package APIBase;

import static io.restassured.RestAssured.*;

import Filters.LoggingFilters;
import RequestModels.LoginRequest;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.HashMap;
import java.util.Map;


public class BaseService {

    //Base URI
    //Creating the request
    //Handling the response
    //This is a class that is wrapper for Rest Assured
    //Abstraction comes into picture with the wrapper class

    private static final String BASE_URL = "http://64.227.160.186:8080/";
    private RequestSpecification requestSpecification;

    static {
        RestAssured.filters(new LoggingFilters());
    }
    public BaseService(){
        requestSpecification = given().baseUri(BASE_URL);}
    protected Response postRequest(Object payload, String endpoint){
        return requestSpecification.contentType(ContentType.JSON).body(payload).post(endpoint);
    }

    protected Response putRequest(Object payload, String endpoint){
        return requestSpecification.contentType(ContentType.JSON).body(payload).put(endpoint);
    }
    protected Response getRequest(String endpoint){
        return requestSpecification.get(endpoint);
    }

    protected void setAuthToken(String token){
       requestSpecification.header("Authorization", "Bearer "+ token);

    }




}
