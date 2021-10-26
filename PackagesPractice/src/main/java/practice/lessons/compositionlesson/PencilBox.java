package practice.lessons.compositionlesson;

public class PencilBox {

    private Eraser eraser;
    private Pencil pencil;
    private Ruler ruler;

    public PencilBox(Eraser e, Pencil p, Ruler r){
        this.eraser = e;
        this.pencil = p;
        this.ruler = r;
    }

    public Eraser getEraser(){
        return this.eraser;
    }

    public Pencil getPencil(){
        return this.pencil;
    }

    public Ruler getRuler(){
        return this.ruler;
    }

}
