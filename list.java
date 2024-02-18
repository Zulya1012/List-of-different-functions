import java.util.Scanner;
public class list{
  public static void main(String[] arg){
    Scanner sc=new Scanner(System.in);
    String[] phone = new String[3];
    for (int x=1; x>0; x++){
      listMenu();
      int a=sc.nextInt();
      if (a==1){
        weatherIndicators();
      }
      if (a==2){
        calculation(sc);
      }
      if (a==3){
        weekDay();
      }
      if (a==4){
        heightWeight(sc);
      }
      if (a==5){
        break;
      }
      if (a==6){
 
        if (getFreeSpace(phone)!=-1)
          addNumber(sc, phone); 
        else
    System.out.println("No free space found");

     }
      if (a==7){
        showNumber(phone);
      }
      if (a==8){
         celsiusFahrenheit(sc);
      }
      if(a==9){
        milesKilometers(sc);
      }
    }
  }
  public static void listMenu(){
    System.out.println("List");
    System.out.println("1. Weather indicators");
    System.out.println("2. Calculator");
    System.out.println("3. Day of the week");
    System.out.println("4. Height and Weight");
    System.out.println("5. Come out");
    System.out.println("6. Add a phone number");
    System.out.println("7. Show phone number");
    System.out.println("8. Celsius to Fahrenheit conversion");
    System.out.println("9. Miles to Kilometers conversion");
  }
  public static void weatherIndicators(){
    int[] array = {12, 15, 10, 6, 9, 20, 10};
    for (int i:array){
      System.out.println(i);
    }
  }

  public static void calculation(Scanner sc){
    int b=sc.nextInt();
    int c=sc.nextInt();
    System.out.println("Choose one is operations:");
    System.out.println("1. *");
    System.out.println("2. +");
    System.out.println("3. -");
    System.out.println("4. /");
    int d=sc.nextInt();
    if (d==1){
      int k=b*c;
      System.out.println(k);
    }
    if (d==2){
      int l=b+c;
      System.out.println(l);
    }
    if (d==3){
      int m=b-c;
      System.out.println(m);
    }
    if (d==4){
      int p=b/c;
      System.out.println(p);
    } 
  }
  public static void weekDay(){
    System.out.println("Monday");
  }
  public static void heightWeight(Scanner sc){
    System.out.println("Enter height");
    int d=sc.nextInt();
    System.out.println("Enter weight");
    int f=sc.nextInt();
    int x=d-f;
    if (x==100){
      System.out.println("Normal weight");
    }
    else if (x>100){
      System.out.println("Underweight "+ ((d-f)-100)+"kq");
    }
    else if (x<100){
      System.out.println("Overweight "+ (100-(d-f))+"kq");
    }
  }

  public static void addNumber(Scanner sc, String[] phone){ 
    System.out.println("Enter the number:");
    sc.nextLine();
    String num=sc.nextLine();
    System.out.println("Number added");
    int idx=getFreeSpace(phone);
    if (idx==-1){
      System.out.println("No emptry space found");
    }
    else {
      phone [idx]=num;
      System.out.println("Number added "+num);
    }

  }
  public static void showNumber(String[] phone){
    for (int i=0; i<3; i++)
      System.out.println(phone[i]);
  }

  public  static int getFreeSpace(String[] phone){
    int idx=-1;
    for (int i=0; i<phone.length; i++){

      if (phone[i]!=null){
        if (phone[i].equals("")){
          idx=1;
          break;
        }
      }
      else {
        idx=i;
        break;
      }
    }
    return idx;
  }
  public static void celsiusFahrenheit(Scanner sc){
    int k=9; 
    int l=5;  
    int m=32; 
    System.out.println("Enter the temperature in Celsius:");
    int temp=sc.nextInt();
    double a=(temp*k/l)+m;
    System.out.println(a+"*F");
  }
  public static void milesKilometers(Scanner sc){
    float x=1.609344F; 
    System.out.println("Enter the distance in Miles:");
    int dis=sc.nextInt();
    double km=dis*x;
    System.out.println(km+"km");
  }

}


