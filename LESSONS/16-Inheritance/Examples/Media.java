public class Media {

    protected String title;
    protected String year;

    public String getTitle(){
        return title;
    }

    public String getYear(){
        return year;
    }

    public void play(){
        System.out.println(title + " is playing");
    }

    public void setTitle(String newTitle){
        if(newTitle.isBlank()){
            System.out.println("The title can't be blank");
            return;
        }else{
            title = newTitle;
        }
    }

    public void setYear(String newYear){
        if(newYear.isBlank()){
            System.err.println("The year can't be blank");
            return;
        }else{
            year = newYear;
        }
    }

    public void displayInfo(){
        System.out.println();
        System.out.println("Title : " + title);
        System.out.println("Year  : " + year);
    }
}