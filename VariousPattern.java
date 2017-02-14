class VariousPattern{
	public static void main(String args[]){
		for(int i=0;i<10;++i){
			if(i==0 || i==9){
				for(int j=0;j<9;++j){
					System.out.print("*");
				}
				System.out.println();
			}
			else{
				for(int j=0;j<10;++j){
					if(j==0 || j==8){
						System.out.print("*");
					}
					else{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
		
		System.out.println();
		System.out.println();
		
		for(int i=0;i<10;++i){
			if(i==0 || i==9){
				for(int j=0;j<10;++j){
					if(j>1 && j<8)
					System.out.print("*");
					else{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			else if(i==1||i==8){
				for(int j=0;j<10;++j){
					if(j==1 || j==8){
						System.out.print("*");
					}
					else{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			else{
				for(int j=0;j<10;++j){
					if(j==0 || j==9){
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