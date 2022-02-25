/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jdk.nashorn.internal.runtime.regexp.joni.Regex;

/**
 *
 * @author johan
 */
public class Testing {

    //static Regex regex = new Regex("[0-9]+");
    static Pattern onlyNum = Pattern.compile("[0-9]+");
    static Matcher m;

    public static void main(String[] args) {
        m = onlyNum.matcher("1111111111");
        System.out.println("is " + (m.matches()));
    }

}
