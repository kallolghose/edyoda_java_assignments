package practice.lessons.enums;

public enum Color {

    PINK("#00E2F"),
    RED("#00E2E"),
    BLUE("#00A2A"),
    WHITE("#FFFFF"),
    BLACK("#00000");

    private String colorCode;

    public String getColorCode() {
        return colorCode;
    }

    Color(String colorCode){
        this.colorCode = colorCode;
    }

}
