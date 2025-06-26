import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner todoSc = new Scanner(System.in);
        ArrayList<String> todos = new ArrayList<>();

        System.out.println("================================");
        System.out.println("📝 할일 관리 프로그램에 오신 것을 환영합니다!");
        System.out.println("================================");

        todos : while (true) {
            System.out.println("\n📋 멋진 메뉴를 선택하세요:");
            System.out.println("1. ➕ 할일 추가");
            System.out.println("2. 📃 할일 목록 보기");
            System.out.println("3. 🔄 할일 상태 변경");
            System.out.println("4. 🚪 프로그램 종료");
            System.out.print("선택: ");
            String choice = todoSc.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("📝 새로운 할일을 입력하세요: ");
                    String todo = todoSc.nextLine();
                    todos.add(todo);
                    break;
                case "2":
                    for (String aaa : todos) {
                        if (aaa == null) {
                            break;
                        } else {
                            System.out.println(aaa);
                        }
                    }
                    break;
                case "3":
                    // 완료되면 Todos에서 선택된거 하나 삭제하기
                    System.out.println("상태를 변경 할 할일을 선택하세요");
                    int completeTodo = todoSc.nextInt() - 1;
                    todoSc.nextLine();

                    if (completeTodo >= todos.size() || completeTodo < 0) {
                        System.out.println("올바른 값을 입력하세요.");
                        continue;
                    }

                    todos.remove(completeTodo);

                    break;
                case "4":
                    break todos;
                default:
                    System.out.println("❌ 잘못된 선택입니다. 1-4 사이의 숫자를 입력해주세요.\n");
            }
        }

        System.out.println("================================");
        System.out.println("안녕히가세요.");
        System.out.println("================================");
    }
}
