package com.viniciuszanoli.hrpayroll.services;

import com.viniciuszanoli.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(long workerId, int days){
        return new Payment("Vinicius", 500.0, days);
    }
}
