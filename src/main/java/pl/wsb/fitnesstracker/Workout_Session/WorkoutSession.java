package pl.wsb.fitnesstracker.Workout_Session;

import jakarta.persistence.*;
import pl.wsb.fitnesstracker.trainings.Trainings;

import java.util.Date;

@Entity
@Table(name = "workout_session")
public class WorkoutSession {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "training_id", nullable = false)
    private Trainings training;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date timestamp;

    @Column(name = "start_latitude")
    private Double startLatitude;

    @Column(name = "start_longitude")
    private Double startLongitude;

    @Column(name = "end_latitude")
    private Double endLatitude;

    @Column(name = "end_longitude")
    private Double endLongitude;

    @Column
    private Double altitude;

    public Long getId() {
        return id;
    }

    public Trainings getTraining() {
        return training;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public Double getStartLatitude() {
        return startLatitude;
    }

    public Double getStartLongitude() {
        return startLongitude;
    }

    public Double getEndLatitude() {
        return endLatitude;
    }

    public Double getEndLongitude() {
        return endLongitude;
    }

    public Double getAltitude() {
        return altitude;
    }
}