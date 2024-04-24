package fr.eql.ai115.cda.hotel.paris.blue.app.entity.dto;

import java.time.LocalDate;

public class AvailableOfferGetDto {
    private LocalDate startDate;
    private LocalDate endDate;

    public AvailableOfferGetDto() {
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
