package com.company;

import java.util.Locale;

public class Car {
                    //HERE, FROM 6-10, WE HAVE NO. OF VARIABLES(FIELD) THAT IS PART OF CLASS-CAR AND THIS FIELD CAN BE NO. OF

    private int doors; //FIELD
    private int wheels; //FIELD
    private String model; //FIELD........//public String model;
    private String engine; //FIELD
    private String colour; //FIELD

                    //FROM 6-10, ALL FIELD IS THE STATE OF OBJECT

    public void setModel (String model) {//setter
        String validModel = model.toLowerCase();

        if (validModel.equals("carrera") || validModel.equals("commondore")) {
            this.model = model;
        }else {
            this.model = "Unknown";
        }
    }

    public String getModel(){//getter
        return this.model;
    }
}


