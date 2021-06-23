class CalcHimself {
    private double result;
    private double M1;
    private double M2;
    private double num1;
    private double num2;


    public void calculate(String inp) {

        String ress = inp.replaceAll(" ", "");
        String[] nums = ress.split("[\\+\\-\\*/%]");
        String[] arithmeticSign = ress.split("[\\d^m]");

        // case if input field wasn't entered without second number; default = 0
        if (nums.length == 1) {
           //String[] num = {nums[0], "0"};
            nums = new String[]{nums[0], "0"};
        }

        // case if input field without arifSign. Set to default = "+";
        if (arithmeticSign.length == 0) {
           // String[] defaultSign = {"+"};
            arithmeticSign = new String[]{"+"};
        }
        //assign for M1 and M2;
        inputCasesForMemorize(nums);

        //switch for arithmetic Sign;
       arithmetic(arithmeticSign);


    }

    public double getResult() {
        return result;
    }

    public double getM1() {
        return M1;
    }

    public double getM2() {
        return M2;
    }

    public void setM1(double m1) {
        this.M1 = m1;
    }

    public void setM2(double m2) {
        this.M2 = m2;
    }
    private  void arithmetic (String[] arithmeticSign){
        switch (arithmeticSign[arithmeticSign.length - 1]) {
            case ("+") -> result = num1 + num2;
            case ("-") -> result = num1 - num2;
            case ("*") -> result = num1 * num2;
            case ("/") -> result = num1 / num2;
            case ("%") -> result = (num1 / 100) * num2;   //Re-made
        }

    }

    private void inputCasesForMemorize(String[] nums) {
        if (nums[0].equalsIgnoreCase("m1") && nums[1].equalsIgnoreCase("m2")) {
            num1 = M1;
            num2 = M2;
        } else if (nums[0].equalsIgnoreCase("M2") && nums[1].equalsIgnoreCase("M1")) {
            num1 = M2;
            num2 = M1;
        } else if (nums[0].equalsIgnoreCase("M2")) {
            num1 = M2;
            num2 = Double.parseDouble(nums[1]);
        } else if (nums[1].equalsIgnoreCase("m2")) {
            num2 = M2;
            num1 = Double.parseDouble(nums[0]);
        } else if (nums[0].equalsIgnoreCase("m1")) {
            num1 = M1;
            num2 = Double.parseDouble(nums[1]);
        } else if (nums[1].equalsIgnoreCase("M1")) {
            num2 = M1;
            num1 = Double.parseDouble(nums[0]);
        } else {
            num1 = Double.parseDouble(nums[0]);
            num2 = Double.parseDouble(nums[1]);
        }
    }

}
