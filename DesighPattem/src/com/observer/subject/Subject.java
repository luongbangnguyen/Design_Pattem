package com.observer.subject;

import com.observer.observer.Observer;

public interface Subject {
	void registerObserver(Observer observer);
	void removeObserver(Observer observer);
	void notificationObserserver();
}
