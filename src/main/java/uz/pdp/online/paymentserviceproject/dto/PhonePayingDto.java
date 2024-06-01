package uz.pdp.online.paymentserviceproject.dto;

import lombok.Value;

@Value
public class PhonePayingDto {
    String phone;
    Double amount;
}
