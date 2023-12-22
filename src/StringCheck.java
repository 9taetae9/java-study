public class StringCheck {
    public static void main(String[] args) {
        StringCheck sample = new StringCheck();

        String[] addresses =new String[]{
                "서울시 구로구 신도림동",
                "경기도 성남시 분당구 정자동 개발 공장",
                "서울시 구로구 개봉동",
        };

        sample.checkAddress(addresses);
        sample.checkMatch();
        sample.checkIndexOf();
        sample.checkLastIndexOf();
    }

    public void checkAddress(String[] addresses){
        int startCount = 0, endCount=0, containCount=0;
        String startText = "서울시";
        String endText = "동";
        String containText = "구로";

        for(String address:addresses){
            if(address.startsWith(startText)){
                startCount++;
            }
            if(address.endsWith(endText)){
                endCount++;
            }
            if(address.contains(containText)){
                containCount++;
            }
        }
        System.out.println("Starts with "+startText+" count is "+startCount);
        System.out.println("Ends with "+endText+" count is "+endCount);
        System.out.println("Contains "+containText+" count is "+containCount);
    }

    public void checkMatch(){
        String text = "This is a text";
        String compare1 = "is";
        String compare2 = "this";
        System.out.println(text.regionMatches(2,compare1,0,1));
        System.out.println(text.regionMatches(5,compare1,0,2));
        System.out.println(text.regionMatches(true,0, compare2,0,4));


    }

    public void checkIndexOf(){
        String text = "Java technology is both a programming language and a platform.";
        System.out.println(text.indexOf('a'));  //1
        System.out.println(text.indexOf("a ")); //3
        System.out.println(text.indexOf('a',20)); //24
        System.out.println(text.indexOf("a ",20)); //24
        System.out.println(text.indexOf('z')); //-1
    }

    public void checkLastIndexOf(){
        String text ="Java technology is both a programming language and a platform.";
        System.out.println(text.lastIndexOf('a'));  //55
        System.out.println(text.lastIndexOf("a ")); //51
        System.out.println(text.lastIndexOf('a',20)); //3
        System.out.println(text.lastIndexOf("a ",20)); //3
        System.out.println(text.lastIndexOf('z')); //-1
    }
}
