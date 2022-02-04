package com.delta.behavioralPattern.observer;

import com.delta.behavioralPattern.observer.editor.Editor;
import com.delta.behavioralPattern.observer.listeners.EmailNotificationListener;
import com.delta.behavioralPattern.observer.listeners.LogOpenListener;

public class ClientCode {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
