package IntroducaoJava.PadroesDeProjeto.Test;

import IntroducaoJava.PadroesDeProjeto.Dominio.*;
import IntroducaoJava.PadroesDeProjeto.Dominio.ReportDto.ReportDtoBuilder;

//preciso dos dados de todos os objetos que vou passar.
public class DataTransferObjectTest01 {
    public static void main(String[] args) {
        Aircraft aircraft = new Aircraft("boeing 747");
        Country country = Country.BRAZIL;
        Person person = new Person.PersonBuilder()
                .firstName("Gean")
                .lastName("Costa")
                .build();
        Currency currency = CurrencyFactory.newCurrency(country);
        ReportDto reportDto = ReportDtoBuilder.builder()
                .aircraftName(aircraft.getName())
                .currency(currency)
                .country(country)
                .personName(person.getFirstName())
                .build();
        System.out.println(reportDto);
    }

}
