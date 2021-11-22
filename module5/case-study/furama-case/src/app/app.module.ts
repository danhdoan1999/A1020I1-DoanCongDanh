import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { CreateCustomerComponent } from './componants/customer/create-customer/create-customer.component';
import { EditCustomerComponent } from './componants/customer/edit-customer/edit-customer.component';
import { ListCustomerComponent } from './componants/customer/list-customer/list-customer.component';
import { DeleteCustomerComponent } from './componants/customer/delete-customer/delete-customer.component';
import { CreateEmployeeComponent } from './componants/employee/create-employee/create-employee.component';
import { ListEmployeeComponent } from './componants/employee/list-employee/list-employee.component';
import { EditEmployeeComponent } from './componants/employee/edit-employee/edit-employee.component';
import { ListServiceComponent } from './componants/service/list-service/list-service.component';
import { CreateServiceComponent } from './componants/service/create-service/create-service.component';
import { EditServiceComponent } from './componants/service/edit-service/edit-service.component';
import { ListContractComponent } from './componants/contract/list-contract/list-contract.component';
import { CreateContractComponent } from './componants/contract/create-contract/create-contract.component';
import { DetailContractComponent } from './componants/contract/detail-contract/detail-contract.component';
import { CreateContractDetailComponent } from './componants/contract-details/create-contract-detail/create-contract-detail.component';
import { ListContractDetailComponent } from './componants/contract-details/list-contract-detail/list-contract-detail.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    CreateCustomerComponent,
    EditCustomerComponent,
    ListCustomerComponent,
    DeleteCustomerComponent,
    CreateEmployeeComponent,
    ListEmployeeComponent,
    EditEmployeeComponent,
    ListServiceComponent,
    CreateServiceComponent,
    EditServiceComponent,
    ListContractComponent,
    CreateContractComponent,
    DetailContractComponent,
    CreateContractDetailComponent,
    ListContractDetailComponent,
    PageNotFoundComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
