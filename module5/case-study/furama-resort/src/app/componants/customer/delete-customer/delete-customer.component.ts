import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {ICustomer} from "../../../models/customer";
import {CustomerService} from "../../../services/customer.service";

@Component({
  selector: 'app-delete-customer',
  templateUrl: './delete-customer.component.html',
  styleUrls: ['./delete-customer.component.css']
})
export class DeleteCustomerComponent implements OnInit {

  constructor(
    private dialogRef:MatDialogRef<DeleteCustomerComponent>,
    // nhan du lieu tu ben list customer
    @Inject(MAT_DIALOG_DATA) public data:any,
    private customerService:CustomerService
  ) { }

  customer !: ICustomer;

  ngOnInit(): void {
    this.customer = this.data;
    console.log(this.customer);
  }

  deleteConfirm() {
    this.customerService.deleteCustomer(this.customer.id).subscribe(()=>{
      this.dialogRef.close();
    })
  }
}
