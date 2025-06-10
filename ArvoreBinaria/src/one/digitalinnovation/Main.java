package one.digitalinnovation;

// import one.digitalinnovation.model.Obj;

// If 'Obj' is a simple class, you can define it here for testing:
class Obj implements Comparable<Obj> {
    private Integer value;

    public Obj(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public int compareTo(Obj o) {
        return this.value.compareTo(o.getValue());
    }

    @Override
    public String toString() {
        return value.toString();
    }
}

public class Main {

    public static void main(String[] args){

        ArvoreBinaria<Obj> minhaArvore = new ArvoreBinaria<>();

        minhaArvore.inserir(new Obj(13));
        minhaArvore.inserir(new Obj(10));
        minhaArvore.inserir(new Obj(25));
        minhaArvore.inserir(new Obj(2));
        minhaArvore.inserir(new Obj(12));
        minhaArvore.inserir(new Obj(20));
        minhaArvore.inserir(new Obj(31));
        minhaArvore.inserir(new Obj(29));
        minhaArvore.inserir(new Obj(32));
        minhaArvore.remover(new Obj(32));

        minhaArvore.exibirInOrdem();
        minhaArvore.exibirPreOrdem();
        minhaArvore.exibirPosOrdem();

    }

}
