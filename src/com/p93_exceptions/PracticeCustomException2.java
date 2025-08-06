package com.p93_exceptions;

public class PracticeCustomException2 {

    public int getPension(int age, int salary) throws Exception{
        int pension = 0;

        if(age>45 && age < 90){
            pension = (age * salary) / 100;
        }else{
            MyCustomException customException = new MyCustomException("Not eligible");
            throw customException;
        }
        return pension;
    }

    public static void main(String[] args) {
        PracticeCustomException2 employee = new PracticeCustomException2();

        try{
            int p = employee.getPension(29, 40000);
            System.out.println(p);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
