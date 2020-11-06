class Ex2_6 {
    public static void main(String[] args) {
        /* 
            변수의 타임 
                - 숫자    
                    int     // 정수(integer)를 저장하기 위한 타입
                    long    // 정수(integer)를 저장하기 위한 타입(20억이 넘을 때는 long)
                    
                    float   // 실수(floating-point number)를 저장하기 위한 타입(float는 오차없이 7자리)
                    double  // 실수(floating-point number)를 저장하기 위한 타입(double은 15자리)

                - 문자
                    char    // 문자(character)를 저장하기 위한 타입
                    String  // 여러 문자(문자열, stirng)를 저장하기 위한 타입
        */ 
        
        int x = 100;
        double pi = 3.14;

        char ch = 'a';
        String str = "abc";

        System.out.println(x);
        System.out.println(pi);

        System.out.println(ch);        
        System.out.println(str);
        
    }
}