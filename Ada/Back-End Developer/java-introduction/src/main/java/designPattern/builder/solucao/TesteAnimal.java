package designPattern.builder.solucao;

public class TesteAnimal {
    public static void main(String[] args) {
        Animal animal = Animal.builder()
                .nome("Rex")
                .raca("Pastor Alemão")
                .dono("Anderson")
                .build();

        System.out.println(animal);
    }
}
