class Geeks {
 static void follPatt(String s){
      int countX=0, countY=0;
        boolean checkCount=false;
        for(int i=0;i<s.length();){
            for(;i<s.length();i++){
                if(s.charAt(i)=='x') countX++;
                else break;
            }
            for(;i<s.length();i++){
                if(s.charAt(i)=='y') countY++;
                else break;
            }
            if(countX==countY){
                checkCount = true;
            }
            else{
                checkCount=false;
                break;
            }
        }
        if(checkCount)
            System.out.println("1");
        else
            System.out.println("0");
    }
}