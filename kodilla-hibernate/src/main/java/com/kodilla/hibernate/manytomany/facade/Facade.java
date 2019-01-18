package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Facade {
    @Autowired
    private CompanyDao company;
    @Autowired
    private EmployeeDao employee;
    private static final Logger LOGGER = LoggerFactory.getLogger(Facade.class);

    public List<Company> findCompanyByNameFragment(final String nameFragment) throws SearchException {
        LOGGER.info("Searching companies by a following name fragment: " + nameFragment);

        List<Company> foundCompanies = company.retrieveCompanyByNameFragment("%"+nameFragment+"%");
        if (foundCompanies.size() == 0) {
            LOGGER.error(SearchException.ERR_NOT_FOUND_COMPANY);
            throw new SearchException(SearchException.ERR_NOT_FOUND_COMPANY);
        }

        LOGGER.info(foundCompanies.size() + " companies match the search criteria");
        return foundCompanies;
    }

    public List<Employee> findEmployeeByLastNameFragment(final String lastNameFragment) throws SearchException {
        LOGGER.info("Searching employees by a following name fragment: " + lastNameFragment);

        List<Employee> foundEmployees = employee.retrieveEmployeeByLastNameFragment("%"+lastNameFragment+"%");
        if (foundEmployees.size() == 0) {
            LOGGER.error(SearchException.ERR_NOT_FOUND_EMPLOYEE);
            throw new SearchException(SearchException.ERR_NOT_FOUND_EMPLOYEE);
        }

        LOGGER.info(foundEmployees.size() + " employees match the search criteria");
        return foundEmployees;
    }


}
