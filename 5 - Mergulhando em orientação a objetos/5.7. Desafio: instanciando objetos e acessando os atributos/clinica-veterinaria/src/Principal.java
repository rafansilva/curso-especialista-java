public class Principal {

    public static void main(String[] args) {
        Cachorro scoobydooSalsicha = new Cachorro();
        scoobydooSalsicha.nome = "Scooby-Doo";
        scoobydooSalsicha.raca = "Dogue Alemão";
        scoobydooSalsicha.sexo = 'M';
        scoobydooSalsicha.idade = 5;

        Cachorro satanasDonaClotilde = new Cachorro();
        satanasDonaClotilde.nome = "Satanas";
        satanasDonaClotilde.raca = "Chihuahua";
        satanasDonaClotilde.sexo = 'M';
        satanasDonaClotilde.idade = 2;

        System.out.println("Turma Scooby-Doo");
        System.out.println("----------");
        System.out.printf("Nome: %s%n", scoobydooSalsicha.nome);
        System.out.printf("Raça: %s%n", scoobydooSalsicha.raca);
        System.out.printf("Sexo: %s%n", scoobydooSalsicha.sexo);
        System.out.printf("Idade: %s%n", scoobydooSalsicha.idade);

        System.out.println();

        System.out.println("Dona Clotilde - Bruxa do 71");
        System.out.println("----------");
        System.out.printf("Nome: %s%n", satanasDonaClotilde.nome);
        System.out.printf("Raça: %s%n", satanasDonaClotilde.raca);
        System.out.printf("Sexo: %s%n", satanasDonaClotilde.sexo);
        System.out.printf("Idade: %s%n", satanasDonaClotilde.idade);

    }
}
