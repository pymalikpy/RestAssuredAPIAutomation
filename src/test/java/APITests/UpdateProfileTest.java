package APITests;

import APIBase.AuthService;
import APIBase.UserProfileManagementService;
import RequestModels.LoginRequest;
import RequestModels.ProfileRequest;
import ResponseModels.LoginResponse;
import ResponseModels.UserProfileResponse;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UpdateProfileTest {

    @Test(description = "Update the profile test ")
    public void updateProfileTest() {

        AuthService authService = new AuthService();
        Response response = authService.login(new LoginRequest("uday1234", "uday1234"));
        LoginResponse loginResponse = response.as(LoginResponse.class);
        System.out.println(response.asPrettyString());

        System.out.println("----------------------------------------------------");

        UserProfileManagementService userProfileManagementService = new UserProfileManagementService();

        response = userProfileManagementService.getProfile(loginResponse.getToken());

        System.out.println(response.asPrettyString());

        UserProfileResponse userProfileResponse = response.as(UserProfileResponse.class);

        Assert.assertEquals(userProfileResponse.getUsername(),"uday1234");

        System.out.println("-------------------------------------------------------");

        ProfileRequest profileRequest = new ProfileRequest.Builder()
                .firstName("Mo")
                        .lastName("Salah")
                                .email("mo@email.com")
                                        .mobileNumber("777777777")
                                                .build();

        response = userProfileManagementService.updateProfile(loginResponse.getToken(),profileRequest);

        System.out.println(response.asPrettyString());












    }
    }
