package observer.withObserverJava9AndLater;

import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

/**
 * An observable parcel with a tracking number and location.
 */
public class Parcel {

    /** This Parcel's tracking number. */
    private String trackingNumber;

    /** This Parcel's location. */
    private String location;

    /*  Helper class for making this class as an observable  */
    private PropertyChangeSupport  observable;

    /**
     * Constructs a new Parcel with tracking number trackingNumber and
     * location location.
     * @param trackingNumber This Parcel's tracking number.
     * @param location This Parcel's location.
     */
    public Parcel(String trackingNumber, String location) {
        this.trackingNumber = trackingNumber;
        this.location = location;
        this.observable = new PropertyChangeSupport (this);

    }

    @Override
    public String toString() {
        return "Parcel " + trackingNumber + ".";
    }


    /*
     * Add a new observer to observe the changes to this class.
     * @param observer
     */
    public void addObserver(PropertyChangeListener observer) {
        observable.addPropertyChangeListener("location", observer);
    }


    /*
     * Remove an existing observer from the list of observers.
     * @param observer
     */
    public void removeObserver(PropertyChangeListener observer) {
        observable.removePropertyChangeListener(observer);
    }

    /*
     * Notify observers o the change event.
     * @param newEvent
     */
    public void notifyObservers (PropertyChangeEvent newEvent)
    {
        for ( PropertyChangeListener observer : observable.getPropertyChangeListeners())
            observer.propertyChange(newEvent);
    }


    /**
     * Sets this Parcel's location to newLocation and notifies its Observers.
     * @param newLocation This Parcel's new location.
     */
    public void updateLocation(String newLocation) {

        String oldLocation  = this.location;
        this.location = newLocation;
        PropertyChangeEvent newEvent = new PropertyChangeEvent (this, "location", oldLocation, newLocation);
        notifyObservers (newEvent);

        /*
         * The following line does not work.
         *  observable.firePropertyChange("The location: ", oldLocation, newLocation);
         */
    }


}
