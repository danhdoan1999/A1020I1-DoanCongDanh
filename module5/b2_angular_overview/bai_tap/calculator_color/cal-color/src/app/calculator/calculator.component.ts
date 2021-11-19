import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent implements OnInit {

  firstNum:number = 0;
  secondNum:number = 0;
  operator = '+';
  result = 0;
  error = '';

  getFirstNum(value: number) {
    this.firstNum = Number(value);
  }

  getSecondNum(value: number) {
    this.secondNum = Number(value);
  }
  onSelectChange(value:string){
    this.operator = value;
  }

  CalculatorOperator(){
    switch (this.operator) {
      case '+':
        this.result = this.firstNum + this.secondNum;
        break;
      case '-':
        this.result = this.firstNum - this.secondNum;
        break;
      case '*':
        this.result = this.firstNum * this.secondNum;
        break;
      case '/':
        if(this.secondNum != 0){
          this.result = this.firstNum / this.secondNum;
        }else{
          this.clearValue();
          this.error = 'lỗi chia cho 0';
        }
        break;
    }
  }

  clearValue(){
    this.result = 0;
  }
  constructor() { }

  ngOnInit(): void {
  }
}
