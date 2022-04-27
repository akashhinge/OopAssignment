package problem1;
import java.util.Scanner;
import problem2.Author;
import problem2.Book;

public class MainApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		
		// For Employee 
		System.out.println("Enter Employee ID : ");
		int id = sc.nextInt();
		
		System.out.println("Enter Employee First Name : ");
		String firstName = sc.next();
		
		System.out.println("Enter Employee Last Name : ");
		String lastName = sc.next();
		
		System.out.println("Enter Employee Salary : ");
		int salary = sc.nextInt();
		
		Employee e = new Employee(id, firstName, lastName, salary);
		
		System.out.println(e.getAnnualSalary());
		System.out.println(e);
		
		System.out.println("Enter salary hike in percent ");
		int hike = sc.nextInt();
		e.raiseSalary(hike);
		System.out.println("Raised salary is " + e.getSalary());
		System.out.println("Raised Annual salary is " + e.getAnnualSalary());
		
		// For Book and Author
		
		System.out.println("Enter Book Name : ");
		String bookName = sc.next();
		
		System.out.println("Enter Author Name : ");
		String authorName = sc.next();
		
		System.out.println("Enter Author Email : ");
		String authorEmail = sc.next();
		
		System.out.println("Enter Author Gender : ");
		char authorGender = sc.next().charAt(0);
		
		Author a = new Author(authorName, authorEmail, authorGender);
		
		System.out.println("Enter Book Price : ");
		double bookPrice = sc.nextInt();
		
		System.out.println("Enter Book Quantity : ");
		int bookQty = sc.nextInt();
		
		Book b = new Book(bookName, a, bookPrice, bookQty);
		System.out.println("Author of " + b.getName() + " is " + b.getAuthor());
		
		System.out.println(b);
	}

}
