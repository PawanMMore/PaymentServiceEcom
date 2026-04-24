package com.pawan.paymentserviceecom.configs;

import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RazorpaySClient {
    @Value("${razorpay.keyId}")
    private String razorpayKeyId;

    @Value("${razorpay.keySecret}")
    private String razorpayKeySecret;

    @Bean
    public RazorpayClient getRazorpayClient() throws RazorpayException {
        // Initialize Razorpay client with API key and secret
        return new RazorpayClient(razorpayKeyId,razorpayKeySecret);
    }
}
