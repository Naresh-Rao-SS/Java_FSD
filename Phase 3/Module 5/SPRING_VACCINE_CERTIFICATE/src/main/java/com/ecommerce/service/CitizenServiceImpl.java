package com.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.entity.Citizen;
import com.ecommerce.entity.VaccineCenter;
import com.ecommerce.repository.CitizenRepository;

import java.util.List;

@Service
public class CitizenServiceImpl implements CitizenService {

    // Inject CitizenRepository
    @Autowired
    private CitizenRepository citizenRepository;

    @Override
    public void addCitizen(Citizen citizen) {
        citizenRepository.save(citizen);
    }

    @Override
    public void updateCitizen(Citizen citizen) {
        citizenRepository.save(citizen);
    }

    @Override
    public void deleteCitizen(Long id) {
        citizenRepository.deleteById(id);
    }

    @Override
    public Citizen getCitizenById(Long id) {
        return citizenRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Citizen not found"));
    }

    @Override
    public List<Citizen> getAllCitizens() {
        return citizenRepository.findAll();
    }

    @Override
    public List<Citizen> getCitizensByVaccinationCenter(VaccineCenter vaccineCenter) {
        return citizenRepository.findByVaccinationCenter(vaccineCenter);
    }

    // Custom exception class
    public class NotFoundException extends RuntimeException {
        public NotFoundException(String message) {
            super(message);
        }
    }
}
