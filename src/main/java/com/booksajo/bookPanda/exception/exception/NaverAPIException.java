package com.booksajo.bookPanda.exception.exception;

import com.booksajo.bookPanda.exception.ErrorCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class NaverAPIException extends RuntimeException{
    private final ErrorCode errorCode;
}