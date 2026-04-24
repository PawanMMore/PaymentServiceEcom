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
        /*
        write an algorithm to choose your gateway
         */
        return stripeGateway;
        // logic to choose the best payment gateway based on the request
    }
}
