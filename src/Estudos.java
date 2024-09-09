public class Estudos {

    public static void main(String[] args){
        double tempCelsius = 31;
        double tempFahr = (tempCelsius * 1.8) + 32;

        String msg = String.format("Temperatura em celsius %s equivale a %s em Fahrenheit.",tempCelsius, tempFahr);

        System.out.println(msg);

        int tempFahrInteira = (int) tempFahr;
        System.out.println("Temperatura em fahrenheit inteira é: " + tempFahrInteira);
    }

}
