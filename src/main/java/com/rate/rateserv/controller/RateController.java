package com.rate.rateserv.controller;

import com.rate.rateserv.controller.api.Rate;
import com.rate.rateserv.dto.RateDto;
import com.rate.rateserv.dto.enums.Categories;
import org.springframework.stereotype.Controller;

@Controller
public class RateController implements Rate {
    @Override
    public RateDto getRate(Categories category, String name, int qty) {
        return new RateDto();
    }
}
