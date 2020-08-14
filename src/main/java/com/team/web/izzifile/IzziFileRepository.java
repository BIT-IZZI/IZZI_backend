package com.team.web.izzifile;

import org.springframework.data.jpa.repository.JpaRepository;


interface IzziFileRepository extends JpaRepository<IzziFile, Long>, IIzziFileRepository {
}
