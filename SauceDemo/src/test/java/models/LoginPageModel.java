package models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LoginPageModel {

    private String username;
    private String password;
}
