package com.pawan.paymentserviceecom.services;

import com.pawan.paymentserviceecom.strategies.PaymentGateway;
import com.pawan.paymentserviceecom.strategies.PaymentGatewayChooserStrategy;
import com.razorpay.RazorpayException;
import com.stripe.exception.StripeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService implements IPaymentService{
    @Autowired
    private PaymentGatewayChooserStrategy paymentGatewayChooserStrategy;

    @Override
    public String generatePaymentLink(String orderId,
                                      Long amount,
                                      String phoneNumber,
                                      String name,
                                      String email) throws RazorpayException , StripeException {
        PaymentGateway paymentGateway = paymentGatewayChooserStrategy.getBestPaymentGateway();


        return paymentGateway.generatePaymentLink(
                orderId,
                amount,
                phoneNumber,
                name,
                email);
    }
}
