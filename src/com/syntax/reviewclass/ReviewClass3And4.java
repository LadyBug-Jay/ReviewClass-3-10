package com.syntax.reviewclass;

public class ReviewClass3And4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Casting
	//Explicit/narrowing/Manual
	double price =4.5;
	int discount=(int)price;
	
	short largerBox=129;
	byte smallerBox=(byte)largerBox;//As we can not fit 129 in byte we will get wrong results
	System.out.println(smallerBox);
	
	
	//Explicit/narrowing/Manual
    // As we can fit 129 in short we will get proper results
    int largerBox1=129; 
    short smallerBox2=(short)largerBox1;
    System.out.println(smallerBox2);
	
	
    //Implicit/widening/Automatic
    short smallerbox3=45;
    long largerBox3=smallerbox3;
    System.out.println(largerBox3);
    
    
    
    //IF CONDITION
    boolean rich=true;
    System.out.println("Lets buy some eggs for breakfast");
    int money=5000000;
    if(money>300000)
    {
    System.out.println("Lets buy a Jet or Island");
    }

    System.out.println("Lets buy some milk for breakfast");


    //IfElse
    int mymoney=5000000;
    if(mymoney>300000)
    {
    System.out.println("Lets buy a Jet or Island");
    }
    else 
    {
    System.out.println("Lets buy some milk for breakfast");
    }
    
    String userName="Admin";
    String password="password";
    if(password.equals("password123"))
    {
        System.out.println("Welcome "+userName);
    }
    else
    {
        System.out.println("Wrong password "+userName);
    }
    
    
    
    
    
    
    //IfEleIfElse 
    
    int number=25;

    if(number==10) 
    {
        System.out.println("nunmber is 10");
    }
    else if (number==20)
    {
        System.out.println("nunmber is 20");
    }
    else if (number==30)
    {
        System.out.println("nunmber is 30");
    }else
    {
        System.out.println("Number is not valid");
    }
    
    
    
    //NestedIf
    int ourMoney=12;

    if(ourMoney>10)   //outer conditions
    {
        System.out.println("Lets buy some eggs");
        int noOfEggs=2;

        if(noOfEggs>0) 
        {
            System.out.println("lets boil the eggs");
        }

    }
    else
    {
    	System.out.println("Lets not buy some eggs");
    }
    
    
    boolean studyHard = true;

    if (studyHard)
    {
        System.out.println(" we ge the job in first few weeks");
        boolean goodCommunicationSkills = true;

        if (goodCommunicationSkills)
        {
            System.out.println(" might get a job in Apple Amazon, etc. ");
        } 
        else
        {
            System.out.println(" we need to work on our communication skills");
        }

    } 
    else 
    {

        System.out.println("it might take a little longer to get the job");
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	
	
	}

}
