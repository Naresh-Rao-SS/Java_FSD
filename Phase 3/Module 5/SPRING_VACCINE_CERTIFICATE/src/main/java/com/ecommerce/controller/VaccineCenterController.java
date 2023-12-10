package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.ecommerce.service.CitizenService;
import com.ecommerce.service.VaccineCenterService;

import java.util.List;

@Controller
@RequestMapping("/vaccine-centers")
public class VaccineCenterController {

    @Autowired
    private VaccineCenterService vaccineCenterService;

    @Autowired
    private CitizenService citizenService;
}
