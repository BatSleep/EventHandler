## Event Handler

Simple java Event Handler/Manager/Bus


## Explanation

*Define Events:* Create classes that extend the Event class.

*Create Listeners:* Implement the EventListener interface and override the invoke() method.

*Register Listeners:* Use EventHandler.subscribe() to register your listeners.

*Post Events:* Trigger events using EventHandler.postEvent() when specific actions occur.

*Unsubscribe Listeners:* Use EventHandler.unsubscribe() if you no longer need a listener.


## Methods

Register a listener to handle events.

``EventHandler.subscribe(EventListener listener)``

Unregister a listener to stop it from handling events.

``EventHandler.unsubscribe(EventListener listener``)

 Post an event to trigger any listeners that are subscribed to that event type.
 
``EventHandler.postEvent(Event event)``



## Example Usage

Main class

```java
public void init() {
    EventHandler.subscribe(new EventAttacked());
}
```

Event hook

```java
public void onPlayerAttack(Player attacker) {

    if (playerAttacked(attacker)) {

      //game code
      player.attackedBy(attacker);
      //game code

      //event Post
      EventHandler.post(new EventAttacked(attacker);
      //event Post
    }
}
```
