import { Activity } from '../activity/activity.model';

export interface Day {
  name: string;
  date: Date;
  activities: Activity[];
}
