package Trend;

public class Threads {
   
	public static void main(String[] args) {
		DD dd = new DD();
		CC cc = new CC();
		
		Thread thread=new Thread(dd);
		Thread threadc=new Thread(cc);
		thread.start();
		threadc.start();
		try {
			threadc.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.err.println("输出成功");
	}
}

 class DD implements Runnable {
	 private int i = 1;
		public void run() {
			while(i <10) {
				System.err.println(i);
				i++;
			}
		}
		
	}
 
 class CC implements Runnable {
	    private int i = 1;
			public void run() {
				while(i <10) {
					System.err.println(i);
					i++;
				}
			}
			
		}