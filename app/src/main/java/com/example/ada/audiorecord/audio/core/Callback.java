package com.example.ada.audiorecord.audio.core;


public interface Callback {
    void onBufferAvailable(byte[] buffer);
}