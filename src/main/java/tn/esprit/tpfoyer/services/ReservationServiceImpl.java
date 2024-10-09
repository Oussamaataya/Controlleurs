package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.entities.Reservation;
import tn.esprit.tpfoyer.repositories.ReservationRepository;

import java.util.List;

public class ReservationServiceImpl implements  IReservationService{
    ReservationRepository reservationRepository;
    @Override
    public List<Reservation> retrieAllReservations() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation addReservation(Reservation r) {
        return reservationRepository.save(r);
    }

    @Override
    public Reservation updateReservation(Reservation r) {
        return reservationRepository.save(r);
    }

    @Override
    public Reservation retrieReservation(Long idReservation) {
        return reservationRepository.findById(idReservation).get();
    }

    @Override
    public void removeReservation(Long idReservation) {
       reservationRepository.deleteById(idReservation);

    }
}
