/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sdut.softlab;

import java.security.Key;
import org.apache.commons.codec.binary.Hex;
import org.apache.shiro.crypto.AesCipherService;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author huanlu
 */
public class EncodeTest {
    
    @Test
    public void encodeTest(){
        AesCipherService aesCipherService = new AesCipherService();
        aesCipherService.setKeySize(128);
        //生成key  
        Key key = aesCipherService.generateNewKey();
        String text = "hello";
        //加密  
        String encrptText
            = aesCipherService.encrypt(text.getBytes(), key.getEncoded()).toHex();
        //解密  
        String text2 = new String(aesCipherService.decrypt(Hex.decode(encrptText), key.getEncoded()).getBytes());

        Assert.assertEquals(text, text2);
    }
}
