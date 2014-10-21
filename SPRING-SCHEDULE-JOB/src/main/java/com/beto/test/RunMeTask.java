package com.beto.test;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

//BEAN' IN SPRING BEAN'I OLDUGUNU BELIRTIYORUZ
@Component
public class RunMeTask {
    //@Scheduled(fixedDelay = 15000)// IS BITTIKTEN 15 SN SONRA TEKRAR CALISTIR
    //@Scheduled(fixedRate = 15000)//IS BASLADIKTAN 15 SN SONRA YENI BIR IS CALISTIR
    @Scheduled(cron = "*/5 * * * * ?")//5 SN ARA ILE SUREKLI CALIS
    public void getProcess() {
        System.out.println("METHOD IS RUNNING ~ TIME : " + new Date());
    }
}
