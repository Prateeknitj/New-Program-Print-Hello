class Arrow_72
{
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
		}
		System.out.println();
		System.out.println();