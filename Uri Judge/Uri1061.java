import java.io.IOException;
import java.util.Scanner;

public class Uri1061 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int diasF=0,horaF=0,minutoF=0,segundoF=0;

        String[] dia = sc.nextLine().split(" ");
        String[] horario = sc.nextLine().split(" : ");
        String[] dia2 = sc.nextLine().split(" ");
        String[] horario2 = sc.nextLine().split(" : ");
        int diaInicial = Integer.parseInt(dia[1]);

        int horaInicial = Integer.parseInt(horario[0]);
        int minutoInicial = Integer.parseInt(horario[1]);
        int segundoInicial = Integer.parseInt(horario[2]);

        int diaFinal = Integer.parseInt(dia2[1]);

        int horaFinal = Integer.parseInt(horario2[0]);
        int minutoFinal = Integer.parseInt(horario2[1]);
        int segundoFinal = Integer.parseInt(horario2[2]);

        if (segundoFinal < segundoInicial){
            segundoF += (60 - segundoInicial) + segundoFinal;
            minutoF--;
        } else if( segundoFinal > segundoInicial)
            segundoF += segundoFinal - segundoInicial;
        else
            segundoF = 0;

        if(minutoFinal < minutoInicial){
            minutoF += (60 - minutoInicial) + minutoFinal;
            horaF--;
        } else if(minutoFinal > minutoInicial)
            minutoF += minutoFinal - minutoInicial;
        else
            minutoF = 0;

        if(horaFinal < horaInicial){
            horaF += (24 - horaInicial) + horaFinal;
            diasF--;
        } else if(horaFinal > horaInicial)
            horaF += horaFinal - horaInicial;
        else
            horaF = 0;

        if(diaFinal < diaInicial)
            diasF += (30 - diaInicial) + diaFinal;
        else if(diaFinal > diaInicial)
            diasF += diaFinal - diaInicial;
        else
            diasF += 0;

        System.out.println(diasF + " dia(s)");
        System.out.println(horaF + " hora(s)");
        System.out.println(minutoF + " minuto(s)");
        System.out.println(segundoF + " segundo(s)");
    }
}

