package com.anglehack.anywhereLibrary.domain.library.entity;

import com.anglehack.anywhereLibrary.domain.common.entity.BaseTimeEntity;
import com.anglehack.anywhereLibrary.domain.seat.entity.Seat;
import com.anglehack.anywhereLibrary.domain.user.entity.User;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Table(name = "libraries")
public class Library extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @OneToOne
    @JoinColumn(name = "owner_id", nullable = false)
    private User owner;

    @Column(nullable = false)
    private int totalPersonnel;

    private String hangout;

    @OneToMany(mappedBy="library", cascade = CascadeType.ALL)
    private List<Seat> seats = new ArrayList<Seat>();
}
