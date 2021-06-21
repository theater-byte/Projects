 class CalcHimself {
    private double result;
    private  double M1 ;
    private  double M2;
    private   double num1 ;
    private double num2;


    public   double calculate (String inp){

        String ress = inp.replaceAll(" ", "");
        String[] nums = ress.split("[\\+\\-\\*/%]");
        String[] arithmeticSign = ress.split("[^\\D]");

        if(nums.length==1){                         // case if input field wasn't entered without second number; default = 0
            String [] num = {nums[0], "0"};
            nums= num;
        }

        if(arithmeticSign.length==0){               // case if input field without arifSign. Set to default = "+";
            String [] defaultSign = {"+"};
            arithmeticSign = defaultSign;
        }



        num1 = Double.parseDouble(nums[0]);
        num2 = Double.parseDouble(nums[1]);

        switch (arithmeticSign[arithmeticSign.length-1]){
                    case ("+"):
                        result = num1+num2;
                        break;
                    case  ("-"):
                        result = num1-num2;
                        break;
                    case  ("*"):
                        result = num1*num2;
                        break;
                    case  ("/"):
                        result = num1/num2;
                        break;
                    case  ("%"):
                        result = (num1/100)*num2;   //Re-made
                        break;
                }

        return  result;
    }

     public  double getResult(){
        return  result;
    }

     public double getM1 (){return M1;}

     public double getM2 () {return M2;}

     public void setM1 (double m1) {
        this.M1 = m1;
     }

     public void setM2 (double m2) {
         this.M2 = m2;
     }

 }
