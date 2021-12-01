import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FooterComponent } from './componants/footer/footer.component';
import { HeaderComponent } from './componants/header/header.component';
import { PageNotFoundComponent } from './componants/page-not-found/page-not-found.component';
import { CreateContractComponent } from './componants/contract/create-contract/create-contract.component';
import { ListContractComponent } from './componants/contract/list-contract/list-contract.component';
import { CreateContractDetailComponent } from './componants/contract-details/create-contract-detail/create-contract-detail.component';
import { CreateCustomerComponent } from './componants/customer/create-customer/create-customer.component';
import { EditCustomerComponent } from './componants/customer/edit-customer/edit-customer.component';
import { ListCustomerComponent } from './componants/customer/list-customer/list-customer.component';
import { DeleteCustomerComponent } from './componants/customer/delete-customer/delete-customer.component';
import { CreateEmployeeComponent } from './componants/employee/create-employee/create-employee.component';
import { EditEmployeeComponent } from './componants/employee/edit-employee/edit-employee.component';
import { DeleteEmployeeComponent } from './componants/employee/delete-employee/delete-employee.component';
import { ListEmployeeComponent } from './componants/employee/list-employee/list-employee.component';
import { CreateServiceComponent } from './componants/service/create-service/create-service.component';
import { EditServiceComponent } from './componants/service/edit-service/edit-service.component';
import { DeleteServiceComponent } from './componants/service/delete-service/delete-service.component';
import { ListServiceComponent } from './componants/service/list-service/list-service.component';
import {ReactiveFormsModule} from "@angular/forms";


@NgModule({
  declarations: [
    AppComponent,
    FooterComponent,
    HeaderComponent,
    PageNotFoundComponent,
    CreateContractComponent,
    ListContractComponent,
    CreateContractDetailComponent,
    CreateCustomerComponent,
    EditCustomerComponent,
    ListCustomerComponent,
    DeleteCustomerComponent,
    CreateEmployeeComponent,
    EditEmployeeComponent,
    DeleteEmployeeComponent,
    ListEmployeeComponent,
    CreateServiceComponent,
    EditServiceComponent,
    DeleteServiceComponent,
    ListServiceComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
