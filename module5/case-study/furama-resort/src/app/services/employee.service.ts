import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {IEmployee} from "../models/employee";

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  constructor(private http:HttpClient) { }
  employeeURL = 'http://localhost:3000/employee';
  divisionURL = ' http://localhost:3000/division';
  positionURL = 'http://localhost:3000/position';
  educationURL= ' http://localhost:3000/educationDegree';
  getAllEmployee(){
    return this.http.get(this.employeeURL);
  }
  getAllDivision(){
    return this.http.get(this.divisionURL);
  }
  getAllEducation(){
    return this.http.get(this.educationURL);
  }
  getAllPosition(){
    return this.http.get(this.positionURL);
  }
  createEmployee(employee:IEmployee){
    return this.http.post(this.employeeURL,employee);
  }
}
