package STUDYJAVA.exercises.ExpressionsStretementsMore;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
    // Passo 1: Verificar se o valor de minutos é inválido
    if (minutes < 0) {
        System.out.println("Invalid Value");
        return; // Sai do método
    }

    // Passo 2: Calcular anos (YY) e dias restantes (ZZ)
    long years = minutes / 525600; // 1 ano tem 525600 minutos
    long remainingMinutesAfterYears = minutes % 525600; // Minutos restantes após calcular os anos
    long days = remainingMinutesAfterYears / 1440; // 1 dia tem 1440 minutos

    // Passo 3: Exibir o resultado no formato especificado
    System.out.println(minutes + " min = " + years + " years and " + days + " days");
}

    public static void main(String[] args){
        printYearsAndDays(89890);
        printYearsAndDays(2880);
        printYearsAndDays(68994);

    }

}
