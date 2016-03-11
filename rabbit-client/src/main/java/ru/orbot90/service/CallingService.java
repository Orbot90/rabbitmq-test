package ru.orbot90.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import ru.orbot90.dto.SomeCoolDto;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by plevako on 11.03.2016.
 */
@Service
public class CallingService {

    @Autowired
    private SomeCoolService coolService;

    @Scheduled(fixedDelay = 1000)
    public void callCoolService() {
        ExecutorService executorService = Executors.newFixedThreadPool(20);
        System.out.println("Called cool service");
        SomeCoolDto dto = coolService.getCoolDto();
        System.out.println(dto);
    }
}
