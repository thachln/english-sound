package com.example.admin.englishthinh.Common;

import com.example.admin.englishthinh.Model.User;

/**
 * Created by Admin on 11/29/2018.
 */

public class Common {
    public static User currentUser;

    public static final String UPDATE = "Update";
    public static final String DELETE = "Delete";
    public static final int PICK_IMAGE_REQUEST = 71;

    public static String convertCodeToStatus(String status) {

        if ("0".equals(status))
            return "Placed";
        else if ("1".equals(status))
            return "On my way";
        else
            return "Shipped";


    }


}
