/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testingutest.leapyear;

/**
 *
 * @author Rahul
 */
public class LeapYear {

    public String isLeapYear(int year) {
        Boolean isLeap = testForLeapYear(year);

        if (isLeap.equals(Boolean.TRUE)) {
            return year + " is Leap Year.";
        } else {
            return year + " is not Leap Year.";
        }
    }

    private Boolean testForLeapYear(int year) {
        if ((year % 100 == 0 && year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            return true;
        }
        return false;
    }
}
