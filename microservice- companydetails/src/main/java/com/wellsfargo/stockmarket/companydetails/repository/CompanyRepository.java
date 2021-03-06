package com.wellsfargo.stockmarket.companydetails.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wellsfargo.stockmarket.companydetails.entity.Company;


@Repository
public interface CompanyRepository extends JpaRepository<Company, Long>  {
	
	@Query("select t.companyName from Company t where t.companyName like ?1%")
	public List<String> findByCompanyName(String companyName);
	
	@Query("from Company where companycode= ?1")
	 public Optional<Company> findByCompanyCode(long companyCode);
	
}
