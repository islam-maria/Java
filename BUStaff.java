import javax.print.DocFlavor.STRING;

class Staff{
    private int code;
    private String name;
    public Staff( int code,String name){
        this.code=code;
        this.name=name;
    }
    public int getCode()
    {
        return code;
    }
    public String getName()
    {
        return name;
    }
}
class Officer extends Staff()
{
    private int grade;
    public Office(int code,String name,int grade)
    {
        super(code,name)
        this.grade=grade;
    }
    public String getGrade()
    {
        return grade;
    }
}
class Teacher extends Staff()
{
   private String subject;
   private String publication;
   public Teacher(int code,String name,String subject,String publication)
   {
    super(code, name)
    this.subject=subject;
    this.publication=publication;
   }
   public String getSubject()
   {
    return subject;
   }
   public String getPublication()
   {
    return Publication;
   }
}
class typist extends Staff()
{
    private int speed;
    public typist(int code,String subject,int speed)
    {
        super(code,subject);
        this.speed=speed;
    }
    public int getSpeed()
    {
        return speed;
    }
}
class regularTypist extends typist()
{
    public regularTypist(int code,String name,int speed)
    {
        super(code,name,speed);
    }
}
class CasualTypist extends Typist()
{
    private int dailtWages;
    public casualTypist(int code,String name,int speed,int dailtWages)
    {super(code,name,speed);
        this.dailtWages=dailtWages;
    }
    public int setdailyWages()
    {
        return dailyWages;
    }

}
public class BuStaff()
{
    public static void main(String[] args)
    {
        
    }
}