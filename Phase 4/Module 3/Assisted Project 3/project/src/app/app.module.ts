import { NgModule } from '@angular/core';
import {
  BrowserModule,
  provideClientHydration,
} from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ProfileComponent } from './profile/profile.component';
import { Routes, RouterModule } from '@angular/router';
import { PropertybindingComponent } from './propertybinding/propertybinding.component';
import { ClassstylebindingComponent } from './classstylebinding/classstylebinding.component';
import { EventbindingComponent } from './eventbinding/eventbinding.component';
import { FormsvalidationComponent } from './formsvalidation/formsvalidation.component';
import { TwowaybindingComponent } from './twowaybinding/twowaybinding.component';
import { PipesComponent } from './pipes/pipes.component';
import { RoutingMechanismsComponent } from './routing-mechanisms/routing-mechanisms.component';
import { FormsModule } from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms';

const routes: Routes = [
  { path: 'profile', component: ProfileComponent },
  { path: 'propertybinding', component: PropertybindingComponent },
  { path: 'classstylebinding', component: ClassstylebindingComponent },
  { path: 'eventbinding', component: EventbindingComponent },
  { path: 'pipes', component: PipesComponent },
  { path: 'twowaybinding', component: TwowaybindingComponent },
  { path: 'routing-mechanisms', component: RoutingMechanismsComponent },
  { path: 'formsvalidation', component: FormsvalidationComponent },
];

@NgModule({
  declarations: [
    AppComponent,
    ProfileComponent,
    PropertybindingComponent,
    ClassstylebindingComponent,
    EventbindingComponent,
    TwowaybindingComponent,
    PipesComponent,
    RoutingMechanismsComponent,
    FormsvalidationComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    RouterModule.forRoot(routes),
  ],
  providers: [provideClientHydration()],
  bootstrap: [AppComponent],
})
export class AppModule {}
