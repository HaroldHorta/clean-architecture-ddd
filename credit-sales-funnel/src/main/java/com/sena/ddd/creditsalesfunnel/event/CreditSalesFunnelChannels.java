package com.sena.ddd.creditsalesfunnel.event;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface CreditSalesFunnelChannels {

    @Output
    MessageChannel creditApplicationSubmittedOut();
}
