package com.delta.behavioralPattern.observer.listeners;

import java.io.File;

public interface EventListener {
    void update(String eventType, File file);
}