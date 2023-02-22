/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author josesalazar
 */
public class Log {

    public static void e(String msg) {
        System.err.println("> Error : " + msg);
    }

    public static void i(String msg) {
        System.out.println("> Info : " + msg);
    }
}
