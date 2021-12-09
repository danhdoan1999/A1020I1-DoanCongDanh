import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {IMovie} from "../models/movie";

@Injectable({
  providedIn: 'root'
})
export class MovieService {

  movieURL = " http://localhost:3000/movie";

  constructor(private http:HttpClient) { }

  getAllMovie() {
    return this.http.get(this.movieURL);
  }
  createMovie(movie:IMovie){
    return this.http.post(this.movieURL,movie);
  }

  findById(id: any) {
    return this.http.get(this.movieURL+'/'+id);
  }

  deleteMovie(id: number) {
    return this.http.delete(this.movieURL+'/'+id);
  }
}
