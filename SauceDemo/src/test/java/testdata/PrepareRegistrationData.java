package testdata;

import constants.Credentials;
import models.LoginPageModel;

public class PrepareRegistrationData {
    public static LoginPageModel getValidStandardLoginData() {
        return LoginPageModel
                .builder()
                .username(Credentials.USERNAME)
                .password(Credentials.PASSWORD)
                .build();
    }

    public static LoginPageModel getValidLockedLoginData() {
        return LoginPageModel
                .builder()
                .username(Credentials.USERNAME_LOCKED)
                .password(Credentials.PASSWORD)
                .build();
    }

    public static LoginPageModel getValidProblemLoginData() {
        return LoginPageModel
                .builder()
                .username(Credentials.USERNAME_PROBLEM)
                .password(Credentials.PASSWORD)
                .build();
    }

    public static LoginPageModel getValidPerformanceGlitchLoginData() {
        return LoginPageModel
                .builder()
                .username(Credentials.USERNAME_PERFORMANCE_GLITCH)
                .password(Credentials.PASSWORD)
                .build();
    }
}
