import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  constructor(private http:HttpClient) { }

  customerURL = "http://localhost:3000/customer";
  customerTypeURL = "http://localhost:3000/customerType";

  getAllCustomer(){
    return this.http.get(this.customerURL);
  }
  findById(id:any){
    return this.http.get(this.customerURL+'/'+id);
  }
  deleteCustomer(id:any){
    return this.http.delete(this.customerURL+'/'+id);
  }
}
