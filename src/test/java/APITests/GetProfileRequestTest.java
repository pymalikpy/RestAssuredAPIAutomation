package APITests;

import APIBase.AuthService;
import APIBase.UserProfileManagementService;
import RequestModels.LoginRequest;
import ResponseModels.LoginResponse;
import ResponseModels.UserProfileResponse;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class GetProfileRequestTest {

    @Test(description = "Get the profile ")
    public void getProfileInfoTest(){

        AuthService authService = new AuthService();
        Response response = authService.login(new LoginRequest("uday1234","uday1234"));
        LoginResponse loginResponse = response.as(LoginResponse.class);
        System.out.println(loginResponse.getToken());

        UserProfileManagementService userProfileManagementService = new UserProfileManagementService();
        response = userProfileManagementService.getProfile(loginResponse.getToken());

        UserProfileResponse userProfileResponse = response.as(UserProfileResponse.class);

        System.out.println(userProfileResponse.getFirstName());

        System.out.println(response.asPrettyString());




    }
}
