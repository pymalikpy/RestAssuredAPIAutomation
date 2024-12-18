package APITests;

import APIBase.AuthService;
import RequestModels.LoginRequest;
import ResponseModels.LoginResponse;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(ListenersPackage.TestListener.class)

public class LoginAPITest {


    @Test(description = "Verify if login API is working...")
    public void loginTest(){

        LoginRequest loginRequest = new LoginRequest("uday1234", "uday1234");
        AuthService authService = new AuthService();

        Response response = authService.login(loginRequest);
        LoginResponse loginResponse = response.as(LoginResponse.class);

        System.out.println(response.asPrettyString());
        System.out.println(loginResponse.getRoles());

        Assert.assertTrue(loginResponse.getToken()!=null);
        //Assert.assertEquals(loginResponse.getEmail(),"ashauttap345@gmail.com");
        Assert.assertEquals(loginResponse.getId(),3);



//        baseURI="http://64.227.160.186:8080/";
//
//        //request specification interface allow you to specify how the request will look like
//
//        Response response = given().baseUri(baseURI).
//                header("Content-Type", "application/json")
//                .body("{\n" +
//                        "  \"username\": \"uday1234\",\n" +
//                        "  \"password\": \"uday1234\"\n" +
//                        "}")
//                .post("api/auth/login");
//
//        System.out.println(response.asPrettyString());
//
//        Assert.assertEquals(response.getStatusCode(), 200);

    }

}
