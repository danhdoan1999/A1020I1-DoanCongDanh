import {Component, Input, OnInit} from '@angular/core';

export interface IStudent {
  id:number;
  name:string;
  mark:number;
  image:string;
}

@Component({
  selector: 'app-info-student',
  templateUrl: './info-student.component.html',
  styleUrls: ['./info-student.component.css']
})
export class InfoStudentComponent implements OnInit {

  @Input()
  studentDetailInfo!:IStudent ;

  constructor() { }

  ngOnInit(): void {
  }

  getMark(value: any) {
    this.studentDetailInfo.mark = value;
  }
}
