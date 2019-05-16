package io.transwarp.demo.utils.javahost;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import io.leopard.javahost.JavaHost;

public class HostTest {
    private static void loadDns() throws IOException {
        InputStream is = HostTest.class.getClassLoader().getResourceAsStream("vdns.properties");
        Properties p = new Properties();
        p.load(is);
        JavaHost.updateVirtualDns(p);
    }
    public static void main(String[] args) throws IOException {
        loadDns();
        JavaHost.printAllVirtualDns();
        while(true){}
    }
}
