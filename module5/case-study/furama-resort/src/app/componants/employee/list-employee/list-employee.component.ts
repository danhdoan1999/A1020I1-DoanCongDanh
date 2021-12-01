import { Component, OnInit } from '@angular/core';
import {IEmployee} from "../../../models/employee";

@Component({
  selector: 'app-list-employee',
  templateUrl: './list-employee.component.html',
  styleUrls: ['./list-employee.component.css']
})
export class ListEmployeeComponent implements OnInit {
  employees: IEmployee[] = [
    {
      id: 1,
      idEmployee: 'NV-001',
      name: 'Hiếu Nguyễn',
      birthday: '19/9/1992',
      idCard: '201623509',
      salary: '300',
      phone: '0905086365',
      email: 'hieunguyen12@gmail.com',
      address: 'Huế',
      position: 'lễ tân',
      educationDegree: 'đại học',
      division: 'quản lí'
    }
  ];

  constructor() { }

  ngOnInit(): void {
  }

}
