public class Student {
  private String name ;
  private String id ;
  private String group ;
  private String email ;

  public Student() {
     name = "Student" ;
     id = "000" ;
     email = "“uet@vnu.edu.vn”" ;
     group = "K62CB" ;
  }

  public Student (String name , String id ,String email ){
    this.name = name ;
    this.id = id ;
    this.email = email ;
    group = "K62CB" ;
  }

  public Student ( Student s )
  {
    this.name = s.name ;
    this.id = s.id ;
    this.email = s.email ;
    this.group = s.group ;
  }

  public String getName() {
    return name ;
  }

  public void setName(String n) {
    name = n;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

}