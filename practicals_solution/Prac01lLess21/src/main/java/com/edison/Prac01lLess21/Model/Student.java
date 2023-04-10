package com.edison.Prac01lLess21.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbStudent")
public class Student {
	 @Id
	    @GeneratedValue
	    private int id;
	    private String name;
	    private int year;
	    private double mark;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		public double getMark() {
			return mark;
		}
		public void setMark(double mark) {
			this.mark = mark;
		}
	    
	    
		
	    
	    
}
