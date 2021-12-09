import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {MovieService} from "../../services/movie.service";
import {Router} from "@angular/router";
import {MatSnackBar} from "@angular/material/snack-bar";

@Component({
  selector: 'app-create-movie',
  templateUrl: './create-movie.component.html',
  styleUrls: ['./create-movie.component.css']
})
export class CreateMovieComponent implements OnInit {
  movieCreateForm!: FormGroup;

  minDate = new Date();

  constructor(private formBuilder:FormBuilder,
              private  movieService:MovieService,
              private  router:Router,
              private snackBar:MatSnackBar) { }

  ngOnInit(): void {
    this.movieCreateForm = this.formBuilder.group({
      'id':[],
      'idMovie':[''],
      'nameMovie':['',[Validators.required]],
      'dateShow':['',[Validators.required]],
      'quantityTicket':['',[Validators.required,Validators.pattern('^[0-9]+')]],
    })
  }

  addNewMovie() {
    if(!this.movieCreateForm.invalid){
      this.movieCreateForm.value.idMovie = 'CI-'+Math.floor(Math.random()*9999);
      this.movieService.createMovie(this.movieCreateForm.value).subscribe(()=>{
        this.snackBar.open("Add new movie success !!!","OK",{
          duration:4000
        });
        this.router.navigateByUrl('movie-list').then(r => {});
      })
    }
  }
}
