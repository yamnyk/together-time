package com.danit.togethertime.DTO;

import com.danit.togethertime.entity.User;

import java.sql.Timestamp;
import java.util.List;

public class MeetingDTO {
    private Timestamp dateStart;
    private Timestamp dateEnd;
    private List<User> perticipants;

    public MeetingDTO() {
    }

    public Timestamp getDateStart() {
        return dateStart;
    }

    public void setDateStart(Timestamp dateStart) {
        this.dateStart = dateStart;
    }

    public Timestamp getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Timestamp dateEnd) {
        this.dateEnd = dateEnd;
    }

    public List<User> getPerticipants() {
        return perticipants;
    }

    public void setPerticipants(List<User> perticipants) {
        this.perticipants = perticipants;
    }
}
