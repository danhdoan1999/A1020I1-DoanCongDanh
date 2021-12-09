import {Component, Inject, OnInit} from '@angular/core';
import {IMovie} from "../../models/movie";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {MovieService} from "../../services/movie.service";
import {MatSnackBar} from "@angular/material/snack-bar";

@Component({
  selector: 'app-delete-movie',
  templateUrl: './delete-movie.component.html',
  styleUrls: ['./delete-movie.component.css']
})
export class DeleteMovieComponent implements OnInit {
  movie!: IMovie;

  constructor(private dialogRef:MatDialogRef<DeleteMovieComponent>,
              @Inject(MAT_DIALOG_DATA) public data:any,
              private movieService:MovieService,
              private snackBar:MatSnackBar) { }

  ngOnInit(): void {
    this.movie = this.data;
  }

  deleteConfirm() {
    this.movieService.deleteMovie(this.movie.id).subscribe(()=>{
      this.dialogRef.close();
      this.snackBar.open("Delete movie success !!!","OK",{
        duration:4000
      });
    })
  }
}
