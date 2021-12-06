import { Component, OnInit } from '@angular/core';
import {CustomerService} from "../../../services/customer.service";
import {ActivatedRoute, Router} from "@angular/router";
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {MatSnackBar} from "@angular/material/snack-bar";

@Component({
  selector: 'app-edit-customer',
  templateUrl: './edit-customer.component.html',
  styleUrls: ['./edit-customer.component.css']
})
export class EditCustomerComponent implements OnInit {

  public customerEditForm!:FormGroup;
  public customerTypeList:any;
  public maxDate=new Date();
  public minDate=new Date(1900,0,1);
  constructor(private formBuilder:FormBuilder,
              private customerService:CustomerService,
              private router:Router,
              private routerActivated:ActivatedRoute,
              private snackBar:MatSnackBar) { }

  ngOnInit(): void {
    this.customerEditForm = this.formBuilder.group({
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
    });
    this.customerService.getAllCustomerType().subscribe(data=>{
      this.customerTypeList = data;
      this.customerService.findById(this.routerActivated.snapshot.params['id']).subscribe(data=>{
        this.customerEditForm.setValue(data);
      })
    });
  }

  editCustomer() {
    if(!this.customerEditForm.invalid){

      this.customerService.editCustomer(this.customerEditForm.value,this.customerEditForm.value.id).subscribe(()=>{
        this.snackBar.open("Update customer success !!! ", "OK",{
          duration: 4000
        });
        this.router.navigateByUrl('customer-list').then(r => {});
      })
    }
  }
}
