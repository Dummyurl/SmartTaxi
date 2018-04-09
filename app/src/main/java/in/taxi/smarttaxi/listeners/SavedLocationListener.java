package in.taxi.smarttaxi.listeners;


import in.taxi.smarttaxi.model.LocationBean;

public interface SavedLocationListener {

    void onLoadCompleted(LocationBean locationBean);

    void onLoadFailed(String error);

}
