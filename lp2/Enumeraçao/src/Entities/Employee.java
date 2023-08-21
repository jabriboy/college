package Entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import EmployeeEnum.EmployeeLevel;

public class Employee {
	private String name;
	private EmployeeLevel level;
	private Double baseSalary;
	
	private Departament dep;
	private List<HourContract> contracts = new ArrayList<>();
	
	public Employee() {
		
	}
	
	public Employee(String name, EmployeeLevel level, Double baseSalary) {
		super();
		this.setName(name);
		this.setLevel(level);
		this.setBaseSalary(baseSalary);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public EmployeeLevel getLevel() {
		return level;
	}

	public void setLevel(EmployeeLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Departament getDep() {
		return dep;
	}

	public void setDep(Departament dep) {
		this.dep = dep;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	public void setContracts(List<HourContract> contract) {
		this.contracts = contract;
	}
	
	public void addContract(HourContract con) {
		this.contracts.add(con);
	
	}
	
	public void removeContract(HourContract con) {
		this.contracts.remove(con);
	}
	
	public Double salario(int year, int month) {
		double salary = this.baseSalary;
		Calendar calendar = Calendar.getInstance();
		
		for(HourContract c : contracts) {
			calendar.setTime(c.getDate());
			int c_year = calendar.get(Calendar.YEAR);
			int c_month = calendar.get(Calendar.MONTH);
			
			if((year == c_year) && (month == c_month)) {
				 salary += c.TotalValue();
			}
		}
		
		return salary;
	}
	
	
}
