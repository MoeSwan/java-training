package com.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;
 
@Entity
@Table(name="employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull(message="required to fill numbers")  // for integer validation 
    @Column(name = "id")
    private Integer id;
    @Size(min=5,message="required to fill min 5 cha")// for string validation   
    @Column(name = "name")
    private String name;
    @NotNull(message="required to fill numbers")
    @Column(name = "age")
    private Integer age;
    @Size(min=5,message="required to fill min 5 cha") 
    @Column(name = "dept")
    private String dept;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
      
  
}
