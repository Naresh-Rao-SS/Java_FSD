import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { EmployeeserviceService } from '../employeeservice.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-employee-details',
  templateUrl: './employee-details.component.html',
  styleUrl: './employee-details.component.css'
})
export class EmployeeDetailsComponent implements OnInit{
  employeeForm!: FormGroup;
  isEditMode: boolean = false;
  employeeId!: number;

  constructor(
    private formBuilder: FormBuilder,
    private employeeserviceService: EmployeeserviceService,
    private route: ActivatedRoute,
    private router: Router
  ) {}

  ngOnInit(): void {
    this.employeeId = +this.route.snapshot.paramMap.get('id')!;
    this.isEditMode = !!this.employeeId;
    this.initForm();

    if (this.isEditMode) {
      this.employeeserviceService.getEmployeeById(this.employeeId).subscribe(
        (employee: { [key: string]: any; }) => {
          this.employeeForm.patchValue(employee);
        },
        (error: any) => {
          console.error('Error fetching employee details:', error);
        }
      );
    }
  }

  initForm(): void {
    this.employeeForm = this.formBuilder.group({
      id: [null],
      first_name: ['', [Validators.required]],
      last_name: ['', [Validators.required]],
      email: ['', [Validators.required, Validators.email]],
    });
  }


 

  saveEmployee(): void {
    const employeeData = this.employeeForm.value;

    if (this.isEditMode) {
      this.employeeserviceService.updateEmployee(employeeData).subscribe(
        () => {
          console.log('Employee updated successfully.');
          this.router.navigate(['/employee-list']);
        },
        (error: any) => {
          console.error('Error updating employee:', error);
        }
      );
    } else {
      this.employeeserviceService.addEmployee(employeeData).subscribe(
        () => {
          console.log('Employee added successfully.');
          this.router.navigate(['/employee-list']);
        },
        (error: any) => {
          console.error('Error adding employee:', error);
        }
      );
    }
  }


}
