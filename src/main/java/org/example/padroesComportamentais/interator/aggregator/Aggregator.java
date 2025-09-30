package org.example.padroesComportamentais.interator.aggregator;

import org.example.padroesComportamentais.interator.interator.Interator;

public interface Aggregator <T>{

    Interator<T> getInterator();
}
