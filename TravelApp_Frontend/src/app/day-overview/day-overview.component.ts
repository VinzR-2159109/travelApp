import { Component, OnInit } from '@angular/core';
import { DayService } from '../day/day.service';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { Day } from '../day/day.model';
import { DayComponent } from '../day/day.component';

@Component({
  selector: 'app-day-overview',
  templateUrl: './day-overview.component.html',
  styleUrls: ['./day-overview.component.scss'],
  standalone: true,
  imports: [CommonModule,FormsModule, DayComponent]
})


export class DayOverviewComponent implements OnInit {
  days: Day[] = [];
  showForm: boolean = false;
  newDay: Day = {
    name: '',
    date: new Date(),
    activities: []
  };

  constructor(private dayService: DayService) { }

  ngOnInit(): void {
    const observer = {
      next: (data: Day[]) => this.days = data,
      error : (err: any) => console.error(err),
    };

    this.dayService.getAllDays().subscribe(observer);
  }

  addDay(): void {
    if (this.newDay.name && this.newDay.date) {
    this.dayService.createDay(this.newDay).subscribe(
      () => {
        this.days.push(this.newDay);
        this.showForm = false;
      },
      (error) => {
        console.error('There was an error!', error);
      }
    );
    }
  }
}
