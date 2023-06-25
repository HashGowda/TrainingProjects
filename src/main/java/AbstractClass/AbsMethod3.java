package AbstractClass;

abstract class Campus{
    abstract void displayCollegeName(String college);
    abstract void displayCityName(String city);

    void staff(){
        int teachingStaff=12;
        int nonTeachingStaff=8;
        int totalStaff = teachingStaff+nonTeachingStaff;
        System.out.println("Staff: "+totalStaff);
    }
}
class Department extends Campus{
    void displayBranch(){
        String branch="Mechanical";
        System.out.println("Branch: "+branch);
    }
    void displayCollegeName(String college){
        System.out.println("College name: "+college);
    }
    void displayCityName(String city){
        System.out.println("City: "+city);
    }
}

class AbsMethod3 {
    public static void main(String[] args) {
        Department d =new Department();
        d.displayBranch();
        d.displayCollegeName("SJCIT");
        d.displayCityName("Chikkaballapura");
        d.staff();

        Campus c = new Department();
        c.displayCollegeName("SJBIT");
        c.displayCityName("Bengaluru");
        c.staff();
    }
}

