package com.example;

import io.micronaut.http.annotation.*;

@Controller("/TBService")
public class TBServiceController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}