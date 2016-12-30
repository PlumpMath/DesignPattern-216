package builder1;

/**
 * Created by Tony on 12/30/2016.
 */
public class ComputerFactory {
    private BluePrint print;

    public void setBlueprint(BluePrint print){
        this.print = print;
    }

    public void make() {
        print.setCpu();
        print.setRam();
        print.setStorage();
    }

    public Computer getComputer() {
        return print.getComputer();
    }
}
