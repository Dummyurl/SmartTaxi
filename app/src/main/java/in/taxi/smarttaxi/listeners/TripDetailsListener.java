package in.taxi.smarttaxi.listeners;


import in.taxi.smarttaxi.model.TripDetailsBean;

public interface TripDetailsListener {

    void onLoadCompleted(TripDetailsBean tripDetailsBean);

    void onLoadFailed(String error);
}
