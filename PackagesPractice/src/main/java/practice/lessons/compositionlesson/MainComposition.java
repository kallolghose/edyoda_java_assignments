package practice.lessons.compositionlesson;

public class MainComposition {
    public static void main(String[] args) {
        Eraser eraser = new Eraser("Natraj", "White");
        Pencil pencil = new Pencil("Apsara", "Extra Dark");
        Ruler ruler = new Ruler(15, "CM");

        PencilBox pencilBox = new PencilBox(eraser, pencil, ruler);
        Eraser eraserInPencilBox = pencilBox.getEraser();
        System.out.println("Brand of eraser in pencil box : " + eraserInPencilBox.getBrand());
    }
}
