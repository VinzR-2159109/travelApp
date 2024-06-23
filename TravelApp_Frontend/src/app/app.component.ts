import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { ActivityComponent } from "./activity/activity.component";
import { DayComponent } from './day/day.component';
import { DayOverviewComponent } from './day-overview/day-overview.component';

@Component({
    selector: 'app-root',
    standalone: true,
    templateUrl: './app.component.html',
    styleUrl: './app.component.scss',
    imports: [RouterOutlet, ActivityComponent, DayComponent, DayOverviewComponent]
})
export class AppComponent {
  title = 'my-app';
}
