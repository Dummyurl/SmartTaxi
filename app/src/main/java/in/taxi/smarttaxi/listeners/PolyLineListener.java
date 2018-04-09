package in.taxi.smarttaxi.listeners;


import in.taxi.smarttaxi.model.PlaceBean;

public interface PolyLineListener {

    void onLoadFailed(String error);

    void onLoadCompleted(PlaceBean placeBean);
}
