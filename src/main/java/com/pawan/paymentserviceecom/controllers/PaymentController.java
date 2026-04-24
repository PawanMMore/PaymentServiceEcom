package com.pawan.paymentserviceecom.controllers;

import com.pawan.paymentserviceecom.dtos.PaymentRequestDTO;
import com.pawan.paymentserviceecom.services.IPaymentService;
import com.razorpay.RazorpayException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {
    @Autowired
    private IPaymentService paymentService;

    @PostMapping
    public String generatePaymentLink(@RequestBody PaymentRequestDTO paymentRequestDto) throws RazorpayException {
        return paymentService.generatePaymentLink(paymentRequestDto.getOrderId(),
                paymentRequestDto.getAmount(),
                paymentRequestDto.getPhoneNumber(),
                paymentRequestDto.getName(),
                paymentRequestDto.getEmail());
    }

}
