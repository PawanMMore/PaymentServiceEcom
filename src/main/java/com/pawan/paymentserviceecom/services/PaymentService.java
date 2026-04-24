package com.pawan.paymentserviceecom.services;

import com.pawan.paymentserviceecom.strategies.PaymentGateway;
import com.pawan.paymentserviceecom.strategies.PaymentGatewayChooserStrategy;
import com.razorpay.RazorpayException;
import org.springframework.beans.factory.annotation.Autowired;

public class PaymentService implements IPaymentService{
    @Autowired
    private PaymentGatewayChooserStrategy paymentGatewayChooserStrategy;

    @Override
    public String generatePaymentLink(String orderId,
                                      Long amount,
                                      String phoneNumber,
                                      String name,
                                      String email) throws RazorpayException {
        PaymentGateway paymentGateway = paymentGatewayChooserStrategy.getBestPaymentGateway();


        return paymentGateway.generatePaymentLink(
                orderId,
                amount,
                phoneNumber,
                name,
                email);
    }
}
