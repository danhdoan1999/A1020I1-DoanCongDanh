import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {CustomerService} from "../../../services/customer.service";
import {Router} from "@angular/router";
import {MatSnackBar} from "@angular/material/snack-bar";

@Component({
  selector: 'app-create-customer',
  templateUrl: './create-customer.component.html',
  styleUrls: ['./create-customer.component.css']
})
export class CreateCustomerComponent implements OnInit {


  public customerCreateForm!:FormGroup;
  public maxDate=new Date();
  public minDate=new Date(1900,0,1);
  constructor(
    private formBuilder:FormBuilder,
    private customerService:CustomerService,
    private router:Router,
    private snackBar:MatSnackBar) {}
    customerTypeList:any;
  ngOnInit(): void {
    this.customerService.getAllCustomerType().subscribe(data=>{
      this.customerTypeList = data;
    });
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
      'customerType': ['', [Validators.required]],
    })
  }
  addNewCustomer(){
    if(!this.customerCreateForm.invalid){
      this.customerCreateForm.value.idCustomer = 'KH-'+Math.floor(Math.random()*1000);
      this.customerService.createCustomer(this.customerCreateForm.value).subscribe(()=>{
        this.snackBar.open("Add new customer success !!! ", "OK",{
          duration: 4000
        });
        this.router.navigateByUrl('customer-list').then(r => {});
      })
    }
  }
}
