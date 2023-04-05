import java.util.Scanner;

public class Commander_laboratory extends Commander {
    public Commander_laboratory(int health, int leadership, int building_speed){
        super(health, leadership, building_speed);
    }

    public void showCommander_laboratory_menu(){
        System.out.println("사령관님의 현재 위치는 연구실 입니다.");
        System.out.println("=======================================================================================");
        System.out.print("1. 방어도 연구     2. 건물연구     3. 민심연구      4. 도움말     5. 나가기   ");
        System.out.println("");
    }

    public void choice(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("방어도연구");
                    break;
                case 2:
                    System.out.println("건물연구");
                    break;
                case 3:
                    System.out.println("민심연구");
                    break;
                case 4:
                    System.out.println("도움말");
                    break;
                case 5:
                System.out.println("연구실에서 나갑니다.");
                //scanner.close();
                MainMenu mainMenu3 = new MainMenu(scanner);
                mainMenu3.showMenu();
                choice = mainMenu3.getChoice();
                    break;
                default:
                    System.out.println("잘못된 선택입니다.");
                    break;
                                
            }
        }
    }
}