package com.jarvis.sysmgmt.web.reading.list;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jarvis.sysmgmt.entity.Reader;

public interface ReadingListRepository extends JpaRepository<Book, Long> {

    List<Book> findByReader(Reader reader);

}
