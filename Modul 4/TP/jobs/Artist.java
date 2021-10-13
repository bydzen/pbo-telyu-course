package jobs;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;

public class Artist {
    String name;
    LocalDate birthdate;
    int age;
    
    public void setName(String name) {
        this.name = name;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public int getAge() {
        LocalDate currentdate = LocalDate.now();
        
        // Calculate age(s) between this date and birthdate
        age = Period.between(birthdate, currentdate).getYears();
        
        return age;
    }
    
    public String getBirthdate() {
        //Date birthday to String sBirthdate using DateFormat (df)
        String _birthdate = "YYYY-MM-DD";
        
        DateFormat df = new SimpleDateFormat(_birthdate);
        String sBirthdate = df.format(birthdate);
        
        return sBirthdate;
    }
    
    public String getName() {
        return name;
    }
    
    public String displayInfo(String name, String sAge, String sBirthdate) {
        
        //Integer age to String sAge
        sAge = Integer.toString(getAge());
        
        return "Nama: " + getName() + "\nUmur: " + sAge + "\nTanggal lahir: " + getBirthdate();
    }
}
