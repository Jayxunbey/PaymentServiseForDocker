package uz.pdp.online.paymentserviceproject.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.pdp.online.paymentserviceproject.dto.PhonePayedResponseDto;
import uz.pdp.online.paymentserviceproject.dto.PhonePayingDto;

@RestController
@RequestMapping("/api/pay")
public class PaymentController {

    @PostMapping("/mobile")
    public ResponseEntity<PhonePayedResponseDto> mobilePayment(@RequestBody PhonePayingDto mobile) {

        PhonePayedResponseDto successfully = new PhonePayedResponseDto(mobile.getPhone(), "Successfully", mobile.getAmount());

        return ResponseEntity.ok(successfully);
    }
}
