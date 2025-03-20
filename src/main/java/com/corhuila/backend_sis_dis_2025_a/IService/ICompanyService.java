package com.corhuila.backend_sis_dis_2025_a.IService;

import java.util.List;
import java.util.Optional;

import com.corhuila.backend_sis_dis_2025_a.Entity.Company;

public interface ICompanyService {

    List<Company> findAll();
    Optional<Company> findById(Long id);
    void deleteById(Long id);
    Company save(Company company);
    Company update(Company company, Long id);
}
