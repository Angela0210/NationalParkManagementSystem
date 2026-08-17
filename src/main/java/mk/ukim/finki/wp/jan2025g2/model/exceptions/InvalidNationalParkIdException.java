package mk.ukim.finki.wp.jan2025g2.model.exceptions;



import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class InvalidNationalParkIdException extends RuntimeException {

    public InvalidNationalParkIdException(Long Id) {
        super(String.format("NationalPark with id %d does not exist.", Id));
    }
}
