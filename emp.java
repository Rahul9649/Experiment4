class emp
{
    void display() 
    {
        System.out.println("Name of class is Employee");
    }
    void calcSalary()
    {
        System.out.println("Salary of employee is 10000");
    }
}

class engineer extends emp
{
    void display() 
    {   super.display();
        super.calcSalary();
        System.out.println("Name of class is Engineer");
    }
    void calcSalary()
    {   
        System.out.println("Salary of employee is 20000");
    }
}

class Salary
{
    public static void main(String args[])
    {
        engineer e = new engineer();
        e.display();
        e.calcSalary();
    }
}