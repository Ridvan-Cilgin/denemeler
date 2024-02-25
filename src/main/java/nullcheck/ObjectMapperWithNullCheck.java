package nullcheck;

import comparatordemo.AuthorDto;
import comparatordemo.Book;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class ObjectMapperWithNullCheck {
    public static void main(String[] args) {
        Date input = new Date();

        Date date1 = Date.from(LocalDate.ofInstant(input.toInstant(),
                ZoneId.systemDefault()).plusDays(1).atStartOfDay(ZoneId.systemDefault()).toInstant());

        Date date6 = Date.from(LocalDate.ofInstant(input.toInstant(),
                ZoneId.systemDefault()).plusDays(6).atStartOfDay(ZoneId.systemDefault()).toInstant());

        Date date8 = Date.from(LocalDate.ofInstant(input.toInstant(),
                ZoneId.systemDefault()).plusDays(8).atStartOfDay(ZoneId.systemDefault()).toInstant());

        Date date12 = Date.from(LocalDate.ofInstant(input.toInstant(),
                ZoneId.systemDefault()).plusDays(12).atStartOfDay(ZoneId.systemDefault()).toInstant());

        LocalDateTime lt
                = java.time.LocalDateTime.now();


        AuthorDto authorDto = AuthorDto.builder()
                .id(12L)
                .lastName("Tostoyewski")
                .name("Oğuzhan")
                .build();

        Book entity = Book.builder()
                .id(1)
//                .name("Suç ve ceza")
                .page(687)
                .startDate(date12)
                .isActive(true)
                .localDate(lt)
                .authorDto(authorDto)
                .build();

        Book request = Book.builder()
                .id(3)
                .name("kapitan")
                .page(87)
                .startDate(date8)
                .isActive(false)
                .build();

        Book response = new Book();

        response.setId(entity.getId());
        response.setName(request.getName()==null ? entity.getName() : request.getName());
        response.setIsActive(request.getIsActive()==null ? entity.getIsActive() : request.getIsActive());

        System.out.println(response);

    }
}
