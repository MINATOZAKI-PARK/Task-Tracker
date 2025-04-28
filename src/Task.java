import java.time.LocalTime;
public class Task {
    public enum Status {
        Done, InProgress, Pending;
    }
    private int id;
    private String name;
    private String description;
    private Status status;
    private String createdAt;
    private String updatedAt;

    public Task(int id, String name, String description, String createdAt, String updatedAt){
       this.id = id;
       this.name = name;
       this.description = description;
       this.status = Status.Pending ;
       this.createdAt = createdAt;
       this.updatedAt = updatedAt;
    }
}
