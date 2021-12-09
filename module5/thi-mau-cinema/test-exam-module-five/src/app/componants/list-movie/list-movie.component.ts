import { Component, OnInit } from '@angular/core';
import {MovieService} from "../../services/movie.service";
import {MatDialog} from "@angular/material/dialog";
import {DeleteMovieComponent} from "../delete-movie/delete-movie.component";

@Component({
  selector: 'app-list-movie',
  templateUrl: './list-movie.component.html',
  styleUrls: ['./list-movie.component.css']
})
export class ListMovieComponent implements OnInit {
  movies: any;

  constructor(private movieService:MovieService ,
              private dialog:MatDialog) { }

  ngOnInit(): void {
    this.movies = this.movieService.getAllMovie().subscribe(data=>{
      this.movies = data;
    })
  }

  openDialogDelete(id: any) {
    this.movieService.findById(id).subscribe(data=>{
      const dialogRef = this.dialog.open(DeleteMovieComponent,{
        width:'500px',
        height:'215px',
        data:data
      });
      dialogRef.afterClosed().subscribe(()=>{
        this.ngOnInit();
      })
    })
  }
}
