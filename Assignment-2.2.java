
public class pattern {
	public static void main(String[] args){
		int i,j;
		for(i=1; i<=5; i++){
			
			for(j=1; j<=5; j++){
				
				if(j==i || j==5-i+1){
					
					System.out.print("*");
				}
				
				else if(j<5-i+1){
					
					System.out.print("_");
				}
				
				else if(j<i){
					
					System.out.print("_");
				}
			}
			
			System.out.println();
		}
	}

}
