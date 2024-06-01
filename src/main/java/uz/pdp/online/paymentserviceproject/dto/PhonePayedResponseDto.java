package uz.pdp.online.paymentserviceproject.dto;

import lombok.Value;

@Value
public class PhonePayedResponseDto {
    private String phone;
    private String status;
    private Double amount;
}
