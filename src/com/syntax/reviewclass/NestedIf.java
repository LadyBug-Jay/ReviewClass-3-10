package com.syntax.reviewclass;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean programmer=true;
        boolean manualTester=true;
        boolean knowFramework=true;

        if(programmer) {
            if(manualTester) {

                if(knowFramework) {
                    System.out.print("You can be an automation engineer");
                }else {
                    System.out.println("You need to know a framework as well ");
                }
                }else {
                    System.out.println("You need to know Manual testing as well");
                }
            }else {
                System.out.println("You need to be a programmer as well");
            }

		
		
		
		
		
		
		
		
		
		
	}

}
