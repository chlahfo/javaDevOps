import java.util.Date;
import java.util.Scanner;
public class javaTest2 {
    //질문과 함께 String 반환
    public static String getAnswerString(String s){
        String answer;
        Scanner sc =  new Scanner(System.in);
        System.out.print(s+"\n==> ");
        answer = sc.next();
        System.out.println();
        return answer;
    }

    //질문과 함께 int 반환
    public static int getAnswerInt(String s){
        int answer;
        Scanner sc =  new Scanner(System.in);
        System.out.print(s+"\n==> ");
        answer = sc.nextInt();
        System.out.println();
        return answer;
    }

    //출생년도를 리턴하는 함수
    public static int getBirthYear(){
        int currentYear, birthYear = 0;
        Date currentDate = new Date();
        
        currentYear = currentDate.getYear() + 1900;
        birthYear = getAnswerInt("나이 또는 출생연도를 입력해주세요");  
        birthYear = (birthYear < 1000)? currentYear - birthYear : birthYear;
        
        return birthYear;
    }

    //띠 번호를 반환
    public static int getAnimalNum(int birthYear){
        int animalNum;
        animalNum = (birthYear - 1900) % 12;
        animalNum = (animalNum < 0)? animalNum + 12: animalNum;
        
        return animalNum;
    }

    //그 사람의 정보들을 질문. 생년월일과 운명 번호 리스트들의 내용을 바꿈
    public static void getFateIntList(int []birth, int []fateNums){
        int num, pos;
        char answer = 'n';
        String Time = "월일시";
        String name = "";

        while(answer == 'n'){       
            pos = 1;         
            name = getAnswerString("당신의 이름은 무엇인가요?");
            birth[0] = getBirthYear();

            for(int i = 0; i < fateNums.length; i++){
                num = (i == 0)? getAnimalNum(birth[0]) : getAnswerInt("몇 "+Time.charAt(i-1)+"에 태어나셨나요?");
                birth [i] = (i == 0)? birth[0] : num;
                if (i == 3){
                    num += (num % 2);
                    num = (num == 24)? (num / 2) - 12 + 1: num / 2 + 1;
                }
                pos += --num;
                pos %= 12;
                fateNums[i] = pos;
            }

            System.out.printf("[%s님의 출생 연월일시]\n%d년 %d월 %d일 %d시\n", name, birth[0], birth[1], birth[2], birth[3]);
            answer = getAnswerString("내용이 맞다면 y 틀리다면 n을 입력해주세요").charAt(0);
            while(!(answer == 'y'|| answer == 'n'))
                answer = getAnswerString("y 또는 n만 입력해주세요").charAt(0);
        }
    }

    //그 사람의 사주팔자를 알려줌.
    public static void startHoroscopeGame(){
        int []birth = new int[4];
        int []fateNums = new int[4];      
        String []fate12 = {
            "천귀 : 귀인 대접", 
            "천액 : 액땜",
            "천권 : 권력, 리더십",
            "천파 : 파동이 있어요, 해외 이주", 
            "천인 : 인간성, 법 없이도 살 사람", 
            "천문 : 머리가 좋아", 
            "천복 : 복을 갖고태어남", 
            "천고 : 외로움을 많이 타요", 
            "천역 : 역마살, 다방면에 관심", 
            "천간 : 이성에게 매력", 
            "천수 : 손재주가 있어요.", 
            "천명 : 명이 길어요"
        };
        getFateIntList(birth, fateNums);
        System.out.printf("**** 사주팔자결과 *****\n%s\n%s\n%s\n%s\n", fate12[fateNums[0]], fate12[fateNums[1]], fate12[fateNums[2]], fate12[fateNums[3]]);
    }

    public static void main(String[] args){
        startHoroscopeGame();
    }
}