import java.util.Scanner;

public class Eden_around extends Eden {
    public Eden_around(int protected_score, int people_trust_score){
        super(protected_score, people_trust_score);
    }
    public void showEden_menu(){
        System.out.println("사령관님 에덴을 둘러보고 계십니다.");
        System.out.println("=======================================================================================");
        System.out.print("1. 방어시설     2. 거리     3. 연설      4. 도움말     5. 나가기   ");
        System.out.println("");
    }
        public void choice(){
        
            Scanner scanner = new Scanner(System.in);
            while (true){
                int choice = scanner.nextInt();
                switch (choice){
                    case 1:
                        System.out.println("방어시설");
                        break;
                    case 2:
                        System.out.println("거리");
                        break;
                    case 3:
                        System.out.println("연설");
                        break;
                    case 4:
                        System.out.println("도움말");
                        break;
                    case 5:
                    System.out.println("에덴으로 돌아가기");
                    //scanner.close();
                    MainMenu mainMenu2 = new MainMenu(scanner);
                    mainMenu2.showMenu();
                    choice = mainMenu2.getChoice();
                        break;
                    default:
                        System.out.println("잘못된 선택입니다.");
                        break;
                                    
                }
            }
        }
    }