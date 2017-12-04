package com.example.android.fragmentreview;

import android.content.res.Resources;
import android.util.Log;
import android.widget.EditText;


/**
 * Created by TatianaM on 12/3/17.
 */

public class CheckingInput {
    Resources resources;
    private String newInput;



    public String editTextString(String editTextString) {

        switch (editTextString) {

            case "hi":
                newInput = "Hello there";
                return newInput;

            case "bye":
                newInput = "Bye!";

                return newInput;
            case "hello":
                newInput = "Time to say goodnight!";

                return newInput;

            default:
                return editTextString;


        }

    }

}
