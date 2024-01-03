import { Component } from '@angular/core';
import { EmployeeserviceService } from '../employeeservice.service';
import { Router } from '@angular/router';
import { Employee } from '../employee';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrl: './employee.component.css'
})
export class EmployeeComponent {
  employee:Employee=new Employee();

  constructor(private employeeservice: EmployeeserviceService,private router:Router) { }

  saveEmployee() {
    this.employeeservice.addEmployee(this.employee).subscribe();
    this.router.navigate(['/employee-list']);
    console.log(this.employee.id)
  }
}
