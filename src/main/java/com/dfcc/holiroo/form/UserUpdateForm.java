package com.dfcc.holiroo.form;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class UserUpdateForm {
    @NotEmpty(message = "User id is necessary")
    private String userId;

    @NotEmpty(message = "User name is necessary")
    private String userName;

    @NotEmpty(message = "Password is necessary.")
    private String userPassword;

    @NotEmpty(message = "Email address is necessary.")
    private String userEmail;

    @NotEmpty(message = "Birthday is necessary.")
    private String userBirthday;

    @NotEmpty(message = "Gender is necessary")
    private String userGender;

    @NotEmpty(message = "Phone number is necessary.")
    private String userPhone;
}
