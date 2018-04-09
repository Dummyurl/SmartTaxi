package in.taxi.smarttaxi.listeners;


import in.taxi.smarttaxi.model.FareBean;

public interface TotalFareListener {

    void onLoadCompleted(FareBean fareBean);

    void onLoadFailed(String error);
}
