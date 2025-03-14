import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

class Student {
  private int id;
  private String name;
  private double cgpa;

  public Student(int id, String name, double cgpa) {
    this.id = id;
    this.name = name;
    this.cgpa = cgpa;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public double getCgpa() {
    return cgpa;
  }

}

class Priorities {
  private PriorityQueue<Student> pq;

  public Priorities() {
    pq = new PriorityQueue<Student>(new Comparator<Student>() {
      @Override
      public int compare(Student o1, Student o2) {
        if (Double.compare(o1.getCgpa(), o2.getCgpa()) != 0) {
          return Double.compare(o2.getCgpa(), o1.getCgpa());
        } else if (o1.getName().compareTo(o2.getName()) != 0) {
          return o1.getName().compareTo(o2.getName());
        }
        return Integer.compare(o1.getId(), o2.getId());
      }
    });
  }

  public List<Student> getStudents(List<String> events) {
    for (String s : events) {
      String[] arr = s.split("\\s+");
      if (arr.length == 1) {
        if (!pq.isEmpty()) {
          pq.poll();
        }
      } else {
        pq.add(new Student(Integer.parseInt(arr[3]), arr[1], Double.parseDouble(arr[2])));
      }
    }
    List<Student> ans = new ArrayList<>();
    while (!pq.isEmpty()) {
      ans.add(pq.poll());
    }
    return ans;
  }

}

public class DATA_STRUCTURE001 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    List<String> events = new ArrayList<>();
    while (t-- > 0) {
      events.add(sc.nextLine());
    }
    List<Student> res = new Priorities().getStudents(events);
    if(res.size()==0){
      System.out.println("EMPTY");
    }
    else{
    for (Student s : res) {
      System.out.println(s.getName());
    }
  }
    sc.close();
  }
}
