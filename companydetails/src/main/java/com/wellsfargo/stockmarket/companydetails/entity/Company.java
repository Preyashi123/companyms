package com.wellsfargo.stockmarket.companydetails.entity;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import lombok.Data;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name="Company")
@Table(name="Company" , schema = "stockexchange")

public class Company {

	@Id
	@Column(name="companyid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long companyId;
	
	@Column(name="companyname")
	private String companyName;
	
	@Column(name="companycode")
	private double companyCode;
	
	private String ceo;
	
	 @ElementCollection
	  @CollectionTable(
	        name="company_x_boardofdir",
	        joinColumns=@JoinColumn(name="assoccompanyid")
	  )
	  
	private List<BoardOfDir> boardOfDirs;
	
	private String sector;
	@Column(name="companydetails")
	private String companyDetails;
	
	 @ElementCollection
	  @CollectionTable(
	        name="company_x_stockexchange",
	        joinColumns=@JoinColumn(name="assoccompanycode")
	  )
	private List<AssocStockExchange> assocStockExchange;
	
	 
	public double getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(double companyCode) {
		this.companyCode = companyCode;
	}
	public long getCompanyId() {
		return companyId;
	}
	public void setCompanyId(long companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCeo() {
		return ceo;
	}
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}
	
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public String getCompanyDetails() {
		return companyDetails;
	}
	public void setCompanyDetails(String companyDetails) {
		this.companyDetails = companyDetails;
	}
	public List<BoardOfDir> getBoardOfDirs() {
		return boardOfDirs;
	}
	public void setBoardOfDirs(List<BoardOfDir> boardOfDirs) {
		this.boardOfDirs = boardOfDirs;
	}
	public List<AssocStockExchange> getAssocStockExchange() {
		return assocStockExchange;
	}
	public void setAssocStockExchange(List<AssocStockExchange> assocStockExchange) {
		this.assocStockExchange = assocStockExchange;
	}
	
	
	
	
}
