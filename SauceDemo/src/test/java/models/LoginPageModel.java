package models;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class LoginPageModel {

    private String username;
    private String password;
}
