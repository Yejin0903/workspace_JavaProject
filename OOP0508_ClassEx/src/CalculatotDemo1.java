class Calculator{
	int left, right;
	public Calculator(int pre, int pos) {
		this.left = pre;
		this.right = pos;
	}
	public void sum() {
		System.out.println(left+right);
	}
	public void avg() {
		System.out.println((left+right)/2);
	}

	}

public class CalculatotDemo1 {
	
	public static void main(String[] args) {
		
		Calculator c1 = new Calculator(10,20);
		c1.sum();
		c1.avg();
		
		Calculator c2 = new Calculator(20,40);
		c2.sum();
		c2.avg(); 
		}
	}
