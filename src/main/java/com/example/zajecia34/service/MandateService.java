package com.example.zajecia34.service;

import com.example.zajecia34.domain.Driver;
import com.example.zajecia34.domain.Mandate;
import com.example.zajecia34.exception.ObjectNotFoundException;
import com.example.zajecia34.repository.DriverRepository;
import com.example.zajecia34.repository.MandateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.mail.MessagingException;

@Service
@RequiredArgsConstructor
public class MandateService {

    private final MandateRepository mandateRepository;
    private final DriverRepository driverRepository;
    private final MailService mailService;

    private static final int MAX_POINTS_IN_LAST_YEAR = 24;

    @Transactional
    public Mandate add(Mandate mandate) {
        Driver driver = driverRepository.findById(mandate.getDriver().getId()).orElseThrow(() -> new ObjectNotFoundException(mandate.getDriver().getId(), Driver.class.getName()));
        Mandate mandateSave = mandateRepository.save(mandate);
//        jesli wykroczenia odrazu dodane to dodac sprawdzenie czy istnieja takie wykroczenia w slowniku?

        if (hasMorePointsInLastYearThanAllowed(driver)) {
            sendVerificationCode(driver);
        }
        return mandateSave;
    }

//    zalezy jakie relacje? czy szukamy w mandatach po peselu/id drivera? czy driver.getMandates?
    private boolean hasMorePointsInLastYearThanAllowed(Driver driver) {
        driver.
    }

    public void sendVerificationCode(Driver driver) {
        String subject = "Information - driving license";
        String content = "Dear [[name]],<br>"
                + "You have too many penalty points in last year<br>"
                + "so your driver's license has been suspended.<br>";

        content = content.replace("[[name]]", driver.getName());

        try {
            mailService.sendMail(driver.getEmail(), subject, content, true);
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

}
