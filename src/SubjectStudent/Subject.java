package SubjectStudent;

/**
 * Subject
 * File name: Subject.java
 * Author: yourself
 * Create date: 2109-09-03
 * Update date: 2109-09-03
 */
public class Subject {

    private String Id;
    private String name;

    public Subject(String Id, String name){
        this.Id = Id;
        this.name = name;
    }

    public String getId(){
        return this.Id;
    }

    public String getName(){
        return this.name;
    }

    public void setId(String Id){
        this.Id = Id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String toString(){
        return "รหัสวิชา: " + this.Id + " ชื่อวิชา : " + this.name;
    }
    
}