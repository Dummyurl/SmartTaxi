package in.taxi.smarttaxi.listeners;


import in.taxi.smarttaxi.model.TripListBean;

public abstract interface TripListListener {

    void onLoadCompleted(TripListBean tripListBean);

    void onLoadFailed(String error);

}
