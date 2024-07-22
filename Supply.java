import java.util.Scanner;
public class Supply {
	private int code;
	private String FoodName,Sticker,FoodType;
	
	public void GetType() {
		switch (Sticker.toLowerCase()) 
        {
            case "green":
                FoodType = "Vegetarian";
                break;
            case "yellow":
                FoodType = "Contains Egg";
                break;
            case "red":
                FoodType = "Non Vegetarian";
                break;
            default:
                FoodType = "Unknown";
                break;
        }

	}
     
	public void FoodIn() {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter Code: ");
        code = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter FoodName: ");
        FoodName = sc.nextLine();

        System.out.print("Enter Sticker (Green/Yellow/Red): ");
        Sticker = sc.nextLine();

        GetType();
	}

	public void FoodOut() {
		System.out.println("Code:     " + code);
        System.out.println("FoodName: " + FoodName);
        System.out.println("Sticker:  " + Sticker);
        System.out.println("FoodType: " + FoodType);
	}
	
	

}
