package com.jarvis.sysmgmt.web.reading.list;

import com.jarvis.sysmgmt.entity.Reader;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReadingListRepository extends JpaRepository<Book, Long> {

    List<Book> findByReader(Reader reader);

}
