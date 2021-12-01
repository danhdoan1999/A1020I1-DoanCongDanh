import { Component, OnInit } from '@angular/core';
import {ICustomer} from "../../../models/customer";


@Component({
  selector: 'app-list-customer',
  templateUrl: './list-customer.component.html',
  styleUrls: ['./list-customer.component.css']
})
export class ListCustomerComponent implements OnInit {


    public customers:ICustomer[] = [
    {
      id: 1,
      idCustomer: 'KH-001',
      name: 'danh đoàn',
      birthday: '02/12/1999',
      gender: 'male',
      idCard: '201814047',
      phone: '0905081300',
      email: 'danhdoan19999@gmail.com',
      address: 'Đà nẵng',
      type: 'diamond'
    },
    {
      id: 2,
      idCustomer: 'KH-002',
      name: 'Hiền lê',
      birthday: '03/10/1995',
      gender: 'male',
      idCard: '201814000',
      phone: '0905081333',
      email: 'hien123@gmail.com',
      address: 'Đà nẵng',
      type: 'gold'
    }
  ];

  constructor() { }

  ngOnInit(): void {
  }
  getAllCustomer(customer:any){
    this.customers = customer;
  }
}
