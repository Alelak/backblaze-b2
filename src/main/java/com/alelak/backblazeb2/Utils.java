package com.alelak.backblazeb2;

import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.Base64;

public class Utils {


    public static String getFileSha1Hash(File file) {
        InputStream in = null;
        String sha1Hash = null;
        try {
            MessageDigest sha1 = MessageDigest.getInstance("SHA-1");
            in = new FileInputStream(file);
            byte[] buffer = new byte[8192];
            int len = in.read(buffer);

            while (len != -1) {
                sha1.update(buffer, 0, len);
                len = in.read(buffer);
            }

            sha1Hash = new HexBinaryAdapter().marshal(sha1.digest());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null)
                    in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return sha1Hash;
    }

    public static String credToBasic64(final String accountId, final String applicationKey) {
        final String credentials = accountId + ":" + applicationKey;
        return "Basic " + Base64.getEncoder().encodeToString(credentials.getBytes());
    }
}
