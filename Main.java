import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("사령관님의 성함을 알려주세요: ");
        String commanderName = scanner.nextLine();
        System.out.println("사령관님의 성함은 " + commanderName + "입니다. 잘 부탁드립니다.");
        System.out.println("=================================================");
        System.out.println("먼 미래 지구에 정체불명의 외계인이 침공했습니다.");
        System.out.println("지구는 외계인들에게 당해 막대한 피해를 입었습니다.");
        System.out.println(commanderName + ", 당신은 지구를 지키는 마지막 사령관으로 선택 되었습니다.");
        System.out.println("지구는 마지막 도시를 건설해 에덴으로 이름 지었고 반드시 수호해야 합니다.");
        System.out.println("마지막 도시 에덴을 발전시키고 방어 시설을 건설해 지구를 지켜주세요.");
        System.out.println("=================================================");
        System.out.println("");

        MainMenu mainMenu = new MainMenu(scanner);
        mainMenu.showMenu();
        int choice = mainMenu.getChoice();

        switch (choice) {
            case 1:
                //사령실로 이동
                Commander_center commanderCenter = new Commander_center(100, 50, 10);
                commanderCenter.showComander_center_menu();
                 commanderCenter.choice();
                break;
            case 2:
                Commander_laboratory commander_laboratory = new Commander_laboratory(choice, choice, choice);
                commander_laboratory.showCommander_laboratory_menu();
                commander_laboratory.choice();
                break;
            case 3:
             Eden_around eden_around = new Eden_around(choice, choice);
                 eden_around.showEden_menu();
                 eden_around.choice();
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                System.out.println("사령관님 다시 선택해 주세요.");
                break;
        }
        scanner.close();
    }
}

class MainMenu {
    public Scanner scanner;
    public int choice;

    public MainMenu(Scanner scanner) {
        this.scanner = scanner;
    }

    public void showMenu() {
        System.out.println("사령관님의 현재 위치는 에덴입니다.");
        System.out.println("=======================================================================================");
        System.out.print("1. 사령실     2. 연구실     3. 에덴 둘러보기     4. 건설소     5. 휴식     6. 게임종료   ");
        System.out.println("");
        this.choice = scanner.nextInt();
    }

    public int getChoice() {
        return choice;
    }
}