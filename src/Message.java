class Message{
    public void displayMsg(String msg){
        System.out.println("Inside displayMsg method " +    Thread.currentThread().getName());
        synchronized(this){
            System.out.print("**" + msg);        
            try {
				System.out.println(2/0);
                Thread.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("*");
        }
    }
	public static void main(String args[]){
		Message m = new Message();
		m.displayMsg("sample");
	}
}