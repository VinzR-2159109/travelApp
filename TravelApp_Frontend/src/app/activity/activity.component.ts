import { Component, Input } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Activity } from '../activity/activity.model';

@Component({
  selector: 'app-activity',
  templateUrl: './activity.component.html',
  styleUrls: ['./activity.component.scss'],
  standalone: true,
  imports: [CommonModule]
})
export class ActivityComponent {
  @Input() activity!: Activity;
}
