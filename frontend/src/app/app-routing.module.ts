import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {RegistratePageComponent} from './page/registrate-page/registrate-page.component';
import {LoginPageComponent} from './page/login-page/login-page.component';
import {HomePageComponent} from './page/home-page/home-page.component';


const routes: Routes = [
  {path: 'registrate', component: RegistratePageComponent},
  {path: 'login', component: LoginPageComponent},
  {path: 'home', component: HomePageComponent}

];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
