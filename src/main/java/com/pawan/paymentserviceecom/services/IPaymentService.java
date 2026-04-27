package com.pawan.paymentserviceecom.services;

import com.razorpay.RazorpayException;
import com.stripe.exception.StripeException;

public interface IPaymentService {
    public String generatePaymentLink(String orderId,
                                      Long amount,
                                      String phoneNumber,
                                      String name,
                                      String email) throws RazorpayException, StripeException;
}
