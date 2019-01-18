package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class FacadeTestSuite {

    @Autowired
    private Facade facade;

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void findCompanyByNameFragmentTest() throws SearchException{
        //Given
        Company softcom = new Company("Softcom");
        Company netdot = new Company("Netdot");
        Company superbot = new Company("Super bot");

        //When
        companyDao.save(softcom);
        int softcomId = softcom.getId();
        companyDao.save(netdot);
        int netdotId = netdot.getId();
        companyDao.save(superbot);
        int superbotId = superbot.getId();

        List<Company> searchSoft = facade.findCompanyByNameFragment("soft");
        List<Company> searchOt = facade.findCompanyByNameFragment("ot");
        List<Company> searchO = facade.findCompanyByNameFragment("o");
        //Then
        Assert.assertEquals(1, searchSoft.size());
        Assert.assertEquals(2, searchOt.size());
        Assert.assertEquals(3, searchO.size());
        //Clean Up
        companyDao.delete(softcomId);
        companyDao.delete(netdotId);
        companyDao.delete(superbotId);
    }

    @Test
    public void findEmployeeByLastNameFragment() throws SearchException{
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);
        //When
        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(greyMatter);

        List<Employee> searchSmith = facade.findEmployeeByLastNameFragment("Smith");
        List<Employee> searchOv = facade.findEmployeeByLastNameFragment("ov");
        List<Employee> searchA = facade.findEmployeeByLastNameFragment("a");
        //Then
        Assert.assertEquals(1, searchSmith.size());
        Assert.assertEquals(1, searchOv.size());
        Assert.assertEquals(2, searchA.size());
        //Clean Up
        employeeDao.delete(johnSmith);
        employeeDao.delete(stephanieClarckson);
        employeeDao.delete(lindaKovalsky);

        companyDao.delete(softwareMachine);
        companyDao.delete(greyMatter);
        companyDao.delete(dataMaesters);
    }

}