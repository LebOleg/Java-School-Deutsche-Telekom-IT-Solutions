package ru.lebedev.SBBProject.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
@Table(name = "timetable")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class Timetable {

    public Timetable(Train train, RouteNumber route, LocalDateTime beginTime) {
        this.train = train;
        this.route = route;
        this.beginDateAndTime = beginTime;

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @OneToOne(fetch = FetchType.EAGER,
            cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "train_number", referencedColumnName = "id")
    private Train train;
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "route_number", referencedColumnName = "number")
    private RouteNumber route;
    @Column(name = "begin_time")
    LocalDateTime beginDateAndTime;
}
