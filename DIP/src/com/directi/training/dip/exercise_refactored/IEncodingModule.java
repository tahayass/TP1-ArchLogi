package com.directi.training.dip.exercise_refactored;

import java.io.IOException;

public interface IEncodingModule {
    public void encodeWithFiles() throws IOException ;
    public void encodeBasedOnNetworkAndDatabase() throws IOException;
}
