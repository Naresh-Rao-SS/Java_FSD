import { Component } from '@angular/core';

@Component({
  selector: 'app-eventbinding',
  templateUrl: './eventbinding.component.html',
  styleUrl: './eventbinding.component.css',
})
export class EventbindingComponent {
  count = 0;
  incr() {
    this.count += 1;
  }

  decr() {
    this.count -= 1;
  }
}
