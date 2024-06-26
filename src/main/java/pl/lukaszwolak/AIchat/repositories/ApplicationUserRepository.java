package pl.lukaszwolak.AIchat.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.lukaszwolak.AIchat.etenties.*;


@Repository
public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Long> {

}
