package in.taxi.smarttaxi.listeners;


import in.taxi.smarttaxi.model.DriverBean;

public interface DriverDetailsListener {

    void onLoadCompleted(DriverBean driverBean);

    void onLoadFailed(String error);
}
