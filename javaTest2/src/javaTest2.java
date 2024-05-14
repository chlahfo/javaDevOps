import java.util.Date;
import java.util.Scanner;
public class javaTest2 {
    public static int getAnimalNum(){
        int birthYear = 0, age, currentYear, animalNum;
        
        Scanner sc =  new Scanner(System.in);
        Date currentDate = new Date();

        //age = sc.nextInt();
        age = 29;
        currentYear = currentDate.getYear() + 1900;
        birthYear = (age < 1500)? currentYear - age : age;

        animalNum = (birthYear - 1900) % 12;//1900년도가 쥐의 해
        animalNum = (animalNum < 0)? animalNum + 12: animalNum;
        sc.close();
        return animalNum;
    }
    
    
    public static String getFate(int num, int pos, String[]arg){
        return arg[num + pos];
    }
    public static void horoscope(){
        //String []koreaGods12 = {"자", "축", "인", "묘", "진", "사", "오", "미", "신", "유", "술", "해"};
        Scanner sc =  new Scanner(System.in);
        String []fate12 = {"천귀", "천액", "천권", "천파", "천인", "천문", "천복", "천고", "천역", "천간", "천수", "천명"};
        String []fatePeople = new String[4];


        System.out.println("현재 나이를 입력하세요. 만약 나이를 입력하기 힘들다면, 출생 연도를 입력해주세요.");
        int pos = 0, num = getAnimalNum();
        fatePeople[0] = getFate(num, pos, fate12);
        pos += num;
        
        System.out.println("몇 월에 태어나셨나요?");
        num = sc.nextInt() - 1;
        fatePeople[1] = getFate(num, pos, fate12);
        pos += num;

        System.out.println("몇 일에 태어나셨나요?");
        num = sc.nextInt() - 1;
        fatePeople[2] = getFate(num, pos, fate12);
        pos += num;

        System.out.println("몇 일에 태어나셨나요?");
        num = sc.nextInt() - 1;
        fatePeople[2] = getFate(num, pos, fate12);
        pos += num;
    }
    
    public static void testHoroscope(){

    }
    public static void main(String[] args){
        horoscope();
    }


}

//

