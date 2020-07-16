package com.anglehack.anywhereLibrary.seat.dto;

import com.anglehack.anywhereLibrary.seat.entity.Seat;
import com.anglehack.anywhereLibrary.user.dto.SimpleUser;
import lombok.*;

import java.time.LocalTime;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
@Builder
public class SimpleSeat {
    private Long id;
    private SimpleUser user;
    private LocalTime learningTime;
    private LocalTime restTime;

    public static SimpleSeat of(Seat seat) {
        return SimpleSeat.builder()
                .id(seat.getId())
                .user(SimpleUser.of(seat.getUser()))
                .learningTime(seat.getLearningTime())
                .restTime(seat.getRestTime())
                .build();
    }
}
