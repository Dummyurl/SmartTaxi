package in.taxi.smarttaxi.listeners;


import in.taxi.smarttaxi.model.DriverRatingBean;

public interface DriverRatingListener {

    void onLoadCompleted(DriverRatingBean driverRatingBean);

    void onLoadFailed(String error);
}


