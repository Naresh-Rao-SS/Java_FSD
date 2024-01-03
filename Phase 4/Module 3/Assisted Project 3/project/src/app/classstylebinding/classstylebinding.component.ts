import { Component } from '@angular/core';

@Component({
  selector: 'app-classstylebinding',
  templateUrl: './classstylebinding.component.html',
  styleUrl: './classstylebinding.component.css',
})
export class ClassstylebindingComponent {
  heading = '"This is the text as a class style binding"';

  isactive = false;

  ishidden = false;
  isdisabled = true;
}
