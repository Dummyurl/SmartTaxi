package in.taxi.smarttaxi.listeners;


import in.taxi.smarttaxi.model.DriverBean;

public interface AppStatusListener {

    void onLoadFailed(String error);

    void onLoadCompleted(DriverBean driverBean);

}
