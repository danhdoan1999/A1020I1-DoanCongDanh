import { Component, OnInit } from '@angular/core';
import {ICustomer} from "../../../models/customer";
import {CustomerService} from "../../../services/customer.service";
import {MatDialog} from "@angular/material/dialog";
import {DeleteCustomerComponent} from "../delete-customer/delete-customer.component";
interface Type {
  value: string;
  viewValue: string;
}

@Component({
  selector: 'app-list-customer',
  templateUrl: './list-customer.component.html',
  styleUrls: ['./list-customer.component.css']
})
export class ListCustomerComponent implements OnInit {

  types: Type[] = [
    {value: 'Diamond', viewValue: 'Diamond'},
    {value: 'Platinum', viewValue: 'Platinium'},
    {value: 'Gold', viewValue: 'Gold'},
    {value: 'Silver', viewValue: 'Silver'},
    {value: 'Member', viewValue: 'Member'},
  ];

  customers : any;

  constructor(private customerService:CustomerService ,
              private dialog:MatDialog) { }

  ngOnInit(): void {
    this.customers = this.customerService.getAllCustomer().subscribe(data => {
      console.log(data);
      this.customers = data;
    });
  }
  openDialogDelete(id: any) {
    this.customerService.findById(id).subscribe(data=>{
      //console.log(data);
      const dialogRef = this.dialog.open(DeleteCustomerComponent,{
        width:'500px',
        height:'215px',
        data:data
      });
      dialogRef.afterClosed().subscribe(()=>{
        this.ngOnInit();
      })
    })
  }
}
