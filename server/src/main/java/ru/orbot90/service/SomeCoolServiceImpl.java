package ru.orbot90.service;

import org.springframework.stereotype.Service;
import ru.orbot90.dto.SomeCoolDto;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by plevako on 11.03.2016.
 */
@Service
public class SomeCoolServiceImpl implements SomeCoolService {

    @Override
    public SomeCoolDto getCoolDto() {
        System.out.println("Got some call!");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        SomeCoolDto dto = new SomeCoolDto();
        dto.setCoolParam1("Cheburator!!");
        dto.setCoolParam2("Krokodile!!");
        return dto;
    }
}
