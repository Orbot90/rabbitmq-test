package ru.orbot90.service;

import ru.orbot90.dto.SomeCoolDto;

/**
 * Created by plevako on 11.03.2016.
 */
public interface SomeCoolService {
    String COOL_SERVICE_QUEUE = "coolService";

    SomeCoolDto getCoolDto();
}
