package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.ecommerce.service.CitizenService;
import com.ecommerce.service.VaccineCenterService;

import java.util.List;

@Controller
@RequestMapping("/citizens")
public class CitizenController {

    @Autowired
    private CitizenService citizenService;

    @Autowired
    private VaccineCenterService vaccineCenterService;
}
