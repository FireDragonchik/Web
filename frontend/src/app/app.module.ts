import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import {RouterModule} from '@angular/router';
import { RegistrateComponent } from './components/registrate/registrate.component';
import { RegistratePageComponent } from './page/registrate-page/registrate-page.component';
import { HeaderComponent } from './components/header/header.component';
import {AppRoutingModule} from './app-routing.module';
import {HTTP_INTERCEPTORS, HttpClientModule} from '@angular/common/http';
import {FormsModule} from '@angular/forms';
import { LoginComponent } from './components/login/login.component';
import { LoginPageComponent } from './page/login-page/login-page.component';
import {TokenStorage} from './token.storage';
import {Interceptor} from './app.interceptor';
import { HomeComponent } from './components/home/home.component';
import { HomePageComponent } from './page/home-page/home-page.component';

@NgModule({
  declarations: [
    AppComponent,
    RegistrateComponent,
    RegistratePageComponent,
    HeaderComponent,
    LoginComponent,
    LoginPageComponent,
    HomeComponent,
    HomePageComponent
  ],
  imports: [
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    BrowserModule
  ],

  providers: [
    TokenStorage,
    {
      provide: HTTP_INTERCEPTORS,
      useClass: Interceptor,
      multi: true
    }],

  bootstrap: [AppComponent]
})
export class AppModule { }
