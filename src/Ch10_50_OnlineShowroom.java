import java.util.Scanner;

public class Ch10_50_OnlineShowroom {
	
	static class Showroom{
		String [] Cars;
		int serialNo;

		String [] newCarlist;
		Showroom(){
		this.Cars = new String[100];
		this.newCarlist = new String [Cars.length - 1];
			// Two existing Cars
		this.Cars[0] = "Ford Mustang GT";
		this.Cars[1] = "Ford Figo Titanium";	
		this.serialNo = 2;
		}
		
		
		public void availableCars(){
			int no = 1;
			System.out.println("\nAvailable Cars now are: ");
			for (String element : Cars){
				if(element == null){
				break;
				}
			System.out.printf("%d. %s\n" , no , element);
				no++;
				}
		}
			
		
		public void addCars(String car){
			Cars[serialNo] = car;
			System.out.printf("~ %s added to Showroom\n" , car);
			serialNo++;
		}
		
		public void removeCars(String rCar){
			for (int i = 0 , k=0; i<= Cars.length-1; i++){
				if(rCar != Cars[i]){
					this.newCarlist[k] = Cars[i];
					k++;
				}
			}
			System.out.println("~ As requested removing " + rCar + " from Database");
		}
		
		public void showremovedCars(){
			int b=1;
			System.out.println();
			System.out.println("Available Cars now are:");
			for (String a : newCarlist){
				if(a == null){
				break;
				}
			System.out.println(b + ". " + a);
				b++;
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		Showroom obj = new Showroom();
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your name: "); String name = input.nextLine();
	
		// Adding cars workfield
		System.out.println("Welcome: " + name);
		System.out.println("\nHere's Your Recent Action Summary:");
		obj.addCars("Suzuki Brezza");
		obj.addCars("Hyundai Creta");
		obj.addCars("Suzuki Alto");
		obj.addCars("Kia Seltos");
		obj.addCars("Volkwagen Polo");
		obj.addCars("Skoda Octavia");
		
		// Summary of Available Cars after adding
		obj.availableCars();
		
		System.out.println();
		System.out.println("********");
		System.out.println();

		// Removing Cars workfield
		obj.removeCars("Skoda Octavia");
		
		// List of Available cars after removing some of them
		obj.showremovedCars();
		
	}
}