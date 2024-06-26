import java.util.Date;
import java.util.Scanner;
public class javaTest3 {
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
    
    //그 사람의 정보들을 질문하고 생년월일과 운명 번호 리스트들의 내용을 바꿈
    public static void fateAndInfoSetting(int []birth, int []fateNums){
        int moveNum, posNum;
        
        String Time = "월일시";
        String name = "";

        posNum = 1;         
            name = getAnswerString("당신의 이름은 무엇인가요?");
            birth[0] = getBirthYear();

            for(int i = 0; i < fateNums.length; i++){
                moveNum = (i == 0)? getAnimalNum(birth[0]) : getAnswerInt("몇 "+Time.charAt(i-1)+"에 태어나셨나요?");
                birth [i] = (i == 0)? birth[0] : moveNum;
                if (i == 3){
                    moveNum += (moveNum % 2);
                    moveNum = (moveNum == 24)? (moveNum / 2) - 12 + 1: moveNum / 2 + 1;
                }
            posNum += --moveNum;
            posNum %= 12;
            fateNums[i] = posNum;
        }

        System.out.printf("[%s님의 출생 연월일시]\n%d년 %d월 %d일 %d시\n", name, birth[0], birth[1], birth[2], birth[3]);
    }
    //계속 할건지 다시 할건지 묻기 //will fix
    public static void askContinue(char loopAnswer, char continueAnswer, int []birth, int []fateNums){
        char answer = loopAnswer;
        while(answer == loopAnswer){
            
            fateAndInfoSetting(birth, fateNums);//will fix

            answer = getAnswerString("계속 진행하시려면 "+continueAnswer+", 다시 입력하시려면 "+loopAnswer+"입력해주세요.").charAt(0);
            while(!(answer == continueAnswer|| answer == loopAnswer))
                answer = getAnswerString(continueAnswer+" 또는 "+loopAnswer+"만 입력해주세요").charAt(0);
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
        //will fix
        askContinue('n', 'y', birth, fateNums);
        System.out.printf("**** 사주팔자결과 *****\n%s\n%s\n%s\n%s\n", fate12[fateNums[0]], fate12[fateNums[1]], fate12[fateNums[2]], fate12[fateNums[3]]);
    }

    public static void main(String[] args){
        startHoroscopeGame();
    }
}