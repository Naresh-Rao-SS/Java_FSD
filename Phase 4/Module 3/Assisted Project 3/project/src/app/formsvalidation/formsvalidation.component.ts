import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-formsvalidation',
  templateUrl: './formsvalidation.component.html',
  styleUrl: './formsvalidation.component.css',
})
export class FormsvalidationComponent {
  myForm: FormGroup;

  constructor(private fb: FormBuilder) {
    this.myForm = this.fb.group({
      name: ['', Validators.required],
    });
  }

  onSubmit() {
    if (this.myForm.valid) {
      alert('Form submitted!');
    }
  }
}
