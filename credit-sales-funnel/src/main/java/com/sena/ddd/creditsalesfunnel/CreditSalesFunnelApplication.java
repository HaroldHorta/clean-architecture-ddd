package com.sena.ddd.creditsalesfunnel;

import com.sena.ddd.creditsalesfunnel.event.CreditSalesFunnelChannels;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(CreditSalesFunnelChannels.class)
public class CreditSalesFunnelApplication {

    public static void main(String[] args) {
        SpringApplication.run(CreditSalesFunnelApplication.class, args);
    }

}
