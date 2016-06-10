/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eduLibrary.query;

import com.eduLibrary.entities.BookQ;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author sandra-emma
 */
@Remote
public interface LibraryQueryBeanRemote {

    void addBookQuery(BookQ bookName);

    List<BookQ> getBookQuery();
}
