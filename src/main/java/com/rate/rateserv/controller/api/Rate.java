package com.rate.rateserv.controller.api;

import com.rate.rateserv.dto.RateDto;
import com.rate.rateserv.dto.enums.Categories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/rate")
public interface Rate {

    @GetMapping
    RateDto getRate(@RequestParam(name = "category", required = true) Categories category, @RequestParam(name = "item_name") String name, @RequestParam int qty);


}
