import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {ICustomer} from "../models/customer";

@Injectable({
  providedIn:'root'
})
export class CustomerService {
  public API:string = 'http://localhost:4200/customers';
  constructor(public http:HttpClient) {
  }
  getAllCustomer():Observable<ICustomer[]>{
    return this.http.get<ICustomer[]>(this.API);
  }
  addNewCustomer(customer:ICustomer):Observable<ICustomer>{
    return this.http.post<ICustomer>(this.API,customer)
  }
}
