package programs;

public class SwapLargestAndSmallestNumberFromArray {

	public static void main(String[] args) {

		int a[] = { 10, 9, 32, 5, 300 };

		int max = 0;

		int maxindex = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
				maxindex = i;

			}
		}

		System.out.println(max + " is the maximum number and index is " + maxindex);

		int min = max;

		int minindex = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
				minindex = i;

			}
		}

		System.out.println(min + " is the minimum number and index is " + minindex);

		int temp = a[minindex];

		a[minindex] = a[maxindex];

		a[maxindex] = temp;
		
		for(int aa:a)
		{
			System.out.print(aa+" ");
		}

	}

}
