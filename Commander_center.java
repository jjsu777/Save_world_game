import java.util.Scanner;

public class Commander_center extends Commander {
    public Commander_center(int health, int leadership, int building_speed){
        super(health, leadership, building_speed); // super을 사용해서 부모 클래스의 변수를 참조할 수 있다. 
    }

    public void showComander_center_menu(){
        System.out.println("사령관님의 현재 위치는 사령실입니다.");
        System.out.println("=======================================================================================");
        System.out.print("1. 상태점검     2. 개인정비     3. 독서     4. 건설공부     5. 도움말     6. 나가기   ");
        System.out.println("");

    }
    public void choice() {
        Scanner scanner = new Scanner(System.in);
        while (true) { //무한루프를 이용해서 선택을 하면 사령실로 다시 나오도록 짠다. 
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("=====================");
                    System.out.println("사령관 님의 현재 상태입니다.");
                    System.out.println("=====================");
                    System.out.println("체력 : " + getHealth());
                    System.out.println("리더쉽 : " + getLeadership());
                    System.out.println("건설능력 : " + getBuilding_speed());
                    break;
                case 2:
                    setHealth(getHealth() + 10);
                    System.out.println("체력이 증가하였습니다. 현재 체력 : " + getHealth());
                    break;
                case 3:
                    setLeadership(getLeadership() + 10);
                    System.out.println("리더쉽이 증가하였습니다. 현재 리더쉽 : " + getLeadership());
                    break;
                case 4:
                    setBuilding_speed(getBuilding_speed() + 10);
                    System.out.println("건설능력이 증가하였습니다. 현재 건설능력 :" + getBuilding_speed());
                    break;
                case 5: 
                    System.out.println("도움말 나중에 추가 예정");
                    break;
                case 6:
                    System.out.println("사령실에서 나갑니다.");
                    //scanner.close();
                    MainMenu mainMenu2 = new MainMenu(scanner);
                    mainMenu2.showMenu();
                    choice = mainMenu2.getChoice();
                    break;
                default:
                    System.out.println("잘못된 선택입니다.");
                    break;
            }
            showComander_center_menu();
        }
    }
} 