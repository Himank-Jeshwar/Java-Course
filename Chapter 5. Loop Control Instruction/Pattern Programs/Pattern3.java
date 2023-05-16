class Pattern3 {
	public static void main (String []args) {
		for (int i = 1;i<=3;i++){
			for (int y = 2;y>=i;y--){
				System.out.print(" ");
			}
			for (float u = 1.0f;u<=i;u+=0.5f){
				System.out.print("*");
			}
			System.out.println();	
		
		}
	}
}
   