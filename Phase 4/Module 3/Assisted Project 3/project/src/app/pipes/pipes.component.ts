import { Component } from '@angular/core';

@Component({
  selector: 'app-pipes',
  templateUrl: './pipes.component.html',
  styleUrl: './pipes.component.css',
})
export class PipesComponent {
  currentDate: Date = new Date();
  originalNumber: number = 12345.6789;
  originalText: string = '"This is a Pipe String"';
}
