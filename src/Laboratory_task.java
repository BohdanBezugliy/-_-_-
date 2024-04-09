import java.util.Scanner;
public class Laboratory_task {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Printer printer = new Printer();
		System.out.print("Name of printer: ");
		printer.setName(sc.next());
		System.out.print("Producer of printer: ");
		printer.setProducer(sc.next());
		System.out.print("Speed print(ppm) of printer: ");
		printer.setSpeedPrint(sc.nextInt());
		System.out.print("Type of printer: ");
		printer.setType(sc.next());
		System.out.print("Color print of printer (true or false): ");
		printer.setColorPrint(sc.nextBoolean());
		System.out.print("Format print (A2,A3,A4...) of printer: ");
		printer.setPrintFormat(sc.next());
		System.out.print("Price of printer: ");
		printer.setPrice(sc.nextFloat());
		sc.close();
		printer.Print("Some text for print");
		if(printer.isColorPrint())
		{
			printer.Print("Some text for print color yellow", "yellow");
			printer.Print("Some text for print color red", "red");
			printer.Print("Some text for print color green", "green");
			printer.Print("Some text for print color blue", "blue");
			printer.Print("Some text for print color magenta", "magenta");
			printer.Print("Some text for print color cyan", "cyan");
		}
		else
		{
			printer.Print("Some text for print color yellow", "yellow");
			// For demonstration how do work if printer cannot print color text
		}
		System.out.println("Name of printer: " + printer.getName());
		System.out.println("Producer of printer: " + printer.getProducer());
		System.out.println("Speed print(ppm) of printer: " + printer.getSpeedPrint());
		System.out.println("Type of printer: " + printer.getType());
		System.out.println("Color print of printer (true or false): " + printer.isColorPrint());
		System.out.println("Format print (A2,A3,A4...) of printer: " + printer.getPrintFormat());
		System.out.printf("Price of printer: %.2f",printer.getPrice());
	}
}
