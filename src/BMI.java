import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap trong luong (kg): ");
        int weight = scanner.nextInt();
        System.out.println("nhap trieu cao (m): ");
        float height = scanner.nextFloat();
        float BMI = weight / (height * height);
        if (BMI < 18.5) {
            System.out.println("qua gay!");
        } else if (BMI < 25) {
            System.out.println("Binh thuong");
        }else if(BMI < 30 ){
            System.out.println("Thua can");
        }else{
            System.out.println("Beo phi");
        }
    }
}
