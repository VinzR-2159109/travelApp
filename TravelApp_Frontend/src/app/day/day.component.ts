import { Component, Input } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Day } from '../day/day.model';
import { ActivityComponent } from '../activity/activity.component';

@Component({
  selector: 'app-day',
  templateUrl: './day.component.html',
  styleUrls: ['./day.component.scss'],
  standalone: true,
  imports: [CommonModule, ActivityComponent]
})
export class DayComponent {
  @Input() day!: Day;
}
