

public class TwoClass {

    public interface IFirstInterface {

        void callBack();
    }

    private IFirstInterface iFirstInterface;
    public void registerCallBack(IFirstInterface iFirstInterface){
        this.iFirstInterface = iFirstInterface;
    }

    public TwoClass(){
        MyThread myThread = new MyThread();
        myThread.start();
    }

    public class MyThread extends Thread {
        public void run() {
            System.out.println("Mой поток запущен...");
            try {
                wait(10000);
                iFirstInterface.callBack();
            } catch (InterruptedException e){e.printStackTrace();}

        }
    }
}
