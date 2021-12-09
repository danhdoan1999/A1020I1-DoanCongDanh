import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {Router} from "@angular/router";
import {MatSnackBar} from "@angular/material/snack-bar";
import {EmployeeService} from "../../../services/employee.service";

@Component({
  selector: 'app-create-employee',
  templateUrl: './create-employee.component.html',
  styleUrls: ['./create-employee.component.css']
})
export class CreateEmployeeComponent implements OnInit {
  public employeeCreateForm!:FormGroup;
  public maxDate=new Date();
  public minDate=new Date(1900,0,1);
  employeePositionList:any;
  employeeEducationList:any;
  employeeDivisionList:any;

  constructor(private formBuilder:FormBuilder,
              private employeeService:EmployeeService,
              private router:Router,
              private snackBar:MatSnackBar) { }

  ngOnInit(): void {
    this.employeeService.getAllDivision().subscribe(data =>{
      this.employeeDivisionList = data;
    });
    this.employeeService.getAllEducation().subscribe(data =>{
      this.employeeEducationList = data;
    });
    this.employeeService.getAllPosition().subscribe(data =>{
      this.employeePositionList = data;
    });
    this.employeeCreateForm = this.formBuilder.group({
      'id':[],
      'idEmployee':[''],
      'name':['',[Validators.required]],
      'birthday':['',[Validators.required]],
      'idCard':['',[Validators.required,Validators.pattern('^[0-9]{9}$')]],
      'salary':['', [Validators.required, Validators.pattern('^[0-9]$')]],
      'phone': ['', [Validators.required, Validators.pattern('^((\\(84\\)\\+)|(0))((91)|(90))[\\d]{7}$')]],
      'email': ['', [Validators.required, Validators.email]],
      'address': ['', [Validators.required]],
      'position': ['', [Validators.required]],
      'educationDegree': ['', [Validators.required]],
      'division': ['', [Validators.required]],
    })
  }

  addNewEmployee() {
    if(!this.employeeCreateForm.invalid){
      this.employeeCreateForm.value.idEmployee = 'NV-'+Math.floor(Math.random()*1000);
      this.employeeService.createEmployee(this.employeeCreateForm.value).subscribe(data=>{
        this.snackBar.open("Add new employee success !!! ", "OK",{
          duration: 4000
        });
        this.router.navigateByUrl('employee-list').then(r => {})
      })
    }
  }
}
