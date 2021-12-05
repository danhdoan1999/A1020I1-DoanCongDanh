import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {ListCustomerComponent} from "./componants/customer/list-customer/list-customer.component";
import {CreateCustomerComponent} from "./componants/customer/create-customer/create-customer.component";
import {HomeComponent} from "./componants/home/home.component";
import {ListEmployeeComponent} from "./componants/employee/list-employee/list-employee.component";
import {EditCustomerComponent} from "./componants/customer/edit-customer/edit-customer.component";
import {CreateEmployeeComponent} from "./componants/employee/create-employee/create-employee.component";
import {EditEmployeeComponent} from "./componants/employee/edit-employee/edit-employee.component";
import {ListServiceComponent} from "./componants/service/list-service/list-service.component";
import {CreateServiceComponent} from "./componants/service/create-service/create-service.component";
import {EditServiceComponent} from "./componants/service/edit-service/edit-service.component";
import {ListContractComponent} from "./componants/contract/list-contract/list-contract.component";
import {CreateContractComponent} from "./componants/contract/create-contract/create-contract.component";
import {PageNotFoundComponent} from "./componants/page-not-found/page-not-found.component";
import {ListContractDetailComponent} from "./componants/contract-details/list-contract-detail/list-contract-detail.component";
import {EditContractComponent} from "./componants/contract/edit-contract/edit-contract.component";

const routes: Routes = [
  {path: '', component: HomeComponent},
  {path: 'customer-list', component: ListCustomerComponent},
  {path: 'customer-create', component: CreateCustomerComponent},
  {path: 'customer-edit/:id', component: EditCustomerComponent},
  {path: 'employee-list', component: ListEmployeeComponent},
  {path: 'employee-create', component: CreateEmployeeComponent},
  {path: 'employee-edit/:id', component: EditEmployeeComponent},
  {path: 'service-list', component: ListServiceComponent},
  {path: 'service-create', component: CreateServiceComponent},
  {path: 'service-edit/:id', component: EditServiceComponent},
  {path: 'contract-list', component: ListContractComponent},
  {path: 'contract-create', component: CreateContractComponent},
  {path: 'contract-edit/:id', component: EditContractComponent},
  {path: 'contract-detail-list', component: ListContractDetailComponent},
  {path: '**', component: PageNotFoundComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
