import { Component, OnInit } from '@angular/core';
import {CustomerService} from "../../../services/customer.service";
import {MatDialog} from "@angular/material/dialog";
import {DeleteCustomerComponent} from "../delete-customer/delete-customer.component";


@Component({
  selector: 'app-list-customer',
  templateUrl: './list-customer.component.html',
  styleUrls: ['./list-customer.component.css']
})
export class ListCustomerComponent implements OnInit {

  customers : any;
  p: any;

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

  searchCustomer(search:string) {
    this.customerService.findByName(search).subscribe(data=>{
      //console.log(data);
      this.customers = data;
      this.p = 1;
    })

  }

  sort() {
    this.customerService.sortByName().subscribe(data=>{
      this.customers=data;
    })
  }
}
