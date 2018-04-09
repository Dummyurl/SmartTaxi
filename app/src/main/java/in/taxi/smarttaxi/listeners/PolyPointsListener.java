package in.taxi.smarttaxi.listeners;


import in.taxi.smarttaxi.model.PolyPointsBean;

public interface PolyPointsListener {

    void onLoadFailed(String error);

    void onLoadCompleted(PolyPointsBean polyPointsBean);
}
