package com.dfcc.holiroo.converter;

import com.dfcc.holiroo.dataObject.UserDetail;
import com.dfcc.holiroo.form.UserDetailForm;
import com.dfcc.holiroo.util.KeyGenerateUtil;

import java.math.BigDecimal;

public class UserDetailForm2UserDetailConverter {
    public static UserDetail convert(UserDetailForm userDetailForm){
        UserDetail userDetail = new UserDetail();

        userDetail.setUserId(KeyGenerateUtil.genUniqueKey());
        userDetail.setUserName(userDetailForm.getUserName());
        userDetail.setUserEmail(userDetailForm.getUserEmail());
        userDetail.setUserPassword(userDetailForm.getUserPassword());
        userDetail.setUserBirthday(userDetailForm.getUserBirthday());
        userDetail.setUserGender(userDetailForm.getUserGender());
        userDetail.setUserPhone(userDetailForm.getUserPhone());
        userDetail.setUserAdmin(1);
        userDetail.setUserCredit(new BigDecimal("0"));

        return userDetail;
    }
}
