import { Component, OnInit } from '@angular/core';
import {IService} from "../../../models/service";

@Component({
  selector: 'app-list-service',
  templateUrl: './list-service.component.html',
  styleUrls: ['./list-service.component.css']
})
export class ListServiceComponent implements OnInit {
  services: IService[] = [
    {
      id: 1,
      idService: 'DV-001',
      name: 'Royal House',
      area: 100,
      cost: '100',
      maxPeople: 4,
      rentType: 'day',
      serviceType: 'House',
      standardRoom: 'vip',
      descriptionOtherConvenience: 'ti vi ...',
      poolArea: 0,
      numOfFloors: 1,
    }
  ];

  constructor() { }

  ngOnInit(): void {
  }

}
