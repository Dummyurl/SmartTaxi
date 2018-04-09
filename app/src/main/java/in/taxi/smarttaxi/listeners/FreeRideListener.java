package in.taxi.smarttaxi.listeners;


import in.taxi.smarttaxi.model.FreeRideBean;

public interface FreeRideListener {

    void onLoadCompleted(FreeRideBean freeRideBean);

    void onLoadFailed(String error);

}
