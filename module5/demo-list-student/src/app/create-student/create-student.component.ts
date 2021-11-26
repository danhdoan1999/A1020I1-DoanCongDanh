import { Component, OnInit } from '@angular/core';
// @ts-ignore
import {FormControl, FormGroup} from "@angular/forms";

@Component({
  selector: 'app-create-student',
  templateUrl: './create-student.component.html',
  styleUrls: ['./create-student.component.css']
})
export class CreateStudentComponent implements OnInit {
  studentForm!:FormGroup;
  constructor() { }

  ngOnInit(): void {
    this.studentForm = new FormGroup(
      {
        id:new FormControl(''),
        name:new FormControl(''),
        mark:new FormControl(''),
        image:new FormControl('No image')
      }
    )
  }

}
