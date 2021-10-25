package practice.lessons.springlesson;

//Discussing the final Keyword
public class MainFinal {

    private final String companyName;

    public MainFinal(){
        companyName = "EdYoda";
    }

    public void updateCount(){
        final int sum = 0;
        System.out.println("Company Name : " + companyName);
    }

    public static void main(String[] args) {
        MainFinal mainFinal = new MainFinal();
        mainFinal.updateCount();
    }

}
