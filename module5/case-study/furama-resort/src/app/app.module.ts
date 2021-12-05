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
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import { HomeComponent } from './componants/home/home.component';
import { ListContractDetailComponent } from './componants/contract-details/list-contract-detail/list-contract-detail.component';
import { EditContractComponent } from './componants/contract/edit-contract/edit-contract.component';
import {HttpClientModule} from "@angular/common/http";
import {BrowserAnimationsModule} from "@angular/platform-browser/animations";
import {Ng2SearchPipeModule} from "ng2-search-filter";
import {NgxPaginationModule} from "ngx-pagination";
import {MatSelectModule} from "@angular/material/select";
import {MatRadioModule} from "@angular/material/radio";
import {MatDialogModule} from "@angular/material/dialog";
import {MatDatepickerModule} from "@angular/material/datepicker";
import {MatNativeDateModule} from "@angular/material/core";
import {MatInputModule} from "@angular/material/input";


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
    HomeComponent,
    ListContractDetailComponent,
    EditContractComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    HttpClientModule,
    FormsModule,
    Ng2SearchPipeModule,
    NgxPaginationModule,
    BrowserAnimationsModule,
    MatSelectModule,
    MatRadioModule,
    MatDialogModule,
    MatDatepickerModule,
    MatNativeDateModule,
    MatInputModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
