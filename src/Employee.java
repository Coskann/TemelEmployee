public class Employee {
    private String name;
    public double salary;
    private int workhours, hireyear;

    Employee(int hireyear, int workhours, double salary, String name) {
        this.name = name;
        this.salary = salary;
        this.workhours = workhours;
        this.hireyear = hireyear;
    }

    public double tax() {
        if (this.salary > 1000) {
            return salary * 0.03;
        } else {
            return 0.0;
        }

    }

    public double bonus() {
        int sonuc = (this.workhours - 40) * 30;
        return sonuc;


    }
    public double increase(){
        int year =2020-this.hireyear;
        if(year<10) {
            return salary * 0.05;

        }else if(year<20 && year>10){
                return salary * 0.1;
            }else{
            return this.salary*0.15;
        }
        }
    }

