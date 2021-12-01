import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {ICustomer} from "../../../models/customer";
import {ListCustomerComponent} from "../list-customer/list-customer.component";

@Component({
  selector: 'app-create-customer',
  templateUrl: './create-customer.component.html',
  styleUrls: ['./create-customer.component.css']
})
export class CreateCustomerComponent implements OnInit {


  customerCreateForm!:FormGroup

  constructor(
    public formBuilder:FormBuilder,
    public customerComponent:ListCustomerComponent) {

  }

  ngOnInit(): void {
    this.customerCreateForm = this.formBuilder.group({
      'id':[],
      'idCustomer':[''],
      'name':['',[Validators.required]],
      'birthday': ['', [Validators.required]],
      'gender': ['', [Validators.required]],
      'idCard': ['', [Validators.required, Validators.pattern('^[0-9]{9}$')]],
      'phone': ['', [Validators.required, Validators.pattern('^((\\(84\\)\\+)|(0))((91)|(90))[\\d]{7}$')]],
      'email': ['', [Validators.required, Validators.email]],
      'address': ['', [Validators.required]],
      'type': ['', [Validators.required]],
    })
  }
  addNewCustomer(){
    this.customerCreateForm.value.idCustomer = 'KH-'+ Math.floor(Math.random()*10000);
    console.log(this.customerCreateForm.value)
    this.customerComponent.customers.push(this.customerCreateForm.value);
  }
}
