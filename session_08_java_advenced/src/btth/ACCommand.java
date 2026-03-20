package btth;

public class ACCommand implements Command {
    AC ac;
    int newTemp;
    int oldTemp;


    public ACCommand(AC ac, int newTemp) {
        this.ac = ac;
        this.newTemp = newTemp;
    }

    @Override
    public void execute() {
        this.oldTemp = ac.getTemp(); // gán giá trị cũ từ thằng ban đầu
        ac.changeTemp(newTemp);
        System.out.println(
                oldTemp > newTemp ?
                        "Đang giảm nhiệt độ " + ac.getTemp() :
                        "Đăng tăng nhiệt độ" + ac.getTemp());
    }

    @Override
    public void undo() {
        ac.changeTemp(oldTemp);
        System.out.println("Đã trở lại nhiệt độ cũ" + ac.getTemp());
    }
}
