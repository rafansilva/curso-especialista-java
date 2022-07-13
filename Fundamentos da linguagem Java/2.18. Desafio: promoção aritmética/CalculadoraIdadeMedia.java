public class CalculadoraIdadeMedia {

    public static void main (String[] args) {
        int idade1 = 30;
        int idade2 = 40;
        int idade3 = 60;
        // float idade3 = 60; // isso compila

        // float idadeMedia = (float) (idade1 + idade2 + idade3) / 3; // isso compila
        // float idadeMedia = (idade1 + idade2 + idade3) / (float) 3; // isso compila
        float idadeMedia = (idade1 + idade2 + idade3) / 3f; // mais elegante

        System.out.println("Idade média: " + idadeMedia);
    }
}
