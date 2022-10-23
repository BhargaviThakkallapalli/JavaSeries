package JavaSessions;

public class IncrementalAndDecremental {

	public static void main(String[] args) {
		// 1. post increment: later
		//++ increase the value by 1
		
		int m = 1;
		int n = m++; //give the original value of m to n then increase the value of m by 1.		
	System.out.println(m); //2
	System.out.println(n); //1
	
	int p = -89;
	int q = p++;
	System.out.println(p);//-88
	System.out.println(q);//-89
	
	int t = 0;
	int r = t++;
	System.out.println(t); //1
	System.out.println(r); //0
	
	int k = -999;
	int g = k++;
	System.out.println(k); //-998
	System.out.println(g); //-999
	
	int total = 1;
	System.out.println(total++); //o/p is 1 because left to right execution
	System.out.println(total); // o/p is 2 because of the memory allocation.
	
	//2. PreIncrement:
	//increase the value first
	int b =1;
	int v = ++b; // after increment the b value then assign the value to v, and give the increased value to b.
	System.out.println(b); //2
	System.out.println(v); //2
	
	int tt = -89;
	int rr = ++tt;
	System.out.println(tt); //-88
	System.out.println(rr); //-88
	
	int pop = 100;
	System.out.println(++pop); //101
	System.out.println(pop); //101
	
	//3. post decrement: -- decrease the value by 1
	int d  = 2;
	int f  = d--;
	System.out.println(d); //1
	System.out.println(f); //2
	
	int s = -1;
	int e = s--;
	System.out.println(s); //-2
	System.out.println(e); //-1
	
	int food = -89;
	System.out.println(food--); //-89
	System.out.println(food); //-90
	
 	//4. pre decrement:
	int h = 2;
	int u = --e;
	System.out.println(h); //1
	System.out.println(u); //1
	
	int test = -989;
	int testing = --test;
	System.out.println(test); //-990
	System.out.println(testing); //-990
	
	int google = -1000;
	System.out.println(--google); //-1001
	System.out.println(google); //-1001
	System.out.println(google++); //-1001
	System.out.println(google); //-1000
	System.out.println(++google);//-999
	
	//
	int bal = 500;
	int totalBal = bal++ +10; // left to right execution, bal(original value)is taken and added to 10 then increase it later 
	System.out.println(totalBal); //510
    System.out.println(bal); //501
    
    int totBal = ++bal +10; //511
    System.out.println(totBal); //511
    
    int le = 2;
    int re = le++ +le++ -le++;
    System.out.println(re);
	
    int sum  = -1111;
    int diff = sum-- +111;
    System.out.println(sum);
    System.out.println(diff);
    
    int x = -100;
    int bh = x+++20;
    
	}

}
