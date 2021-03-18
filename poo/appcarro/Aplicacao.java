public class Aplicacao {

    public static void main(String[] args){
        Carro gol = new Carro("Volkswagen","Gol", 2020);
        gol.setVariante("Sport");

        System.out.println(gol.getVariante());
    }

}
