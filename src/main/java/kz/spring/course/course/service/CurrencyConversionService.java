package kz.spring.course.course.service;

import kz.spring.course.course.entity.Currency;
import kz.spring.course.course.service.impl.NbrbCurrencyConversionService;

public interface CurrencyConversionService {
    static CurrencyConversionService getInstance() {
        return new NbrbCurrencyConversionService();
    }

    double getConversionRatio(Currency original, Currency target);
}
