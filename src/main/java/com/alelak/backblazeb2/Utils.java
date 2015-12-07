package com.alelak.backblazeb2;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Base64;

public class Utils {


    public static String getFileSha1Hash(File file) {
        FileInputStream fileInputStream = null;
        String sha1Hash = null;
        try {
            fileInputStream = new FileInputStream(file);
            sha1Hash = DigestUtils.sha1Hex(fileInputStream);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            IOUtils.closeQuietly(fileInputStream);
        }
        return sha1Hash;
    }

    public static String credToBasic64(final String accountId, final String applicationKey) {
        final String credentials = accountId + ":" + applicationKey;
        return "Basic " + Base64.getEncoder().encodeToString(credentials.getBytes());
    }
}
