import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';
import { provideHttpClient } from '@angular/common/http';

@NgModule({
  imports: [
    BrowserModule,
    AppComponent,
  ],
  providers: [
    provideHttpClient()
  ],
  bootstrap: []
})
export class AppModule { }
