import { Component, OnInit } from '@angular/core';

export interface IStudent {
  id:number;
  name:string;
  mark:number;
  image:string;
}
@Component({
  selector: 'app-list-student',
  templateUrl: './list-student.component.html',
  styleUrls: ['./list-student.component.css']
})
export class ListStudentComponent implements OnInit {

  students:IStudent[] = [
    {
      id:1,
      name:"danh",
      mark:5,
      image:""
    },
    {
      id:2,
      name:"hiếu",
      mark:6,
      image:""
    },
    {
      id:3,
      name:"hiền",
      mark:8,
      image:""
    },
    {
      id:4,
      name:"quang",
      mark:2,
      image:""
    },
  ];

  studentDetail!: IStudent ;


  constructor() { }

  ngOnInit(): void {
  }

  getStudent(student: any) {
    this.studentDetail = student;
    console.log(this.studentDetail);
  }
}
