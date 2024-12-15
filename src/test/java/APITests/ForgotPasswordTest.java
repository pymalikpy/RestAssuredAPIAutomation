package APITests;

import APIBase.AuthService;
import RequestModels.SignUpRequest;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class ForgotPasswordTest {

    @Test(description ="Verify if forgot-password is working" )

    public void forgotPasswordTest(){

        AuthService authService = new AuthService();
        Response response = authService.forgotPassword("baba123@email.com");
        System.out.println(response.asPrettyString());

    }
}
