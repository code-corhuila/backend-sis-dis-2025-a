package com.corhuila.backend_sis_dis_2025_a.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corhuila.backend_sis_dis_2025_a.Entity.Company;
import com.corhuila.backend_sis_dis_2025_a.IRepository.ICompanyRepository;
import com.corhuila.backend_sis_dis_2025_a.IService.ICompanyService;

@Service
public class CompanyService implements ICompanyService {

    @Autowired
    private ICompanyRepository repository;

    @Override
    public List<Company> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Company> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Company save(Company company) {
        return repository.save(company);
    }

    @Override
    public Company update(Company company, Long id) {
        Company companyUpdate = repository.findById(id).get();

        if (companyUpdate == null) {
            return null;            
        }

        companyUpdate.setNit(company.getNit());
        companyUpdate.setName(company.getName());
        companyUpdate.setPhone(company.getPhone());
        companyUpdate.setEmail(company.getEmail());
        companyUpdate.setAddress(company.getAddress());
        return repository.save(companyUpdate);
    }
    
}
