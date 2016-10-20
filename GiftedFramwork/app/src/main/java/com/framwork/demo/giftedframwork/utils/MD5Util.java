package com.framwork.demo.giftedframwork.utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by cty on 16/10/18.
 */
public class MD5Util {
    public static String ENC_MD5 = "MD5";
    private MessageDigest md5;

    public MD5Util() {
        try {
            md5 = MessageDigest.getInstance(ENC_MD5);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    public static String compute(final String inStr) {
        byte[] byteArray = null;
        try {
            byteArray = inStr.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        StringBuffer hexValue = null;
        try {
            byte[] md5Bytes =  MessageDigest.getInstance(ENC_MD5).digest(byteArray);
            hexValue = new StringBuffer();

            for (int i = 0; i < md5Bytes.length; i++) {
                int val = (md5Bytes[i]) & 0xff;
                if (val < 16)
                    hexValue.append("0");
                hexValue.append(Integer.toHexString(val));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return hexValue.toString();
    }
}
