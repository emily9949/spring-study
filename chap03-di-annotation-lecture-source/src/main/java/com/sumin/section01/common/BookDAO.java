package com.sumin.section01.common;

import java.util.List;

public interface BookDAO {

    List<BookDTO> findAllBook();

    BookDTO findBookBySequence(int sequence);
}
