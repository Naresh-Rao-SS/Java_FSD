// StudentMain

package com.example;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        StudentDAO dao = ac.getBean(StudentDAO.class);
        Scanner sc = new Scanner(System.in);

        boolean continueLoop = true;

        while (continueLoop) {
            System.out.println("Choose an operation:");
            System.out.println("1. Insert");
            System.out.println("2. Update");
            System.out.println("3. Delete");
            System.out.println("4. Display All");
            System.out.println("5. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Student s = ac.getBean(Student.class);

                    System.out.println("Enter Student id");
                    s.setId(sc.nextInt());

                    System.out.println("Enter Student name");
                    s.setName(sc.next());

                    System.out.println("Enter Student email");
                    s.setEmail(sc.next());

                    if (dao.insert(s) > 0) {
                        System.out.println("Inserted Successfully");
                    } else {
                        System.out.println("Failed to Insert");
                    }
                    break;

                case 2:
                    System.out.println("Enter Student id to update");
                    int updateId = sc.nextInt();
                    
                    Student updateStudent = new Student();
                    updateStudent.setId(updateId);

                    System.out.println("Enter updated Student name");
                    updateStudent.setName(sc.next());

                    System.out.println("Enter updated Student email");
                    updateStudent.setEmail(sc.next());

                    if (dao.update(updateStudent) > 0) {
                        System.out.println("Updated Successfully");
                    } else {
                        System.out.println("Failed to Update");
                    }
                    break;

                case 3:
                    System.out.println("Enter Student id to delete");
                    int deleteId = sc.nextInt();

                    if (dao.delete(deleteId) > 0) {
                        System.out.println("Deleted Successfully");
                    } else {
                        System.out.println("Failed to Delete");
                    }
                    break;

                case 4:
                    List<Student> studentList = dao.displayAll();
                    System.out.println("All Students:");
                    for (Student student : studentList) {
                        System.out.println(student);
                    }
                    break;

                case 5:
                    continueLoop = false;
                    System.out.println("Exiting program");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
