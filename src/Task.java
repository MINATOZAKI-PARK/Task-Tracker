public class Task {
    private int id;
    private String name;
    private String description;
    private int status; // 1- incomplete, 2- in-progress, 3- completed
    private String createdAt;
    private String updatedAt;

    public Task(int id, String name, String description, String createdAt, String updatedAt){
       this.id = id;
       this.name = name;
       this.description = description;
       this.status = 1;
       this.createdAt = createdAt;
       this.updatedAt = updatedAt;
    }
}
