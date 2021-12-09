import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {ICustomer} from "../models/customer";

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
  getAllCustomerType(){
    return this.http.get(this.customerTypeURL);
  }
  createCustomer(customer:ICustomer){
    return this.http.post(this.customerURL,customer)
  }
  editCustomer(customer:ICustomer,id:number){
    return this.http.put<ICustomer>(this.customerURL+'/'+id,customer);
  }

  findByName(search:string) {
    return this.http.get(this.customerURL+'?name_like='+search);
  }

  sortByName() {
    return this.http.get(this.customerURL+'?_sort=name');
  }
}
