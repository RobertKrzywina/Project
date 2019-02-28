package pl.robert.project.bank_account.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter @Setter
public class ModifyBalanceDTO {

    long id;
    double newBalance;
}
