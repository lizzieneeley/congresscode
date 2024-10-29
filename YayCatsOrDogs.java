import java.util.Scanner;

public class YayCatsOrDogs {
  public static void main( String[] args ) {
      Scanner keyboard = new Scanner(System.in);
      
      String choice;
      String secondChoice;
      String thirdChoice;
      String secondChoiceDog;
      
      System.out.println("Would you like to print a cat or dog?");
      choice = keyboard.nextLine();
      
      if(choice.equalsIgnoreCase("cat")) {
        firstCat();
        System.out.println("Would you want to print a more detailed cat? Yes or No");
        secondChoice = keyboard.nextLine();
        if(secondChoice.equalsIgnoreCase("yes")) {
          secondCat();
          System.out.println("Would you want to print more cats? Yes or No");
          thirdChoice = keyboard.nextLine();
          if(thirdChoice.equalsIgnoreCase("yes")) {
            thirdCat();
          }else{
            sadCat();
          }
        }
      }else if(choice.equalsIgnoreCase("dog")) {
        firstDog();
        System.out.println("Would you like to print a fish? Yes or No");
        secondChoiceDog = keyboard.nextLine();
        if(secondChoiceDog.equalsIgnoreCase("yes")) {
          firstFish();
        }else{
          sadDog();
        }
      }else{
        sadCat();
        sadDog();
      }
  }
  
  //simplest cat
  public static void firstCat() {
    System.out.println("  ╱|、");
    System.out.println(" (˚ˎ 。7");  
    System.out.println("  |、˜〵");          
    System.out.println("  じしˍˍ)ノ");
  }
  
//second cat
  public static void secondCat() {
    System.out.println(" ⠀⠀⠀ ⠀ ⠀⠀⠀⠀⢸⡷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣴⡟⠀⠀⠀⠀⠀⠀⠀");
    System.out.println("⠀⠀⠀  ⠀⠀⠀⠀⠀⠀⢸⣷⣌⠙⢦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠞⣡⡶⡇⠀⠀⠀⠀⠀⠀⠀");
    System.out.println("⠀⠀⠀  ⠀⠀⠀⠀⠀⠀⢸⢻⡌⠳⣄⠉⠳⢤⠴⠒⠛⠛⠛⠛⠒⠦⢤⡤⠚⣡⠞⢁⣿⡇⠀⠀⠀⠀⠀⠀⠀");
    System.out.println("⠀⠀  ⠀⠀⠀⠀⠀⠀⠀⢸⣽⡷⠒⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠛⠲⢾⣿⡇⠀⠀⠀⠀⠀⠀⠀");
    System.out.println("⠀⠀  ⠀⠀⠀⠀⠀⠀⠀⣸⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⡇⠀⠀⠀⠀⠀⠀⠀");
    System.out.println("⠀⠀  ⠀⠀⠀⠀⠀⠀⢀⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⠀⠀⠀⠀⠀⢀⠀");
    System.out.println("⠀  ⠀⠙⠓⠦⢤⣀⡀⢸⠁⠀⠀⠀⣰⠟⠛⢦⠀⠀⠀⠀⠀⠀⠀⢠⣾⠛⢳⡆⠀⠀⠀⠸⣇⣀⣠⠤⠶⠛⠁");
    System.out.println("⠀  ⠀⢀⠀⠀⠀⠀⠉⣿⠒⠦⢄⠀⠻⣴⣳⠾⠁⠀⠰⣿⣿⠂⠀⠘⢿⣿⡽⠋⠀⣤⢖⠚⣏⠉⠀⠀⠀⠀⠀");
    System.out.println("  ⠀⠀⠉⠉⠉⠉⠉⠙⢻⣍⣽⠿⠀⠀⠀⠀⠀⠀⠸⣦⣼⣷⣼⠆⠀⠀⠀⠀⠀⠐⠿⣍⣹⡏⠉⠉⠉⠉⠙⠁");
    System.out.println("  ⠀⠀⠀⣀⣠⠤⠶⠚⠛⢷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠀⠈⠁⠀⠀⠀⠀⠀⠀⠀⠀⢀⡟⠉⠓⠲⠤⣄⣀⠀");
    System.out.println("⠀  ⠀⠉⠉⠀⠀⠀⠀⠀⠀⠱⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⡞⠀⠀⠀⠀⠀⠀⠉⠁");
    System.out.println("⠀  ⠀⠀⠀⠀⠀⠀⠀⠀⠀⡴⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠻⡄⠀⠀⠀⠀⠀⠀⠀⠀");
    System.out.println("⠀⠀  ⠀⠀⠀⠀⠀⠀⢀⡾⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⣆⠀⠀⠀⠀⠀⠀⠀");
    System.out.println("⠀  ⠀⠀⠀⠀⠀⠀⠀⡼⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣆⠀⠀⠀⠀⠀⠀");
    System.out.println("  ⠀⠀⠀⠀⠀⠀⠀⣸⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⡆⠀⠀⠀⠀⠀");
    System.out.println("  ⠀⠀⠀⠀⠀⠀⢀⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⡀⠀⠀⠀⠀");
    System.out.println("  ⠀⠀⠀⠀⠀⠀⢸⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⡇⠀⠀⠀⠀");
    System.out.println("⠀⢀⡴⠖⠲⢄⠀⠀⣼⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣇⠀⠀⠀⠀");
    System.out.println("⢠⠏⠀⠀⠀⠈⢧⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡟⠀⠀⠀⠀");
    System.out.println("⣿⠀⠀⠀⠀⠀⢸⡄⢸⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡇⠀⠀⠀⠀");
    System.out.println("⢻⡀⠀⠀⠀⠀⠘⡇⠸⡇⠀⠀⠀⠀⢀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⠀⠀⠀⠀⠀⣸⢧⡀⠀⠀⠀");
    System.out.println("⠸⡇⠀⠀⠀⠀⠀⣧⠀⢻⡄⠀⠀⠀⠸⡇⠀⠀⠀⠀⠀⣠⠀⣠⠀⠀⠀⠀⠀⢈⣟⠀⠀⠀⠀⢠⡏⠈⢳⡀⠀⠀");
    System.out.println("⠀⢻⡄⠀⠀⠀⠀⢹⡄⠀⡳⡄⠀⠀⠀⣧⠀⠀⠀⠀⠀⢸⠀⣿⠀⠀⠀⠀⠀⢸⡇⠀⠀⠀⢠⣟⠀⠀⠈⣇⠀⠀");
    System.out.println("⠀⠀⢳⡄⠀⠀⠀⠀⠳⡄⠀⠙⢦⡀⠀⢹⡀⠀⠀⠀⠀⢸⠀⣿⠀⠀⠀⠀⠀⣼⠀⠀⢀⡴⠋⣿⠀⠀⠀⣿⠀⠀");
    System.out.println("⠀⠀⠀⠱⣄⠀⠀⠀⠀⠙⢦⡀⠀⠈⠓⠮⣧⠀⠀⢀⠀⡾⠀⢹⡀⢀⠀⠀⣸⣇⡤⠞⠉⢀⣴⠃⠀⠀⢀⣿⠀⠀");
    System.out.println("⠀⠀⠀⠀⠘⢦⡀⠀⠀⠀⠀⠉⠲⢤⣀⠀⠈⠳⣿⣸⡾⠛⠛⠚⢷⣟⣸⡴⠋⠀⠀⣀⡴⠚⠁⠀⠀⠀⣼⠁⠀⠀");
    System.out.println("⠀⠀⠀⠀⠀⠀⠙⠦⣀⠀⠀⠀⠀⠀⠈⠉⠓⠲⠶⠤⠤⣤⣤⣤⣤⠼⠵⠶⠖⠚⠉⠁⠀⠀⠀⠀⢀⡼⠁⠀⠀⠀");
    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠈⠓⠦⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠴⠋⠀⠀⠀⠀⠀");
    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠓⠲⠤⣤⣀⣀⣀⠀⠀⠀⠀⠀⠀⣀⣀⣀⣤⠤⠴⠚⠉⠁⠀⠀⠀⠀⠀⠀⠀");
    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⠈⠉⠉⠉⠉⠉⠉⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
  }
  
  //third cat
  public static void thirdCat() {
    System.out.println("                      /^--^\\     /^--^\\     /^--^\\  ");
    System.out.println("                      \\____/     \\____/     \\____/   ");
    System.out.println("                     /      \\   /      \\   /      \\   ");
    System.out.println("                    |        | |        | |        |   ");
    System.out.println("                     \\__  __/   \\__  __/   \\__  __/     ");
    System.out.println("|^|^|^|^|^|^|^|^|^|^|^|^\\ \\^|^|^|^/ /^|^|^|^|^\\ \\^|^|^|^|^|^|^|^|^|^|^|^|");
    System.out.println("| | | | | | | | | | | | |\\ \\| | |/ /| | | | | | \\ \\ | | | | | | | | | | |");
    System.out.println("########################/ /######\\ \\###########/ /#######################");
    System.out.println("| | | | | | | | | | | | \\/| | | | \\/| | | | | |\\/ | | | | | | | | | | | |");
    System.out.println("|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|");
}

  //first dog
  public static void firstDog() { 
    System.out.println("⠀⠀⠀⢠⣴⣦⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣠⣤⣤⡀⠀⠀");
    System.out.println("⠀⠀⢰⣿⠿⠏⠉⠛⢿⣶⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⣶⠿⠛⠉⣹⣿⣿⡆⠀");
    System.out.println("⠀⠀⣴⣿⣧⠀⠀⠀⠀⠙⢿⣷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣶⠟⠋⠀⠀⠀⠰⠋⣿⡿⣷⡄");
    System.out.println("⠀⠀⢹⣧⠀⠀⠀⠀⠀⠀⠀⠘⢿⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣾⠟⠁⠀⠀⠀⠀⠀⠀⠘⠁⢠⡿⠁");
    System.out.println("⠀⠀⠀⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠙⢿⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣾⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠃⠀");
    System.out.println("⠀⠀⠀⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⣷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠀⠀");
    System.out.println("⠀⠀⠀⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠛⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⡟⠀⠀");
    System.out.println("⠀⠀⢀⣿⠷⠀⠀⠀⠀⠀⠀⠀⣀⣀⣤⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣀⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⠃⠀⠀");
    System.out.println("⠀⢠⡾⠁⠀⢀⠀⠀⠀⣠⣞⠋⠁⠀⠀⠀⠈⠉⠢⡀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠖⠉⠁⠀⠀⠀⣈⣉⣳⣄⣀⡀⠀⠀⠀⠀⠀⠈⢿⡄⠀⠀");
    System.out.println("⠀⣿⠃⢀⣴⣁⣴⠾⠛⠉⠉⠁⠉⠉⠁⠀⠀⠀⠀⠈⠀⠀⠀⠀⠀⠀⠀⠀⠎⠀⠀⠀⠀⠀⠁⠀⠀⠀⠀⠉⠉⠛⠷⣦⣀⢢⡀⠈⣿⡀⠀");
    System.out.println("⠀⣿⣴⣿⡿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢿⣿⣆⣿⡇⠀");
    System.out.println("⠀⢹⣿⠟⠀⠀⠀⠀⠀⠀⠀⠀⣀⡤⠔⠒⠋⠑⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⠒⠒⠢⠤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠻⣿⡟⠀⠀");
    System.out.println("⢠⣿⡏⠀⠀⠀⠀⠀⠀⢀⣤⠞⠋⠀⠀⣀⣠⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣀⣀⠀⠀⠈⠛⢦⣄⠀⠀⠀⠀⠀⠀⠀⠀⢹⣿⠀⠀");
    System.out.println("⣸⡟⠀⠀⠀⠀⠀⢠⣶⠟⠁⠀⠀⣰⣾⣟⠉⢹⣿⣦⠀⠀⠀⠀⠀⠀⠀⠀⣾⣿⡏⠉⣿⣷⣄⠀⠀⠀⠈⠳⣦⡀⠀⠀⠀⡀⠀⠈⣿⡇⠀");
    System.out.println("⣿⡇⠀⢀⠄⠀⣴⡟⠁⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣄⣀⠀⠀⠀⠀⣀⣸⣿⣿⣿⣿⣿⣿⣿⡆⠀⠀⠀⠀⠈⠻⣆⠀⠀⢹⣦⡀⢹⡇⠀");
    System.out.println("⣿⡇⣠⡏⢀⣾⠏⠀⠀⠀⠀⠀⠀⢻⣿⣿⠟⠋⠉⠀⠀⠉⠙⠛⠛⠋⠉⠁⠀⠉⠙⠻⢿⣿⡟⠀⠀⠀⠀⠀⠀⠀⠙⢷⡄⠀⣿⣷⣼⡇⠀");
    System.out.println("⣿⣿⣿⣁⣾⠃⠀⠀⠀⠀⠀⠀⣠⡾⠋⠀⠀⠀⠀⠀⣀⣤⣴⣶⣶⣤⣄⡀⠀⠀⠀⠀⠀⠙⠷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠻⣦⣿⣿⠿⠃⠀");
    System.out.println("⠈⠉⣿⣿⠃⠀⠀⠀⠀⠀⢀⠜⠁⠀⠀⠀⠀⠀⠀⠰⣿⣿⣿⣿⣿⣿⣿⡗⠀⠀⠀⠀⠀⠀⠀⠈⠳⣄⠀⠀⠀⠀⠀⠀⠀⠙⣿⡇⠀⠀⠀");
    System.out.println("⠀⠀⣿⠇⠀⠀⠀⠀⠀⠀⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠛⠿⠿⠿⠟⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢦⠀⠀⠀⠀⠀⠀⠀⢸⣿⠀⠀⠀");
    System.out.println("⠀⠀⣿⠀⠀⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠀⠀⠀⠀⢀⣤⣤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢆⠀⠀⠀⠀⢀⠀⢸⣿⠀⠀⠀");
    System.out.println("⠀⠀⣿⡀⢸⣷⠀⠀⠀⠀⠀⡀⠀⠀⠀⠀⠀⠈⠉⠒⠶⠞⠛⠉⠉⠛⠳⠶⠒⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠘⡀⠀⠀⠀⢸⣧⣸⡟⠀⠀⠀");
    System.out.println("⠀⠀⠸⣧⣸⣿⠀⠀⠀⠀⣸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣆⠀⠀⠁⠀⠀⠀⣾⠿⠿⠃⠀⠀⠀");
    System.out.println("⠀⠀⠀⠙⠛⢿⣇⣰⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⡄⠀⠀⠀⣠⣾⠋⠀⠀⠀⠀⠀⠀");
    System.out.println("⠀⠀⠀⠀⠀⠀⠙⢿⡄⠘⣿⡆⠀⠀⣧⠀⠀⠀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠀⠀⢀⡼⠀⠀⣼⣿⡇⢠⡿⠟⠋⠀⠀⠀⠀⠀⠀⠀⠀");
    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠈⢿⣤⣿⡿⣦⣀⣹⣷⡀⠀⢷⠀⠠⠶⠖⠚⠛⠒⠒⠂⢀⡾⠀⣠⠞⢁⣠⣾⠿⣿⣷⡟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠋⠀⠈⠙⢻⡏⠉⠀⠘⢧⠀⠀⠀⠀⠀⠀⠀⠀⡼⠁⠀⠁⠀⠀⣿⡇⠀⠈⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⡟⠀⠀⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣷⡀⠀⣀⣤⣤⣤⣀⠀⠀⠀⠀⠀⠀⠀");
    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⡟⠀⠀⢠⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣷⡿⠟⠋⠉⢉⣿⡇⠀⠀⠀⠀⠀⠀");
    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⡿⠁⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⡄⠀⠀⠀⣈⣿⣧⠀⠀⠀⠀⠀⠀");
    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣿⠃⠀⠀⠀⠘⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡔⠀⠀⠀⠀⠀⠘⣿⠶⣶⣶⣾⠿⠋⠀⠀⠀⠀⠀⠀");
    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⢀⣼⡿⣿⠀⠀⠀⠀⠀⠙⣆⠀⠀⠀⢄⡀⠀⠀⠀⠀⠀⣠⠎⠀⠀⠀⠀⠀⠀⠀⣿⠀⠈⠻⣿⣄⠀⠀⠀⠀⠀⠀⠀");
    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⣾⣿⠀⣿⠀⠀⠀⠀⠀⠀⠈⠙⠦⣄⡀⠹⣦⠀⠀⠀⣰⠋⠀⠀⠀⠀⠀⠀⠀⠀⣿⠀⠀⠀⢹⣿⡀⠀⠀⠀⠀⠀⠀");
    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⣿⡟⠀⢹⡄⠀⠀⠀⠀⠀⠀⠀⠀⠸⡉⠀⠈⠇⠀⢠⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠀⠀⢠⢈⣿⠇⠀⠀⠀⠀⠀⠀");
    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⣿⡇⢰⡜⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⣧⠀⠀⠀⠀⣼⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡟⠀⡄⣼⣿⣿⠀⠀⠀⠀⠀⠀⠀");
    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠿⠿⢿⣷⣿⡆⠀⠀⠀⠀⠀⠀⠀⣸⣿⣿⣿⣶⣶⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣀⣼⣷⣿⠋⠁⠀⠀⠀⠀⠀⠀⠀");
    System.out.println("             ⠀⠹⣷⠀⠀⠀⠀⠀⠀⣴⡿⠋⠁⠀⠀⠀⢿⣇⠀⢠⠀⣠⠀⣀⢀⣾⡟⠛⠋⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀");
    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣶⠾⢶⣦⣼⣾⠏⠀⠀⠀⠀⠀⠀⠀⠻⣶⣾⣷⣿⣷⣿⣾⠏⠀⠀⠀⠀");
    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠀⠀⠀⠀⠀⠀⠀⠀");;
  }

//fish
  public static void firstFish() {
    System.out.println("    ⠀ ⠀⠀⠀⠀⠀⠀⢀⣠⣾⣷⣄⠀⠀⠀⠀⠀⠀⠀");
    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣴⣿⣿⣿⣿⣿⣷⣀⠀⠀⠀⠀⠀⠀");
    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⢾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣦⡀⠀⠀⠀");
    System.out.println("⠈⣿⣶⣤⡀⠀⠀⠀⣸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⡀⠀⠀");
    System.out.println("⠀⢹⣿⣿⣿⣷⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡄⠀");
    System.out.println("⠀⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⢸⣿⣿⣿⡀");
    System.out.println("⠀⢀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃");
    System.out.println("⠀⢸⣿⣿⣿⣿⠿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠋⠀");
    System.out.println("⠀⣿⣿⠿⠋⠁⠀⠀⠉⠻⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠟⠁⠀⠀");
    System.out.println("⠈⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⣿⣿⣿⣿⡿⠿⠟⠋⠉⠀⠀⠀⠀⠀");
    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⣿⠿⠟⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀"); 
  }

//dog
  public static void sadDog() {
    System.out.println("  ⠀⠀⠀⣀⡤⠤⣤⣤⡤⠤⠒⢤⣤⣤⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
    System.out.println("⠀⠀⢠⡶⢋⣝⣾⠁⠀⠀⠀⣿⣿⣿⣿⣿⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀");
    System.out.println("⠀⠀⠀⣴⠋⢺⠏⠛⠆⠀⢈⣿⣿⣿⣿⣿⣿⣿⡀⠀⠀⠀⠀⠀⠀⠀");
    System.out.println("⠀⠀⠀⢀⣴⠟⡀⠀⠀⠀⠀⢿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀");
    System.out.println("⠀⢀⣴⠟⠁⠀⠙⠭⠉⠀⠀⠈⢿⣿⣿⣿⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀");
    System.out.println("⢀⡾⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⢛⡿⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀");
    System.out.println("⠠⡇⠀⠀⠀⠀⠀⠀⠀⠀⢀⣄⡀⠀⢘⣧⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
    System.out.println("⠐⣧⠀⠀⠀⠀⠀⠀⠀⣠⠟⠋⠉⢻⣏⠀⢉⠛⠲⣤⡀⠀⠀⠀⠀⠀");
    System.out.println("⠀⢿⣿⣷⠆⠀⠰⠒⠋⠁⠀⠀⠀⣸⣏⡇⠘⡆⠀⢀⣷⡄⠀⠀⠀⠀");
    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⡇⡏⠀⢣⠀⠸⣿⣿⠀⠀⠀⠀");
    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⢿⡆⢱⠀⠈⢒⡆⠈⣽⠃⠀⠀⠀");
    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣸⣧⢾⣽⣾⡀⡾⣝⣡⡴⣿⣶⡒⢶⡀");
    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣥⠈⠉⠻⠋⠀⡽⠋⠉⠉⢲⡍⠉⠁⣸⠄");
    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠳⣏⠀⠀⠀⠀⣇⠀⢀⠖⢉⠤⣄⣴⠋⠀");
    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠒⠂⠤⠚⠀⠈⠒⠚⠚⠉⠀⠀⠀");
  }
  
  //sad cat
  public static void sadCat() {
    System.out.println(" ⢀⡴⠶⠶⢤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⠶⠛⠉⠙⢷⡀⠀⠀");
    System.out.println("⠀⣸⠁⠀⠀⠀⠈⠙⠶⣤⣤⣤⣤⣤⣤⣤⣤⠾⠋⠀⠀⠀⠀⠀⠘⡇⠀⠀");
    System.out.println("⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀");
    System.out.println("⠀⢻⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢧⠀⠀");
    System.out.println("⠀⣸⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢷⡀");
    System.out.println("⢀⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣇");
    System.out.println("⢸⠃⠀⠀⠀⠀⠀⠀⠀⠀⣀⠀⠀⠀⠀⠀⠀⣄⣀⡀⠀⠀⠀⠀⠀⠀⠀⢻");
    System.out.println("⢸⠀⠀⠀⠀⠀⠀⠀⠈⠋⠁⠀⠀⢀⣀⠀⠀⠀⠉⠁⠀⠀⠀⠀⠀⠀⠀⢸");
    System.out.println("⠸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾");
    System.out.println("⠀⢻⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡤⠤⣤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⠇");
    System.out.println("⠀⠀⠙⢦⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣤⠞⠁⠀");
    System.out.println("⠀⠀⠀⠀⠉⠛⠓⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠖⠒⠛⠛⠉⠉⠀⠀");
  }
  
}
  
  
  
  
  
  
  
  
  
  
  
  
  