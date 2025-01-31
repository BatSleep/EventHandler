package com.github.BatSleep.EventHandler;

import java.util.ArrayList;
import java.util.List;

public class EventHandler {
    private static final List<EventListener> listeners = new ArrayList<>();

    public static void subscribe(EventListener listener) {listeners.add(listener);}

    public static void unsubscribe(EventListener listener) {listeners.remove(listener);}

    public static void postEvent(Event event) {
        for (EventListener listener : listeners) {
            listener.onEvent(event);
        }
    }
}
