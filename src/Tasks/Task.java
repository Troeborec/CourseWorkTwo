package Tasks;

import java.lang.reflect.Type;
import java.util.Objects;

public abstract class Task {
    private final int id;
    private final String nameTittle;
    private String pole;
    private Type type; //личная или рабочая
    private String priznak;
    private static int idGenerator = 1;


    public Task(int id, String nameTittle, String pole, Type type, String priznak) {
        this.id = idGenerator;
        this.nameTittle = nameTittle;
        this.pole = pole;
        this.type = type;
        this.priznak = priznak;
        idGenerator++;
    }


    public int getId() {
        return id;
    }

    public String getNameTittle() {
        return nameTittle;
    }

    public String getPole() {
        return pole;
    }

    public void setPole(String pole) {
        this.pole = pole;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getPriznak() {
        return priznak;
    }

    public void setPriznak(String priznak) {
        this.priznak = priznak;
    }

    public static int getIdGenerator() {
        return idGenerator;
    }

    public static void setIdGenerator(int idGenerator) {
        Task.idGenerator = idGenerator;
    }

    @Override
    public String toString() {
        return "Задача" +
                " id " + id +
                " заголовок " + nameTittle + '\'' +
                " pole " + pole + '\'' +
                " type" + type +
                "дата и время выполнения " + priznak + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nameTittle, pole, type, priznak);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}


