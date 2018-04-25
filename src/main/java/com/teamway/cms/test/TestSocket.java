package com.teamway.cms.test;

import java.io.IOException;
import java.net.Socket;

public class TestSocket {
    public static void main(String[] args) throws IOException {
        final Socket socket = new Socket("192.168.12.32", 8998);
        socket.shutdownOutput();
    }
}
