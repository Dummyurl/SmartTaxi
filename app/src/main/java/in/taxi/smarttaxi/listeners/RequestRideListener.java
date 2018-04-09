package in.taxi.smarttaxi.listeners;


import in.taxi.smarttaxi.model.RequestBean;

public interface RequestRideListener {

    void onLoadCompleted(RequestBean requestBean);

    void onLoadFailed(String error);
}
