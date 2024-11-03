import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Copier extends Scanner implements Copy{

    private boolean turnOnCopy;
    private boolean isCoppied;

    private PrintWriter fout1;

    public Copier() throws FileNotFoundException {
        super();
        fout1 = new PrintWriter(new File("Log.txt"));
    }

    /**
     * Method releases used recourses
     */
    public void dispose()
    {
        fout1.close();
    }

    void set_copy(boolean s_cpy){
        this.turnOnCopy = s_cpy;
    }

    boolean get_copy(){
        return this.turnOnCopy;
    }

    void set_coppeid(boolean s_c) {
        this.isCoppied = s_c;
    }

    @Override
    public boolean isCopied() {
        return isCoppied;
    }

    @Override
    public void startCopping(boolean s_c) {
        scanning();
        if(get_copy()){
            System.out.print("Start copping...\n");
            System.out.print("Coppied\n");
            set_coppeid(s_c);
            fout1.print("Start copping...\n");
            fout1.print("Coppied\n");
            fout1.flush();
        }
    }
}
