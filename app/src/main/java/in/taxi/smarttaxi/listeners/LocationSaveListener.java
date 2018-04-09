package in.taxi.smarttaxi.listeners;


import in.taxi.smarttaxi.model.LocationBean;

public interface LocationSaveListener {

    void onLoadCompleted(LocationBean locationBean);

    void onLoadFailed(String error);
}


