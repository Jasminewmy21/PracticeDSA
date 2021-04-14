package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class URL {
    public static void main(String[] args) throws IOException {

        java.net.URL url = new java.net.URL("http://www.baidu.com");

        /* 字节流 */
        InputStream is = url.openStream();

        /* 字符流 */
        InputStreamReader isr = new InputStreamReader(is, "utf-8");

        /* 提供缓存功能 */
        BufferedReader br = new BufferedReader(isr);

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }
}

