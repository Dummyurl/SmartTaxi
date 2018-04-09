package in.taxi.smarttaxi.listeners;


import in.taxi.smarttaxi.model.CarBean;

public interface CarInfoListener {

    void onLoadFailed(String error);

    void onLoadCompleted(CarBean carBean);

}
