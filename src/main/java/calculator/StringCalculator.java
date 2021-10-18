package calculator;

class StringCalculator {

    public int add(String input) {
        int a=0;
        
        char[] arr=input.toCharArray();
        int[] b=new int[arr.length];
        for(int i=0;i<arr.length;i++){
          if(arr[i]!=',' && arr[i]!='\n' && arr[i]!=';')
          {
              b[i]=arr[i];
          }
        }
        for(int i=0;i<b.length;i++){
          if(b[i]>0){
              a=a+(b[i]-48);
          }    
        }
        return a;
    }

}