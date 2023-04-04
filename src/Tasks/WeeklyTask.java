package Tasks;

import java.lang.reflect.Type;

public class WeeklyTask extends Task{
    public WeeklyTask(int id, String nameTittle, String pole, Type type, String priznak) {
        super(id, nameTittle, pole, type, priznak);
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public String getNameTittle() {
        return super.getNameTittle();
    }

    @Override
    public String getPole() {
        return super.getPole();
    }

    @Override
    public void setPole(String pole) {
        super.setPole(pole);
    }

    @Override
    public Type getType() {
        return super.getType();
    }

    @Override
    public void setType(Type type) {
        super.setType(type);
    }

    @Override
    public String getPriznak() {
        return super.getPriznak();
    }

    @Override
    public void setPriznak(String priznak) {
        super.setPriznak(priznak);
    }
}
