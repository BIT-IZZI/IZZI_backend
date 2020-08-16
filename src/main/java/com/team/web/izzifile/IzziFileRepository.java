package com.team.web.izzifile;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface IzziFileRepository extends JpaRepository<IzziFileDB, String> {
}
