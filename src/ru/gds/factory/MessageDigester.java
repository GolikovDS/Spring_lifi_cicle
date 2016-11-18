package ru.gds.factory;


import java.security.MessageDigest;
import java.util.Arrays;

public class MessageDigester {
    private MessageDigest digestl;
    private MessageDigest digest2;

    public void setDigest2(MessageDigest digest2) {
        this.digest2 = digest2;
    }

    public void setDigestl(MessageDigest digestl) {
        this.digestl = digestl;
    }

    public void digest(String msg) {


        System.out.println("Using digestl");

        digest(msg, digestl);

        System.out.println("Using digest2");

        digest(msg, digest2);
    }

    private void digest(String msg, MessageDigest digest) {
        System. out. println ( "Using alogrithm: " + digest.getAlgorithm());
        digest.reset();
        byte [] bytes = msg.getBytes() ;
        byte [] out = digest.digest(bytes);
        System.out.println(Arrays.asList(out).toString());
    }
}
