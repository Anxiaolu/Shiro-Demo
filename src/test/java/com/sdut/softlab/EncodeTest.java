/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sdut.softlab;

import com.sdut.softlab.entity.UpmsUser;
import java.lang.reflect.Method;
import org.junit.Test;

/**
 *
 * @author huanlu
 */
public class EncodeTest {

    @Test
    public void test() {

        UpmsUser cls = new UpmsUser();
        Class c = cls.getClass();

        try {
            // parameter type is null  
            Method m = c.getDeclaredMethod("show", null);
            System.out.println("method = " + m.toString());

            // method Integer  
            Class[] cArg = new Class[1];
            cArg[0] = Integer.class;
            Method lMethod = c.getDeclaredMethod("showInteger", cArg);
            System.out.println("method = " + lMethod.toString());

        } catch (NoSuchMethodException e) {
            System.out.println(e.toString());
        }
    }

    private Integer show() {
        return 1;
    }

    public void showInteger(Integer i) {
        this.i = i;
    }
    public int i = 78655;
}
