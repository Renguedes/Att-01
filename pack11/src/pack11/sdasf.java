package pack11;

import java.time.LocalDate;
import java.time.Period;

public class sdasf {

    public class ContadordeDatas {

        public static void calcularTempoRestante(int dia, int mes, int ano) {
            LocalDate hoje = LocalDate.now();
            LocalDate dataAlvo = LocalDate.of(ano, mes, dia);
            Period tempoRestante = Period.between(hoje, dataAlvo);

            if (tempoRestante.isNegative()) {
                System.out.println("A data já passou!");
            } else {
                System.out.printf("Faltam %d anos, %d meses e %d dias para a data %02d/%02d/%d.%n", tempoRestante.getYears(),
                        tempoRestante.getMonths(), tempoRestante.getDays(), dia, mes, ano);
            }
        }

        public static void main(String[] args) {
            calcularTempoRestante(30, 3, 2025);
        }
    }
}
