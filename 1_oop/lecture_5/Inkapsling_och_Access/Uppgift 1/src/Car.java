/*
Uppgift 1
- Skapa en klass Car med följande private variabler:
String make, String model, int year.
- Skapa publika getter- och setter-metoder för varje variabel
 */

public class Car
{
    private String make;
    private String model;
    private int year;

    public String getMake()
    {
        return make;
    }

    public void setMake(String make)
    {
        this.make = make;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year) {
        if (year > 1885) {
            this.year = year;
        }
    }

}
