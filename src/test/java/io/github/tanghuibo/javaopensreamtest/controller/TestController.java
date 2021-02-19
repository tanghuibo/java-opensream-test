package io.github.tanghuibo.javaopensreamtest.controller;



import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;

/**
 * @author tanghuibo
 * @date 2021/2/19下午9:05
 */
public class TestController {

    @Test
    public void test() {
        int timeout = 3000000;
        try(InputStream inputStream = new URL("http://127.0.0.1:8080/test?timeout=" + timeout).openStream()) {
            byte[] bytes = new byte[2048];
            inputStream.read(bytes);
            System.out.println(new String(bytes, StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
