package com.example.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncryptUtils {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        System.out.printf(encoder.encode(""));
        // mật khẩu user1 là user123 : --> mã hoá thành : $2a$10$fdoZi3afYpJfLl6pvarse.BAguW9dyrHx12Jhhbjb/GaW3Qn.n0CK
        // mật khẩu admin1 là admin456 : --> mã hoá thành : $2a$10$wwTJDba/vyzZZd9N/oyQmuMstYwgaZHR8cXXNMZ2UJyitBOJd0d4K
    }
}
