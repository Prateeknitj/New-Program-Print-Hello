class ArrowDiamond{
	public static void main(String args[]){
		for(int i=0;i<7;++i){
			if(i==0 || (i>2)){
				for(int j=0;j<7;++j){
					if(j==3){
						System.out.print("*");
					}
					else{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			else if(i==1){
				for(int j=0;j<7;++j){
					if(j>0 && j<6){
						System.out.print("*");
					}
					else{
						System.out.print(" ");
					}
				}
				System.out.println();
			}

			else if(i==2){
				for(int j=0;j<7;++j){
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
		System.out.println();
		System.out.println();
		
		for(int i=0;i<7;++i){
			if(i==0 || i==6){
				for(int j=0;j<7;++j){
					if(j==3){
						System.out.print("*");
					}
					else{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			else if(i==1 || i==5){
				for(int j=0;j<7;++j){
					if(j==2 || j==4){
						System.out.print("*");
					}
					else{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			else if(i==2 || i==4){
				for(int j=0;j<7;++j){
					if(j==1 || j==5){
						System.out.print("*");
					}
					else{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			else if(i==3){
				for(int j=0;j<7;++j){
					if(j==0 || j==6){
						System.out.print("*");
					}
					else{
						System.out.print(" ");
					}
				}
				System.out.println();
			} 
		}
	}
}