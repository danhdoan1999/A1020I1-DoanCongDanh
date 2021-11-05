package bai12_java_collection_framework.thuc_hanh.phan_biet_hashmap_hashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MainTestHash {
    public static void main(String[] args) {
        Student student1 = new Student("Quang",19,"Hai Chau");
        Student student2 = new Student("Bao",29,"Cam Le");
        Student student3 = new Student("Thuy",11,"Hoa Vang");
        Map<Integer,Student> studentMap = new HashMap<Integer, Student>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
        for (Map.Entry<Integer,Student> student : studentMap.entrySet()){
            System.out.println(student.toString());
        }
        Set<Student> studentSet = new HashSet<Student>();
        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student3);
        for (Student student : studentSet){
            System.out.println(student.toString());
        }
    }
}
