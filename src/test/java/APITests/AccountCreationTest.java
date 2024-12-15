package APITests;

import APIBase.AuthService;
import RequestModels.SignUpRequest;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class AccountCreationTest {
    @Test(description ="Verify if account is created" )

    public void createAccountTest(){

        SignUpRequest signUpRequest = new SignUpRequest.Builder()
                .userName("pmalik")
                .password("pmalik123")
                .email("pinchumalik@gmail.com")
                .firstName("Prince")
                .lastName("Malik")
                .mobileNumber("8588030752")
                .build();

        AuthService authService = new AuthService();
        Response response = authService.signUp(signUpRequest);
        System.out.println(response.asPrettyString());

    }





}
