
public class Vector {

	public static void main(String[] args) {
		int [] v=new int [] {9,15,7,12,6};
		
		for (int index = 0; index <5; index ++)
			System.out.printf("v[%s]=%s\n", index, v [index]);

		System.out.println();
		int value=12;
		int position= indexOf(v,value);
		System.out.println("position=" + position);
		//int min = min(v);
		//System.out.println("min=" + min);
		
		
	public static int indexOf(int[] v, int value) {
		
		for (int index = 1 ; index < v.length -1; index++)
			if(v[index]== value)
				return index;
				
		// int index=0;
		// while (index< v.length && v[index] !=value) 
		// index++;
		// if (index==v.length)
		//		retun -1;
		// return index;
		
		for (int index = 0 ; index < v.length;index ++)
			if(v[index]==value)
				return index;
		return -1;
		
	}
	
	public static int min (int[]v) {
		return 77; //TODO implementar
		
	}
	}

}
