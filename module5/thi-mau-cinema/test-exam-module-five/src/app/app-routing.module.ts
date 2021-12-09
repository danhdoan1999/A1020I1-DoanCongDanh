import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {ListMovieComponent} from "./componants/list-movie/list-movie.component";
import {CreateMovieComponent} from "./componants/create-movie/create-movie.component";
import {EditMovieComponent} from "./componants/edit-movie/edit-movie.component";


const routes: Routes = [
  {path: 'movie-list', component: ListMovieComponent},
  {path: 'movie-create', component: CreateMovieComponent},
  {path: 'customer-edit/:id', component: EditMovieComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
