package com.project.exception;

import com.project.entity.Order;
import com.project.entity.Product;

import java.io.Serial;
import java.io.Serializable;
import java.text.MessageFormat;

public class InvalidDataException extends RuntimeException implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    public InvalidDataException(String message, Order order) {
        super(MessageFormat.format(message, order));
    }

    public InvalidDataException(String message, Product product) {
        super(MessageFormat.format(message, product));
    }
}
