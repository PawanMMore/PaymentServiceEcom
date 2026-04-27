package com.pawan.paymentserviceecom.strategies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentGatewayChooserStrategy {

    @Autowired
    private Razorpay razorpayGateway;

    @Autowired
    private Stripe stripeGateway;


    public PaymentGateway getBestPaymentGateway(){
        return stripeGateway;
    }
}
