class School {

  String schoolName;

  public School(String name) {
    schoolName = name;
  }

  public String getName() {
    return schoolName;
  }

  public static void main() {
    School college = new School("Berklee");
    String sName = college.getName();
    System.out.println(sName);
  }

}
