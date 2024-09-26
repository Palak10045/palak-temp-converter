import java.util.Vector;
public class VectorStudent {
    
    private Vector<String> studentNames;
    
    
    public VectorStudent() {
        studentNames = new Vector<>();
    }
    
    public void addStudent(String name) {
        studentNames.add(name);
    }
    public void addStudent(int index, String name) {
        studentNames.add(index, name);
    }
    
    
    public void removeStudent(String name) {
        studentNames.remove(name);
    }
    
    public void removeAllStudents() {
        studentNames.clear();
    }
    
    public int getSize() {
        return studentNames.size();
    }
    
    public int getCapacity() {
        return studentNames.capacity();
    }
    
    public void printStudents() {
        System.out.println("Student Names: " + studentNames);
    }
    
    public static void main(String[] args) {
        VectorStudent vs = new VectorStudent();
        
        vs.addStudent("Alice");
        vs.addStudent("Bob");
        vs.addStudent(1, "Charlie"); 
        
        vs.printStudents();
        
        System.out.println("Size: " + vs.getSize());
        System.out.println("Capacity: " + vs.getCapacity());
        
        vs.removeStudent("Bob");
        vs.printStudents();
        
        vs.removeAllStudents();
        vs.printStudents();
        
        System.out.println("Size after removal: " + vs.getSize());
        System.out.println("Capacity after removal: " + vs.getCapacity());
    }
}


